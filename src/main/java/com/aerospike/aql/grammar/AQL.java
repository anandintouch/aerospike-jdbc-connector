
package com.aerospike.aql.grammar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.log4j.Logger;

import com.aerospike.aql.grammar.AQLCodeGenerator;
import com.aerospike.aql.grammar.AQLCodeGenerator.aqlStatement_return;
import com.aerospike.aql.grammar.AQLExecutor;
import com.aerospike.aql.grammar.AQLTreeAdaptor;
import com.aerospike.aql.grammar.AQLastLexer;
import com.aerospike.aql.grammar.AQLastParser;
import com.aerospike.aql.grammar.AQLastParser.aqlFile_return;
import com.aerospike.aql.grammar.AQLastParser.aqlStatements_return;
import com.aerospike.aql.grammar.IErrorReporter;
import com.aerospike.aql.grammar.IResultReporter;
import com.aerospike.aql.grammar.NoCaseFileStream;
import com.aerospike.aql.grammar.NoCaseInputStream;
import com.aerospike.aql.grammar.NoCaseStringStream;
import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.policy.ClientPolicy;
import com.aerospike.client.policy.InfoPolicy;
import com.aerospike.client.policy.Policy;

public class AQL {
	public enum Language {
		C, CSHARP, JAVA, PYTHON, GO, PHP, NODE, RUBY;
	}

	private static Logger log = Logger.getLogger(AQL.class);

	private CommonTokenStream tokenStream;
	private AQLastLexer lexer;
	private AQLastParser parser;
	private StringTemplateGroup group;
	private AerospikeClient client = null;
	private ClientPolicy cPolicy = null;
	private InfoPolicy infoPolicy = null;
	public	boolean generateDOT = log.isDebugEnabled();
	private DOTTreeGenerator dot = new DOTTreeGenerator();

	public AQL(){
		super();
	}

	public AQL(AerospikeClient client){
		this();
		this.client = client;
		this.cPolicy = new ClientPolicy();
		this.infoPolicy = new InfoPolicy();
	}

	protected AQLastParser getFileParser(File file) throws IOException {
		CharStream stream = new NoCaseFileStream(file);
		getParser(stream);
		return this.parser;
	}
	protected AQLastParser getStringParser(String source) throws Exception{
		CharStream stream = new NoCaseStringStream(source);
		getParser(stream);
		return this.parser;
	}
	protected AQLastParser getStreamParser(InputStream inputStream) throws Exception{
		CharStream stream = new NoCaseInputStream(inputStream);
		getParser(stream);
		return this.parser;
	}
	protected AQLastParser getParser(CharStream stream){
		this.lexer = new AQLastLexer(stream);
		this.tokenStream = new CommonTokenStream(lexer);
		this.parser = new AQLastParser(tokenStream);
		this.parser.setTreeAdaptor(new AQLTreeAdaptor());
		this.parser.setErrorReporter(new IErrorReporter() {
			int errors = 0;
			
			public void reportError(int line, int charStart, int charEnd, String message) {
				log.error(line+":"+charStart+" "+message);
				errors++;
			}
			
			public int getErrors() {
				return errors;
			}

		});
		return this.parser;
	}

	public aqlFile_return compile(File sqlFile, IErrorReporter reporter, IResultReporter resultReporter) throws IOException{
		CharStream stream = new NoCaseFileStream(sqlFile);
		aqlFile_return ast = compileFileStream(stream, reporter, resultReporter);
		if (generateDOT){
			StringTemplate st = asDOT((Tree)ast.getTree());
			String name = sqlFile.getName();
			name = name.substring(0, name.lastIndexOf("."));
			name = name + ".dot";
			File file = new File(name);
			String content = st.toString();
			writeFile(file, content);
		}
		CommonTree tree = (CommonTree) ast.getTree();
		log.debug("AST tree:");
		log.debug(tree.toStringTree());
		return ast;
	}

	public aqlStatements_return compileStringStream(CharStream stream, IErrorReporter errorReporter, IResultReporter resultReporter) throws IOException{
		try {
			AQLastLexer lexer = new AQLastLexer(stream);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			AQLastParser parser = new AQLastParser(tokenStream);
			parser.setTreeAdaptor(new AQLTreeAdaptor());
			parser.setErrorReporter(errorReporter);
			parser.setResultReporter(resultReporter);
			aqlStatements_return ast = parser.aqlStatements();
			CommonTree tree = (CommonTree) ast.getTree();
			log.debug("AST tree:");
			log.debug(tree.toStringTree());
			return ast;
		} catch (RecognitionException e) {
			errorReporter.reportError(e.line, e.charPositionInLine, e.charPositionInLine+e.token.getText().length(), e.getMessage());
		}
		return null;
	}
	public aqlFile_return compileFileStream(CharStream stream, IErrorReporter errorReporter, IResultReporter resultReporter) throws IOException{
		try {
			AQLastLexer lexer = new AQLastLexer(stream);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			AQLastParser parser = new AQLastParser(tokenStream);
			parser.setTreeAdaptor(new AQLTreeAdaptor());
			parser.setErrorReporter(errorReporter);
			parser.setResultReporter(resultReporter);
			aqlFile_return ast = parser.aqlFile();
			log.debug(ast.getTree().toString());
			return ast;
		} catch (RecognitionException e) {
			errorReporter.reportError(e.line, e.charPositionInLine, e.charPositionInLine+e.token.getText().length(), e.getMessage());
		}
		return null;
	}

	public StringTemplate asDOT(Tree tree){
		return dot.toDOT(tree);
	}

	//TODO return token at offset
	public Token tokenAt(String sqlString) throws IOException{
		aqlStatements_return result = this.compile(sqlString, null, null);
		CommonTree tree = (CommonTree) result.getTree();
		log.debug("AST tree:");
		log.debug(tree.toStringTree());
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		nodes.setTokenStream(this.tokenStream);
		return null;
	}

	public void compileAndGenerate(File sqlFile, File outputDirectory,
			Language language, String host, int port) throws Exception {
		compileAndGenerate(sqlFile, outputDirectory,
				language, host, String.valueOf(port));

	}

	/**
	 * Generates source code from AQL file. The output source file will have
	 * the same name as the AQL file.
	 * @param inputFile
	 * @param language
	 * @param host
	 * @param portString
	 * @return
	 * @throws Exception
	 */
	public String compileAndGenerateString(File inputFile, Language language, String host, String portString) throws Exception{
		URL url = getTemplateURL(language);
		String outputString = null;
		String moduleName = moduleFromFile(inputFile.getName());
		com.aerospike.aql.grammar.AQLastParser.aqlFile_return result =  getFileParser(inputFile).aqlFile();

		this.group = new StringTemplateGroup(new InputStreamReader(url.openStream()));
		outputString = parseAndWalk(parser, result, moduleName, host, portString);
		if (generateDOT){
			StringTemplate st = asDOT((Tree)result.getTree());
			String name = inputFile.getName();
			name = name.substring(0, name.lastIndexOf("."));
			name = name + ".dot";
			File file = new File(name);
			String content = st.toString();
			writeFile(file, content);
		}

		return outputString;
	}

	private URL getTemplateURL(Language language){
		URL url = null;

		switch (language){
		case CSHARP:
			url = getClass().getResource("AS_C_Sharp.st");
			break;
		case C:
			url = getClass().getResource("AS_C.st");
			break;
		case PYTHON:
			url = getClass().getResource("AS_Python.st");
			break;
		case GO:
			url = getClass().getResource("AS_Go.st");
			break;
		case PHP:
			url = getClass().getResource("AS_PHP.st");
			break;
		case NODE:
			url = getClass().getResource("AS_Node.st");
			break;
		default:
			url = getClass().getResource("AS_Java.st");
			break;
		}
		return url;
	}

	private String GetFileExtension(Language language){
		String extension = null;
		switch (language){

		case CSHARP:
			extension = ".cs";
			break;
		case PYTHON:
			extension = ".py";
			break;
		case C:
			extension = ".c";
			break;
		case GO:
			extension = ".go";
			break;
		case NODE:
			extension = ".js";
			break;
		case PHP:
			extension = ".php";
			break;
		default:
			extension = ".java";
			break;
		}
		return extension;

	}

	private String parseAndWalkSnipets(AQLastParser parser, aqlStatements_return result) throws RecognitionException{
		String outputString = null;
		if (parser.getNumberOfSyntaxErrors() == 0){
			CommonTree tree = (CommonTree) result.getTree();
			log.debug("AST tree:");
			log.debug(tree.toStringTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(this.tokenStream);
			AQLCodeGenerator walker = new AQLCodeGenerator(nodes);
			walker.setTemplateLib(this.group);
			try{
				aqlStatement_return returnValue = walker.aqlStatement();
				log.debug("Walked tree:");
				log.debug(result.toString());
				StringTemplate st = (StringTemplate)returnValue.getTemplate();
				outputString = st.toString();
				if (walker.getNumberOfSyntaxErrors() > 0) {
					outputString = "Errors in AST tree";
					log.error(outputString);
				}
			}catch (RuntimeException e){
				log.error("AST tree error:", e);
				throw e;
			}
		} else {
			outputString = "Syntax errors: " + this.parser.getNumberOfSyntaxErrors();
			log.error(outputString);
		}		
		return outputString;
	}

	private String parseAndWalk(AQLastParser parser, com.aerospike.aql.grammar.AQLastParser.aqlFile_return result, String moduleName, String host, String portString) throws RecognitionException{
		String outputString = null;
		if (parser.getNumberOfSyntaxErrors() == 0){
			CommonTree tree = (CommonTree) result.getTree();
			log.debug("AST tree:");
			log.debug(tree.toStringTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(this.tokenStream);
			AQLCodeGenerator walker = new AQLCodeGenerator(nodes);
			walker.setTemplateLib(this.group);
			try{
				com.aerospike.aql.grammar.AQLCodeGenerator.aqlFile_return returnValue = walker.aqlFile(moduleName, host, portString);
				log.debug("Walked tree:");
				log.debug(result.toString());
				StringTemplate st = (StringTemplate)returnValue.getTemplate();
				outputString = st.toString();
				if (walker.getNumberOfSyntaxErrors() > 0) {
					outputString = "Errors in AST tree";
					log.error(outputString);
				}
			}catch (RuntimeException e){
				log.error("AST tree error:", e);
				throw e;
			}
		} else {
			outputString = "Syntax errors: " + this.parser.getNumberOfSyntaxErrors();
			log.error(outputString);
		}		
		return outputString;
	}
	public void compileAndGenerate(File inputfile, File outputFile, Language language, String host, String portString) throws Exception{
		getFileParser(inputfile);
		String moduleName = moduleFromFile(inputfile.getName());
		String outputFileName = "output";
		String extension = GetFileExtension(language);
		if (outputFile == null){
			outputFileName = moduleName + extension;
			outputFile = new File(outputFileName);
		} if (outputFile.isDirectory()){
			outputFile = new File(outputFile.getAbsolutePath() + "/" + moduleName + extension);
		}

		String content = compileAndGenerateString(inputfile, language, host, portString);
		writeFile(outputFile, content);

	}


	private void writeFile(File file, String content) throws IOException{
		if (!file.exists()){
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();	
	}

	private String moduleFromFile(String fileName){
		String moduleName = fileName;
		if (moduleName.contains(".")){
			moduleName = moduleName.substring(0, moduleName.lastIndexOf("."));
		}
		return moduleName;
	}

	public String compileAndGenerateSnipets(String inputString, Language language) throws Exception{
		URL url = getTemplateURL(language);
		if (url != null){
			this.group = new StringTemplateGroup(new InputStreamReader(url.openStream()));
			aqlStatements_return result =  getStringParser(inputString).aqlStatements();
			String outputString = parseAndWalkSnipets(parser, result);
			return outputString;
		}
		return null;
	}
	/**
	 * Compile AQL string and produce statement AST
	 * @param sqlString
	 * @param reporter
	 * @param resultReporter
	 * @return
	 * @throws IOException
	 */
	public aqlStatements_return compile(String sqlString, IErrorReporter reporter, IResultReporter resultReporter) throws IOException{
		CharStream stream = new NoCaseStringStream(sqlString);
		return compileStringStream(stream, reporter, resultReporter);
	}
	/**
	 * Generate a code string from an AST
	 * @param ast
	 * @param resultReporter
	 * @return
	 */
	public String generate(aqlStatements_return ast, IResultReporter resultReporter, Language language){
		URL url = getTemplateURL(language);
		if (url == null){
			String msg = "Cannot find template for " + language;
			resultReporter.report(msg);
			log.error(msg);
			return null;
		}
		try{
			String outputString = parseAndWalkSnipets(parser, ast);
			return outputString;
		} catch (RecognitionException e) {
			resultReporter.report(e.getMessage());
			log.error(e.getMessage(), e);
		}	
		return null;
	}
	public void execute(PreparedStatement statement, IResultReporter resultReporter, IErrorReporter errorReporter) throws RecognitionException, AerospikeException{
		execute(statement.getAst(), resultReporter, errorReporter);
	}
	/**
	 * Execute 
	 * @param ast
	 * @param resultReporter
	 * @param errorReporter
	 * @throws AerospikeException 
	 * @throws RecognitionException 
	 */
	public void execute(aqlStatements_return ast, IResultReporter resultReporter, IErrorReporter errorReporter) throws RecognitionException, AerospikeException{
		//TODO add policy
		if (this.client == null){
			if (resultReporter != null)
				resultReporter.report("Aerospike client is null");
			else
				log.error("Aerospike client is null");
			return;
		}
		if (ast == null){
			if (resultReporter != null)
				resultReporter.report("Error: No AST");
			else
				log.error("Error: No AST");
			return;
		}
			CommonTree tree = (CommonTree) ast.getTree();
			if (tree == null)
				return;
			log.debug("AST tree:");
			log.debug(tree.toStringTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			nodes.setTokenStream(this.tokenStream);
			AQLExecutor walker = new AQLExecutor(nodes, this.client);
			walker.setErrorReporter(errorReporter);
			walker.setResultReporter(resultReporter);
			walker.aqlStatement();
			if (walker.getNumberOfSyntaxErrors() > 0) {
				log.error("Errors in AST tree: " + walker.getNumberOfSyntaxErrors());
			}
	}
	/** Prepares an AQL statement for execution
	 * 
	 * @param aqlString
	 * @param reporter
	 * @param resultReporter
	 * @return
	 */
	public PreparedStatement prepare(String aqlString, IErrorReporter reporter, IResultReporter resultReporter){
		aqlStatements_return ast;
		try {
			ast = compile(aqlString, reporter, resultReporter);
			PreparedStatement statement = new PreparedStatement(ast);
			return statement;
		} catch (IOException e) {
			log.error("Could not prepare AQL", e);
			throw new AQLException("Could not prepare AQL", e);
		}
	}

	public void execute(File file, IResultReporter resultReporter, IErrorReporter errorReporter) {
		if (this.client == null){
			if (resultReporter != null)
				resultReporter.report("Aerospike client is null");
			else
				log.error("Aerospike client is null");
			return;
		}
		if (file == null){
			if (resultReporter != null)
				resultReporter.report("Error: No input file");
			else
				log.error("Error: No input file");
			return;
		}
		if (!file.exists()){
			if (resultReporter != null)
				resultReporter.report("Error: Input file does not exist");
			else
				log.error("Error: Input file does not exist");
			return;
		}
		try{
			AQLastParser astParser = getFileParser(file);
			aqlFile_return result = astParser.aqlFile();
			if (astParser.getNumberOfSyntaxErrors() == 0){
				CommonTree tree = (CommonTree) result.getTree();
				if (tree == null)
					return;
				log.debug("AST tree:");
				log.debug(tree.toStringTree());
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
				nodes.setTokenStream(this.tokenStream);
				AQLExecutor walker = new AQLExecutor(nodes, this.client);
				walker.setErrorReporter(errorReporter);
				walker.setResultReporter(resultReporter);
				walker.aqlFile();
				if (walker.getNumberOfSyntaxErrors() > 0) {
					log.error("Errors in AST tree: " + walker.getNumberOfSyntaxErrors());
				}

			} else {
				log.error("Syntax errors: " + this.parser.getNumberOfSyntaxErrors());
			}
		} catch (IOException e){
			resultReporter.report(e.getMessage());
			log.error(e.getMessage(), e);
		} catch (RecognitionException e) {
			resultReporter.report(e.getMessage());
			log.error(e.getMessage(), e);
		} catch (AerospikeException e) {
			resultReporter.report(e.getMessage());
			log.error(e.getMessage(), e);
		}
	}
	public void interpret(InputStream in) throws Exception{

		//  interactive
		System.out.print("aql > ");

		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String commandline = null;

		try {
			while (true){
				commandline = br.readLine();
				if (commandline == null || commandline.isEmpty())
					continue;
				log.debug(commandline);
				getStringParser(commandline);
				try {
					aqlStatements_return result =  this.parser.aqlStatements();
					if (this.parser.getNumberOfSyntaxErrors() == 0){
						CommonTree tree = (CommonTree) result.getTree();
						if (tree == null)
							continue;
						log.debug("AST tree:");
						log.debug(tree.toStringTree());
						CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
						nodes.setTokenStream(this.tokenStream);
						AQLExecutor walker = new AQLExecutor(nodes, this.client);
						walker.setErrorReporter(new IErrorReporter() {
							int errors=0;
							public void reportError(int line, int charStart, int charEnd, String message) {
								log.error(line+":"+charStart+" "+message);
								errors++;
							}
							public int getErrors() {
								return errors;
							}

						});
						walker.aqlStatement();
						if (walker.getNumberOfSyntaxErrors() > 0) {
							log.error("Errors in AST tree: " + walker.getNumberOfSyntaxErrors());
						}

					} else {
						log.error("Syntax errors: " + this.parser.getNumberOfSyntaxErrors());
					}
				} catch (AerospikeException ae){
					log.error("Aerospike error: " + ae.getMessage());
					log.debug(ae.getMessage(), ae);
				}
				System.out.print("aql > ");
			}
		} catch (IOException ioe) {
			log.error("Error processing command: " + commandline, ioe);
			System.exit(1);
		}

	}

}
