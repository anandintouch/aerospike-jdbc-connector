// $ANTLR 3.5.1 AQLCodeGenerator.g 2014-10-20 13:56:19

package com.aerospike.aql.grammar;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class AQLCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AGGREGATE", "AND", "BETWEEN", 
		"BINS", "BIN_NAMES", "BY", "COMMENT", "CREATE", "DELETE", "DESC", "DIGIT", 
		"DROP", "ECHO", "EQ", "EXECUTE", "EXIT", "EscapeSequence", "FALSE", "FILTERS", 
		"FLOATLITERAL", "FROM", "FUNCTION", "GET", "HEXLITERAL", "HYPHEN", "HexDigit", 
		"HexPrefix", "IDENTIFIER", "INDEX", "INDEXES", "INSERT", "INTLITERAL", 
		"INTO", "IntegerNumber", "KILL", "KILL_QUERY", "KILL_SCAN", "LETTER", 
		"LUA_SYSTEM_PATH", "LUA_USER_PATH", "MODULE", "MODULES", "NAMESET", "NAMESPACES", 
		"NUMERIC", "ON", "ORDER", "OUTPUT", "PACKAGES", "PK", "PRINT", "QUERIES", 
		"QUERY", "QUIT", "RECORD_TTL", "REGISTER", "REMOVE", "RUN", "SCAN", "SCANS", 
		"SELECT", "SELECT_ALL", "SELECT_EXPLICIT", "SEMICOLON", "SET", "SETS", 
		"SHOW", "STAR", "STAT", "STRING", "STRINGLITERAL", "SYSTEM", "TIMEOUT", 
		"TRUE", "UNDERSCORE", "USE_SMD", "VALUES", "VERBOSE", "VIEW", "WHERE", 
		"WS", "'('", "')'", "','", "'.'", "'help'", "'json'", "'lua'", "'nosql'", 
		"'q'", "'so'", "'table'", "ASC"
	};
	public static final int EOF=-1;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int AGGREGATE=4;
	public static final int AND=5;
	public static final int BETWEEN=6;
	public static final int BINS=7;
	public static final int BIN_NAMES=8;
	public static final int BY=9;
	public static final int COMMENT=10;
	public static final int CREATE=11;
	public static final int DELETE=12;
	public static final int DESC=13;
	public static final int DIGIT=14;
	public static final int DROP=15;
	public static final int ECHO=16;
	public static final int EQ=17;
	public static final int EXECUTE=18;
	public static final int EXIT=19;
	public static final int EscapeSequence=20;
	public static final int FALSE=21;
	public static final int FILTERS=22;
	public static final int FLOATLITERAL=23;
	public static final int FROM=24;
	public static final int FUNCTION=25;
	public static final int GET=26;
	public static final int HEXLITERAL=27;
	public static final int HYPHEN=28;
	public static final int HexDigit=29;
	public static final int HexPrefix=30;
	public static final int IDENTIFIER=31;
	public static final int INDEX=32;
	public static final int INDEXES=33;
	public static final int INSERT=34;
	public static final int INTLITERAL=35;
	public static final int INTO=36;
	public static final int IntegerNumber=37;
	public static final int KILL=38;
	public static final int KILL_QUERY=39;
	public static final int KILL_SCAN=40;
	public static final int LETTER=41;
	public static final int LUA_SYSTEM_PATH=42;
	public static final int LUA_USER_PATH=43;
	public static final int MODULE=44;
	public static final int MODULES=45;
	public static final int NAMESET=46;
	public static final int NAMESPACES=47;
	public static final int NUMERIC=48;
	public static final int ON=49;
	public static final int ORDER=50;
	public static final int OUTPUT=51;
	public static final int PACKAGES=52;
	public static final int PK=53;
	public static final int PRINT=54;
	public static final int QUERIES=55;
	public static final int QUERY=56;
	public static final int QUIT=57;
	public static final int RECORD_TTL=58;
	public static final int REGISTER=59;
	public static final int REMOVE=60;
	public static final int RUN=61;
	public static final int SCAN=62;
	public static final int SCANS=63;
	public static final int SELECT=64;
	public static final int SELECT_ALL=65;
	public static final int SELECT_EXPLICIT=66;
	public static final int SEMICOLON=67;
	public static final int SET=68;
	public static final int SETS=69;
	public static final int SHOW=70;
	public static final int STAR=71;
	public static final int STAT=72;
	public static final int STRING=73;
	public static final int STRINGLITERAL=74;
	public static final int SYSTEM=75;
	public static final int TIMEOUT=76;
	public static final int TRUE=77;
	public static final int UNDERSCORE=78;
	public static final int USE_SMD=79;
	public static final int VALUES=80;
	public static final int VERBOSE=81;
	public static final int VIEW=82;
	public static final int WHERE=83;
	public static final int WS=84;
	public static final int ASC=96;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public AQLCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public AQLCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("AQLCodeGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return AQLCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "AQLCodeGenerator.g"; }


	public static class aqlFile_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "aqlFile"
	// AQLCodeGenerator.g:16:1: aqlFile[String fileName, String host, String portString] : (stmts+= aqlStatement )* -> aqlFile(className=$fileNamestatements=$stmtshost=$hostport=$portString);
	public final AQLCodeGenerator.aqlFile_return aqlFile(String fileName, String host, String portString) throws RecognitionException {
		AQLCodeGenerator.aqlFile_return retval = new AQLCodeGenerator.aqlFile_return();
		retval.start = input.LT(1);

		List<Object> list_stmts=null;
		RuleReturnScope stmts = null;
		try {
			// AQLCodeGenerator.g:17:2: ( (stmts+= aqlStatement )* -> aqlFile(className=$fileNamestatements=$stmtshost=$hostport=$portString))
			// AQLCodeGenerator.g:17:4: (stmts+= aqlStatement )*
			{
			// AQLCodeGenerator.g:17:9: (stmts+= aqlStatement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AGGREGATE||(LA1_0 >= CREATE && LA1_0 <= DESC)||LA1_0==DROP||(LA1_0 >= EXECUTE && LA1_0 <= EXIT)||LA1_0==GET||LA1_0==INSERT||(LA1_0 >= KILL_QUERY && LA1_0 <= KILL_SCAN)||LA1_0==PRINT||LA1_0==QUIT||LA1_0==REGISTER||LA1_0==RUN||(LA1_0 >= SELECT_ALL && LA1_0 <= SELECT_EXPLICIT)||LA1_0==SET||LA1_0==SHOW||LA1_0==STAT||LA1_0==89||LA1_0==93) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// AQLCodeGenerator.g:17:9: stmts+= aqlStatement
					{
					pushFollow(FOLLOW_aqlStatement_in_aqlFile66);
					stmts=aqlStatement();
					state._fsp--;
					if (state.failed) return retval;
					if (list_stmts==null) list_stmts=new ArrayList<Object>();
					list_stmts.add(stmts.getTemplate());
					}
					break;

				default :
					break loop1;
				}
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 17:25: -> aqlFile(className=$fileNamestatements=$stmtshost=$hostport=$portString)
			  {
			  	retval.st = templateLib.getInstanceOf("aqlFile",new STAttrMap().put("className", fileName).put("statements", list_stmts).put("host", host).put("port", portString));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aqlFile"


	public static class aqlStatement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "aqlStatement"
	// AQLCodeGenerator.g:20:1: aqlStatement : ( create -> statement(stmt=$create.st)| drop -> statement(stmt=$drop.st)| insert -> statement(stmt=$insert.st)| delete -> statement(stmt=$delete.st)| select -> statement(stmt=$select.st)| registerPackage -> statement(stmt=$registerPackage.st)| execute -> statement(stmt=$execute.st)| aggregate -> statement(stmt=$aggregate.st)| show -> statement(stmt=$show.st)| desc -> statement(stmt=$desc.st)| stat -> statement(stmt=$stat.st)| set -> statement(stmt=$set.st)| get -> statement(stmt=$get.st)| run -> statement(stmt=$run.st)| kill_query -> statement(stmt=$kill_query.st)| kill_scan -> statement(stmt=$kill_scan.st)| quit -> statement(stmt=$quit.st)| help -> statement(stmt=$help.st)| print -> statement(stmt=$print.st));
	public final AQLCodeGenerator.aqlStatement_return aqlStatement() throws RecognitionException {
		AQLCodeGenerator.aqlStatement_return retval = new AQLCodeGenerator.aqlStatement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope create1 =null;
		TreeRuleReturnScope drop2 =null;
		TreeRuleReturnScope insert3 =null;
		TreeRuleReturnScope delete4 =null;
		TreeRuleReturnScope select5 =null;
		TreeRuleReturnScope registerPackage6 =null;
		TreeRuleReturnScope execute7 =null;
		TreeRuleReturnScope aggregate8 =null;
		TreeRuleReturnScope show9 =null;
		TreeRuleReturnScope desc10 =null;
		TreeRuleReturnScope stat11 =null;
		TreeRuleReturnScope set12 =null;
		TreeRuleReturnScope get13 =null;
		TreeRuleReturnScope run14 =null;
		TreeRuleReturnScope kill_query15 =null;
		TreeRuleReturnScope kill_scan16 =null;
		TreeRuleReturnScope quit17 =null;
		TreeRuleReturnScope help18 =null;
		TreeRuleReturnScope print19 =null;

		try {
			// AQLCodeGenerator.g:21:2: ( create -> statement(stmt=$create.st)| drop -> statement(stmt=$drop.st)| insert -> statement(stmt=$insert.st)| delete -> statement(stmt=$delete.st)| select -> statement(stmt=$select.st)| registerPackage -> statement(stmt=$registerPackage.st)| execute -> statement(stmt=$execute.st)| aggregate -> statement(stmt=$aggregate.st)| show -> statement(stmt=$show.st)| desc -> statement(stmt=$desc.st)| stat -> statement(stmt=$stat.st)| set -> statement(stmt=$set.st)| get -> statement(stmt=$get.st)| run -> statement(stmt=$run.st)| kill_query -> statement(stmt=$kill_query.st)| kill_scan -> statement(stmt=$kill_scan.st)| quit -> statement(stmt=$quit.st)| help -> statement(stmt=$help.st)| print -> statement(stmt=$print.st))
			int alt2=19;
			switch ( input.LA(1) ) {
			case CREATE:
				{
				alt2=1;
				}
				break;
			case DROP:
				{
				alt2=2;
				}
				break;
			case INSERT:
				{
				alt2=3;
				}
				break;
			case DELETE:
				{
				alt2=4;
				}
				break;
			case SELECT_ALL:
			case SELECT_EXPLICIT:
				{
				alt2=5;
				}
				break;
			case REGISTER:
				{
				alt2=6;
				}
				break;
			case EXECUTE:
				{
				alt2=7;
				}
				break;
			case AGGREGATE:
				{
				alt2=8;
				}
				break;
			case SHOW:
				{
				alt2=9;
				}
				break;
			case DESC:
				{
				alt2=10;
				}
				break;
			case STAT:
				{
				alt2=11;
				}
				break;
			case SET:
				{
				alt2=12;
				}
				break;
			case GET:
				{
				alt2=13;
				}
				break;
			case RUN:
				{
				alt2=14;
				}
				break;
			case KILL_QUERY:
				{
				alt2=15;
				}
				break;
			case KILL_SCAN:
				{
				alt2=16;
				}
				break;
			case EXIT:
			case QUIT:
			case 93:
				{
				alt2=17;
				}
				break;
			case 89:
				{
				alt2=18;
				}
				break;
			case PRINT:
				{
				alt2=19;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// AQLCodeGenerator.g:21:4: create
					{
					pushFollow(FOLLOW_create_in_aqlStatement104);
					create1=create();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 21:11: -> statement(stmt=$create.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (create1!=null?((StringTemplate)create1.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:22:4: drop
					{
					pushFollow(FOLLOW_drop_in_aqlStatement118);
					drop2=drop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 22:10: -> statement(stmt=$drop.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (drop2!=null?((StringTemplate)drop2.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:23:4: insert
					{
					pushFollow(FOLLOW_insert_in_aqlStatement133);
					insert3=insert();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 23:11: -> statement(stmt=$insert.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (insert3!=null?((StringTemplate)insert3.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// AQLCodeGenerator.g:24:4: delete
					{
					pushFollow(FOLLOW_delete_in_aqlStatement147);
					delete4=delete();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 24:11: -> statement(stmt=$delete.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (delete4!=null?((StringTemplate)delete4.getTemplate()):null)));
					  }


					}

					}
					break;
				case 5 :
					// AQLCodeGenerator.g:25:4: select
					{
					pushFollow(FOLLOW_select_in_aqlStatement161);
					select5=select();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 25:11: -> statement(stmt=$select.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (select5!=null?((StringTemplate)select5.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// AQLCodeGenerator.g:26:4: registerPackage
					{
					pushFollow(FOLLOW_registerPackage_in_aqlStatement175);
					registerPackage6=registerPackage();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 26:20: -> statement(stmt=$registerPackage.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (registerPackage6!=null?((StringTemplate)registerPackage6.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// AQLCodeGenerator.g:27:4: execute
					{
					pushFollow(FOLLOW_execute_in_aqlStatement189);
					execute7=execute();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 27:12: -> statement(stmt=$execute.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (execute7!=null?((StringTemplate)execute7.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// AQLCodeGenerator.g:28:4: aggregate
					{
					pushFollow(FOLLOW_aggregate_in_aqlStatement203);
					aggregate8=aggregate();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 28:14: -> statement(stmt=$aggregate.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (aggregate8!=null?((StringTemplate)aggregate8.getTemplate()):null)));
					  }


					}

					}
					break;
				case 9 :
					// AQLCodeGenerator.g:29:4: show
					{
					pushFollow(FOLLOW_show_in_aqlStatement217);
					show9=show();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 29:9: -> statement(stmt=$show.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (show9!=null?((StringTemplate)show9.getTemplate()):null)));
					  }


					}

					}
					break;
				case 10 :
					// AQLCodeGenerator.g:30:4: desc
					{
					pushFollow(FOLLOW_desc_in_aqlStatement231);
					desc10=desc();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 30:9: -> statement(stmt=$desc.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (desc10!=null?((StringTemplate)desc10.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// AQLCodeGenerator.g:31:4: stat
					{
					pushFollow(FOLLOW_stat_in_aqlStatement245);
					stat11=stat();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 31:9: -> statement(stmt=$stat.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (stat11!=null?((StringTemplate)stat11.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// AQLCodeGenerator.g:32:4: set
					{
					pushFollow(FOLLOW_set_in_aqlStatement259);
					set12=set();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 32:8: -> statement(stmt=$set.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (set12!=null?((StringTemplate)set12.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// AQLCodeGenerator.g:33:4: get
					{
					pushFollow(FOLLOW_get_in_aqlStatement273);
					get13=get();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 33:8: -> statement(stmt=$get.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (get13!=null?((StringTemplate)get13.getTemplate()):null)));
					  }


					}

					}
					break;
				case 14 :
					// AQLCodeGenerator.g:34:4: run
					{
					pushFollow(FOLLOW_run_in_aqlStatement287);
					run14=run();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 34:8: -> statement(stmt=$run.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (run14!=null?((StringTemplate)run14.getTemplate()):null)));
					  }


					}

					}
					break;
				case 15 :
					// AQLCodeGenerator.g:35:4: kill_query
					{
					pushFollow(FOLLOW_kill_query_in_aqlStatement301);
					kill_query15=kill_query();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 35:15: -> statement(stmt=$kill_query.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (kill_query15!=null?((StringTemplate)kill_query15.getTemplate()):null)));
					  }


					}

					}
					break;
				case 16 :
					// AQLCodeGenerator.g:36:4: kill_scan
					{
					pushFollow(FOLLOW_kill_scan_in_aqlStatement315);
					kill_scan16=kill_scan();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 36:14: -> statement(stmt=$kill_scan.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (kill_scan16!=null?((StringTemplate)kill_scan16.getTemplate()):null)));
					  }


					}

					}
					break;
				case 17 :
					// AQLCodeGenerator.g:37:4: quit
					{
					pushFollow(FOLLOW_quit_in_aqlStatement329);
					quit17=quit();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 37:9: -> statement(stmt=$quit.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (quit17!=null?((StringTemplate)quit17.getTemplate()):null)));
					  }


					}

					}
					break;
				case 18 :
					// AQLCodeGenerator.g:38:4: help
					{
					pushFollow(FOLLOW_help_in_aqlStatement343);
					help18=help();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 38:9: -> statement(stmt=$help.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (help18!=null?((StringTemplate)help18.getTemplate()):null)));
					  }


					}

					}
					break;
				case 19 :
					// AQLCodeGenerator.g:39:5: print
					{
					pushFollow(FOLLOW_print_in_aqlStatement358);
					print19=print();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 39:11: -> statement(stmt=$print.st)
					  {
					  	retval.st = templateLib.getInstanceOf("statement",new STAttrMap().put("stmt", (print19!=null?((StringTemplate)print19.getTemplate()):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aqlStatement"


	public static class create_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "create"
	// AQLCodeGenerator.g:48:1: create : ^( CREATE index_name nameSet bin indexType ) -> create(source=$CREATE.sourceindexName=$index_name.textnameSpace=$nameSet.nameSpacesetName=$nameSet.setNamebinName=$bin.nametype=$indexType.text);
	public final AQLCodeGenerator.create_return create() throws RecognitionException {
		AQLCodeGenerator.create_return retval = new AQLCodeGenerator.create_return();
		retval.start = input.LT(1);

		AQLTree CREATE20=null;
		TreeRuleReturnScope index_name21 =null;
		TreeRuleReturnScope nameSet22 =null;
		TreeRuleReturnScope bin23 =null;
		TreeRuleReturnScope indexType24 =null;

		try {
			// AQLCodeGenerator.g:49:2: ( ^( CREATE index_name nameSet bin indexType ) -> create(source=$CREATE.sourceindexName=$index_name.textnameSpace=$nameSet.nameSpacesetName=$nameSet.setNamebinName=$bin.nametype=$indexType.text))
			// AQLCodeGenerator.g:49:4: ^( CREATE index_name nameSet bin indexType )
			{
			CREATE20=(AQLTree)match(input,CREATE,FOLLOW_CREATE_in_create382); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_index_name_in_create384);
			index_name21=index_name();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_create386);
			nameSet22=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_bin_in_create388);
			bin23=bin();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_indexType_in_create390);
			indexType24=indexType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 51:3: -> create(source=$CREATE.sourceindexName=$index_name.textnameSpace=$nameSet.nameSpacesetName=$nameSet.setNamebinName=$bin.nametype=$indexType.text)
			  {
			  	retval.st = templateLib.getInstanceOf("create",new STAttrMap().put("source", CREATE20.source).put("indexName", (index_name21!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name21.start),input.getTreeAdaptor().getTokenStopIndex(index_name21.start))):null)).put("nameSpace", (nameSet22!=null?((AQLCodeGenerator.nameSet_return)nameSet22).nameSpace:null)).put("setName", (nameSet22!=null?((AQLCodeGenerator.nameSet_return)nameSet22).setName:null)).put("binName", (bin23!=null?((AQLCodeGenerator.bin_return)bin23).name:null)).put("type", (indexType24!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(indexType24.start),input.getTreeAdaptor().getTokenStopIndex(indexType24.start))):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create"


	public static class drop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "drop"
	// AQLCodeGenerator.g:54:1: drop : ^( DROP ( ^( INDEX index_name ins= nameSet ) -> drop(source=$DROP.sourceindexName=$index_name.textnameSpace=$ins.nameSpacesetName=$ins.setName)| ^( MODULE moduleName ) -> remove(source=$DROP.sourcepackage=$moduleName.text)| ^( SET sns= nameSet ) -> deleteSet(source=$DROP.sourcenamespace=$sns.nameSpaceset=$sns.setName)) ) ;
	public final AQLCodeGenerator.drop_return drop() throws RecognitionException {
		AQLCodeGenerator.drop_return retval = new AQLCodeGenerator.drop_return();
		retval.start = input.LT(1);

		AQLTree DROP25=null;
		TreeRuleReturnScope ins =null;
		TreeRuleReturnScope sns =null;
		TreeRuleReturnScope index_name26 =null;
		TreeRuleReturnScope moduleName27 =null;

		try {
			// AQLCodeGenerator.g:55:2: ( ^( DROP ( ^( INDEX index_name ins= nameSet ) -> drop(source=$DROP.sourceindexName=$index_name.textnameSpace=$ins.nameSpacesetName=$ins.setName)| ^( MODULE moduleName ) -> remove(source=$DROP.sourcepackage=$moduleName.text)| ^( SET sns= nameSet ) -> deleteSet(source=$DROP.sourcenamespace=$sns.nameSpaceset=$sns.setName)) ) )
			// AQLCodeGenerator.g:55:4: ^( DROP ( ^( INDEX index_name ins= nameSet ) -> drop(source=$DROP.sourceindexName=$index_name.textnameSpace=$ins.nameSpacesetName=$ins.setName)| ^( MODULE moduleName ) -> remove(source=$DROP.sourcepackage=$moduleName.text)| ^( SET sns= nameSet ) -> deleteSet(source=$DROP.sourcenamespace=$sns.nameSpaceset=$sns.setName)) )
			{
			DROP25=(AQLTree)match(input,DROP,FOLLOW_DROP_in_drop442); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// AQLCodeGenerator.g:56:2: ( ^( INDEX index_name ins= nameSet ) -> drop(source=$DROP.sourceindexName=$index_name.textnameSpace=$ins.nameSpacesetName=$ins.setName)| ^( MODULE moduleName ) -> remove(source=$DROP.sourcepackage=$moduleName.text)| ^( SET sns= nameSet ) -> deleteSet(source=$DROP.sourcenamespace=$sns.nameSpaceset=$sns.setName))
			int alt3=3;
			switch ( input.LA(1) ) {
			case INDEX:
				{
				alt3=1;
				}
				break;
			case MODULE:
				{
				alt3=2;
				}
				break;
			case SET:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// AQLCodeGenerator.g:57:4: ^( INDEX index_name ins= nameSet )
					{
					match(input,INDEX,FOLLOW_INDEX_in_drop452); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_index_name_in_drop454);
					index_name26=index_name();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_nameSet_in_drop458);
					ins=nameSet();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 57:36: -> drop(source=$DROP.sourceindexName=$index_name.textnameSpace=$ins.nameSpacesetName=$ins.setName)
					  {
					  	retval.st = templateLib.getInstanceOf("drop",new STAttrMap().put("source", DROP25.source).put("indexName", (index_name26!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name26.start),input.getTreeAdaptor().getTokenStopIndex(index_name26.start))):null)).put("nameSpace", (ins!=null?((AQLCodeGenerator.nameSet_return)ins).nameSpace:null)).put("setName", (ins!=null?((AQLCodeGenerator.nameSet_return)ins).setName:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:58:5: ^( MODULE moduleName )
					{
					match(input,MODULE,FOLLOW_MODULE_in_drop490); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_moduleName_in_drop492);
					moduleName27=moduleName();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 58:26: -> remove(source=$DROP.sourcepackage=$moduleName.text)
					  {
					  	retval.st = templateLib.getInstanceOf("remove",new STAttrMap().put("source", DROP25.source).put("package", (moduleName27!=null?((AQLCodeGenerator.moduleName_return)moduleName27).text:null)));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:59:5: ^( SET sns= nameSet )
					{
					match(input,SET,FOLLOW_SET_in_drop514); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_nameSet_in_drop518);
					sns=nameSet();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 59:24: -> deleteSet(source=$DROP.sourcenamespace=$sns.nameSpaceset=$sns.setName)
					  {
					  	retval.st = templateLib.getInstanceOf("deleteSet",new STAttrMap().put("source", DROP25.source).put("namespace", (sns!=null?((AQLCodeGenerator.nameSet_return)sns).nameSpace:null)).put("set", (sns!=null?((AQLCodeGenerator.nameSet_return)sns).setName:null)));
					  }


					}

					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "drop"


	public static class indexType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexType"
	// AQLCodeGenerator.g:63:1: indexType : ( NUMERIC | STRING );
	public final AQLCodeGenerator.indexType_return indexType() throws RecognitionException {
		AQLCodeGenerator.indexType_return retval = new AQLCodeGenerator.indexType_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:64:2: ( NUMERIC | STRING )
			// AQLCodeGenerator.g:
			{
			if ( input.LA(1)==NUMERIC||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexType"


	public static class insert_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "insert"
	// AQLCodeGenerator.g:75:1: insert : ^( INSERT nameSet primaryKey bn= binNameList v= valueList ) -> insertStmt(source=$INSERT.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.valuebinNames=$bn.binsvalues=$v.values);
	public final AQLCodeGenerator.insert_return insert() throws RecognitionException {
		AQLCodeGenerator.insert_return retval = new AQLCodeGenerator.insert_return();
		retval.start = input.LT(1);

		AQLTree INSERT28=null;
		TreeRuleReturnScope bn =null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope nameSet29 =null;
		TreeRuleReturnScope primaryKey30 =null;

		try {
			// AQLCodeGenerator.g:76:2: ( ^( INSERT nameSet primaryKey bn= binNameList v= valueList ) -> insertStmt(source=$INSERT.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.valuebinNames=$bn.binsvalues=$v.values))
			// AQLCodeGenerator.g:76:4: ^( INSERT nameSet primaryKey bn= binNameList v= valueList )
			{
			INSERT28=(AQLTree)match(input,INSERT,FOLLOW_INSERT_in_insert574); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_insert576);
			nameSet29=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_primaryKey_in_insert578);
			primaryKey30=primaryKey();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_binNameList_in_insert582);
			bn=binNameList();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_valueList_in_insert586);
			v=valueList();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 77:3: -> insertStmt(source=$INSERT.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.valuebinNames=$bn.binsvalues=$v.values)
			  {
			  	retval.st = templateLib.getInstanceOf("insertStmt",new STAttrMap().put("source", INSERT28.source).put("nameSpace", (nameSet29!=null?((AQLCodeGenerator.nameSet_return)nameSet29).nameSpace:null)).put("setName", (nameSet29!=null?((AQLCodeGenerator.nameSet_return)nameSet29).setName:null)).put("primaryKey", (primaryKey30!=null?((AQLCodeGenerator.primaryKey_return)primaryKey30).value:null)).put("binNames", (bn!=null?((AQLCodeGenerator.binNameList_return)bn).bins:null)).put("values", (v!=null?((AQLCodeGenerator.valueList_return)v).values:null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insert"


	public static class delete_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "delete"
	// AQLCodeGenerator.g:81:1: delete : ^( DELETE nameSet primaryKey ) -> deleteStmt(source=$DELETE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.value);
	public final AQLCodeGenerator.delete_return delete() throws RecognitionException {
		AQLCodeGenerator.delete_return retval = new AQLCodeGenerator.delete_return();
		retval.start = input.LT(1);

		AQLTree DELETE31=null;
		TreeRuleReturnScope nameSet32 =null;
		TreeRuleReturnScope primaryKey33 =null;

		try {
			// AQLCodeGenerator.g:82:2: ( ^( DELETE nameSet primaryKey ) -> deleteStmt(source=$DELETE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.value))
			// AQLCodeGenerator.g:82:4: ^( DELETE nameSet primaryKey )
			{
			DELETE31=(AQLTree)match(input,DELETE,FOLLOW_DELETE_in_delete642); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_delete644);
			nameSet32=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_primaryKey_in_delete646);
			primaryKey33=primaryKey();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 83:3: -> deleteStmt(source=$DELETE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNameprimaryKey=$primaryKey.value)
			  {
			  	retval.st = templateLib.getInstanceOf("deleteStmt",new STAttrMap().put("source", DELETE31.source).put("nameSpace", (nameSet32!=null?((AQLCodeGenerator.nameSet_return)nameSet32).nameSpace:null)).put("setName", (nameSet32!=null?((AQLCodeGenerator.nameSet_return)nameSet32).setName:null)).put("primaryKey", (primaryKey33!=null?((AQLCodeGenerator.primaryKey_return)primaryKey33).value:null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "delete"


	protected static class select_scope {
		String nameSpace;
		String setName;
		String key;
	}
	protected Stack<select_scope> select_stack = new Stack<select_scope>();

	public static class select_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "select"
	// AQLCodeGenerator.g:95:1: select : ( ^( SELECT_ALL from ) -> select(source=$SELECT_ALL.sourcenameSpace=$select::nameSpacesetName=$select::setNamewhere=$from.wherekey=$select::key)| ^( SELECT_EXPLICIT bn= binNameList from ) -> select(source=$SELECT_EXPLICIT.sourcenameSpace=$select::nameSpacesetName=$select::setNamebinNames=$bn.binswhere=$from.wherekey=$select::keyorderBy=$from.orderBy));
	public final AQLCodeGenerator.select_return select() throws RecognitionException {
		select_stack.push(new select_scope());
		AQLCodeGenerator.select_return retval = new AQLCodeGenerator.select_return();
		retval.start = input.LT(1);

		AQLTree SELECT_ALL34=null;
		AQLTree SELECT_EXPLICIT36=null;
		TreeRuleReturnScope bn =null;
		TreeRuleReturnScope from35 =null;
		TreeRuleReturnScope from37 =null;

		try {
			// AQLCodeGenerator.g:96:2: ( ^( SELECT_ALL from ) -> select(source=$SELECT_ALL.sourcenameSpace=$select::nameSpacesetName=$select::setNamewhere=$from.wherekey=$select::key)| ^( SELECT_EXPLICIT bn= binNameList from ) -> select(source=$SELECT_EXPLICIT.sourcenameSpace=$select::nameSpacesetName=$select::setNamebinNames=$bn.binswhere=$from.wherekey=$select::keyorderBy=$from.orderBy))
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==SELECT_ALL) ) {
				alt4=1;
			}
			else if ( (LA4_0==SELECT_EXPLICIT) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// AQLCodeGenerator.g:96:4: ^( SELECT_ALL from )
					{
					SELECT_ALL34=(AQLTree)match(input,SELECT_ALL,FOLLOW_SELECT_ALL_in_select691); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_from_in_select693);
					from35=from();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 97:3: -> select(source=$SELECT_ALL.sourcenameSpace=$select::nameSpacesetName=$select::setNamewhere=$from.wherekey=$select::key)
					  {
					  	retval.st = templateLib.getInstanceOf("select",new STAttrMap().put("source", SELECT_ALL34.source).put("nameSpace", select_stack.peek().nameSpace).put("setName", select_stack.peek().setName).put("where", (from35!=null?((AQLCodeGenerator.from_return)from35).where:null)).put("key", select_stack.peek().key));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:98:4: ^( SELECT_EXPLICIT bn= binNameList from )
					{
					SELECT_EXPLICIT36=(AQLTree)match(input,SELECT_EXPLICIT,FOLLOW_SELECT_EXPLICIT_in_select731); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_binNameList_in_select735);
					bn=binNameList();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_from_in_select737);
					from37=from();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 99:3: -> select(source=$SELECT_EXPLICIT.sourcenameSpace=$select::nameSpacesetName=$select::setNamebinNames=$bn.binswhere=$from.wherekey=$select::keyorderBy=$from.orderBy)
					  {
					  	retval.st = templateLib.getInstanceOf("select",new STAttrMap().put("source", SELECT_EXPLICIT36.source).put("nameSpace", select_stack.peek().nameSpace).put("setName", select_stack.peek().setName).put("binNames", (bn!=null?((AQLCodeGenerator.binNameList_return)bn).bins:null)).put("where", (from37!=null?((AQLCodeGenerator.from_return)from37).where:null)).put("key", select_stack.peek().key).put("orderBy", (from37!=null?((AQLCodeGenerator.from_return)from37).orderBy:null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			select_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "select"


	public static class from_return extends TreeRuleReturnScope {
		public StringTemplate where;
		public StringTemplate orderBy;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "from"
	// AQLCodeGenerator.g:103:1: from returns [StringTemplate where, StringTemplate orderBy] : ^( FROM nameSet ( ^( WHERE expressions[$select::nameSpace, $select::setName] ) )? ( ^( ORDER orderby ) )? ) ;
	public final AQLCodeGenerator.from_return from() throws RecognitionException {
		AQLCodeGenerator.from_return retval = new AQLCodeGenerator.from_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope nameSet38 =null;
		TreeRuleReturnScope expressions39 =null;
		TreeRuleReturnScope orderby40 =null;

		try {
			// AQLCodeGenerator.g:104:2: ( ^( FROM nameSet ( ^( WHERE expressions[$select::nameSpace, $select::setName] ) )? ( ^( ORDER orderby ) )? ) )
			// AQLCodeGenerator.g:104:4: ^( FROM nameSet ( ^( WHERE expressions[$select::nameSpace, $select::setName] ) )? ( ^( ORDER orderby ) )? )
			{
			match(input,FROM,FOLLOW_FROM_in_from800); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_from802);
			nameSet38=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {select_stack.peek().nameSpace = (nameSet38!=null?((AQLCodeGenerator.nameSet_return)nameSet38).nameSpace:null); select_stack.peek().setName = (nameSet38!=null?((AQLCodeGenerator.nameSet_return)nameSet38).setName:null); }
			// AQLCodeGenerator.g:105:3: ( ^( WHERE expressions[$select::nameSpace, $select::setName] ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WHERE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// AQLCodeGenerator.g:105:4: ^( WHERE expressions[$select::nameSpace, $select::setName] )
					{
					match(input,WHERE,FOLLOW_WHERE_in_from811); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expressions_in_from813);
					expressions39=expressions(select_stack.peek().nameSpace, select_stack.peek().setName);
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.where = (expressions39!=null?((StringTemplate)expressions39.getTemplate()):null);}
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;

			}

			// AQLCodeGenerator.g:106:3: ( ^( ORDER orderby ) )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ORDER) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// AQLCodeGenerator.g:106:4: ^( ORDER orderby )
					{
					match(input,ORDER,FOLLOW_ORDER_in_from825); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_orderby_in_from827);
					orderby40=orderby();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.orderBy = (orderby40!=null?((StringTemplate)orderby40.getTemplate()):null);}
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "from"


	public static class orderby_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "orderby"
	// AQLCodeGenerator.g:110:1: orderby : (list+= order )+ -> orderBy(list=$list);
	public final AQLCodeGenerator.orderby_return orderby() throws RecognitionException {
		AQLCodeGenerator.orderby_return retval = new AQLCodeGenerator.orderby_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// AQLCodeGenerator.g:111:2: ( (list+= order )+ -> orderBy(list=$list))
			// AQLCodeGenerator.g:111:4: (list+= order )+
			{
			// AQLCodeGenerator.g:111:8: (list+= order )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DESC||LA7_0==ASC) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// AQLCodeGenerator.g:111:8: list+= order
					{
					pushFollow(FOLLOW_order_in_orderby850);
					list=order();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 111:17: -> orderBy(list=$list)
			  {
			  	retval.st = templateLib.getInstanceOf("orderBy",new STAttrMap().put("list", list_list));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderby"


	public static class order_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "order"
	// AQLCodeGenerator.g:114:1: order : ( ^( ASC bin ) -> ascend(bin=$bin.name)| ^( DESC bin ) -> descend(bin=$bin.name));
	public final AQLCodeGenerator.order_return order() throws RecognitionException {
		AQLCodeGenerator.order_return retval = new AQLCodeGenerator.order_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bin41 =null;
		TreeRuleReturnScope bin42 =null;

		try {
			// AQLCodeGenerator.g:115:2: ( ^( ASC bin ) -> ascend(bin=$bin.name)| ^( DESC bin ) -> descend(bin=$bin.name))
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ASC) ) {
				alt8=1;
			}
			else if ( (LA8_0==DESC) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// AQLCodeGenerator.g:115:4: ^( ASC bin )
					{
					match(input,ASC,FOLLOW_ASC_in_order873); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_bin_in_order875);
					bin41=bin();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 115:15: -> ascend(bin=$bin.name)
					  {
					  	retval.st = templateLib.getInstanceOf("ascend",new STAttrMap().put("bin", (bin41!=null?((AQLCodeGenerator.bin_return)bin41).name:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:116:4: ^( DESC bin )
					{
					match(input,DESC,FOLLOW_DESC_in_order893); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_bin_in_order895);
					bin42=bin();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 116:16: -> descend(bin=$bin.name)
					  {
					  	retval.st = templateLib.getInstanceOf("descend",new STAttrMap().put("bin", (bin42!=null?((AQLCodeGenerator.bin_return)bin42).name:null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "order"


	public static class expressions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressions"
	// AQLCodeGenerator.g:119:1: expressions[String nameSpace, String setName] : ( ^( PK value ) -> wherePK(value=$value.text)| ^( FILTERS list+= filter ) -> whereFilter(nameSpace=$nameSpacesetName=$setNamefilters=$list));
	public final AQLCodeGenerator.expressions_return expressions(String nameSpace, String setName) throws RecognitionException {
		AQLCodeGenerator.expressions_return retval = new AQLCodeGenerator.expressions_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope value43 =null;
		RuleReturnScope list = null;
		try {
			// AQLCodeGenerator.g:120:2: ( ^( PK value ) -> wherePK(value=$value.text)| ^( FILTERS list+= filter ) -> whereFilter(nameSpace=$nameSpacesetName=$setNamefilters=$list))
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PK) ) {
				alt9=1;
			}
			else if ( (LA9_0==FILTERS) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// AQLCodeGenerator.g:120:4: ^( PK value )
					{
					match(input,PK,FOLLOW_PK_in_expressions921); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_value_in_expressions923);
					value43=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {select_stack.peek().key = (value43!=null?((AQLCodeGenerator.value_return)value43).text:null);}
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 120:46: -> wherePK(value=$value.text)
					  {
					  	retval.st = templateLib.getInstanceOf("wherePK",new STAttrMap().put("value", (value43!=null?((AQLCodeGenerator.value_return)value43).text:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:121:4: ^( FILTERS list+= filter )
					{
					match(input,FILTERS,FOLLOW_FILTERS_in_expressions941); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_filter_in_expressions945);
					list=filter();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 121:28: -> whereFilter(nameSpace=$nameSpacesetName=$setNamefilters=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("whereFilter",new STAttrMap().put("nameSpace", nameSpace).put("setName", setName).put("filters", list_list));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressions"


	public static class filter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "filter"
	// AQLCodeGenerator.g:123:1: filter : ( ^( EQ bin value ) -> filterEquals(bin=$bin.namevalue=$value.text)| ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL ) -> filterRange(bin=$bin.namelow=$low.texthigh=$high.text)| ^( BETWEEN b2= bin lowF= function highF= function ) -> filterRangeFunction(bin=$bin.namelow=$low.texthigh=$high.text));
	public final AQLCodeGenerator.filter_return filter() throws RecognitionException {
		AQLCodeGenerator.filter_return retval = new AQLCodeGenerator.filter_return();
		retval.start = input.LT(1);

		AQLTree low=null;
		AQLTree high=null;
		TreeRuleReturnScope b2 =null;
		TreeRuleReturnScope lowF =null;
		TreeRuleReturnScope highF =null;
		TreeRuleReturnScope bin44 =null;
		TreeRuleReturnScope value45 =null;

		try {
			// AQLCodeGenerator.g:124:2: ( ^( EQ bin value ) -> filterEquals(bin=$bin.namevalue=$value.text)| ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL ) -> filterRange(bin=$bin.namelow=$low.texthigh=$high.text)| ^( BETWEEN b2= bin lowF= function highF= function ) -> filterRangeFunction(bin=$bin.namelow=$low.texthigh=$high.text))
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==EQ) ) {
				alt10=1;
			}
			else if ( (LA10_0==BETWEEN) ) {
				int LA10_2 = input.LA(2);
				if ( (LA10_2==DOWN) ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3==IDENTIFIER) ) {
						int LA10_4 = input.LA(4);
						if ( (LA10_4==INTLITERAL) ) {
							alt10=2;
						}
						else if ( (LA10_4==FUNCTION) ) {
							alt10=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// AQLCodeGenerator.g:124:4: ^( EQ bin value )
					{
					match(input,EQ,FOLLOW_EQ_in_filter977); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_bin_in_filter979);
					bin44=bin();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_value_in_filter981);
					value45=value();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 124:20: -> filterEquals(bin=$bin.namevalue=$value.text)
					  {
					  	retval.st = templateLib.getInstanceOf("filterEquals",new STAttrMap().put("bin", (bin44!=null?((AQLCodeGenerator.bin_return)bin44).name:null)).put("value", (value45!=null?((AQLCodeGenerator.value_return)value45).text:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:125:4: ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL )
					{
					match(input,BETWEEN,FOLLOW_BETWEEN_in_filter1001); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_bin_in_filter1005);
					b2=bin();
					state._fsp--;
					if (state.failed) return retval;
					low=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter1009); if (state.failed) return retval;
					high=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter1013); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 125:53: -> filterRange(bin=$bin.namelow=$low.texthigh=$high.text)
					  {
					  	retval.st = templateLib.getInstanceOf("filterRange",new STAttrMap().put("bin", (b2!=null?((AQLCodeGenerator.bin_return)b2).name:null)).put("low", (low!=null?low.getText():null)).put("high", (high!=null?high.getText():null)));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:126:5: ^( BETWEEN b2= bin lowF= function highF= function )
					{
					match(input,BETWEEN,FOLLOW_BETWEEN_in_filter1039); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_bin_in_filter1043);
					b2=bin();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_function_in_filter1047);
					lowF=function();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_function_in_filter1051);
					highF=function();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 126:52: -> filterRangeFunction(bin=$bin.namelow=$low.texthigh=$high.text)
					  {
					  	retval.st = templateLib.getInstanceOf("filterRangeFunction",new STAttrMap().put("bin", (b2!=null?((AQLCodeGenerator.bin_return)b2).name:null)).put("low", (low!=null?low.getText():null)).put("high", (high!=null?high.getText():null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filter"


	public static class function_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "function"
	// AQLCodeGenerator.g:129:1: function : ^( FUNCTION id= IDENTIFIER value ) -> function(name=$idvalue=$value.text);
	public final AQLCodeGenerator.function_return function() throws RecognitionException {
		AQLCodeGenerator.function_return retval = new AQLCodeGenerator.function_return();
		retval.start = input.LT(1);

		AQLTree id=null;
		TreeRuleReturnScope value46 =null;

		try {
			// AQLCodeGenerator.g:130:3: ( ^( FUNCTION id= IDENTIFIER value ) -> function(name=$idvalue=$value.text))
			// AQLCodeGenerator.g:130:5: ^( FUNCTION id= IDENTIFIER value )
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_function1083); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			id=(AQLTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1087); if (state.failed) return retval;
			pushFollow(FOLLOW_value_in_function1089);
			value46=value();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 130:37: -> function(name=$idvalue=$value.text)
			  {
			  	retval.st = templateLib.getInstanceOf("function",new STAttrMap().put("name", id).put("value", (value46!=null?((AQLCodeGenerator.value_return)value46).text:null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class binNameList_return extends TreeRuleReturnScope {
		public List<String> bins;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binNameList"
	// AQLCodeGenerator.g:132:1: binNameList returns [List<String> bins] : ^( BIN_NAMES ( bin )+ ) ;
	public final AQLCodeGenerator.binNameList_return binNameList() throws RecognitionException {
		AQLCodeGenerator.binNameList_return retval = new AQLCodeGenerator.binNameList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bin47 =null;


			retval.bins = new ArrayList<String>();

		try {
			// AQLCodeGenerator.g:136:2: ( ^( BIN_NAMES ( bin )+ ) )
			// AQLCodeGenerator.g:136:4: ^( BIN_NAMES ( bin )+ )
			{
			match(input,BIN_NAMES,FOLLOW_BIN_NAMES_in_binNameList1125); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// AQLCodeGenerator.g:136:16: ( bin )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENTIFIER) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// AQLCodeGenerator.g:136:17: bin
					{
					pushFollow(FOLLOW_bin_in_binNameList1128);
					bin47=bin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.bins.add((bin47!=null?((AQLCodeGenerator.bin_return)bin47).name:null));}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binNameList"


	public static class valueList_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "valueList"
	// AQLCodeGenerator.g:139:1: valueList returns [List<String> values] : ^( VALUES ( value )+ ) ;
	public final AQLCodeGenerator.valueList_return valueList() throws RecognitionException {
		AQLCodeGenerator.valueList_return retval = new AQLCodeGenerator.valueList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope value48 =null;


			retval.values = new ArrayList<String>();

		try {
			// AQLCodeGenerator.g:143:2: ( ^( VALUES ( value )+ ) )
			// AQLCodeGenerator.g:143:4: ^( VALUES ( value )+ )
			{
			match(input,VALUES,FOLLOW_VALUES_in_valueList1155); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// AQLCodeGenerator.g:143:13: ( value )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==INTLITERAL||LA12_0==STRINGLITERAL) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// AQLCodeGenerator.g:143:14: value
					{
					pushFollow(FOLLOW_value_in_valueList1158);
					value48=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.values.add((value48!=null?((AQLCodeGenerator.value_return)value48).text:null));}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueList"


	public static class nameSet_return extends TreeRuleReturnScope {
		public String nameSpace;
		public String setName;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nameSet"
	// AQLCodeGenerator.g:147:1: nameSet returns [String nameSpace, String setName] : ^( NAMESET namespace_name ( set_name )? ) ;
	public final AQLCodeGenerator.nameSet_return nameSet() throws RecognitionException {
		AQLCodeGenerator.nameSet_return retval = new AQLCodeGenerator.nameSet_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope namespace_name49 =null;
		TreeRuleReturnScope set_name50 =null;

		try {
			// AQLCodeGenerator.g:148:2: ( ^( NAMESET namespace_name ( set_name )? ) )
			// AQLCodeGenerator.g:148:4: ^( NAMESET namespace_name ( set_name )? )
			{
			match(input,NAMESET,FOLLOW_NAMESET_in_nameSet1181); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_namespace_name_in_nameSet1183);
			namespace_name49=namespace_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.nameSpace =(namespace_name49!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(namespace_name49.start),input.getTreeAdaptor().getTokenStopIndex(namespace_name49.start))):null);}
			// AQLCodeGenerator.g:148:64: ( set_name )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENTIFIER) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// AQLCodeGenerator.g:148:64: set_name
					{
					pushFollow(FOLLOW_set_name_in_nameSet1187);
					set_name50=set_name();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {retval.setName =(set_name50!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(set_name50.start),input.getTreeAdaptor().getTokenStopIndex(set_name50.start))):null);}
			match(input, Token.UP, null); if (state.failed) return retval;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameSet"


	public static class registerPackage_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "registerPackage"
	// AQLCodeGenerator.g:164:1: registerPackage : ^( REGISTER path= STRINGLITERAL ) -> register(source=$REGISTER.sourcepath=$path.text.substring(1, $path.text.length()-1));
	public final AQLCodeGenerator.registerPackage_return registerPackage() throws RecognitionException {
		AQLCodeGenerator.registerPackage_return retval = new AQLCodeGenerator.registerPackage_return();
		retval.start = input.LT(1);

		AQLTree path=null;
		AQLTree REGISTER51=null;

		try {
			// AQLCodeGenerator.g:165:2: ( ^( REGISTER path= STRINGLITERAL ) -> register(source=$REGISTER.sourcepath=$path.text.substring(1, $path.text.length()-1)))
			// AQLCodeGenerator.g:165:4: ^( REGISTER path= STRINGLITERAL )
			{
			REGISTER51=(AQLTree)match(input,REGISTER,FOLLOW_REGISTER_in_registerPackage1208); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			path=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_registerPackage1212); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 166:3: -> register(source=$REGISTER.sourcepath=$path.text.substring(1, $path.text.length()-1))
			  {
			  	retval.st = templateLib.getInstanceOf("register",new STAttrMap().put("source", REGISTER51.source).put("path", (path!=null?path.getText():null).substring(1, (path!=null?path.getText():null).length()-1)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "registerPackage"


	public static class execute_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "execute"
	// AQLCodeGenerator.g:171:1: execute : ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? ) -> execute(source=$EXECUTE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamekey=$primaryKey.valuepackage=$packageFunction.packageNameudf=$packageFunction.functionNamearguments=$valueList.values);
	public final AQLCodeGenerator.execute_return execute() throws RecognitionException {
		AQLCodeGenerator.execute_return retval = new AQLCodeGenerator.execute_return();
		retval.start = input.LT(1);

		AQLTree EXECUTE52=null;
		TreeRuleReturnScope nameSet53 =null;
		TreeRuleReturnScope primaryKey54 =null;
		TreeRuleReturnScope packageFunction55 =null;
		TreeRuleReturnScope valueList56 =null;

		try {
			// AQLCodeGenerator.g:172:2: ( ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? ) -> execute(source=$EXECUTE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamekey=$primaryKey.valuepackage=$packageFunction.packageNameudf=$packageFunction.functionNamearguments=$valueList.values))
			// AQLCodeGenerator.g:172:4: ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? )
			{
			EXECUTE52=(AQLTree)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute1244); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_execute1246);
			nameSet53=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_packageFunction_in_execute1248);
			packageFunction55=packageFunction();
			state._fsp--;
			if (state.failed) return retval;
			// AQLCodeGenerator.g:172:38: ( primaryKey )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==PK) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// AQLCodeGenerator.g:172:38: primaryKey
					{
					pushFollow(FOLLOW_primaryKey_in_execute1250);
					primaryKey54=primaryKey();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// AQLCodeGenerator.g:172:50: ( valueList )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==VALUES) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// AQLCodeGenerator.g:172:50: valueList
					{
					pushFollow(FOLLOW_valueList_in_execute1253);
					valueList56=valueList();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 173:3: -> execute(source=$EXECUTE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamekey=$primaryKey.valuepackage=$packageFunction.packageNameudf=$packageFunction.functionNamearguments=$valueList.values)
			  {
			  	retval.st = templateLib.getInstanceOf("execute",new STAttrMap().put("source", EXECUTE52.source).put("nameSpace", (nameSet53!=null?((AQLCodeGenerator.nameSet_return)nameSet53).nameSpace:null)).put("setName", (nameSet53!=null?((AQLCodeGenerator.nameSet_return)nameSet53).setName:null)).put("key", (primaryKey54!=null?((AQLCodeGenerator.primaryKey_return)primaryKey54).value:null)).put("package", (packageFunction55!=null?((AQLCodeGenerator.packageFunction_return)packageFunction55).packageName:null)).put("udf", (packageFunction55!=null?((AQLCodeGenerator.packageFunction_return)packageFunction55).functionName:null)).put("arguments", (valueList56!=null?((AQLCodeGenerator.valueList_return)valueList56).values:null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "execute"


	public static class aggregate_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "aggregate"
	// AQLCodeGenerator.g:179:1: aggregate : ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? ) -> aggregate(source=$AGGREGATE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamepackage=$packageFunction.packageNamefunction=$packageFunction.functionNamearguments=$valueList.valueswhere=$expressions.st);
	public final AQLCodeGenerator.aggregate_return aggregate() throws RecognitionException {
		AQLCodeGenerator.aggregate_return retval = new AQLCodeGenerator.aggregate_return();
		retval.start = input.LT(1);

		AQLTree AGGREGATE58=null;
		TreeRuleReturnScope nameSet57 =null;
		TreeRuleReturnScope packageFunction59 =null;
		TreeRuleReturnScope valueList60 =null;
		TreeRuleReturnScope expressions61 =null;

		try {
			// AQLCodeGenerator.g:180:2: ( ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? ) -> aggregate(source=$AGGREGATE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamepackage=$packageFunction.packageNamefunction=$packageFunction.functionNamearguments=$valueList.valueswhere=$expressions.st))
			// AQLCodeGenerator.g:180:4: ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? )
			{
			AGGREGATE58=(AQLTree)match(input,AGGREGATE,FOLLOW_AGGREGATE_in_aggregate1317); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_nameSet_in_aggregate1319);
			nameSet57=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_packageFunction_in_aggregate1327);
			packageFunction59=packageFunction();
			state._fsp--;
			if (state.failed) return retval;
			// AQLCodeGenerator.g:181:21: ( expressions[$nameSet.nameSpace, $nameSet.setName] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FILTERS||LA16_0==PK) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// AQLCodeGenerator.g:181:21: expressions[$nameSet.nameSpace, $nameSet.setName]
					{
					pushFollow(FOLLOW_expressions_in_aggregate1329);
					expressions61=expressions((nameSet57!=null?((AQLCodeGenerator.nameSet_return)nameSet57).nameSpace:null), (nameSet57!=null?((AQLCodeGenerator.nameSet_return)nameSet57).setName:null));
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			// AQLCodeGenerator.g:181:72: ( valueList )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==VALUES) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// AQLCodeGenerator.g:181:72: valueList
					{
					pushFollow(FOLLOW_valueList_in_aggregate1333);
					valueList60=valueList();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 182:3: -> aggregate(source=$AGGREGATE.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setNamepackage=$packageFunction.packageNamefunction=$packageFunction.functionNamearguments=$valueList.valueswhere=$expressions.st)
			  {
			  	retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("source", AGGREGATE58.source).put("nameSpace", (nameSet57!=null?((AQLCodeGenerator.nameSet_return)nameSet57).nameSpace:null)).put("setName", (nameSet57!=null?((AQLCodeGenerator.nameSet_return)nameSet57).setName:null)).put("package", (packageFunction59!=null?((AQLCodeGenerator.packageFunction_return)packageFunction59).packageName:null)).put("function", (packageFunction59!=null?((AQLCodeGenerator.packageFunction_return)packageFunction59).functionName:null)).put("arguments", (valueList60!=null?((AQLCodeGenerator.valueList_return)valueList60).values:null)).put("where", (expressions61!=null?((StringTemplate)expressions61.getTemplate()):null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aggregate"


	public static class packageFunction_return extends TreeRuleReturnScope {
		public String packageName;
		public String functionName;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "packageFunction"
	// AQLCodeGenerator.g:187:1: packageFunction returns [String packageName, String functionName] : p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE ) ;
	public final AQLCodeGenerator.packageFunction_return packageFunction() throws RecognitionException {
		AQLCodeGenerator.packageFunction_return retval = new AQLCodeGenerator.packageFunction_return();
		retval.start = input.LT(1);

		AQLTree p=null;
		AQLTree f=null;

		try {
			// AQLCodeGenerator.g:188:2: (p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE ) )
			// AQLCodeGenerator.g:188:4: p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE )
			{
			p=(AQLTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_packageFunction1404); if (state.failed) return retval;
			match(input,88,FOLLOW_88_in_packageFunction1406); if (state.failed) return retval;
			f=(AQLTree)input.LT(1);
			if ( input.LA(1)==GET||input.LA(1)==IDENTIFIER||input.LA(1)==REMOVE||input.LA(1)==SCAN ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			if ( state.backtracking==0 ) {retval.packageName = (p!=null?p.getText():null); retval.functionName = (f!=null?f.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageFunction"


	public static class show_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "show"
	// AQLCodeGenerator.g:209:1: show : ( ^( SHOW INDEXES ( nameSet )? ) -> showIndex(source=$SHOW.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setName)| ^( SHOW MODULES ) -> showPackages(source=$SHOW.source)| ^( SHOW PACKAGES ) -> showPackages(source=$SHOW.source)| ^( SHOW NAMESPACES ) -> showNamespaces(source=$SHOW.source)| ^( SHOW SETS ) -> showSets(source=$SHOW.source)| ^( SHOW BINS ) -> showBins(source=$SHOW.source)| ^( SHOW SCANS ) -> showScans(source=$SHOW.source)| ^( SHOW QUERIES ) -> showQueries(source=$SHOW.source));
	public final AQLCodeGenerator.show_return show() throws RecognitionException {
		AQLCodeGenerator.show_return retval = new AQLCodeGenerator.show_return();
		retval.start = input.LT(1);

		AQLTree SHOW62=null;
		AQLTree SHOW64=null;
		AQLTree SHOW65=null;
		AQLTree SHOW66=null;
		AQLTree SHOW67=null;
		AQLTree SHOW68=null;
		AQLTree SHOW69=null;
		AQLTree SHOW70=null;
		TreeRuleReturnScope nameSet63 =null;

		try {
			// AQLCodeGenerator.g:210:2: ( ^( SHOW INDEXES ( nameSet )? ) -> showIndex(source=$SHOW.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setName)| ^( SHOW MODULES ) -> showPackages(source=$SHOW.source)| ^( SHOW PACKAGES ) -> showPackages(source=$SHOW.source)| ^( SHOW NAMESPACES ) -> showNamespaces(source=$SHOW.source)| ^( SHOW SETS ) -> showSets(source=$SHOW.source)| ^( SHOW BINS ) -> showBins(source=$SHOW.source)| ^( SHOW SCANS ) -> showScans(source=$SHOW.source)| ^( SHOW QUERIES ) -> showQueries(source=$SHOW.source))
			int alt19=8;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==SHOW) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case INDEXES:
						{
						alt19=1;
						}
						break;
					case MODULES:
						{
						alt19=2;
						}
						break;
					case PACKAGES:
						{
						alt19=3;
						}
						break;
					case NAMESPACES:
						{
						alt19=4;
						}
						break;
					case SETS:
						{
						alt19=5;
						}
						break;
					case BINS:
						{
						alt19=6;
						}
						break;
					case SCANS:
						{
						alt19=7;
						}
						break;
					case QUERIES:
						{
						alt19=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// AQLCodeGenerator.g:210:4: ^( SHOW INDEXES ( nameSet )? )
					{
					SHOW62=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1442); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,INDEXES,FOLLOW_INDEXES_in_show1444); if (state.failed) return retval;
					// AQLCodeGenerator.g:210:19: ( nameSet )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==NAMESET) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// AQLCodeGenerator.g:210:19: nameSet
							{
							pushFollow(FOLLOW_nameSet_in_show1446);
							nameSet63=nameSet();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 210:29: -> showIndex(source=$SHOW.sourcenameSpace=$nameSet.nameSpacesetName=$nameSet.setName)
					  {
					  	retval.st = templateLib.getInstanceOf("showIndex",new STAttrMap().put("source", SHOW62.source).put("nameSpace", (nameSet63!=null?((AQLCodeGenerator.nameSet_return)nameSet63).nameSpace:null)).put("setName", (nameSet63!=null?((AQLCodeGenerator.nameSet_return)nameSet63).setName:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:211:4: ^( SHOW MODULES )
					{
					SHOW64=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1477); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,MODULES,FOLLOW_MODULES_in_show1479); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 211:24: -> showPackages(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showPackages",new STAttrMap().put("source", SHOW64.source));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:212:5: ^( SHOW PACKAGES )
					{
					SHOW65=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1500); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,PACKAGES,FOLLOW_PACKAGES_in_show1502); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 212:30: -> showPackages(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showPackages",new STAttrMap().put("source", SHOW65.source));
					  }


					}

					}
					break;
				case 4 :
					// AQLCodeGenerator.g:213:4: ^( SHOW NAMESPACES )
					{
					SHOW66=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1526); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,NAMESPACES,FOLLOW_NAMESPACES_in_show1528); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 213:25: -> showNamespaces(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showNamespaces",new STAttrMap().put("source", SHOW66.source));
					  }


					}

					}
					break;
				case 5 :
					// AQLCodeGenerator.g:214:4: ^( SHOW SETS )
					{
					SHOW67=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1546); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,SETS,FOLLOW_SETS_in_show1548); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 214:22: -> showSets(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showSets",new STAttrMap().put("source", SHOW67.source));
					  }


					}

					}
					break;
				case 6 :
					// AQLCodeGenerator.g:215:4: ^( SHOW BINS )
					{
					SHOW68=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1569); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,BINS,FOLLOW_BINS_in_show1571); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 215:22: -> showBins(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showBins",new STAttrMap().put("source", SHOW68.source));
					  }


					}

					}
					break;
				case 7 :
					// AQLCodeGenerator.g:216:4: ^( SHOW SCANS )
					{
					SHOW69=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1592); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,SCANS,FOLLOW_SCANS_in_show1594); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 216:23: -> showScans(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showScans",new STAttrMap().put("source", SHOW69.source));
					  }


					}

					}
					break;
				case 8 :
					// AQLCodeGenerator.g:217:4: ^( SHOW QUERIES )
					{
					SHOW70=(AQLTree)match(input,SHOW,FOLLOW_SHOW_in_show1615); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,QUERIES,FOLLOW_QUERIES_in_show1617); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 217:24: -> showQueries(source=$SHOW.source)
					  {
					  	retval.st = templateLib.getInstanceOf("showQueries",new STAttrMap().put("source", SHOW70.source));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "show"


	public static class desc_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "desc"
	// AQLCodeGenerator.g:222:1: desc : ( ^( DESC ^( MODULE moduleName ) ) -> descPackage(source=$DESC.sourcename=$moduleName.text)| ^( DESC ^( INDEX namespace_name index_name ) ) -> descIndex(source=$DESC.sourcenameSpace=$namespace_name.textindexName=$index_name.text));
	public final AQLCodeGenerator.desc_return desc() throws RecognitionException {
		AQLCodeGenerator.desc_return retval = new AQLCodeGenerator.desc_return();
		retval.start = input.LT(1);

		AQLTree DESC71=null;
		AQLTree DESC73=null;
		TreeRuleReturnScope moduleName72 =null;
		TreeRuleReturnScope namespace_name74 =null;
		TreeRuleReturnScope index_name75 =null;

		try {
			// AQLCodeGenerator.g:223:2: ( ^( DESC ^( MODULE moduleName ) ) -> descPackage(source=$DESC.sourcename=$moduleName.text)| ^( DESC ^( INDEX namespace_name index_name ) ) -> descIndex(source=$DESC.sourcenameSpace=$namespace_name.textindexName=$index_name.text))
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==DESC) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					int LA20_2 = input.LA(3);
					if ( (LA20_2==MODULE) ) {
						alt20=1;
					}
					else if ( (LA20_2==INDEX) ) {
						alt20=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// AQLCodeGenerator.g:223:4: ^( DESC ^( MODULE moduleName ) )
					{
					DESC71=(AQLTree)match(input,DESC,FOLLOW_DESC_in_desc1647); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,MODULE,FOLLOW_MODULE_in_desc1650); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_moduleName_in_desc1652);
					moduleName72=moduleName();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 224:3: -> descPackage(source=$DESC.sourcename=$moduleName.text)
					  {
					  	retval.st = templateLib.getInstanceOf("descPackage",new STAttrMap().put("source", DESC71.source).put("name", (moduleName72!=null?((AQLCodeGenerator.moduleName_return)moduleName72).text:null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:225:4: ^( DESC ^( INDEX namespace_name index_name ) )
					{
					DESC73=(AQLTree)match(input,DESC,FOLLOW_DESC_in_desc1678); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,INDEX,FOLLOW_INDEX_in_desc1681); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_namespace_name_in_desc1683);
					namespace_name74=namespace_name();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_index_name_in_desc1685);
					index_name75=index_name();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 226:3: -> descIndex(source=$DESC.sourcenameSpace=$namespace_name.textindexName=$index_name.text)
					  {
					  	retval.st = templateLib.getInstanceOf("descIndex",new STAttrMap().put("source", DESC73.source).put("nameSpace", (namespace_name74!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(namespace_name74.start),input.getTreeAdaptor().getTokenStopIndex(namespace_name74.start))):null)).put("indexName", (index_name75!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name75.start),input.getTreeAdaptor().getTokenStopIndex(index_name75.start))):null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "desc"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// AQLCodeGenerator.g:232:1: stat : ( ^( STAT ^( INDEX namespace_name index_name ) ) -> statIndex(source=$STAT.sourcenameSpace=$namespace_name.textindexName=$index_name.text)| ^( STAT QUERY ) -> statQuery(source=$STAT.source)| ^( STAT SYSTEM ) -> statSystem(source=$STAT.source));
	public final AQLCodeGenerator.stat_return stat() throws RecognitionException {
		AQLCodeGenerator.stat_return retval = new AQLCodeGenerator.stat_return();
		retval.start = input.LT(1);

		AQLTree STAT76=null;
		AQLTree STAT79=null;
		AQLTree STAT80=null;
		TreeRuleReturnScope namespace_name77 =null;
		TreeRuleReturnScope index_name78 =null;

		try {
			// AQLCodeGenerator.g:233:2: ( ^( STAT ^( INDEX namespace_name index_name ) ) -> statIndex(source=$STAT.sourcenameSpace=$namespace_name.textindexName=$index_name.text)| ^( STAT QUERY ) -> statQuery(source=$STAT.source)| ^( STAT SYSTEM ) -> statSystem(source=$STAT.source))
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==STAT) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case INDEX:
						{
						alt21=1;
						}
						break;
					case QUERY:
						{
						alt21=2;
						}
						break;
					case SYSTEM:
						{
						alt21=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// AQLCodeGenerator.g:233:4: ^( STAT ^( INDEX namespace_name index_name ) )
					{
					STAT76=(AQLTree)match(input,STAT,FOLLOW_STAT_in_stat1728); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,INDEX,FOLLOW_INDEX_in_stat1731); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_namespace_name_in_stat1733);
					namespace_name77=namespace_name();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_index_name_in_stat1735);
					index_name78=index_name();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 234:3: -> statIndex(source=$STAT.sourcenameSpace=$namespace_name.textindexName=$index_name.text)
					  {
					  	retval.st = templateLib.getInstanceOf("statIndex",new STAttrMap().put("source", STAT76.source).put("nameSpace", (namespace_name77!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(namespace_name77.start),input.getTreeAdaptor().getTokenStopIndex(namespace_name77.start))):null)).put("indexName", (index_name78!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name78.start),input.getTreeAdaptor().getTokenStopIndex(index_name78.start))):null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:235:4: ^( STAT QUERY )
					{
					STAT79=(AQLTree)match(input,STAT,FOLLOW_STAT_in_stat1768); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,QUERY,FOLLOW_QUERY_in_stat1770); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 236:3: -> statQuery(source=$STAT.source)
					  {
					  	retval.st = templateLib.getInstanceOf("statQuery",new STAttrMap().put("source", STAT79.source));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:237:4: ^( STAT SYSTEM )
					{
					STAT80=(AQLTree)match(input,STAT,FOLLOW_STAT_in_stat1788); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,SYSTEM,FOLLOW_SYSTEM_in_stat1790); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 238:3: -> statSystem(source=$STAT.source)
					  {
					  	retval.st = templateLib.getInstanceOf("statSystem",new STAttrMap().put("source", STAT80.source));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class set_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "set"
	// AQLCodeGenerator.g:262:1: set : ( ^( SET ^( TIMEOUT timeOut= INTLITERAL ) ) -> setTimeOut(source=$SET.sourcevalue=$timeOut.text)| ^( SET ^( VERBOSE verboseOn= booleanLiteral ) ) -> setVerbose(source=$SET.sourcevalue=$verboseOn.text)| ^( SET ^( ECHO echoOn= booleanLiteral ) ) -> setEcho(source=$SET.sourcevalue=$echoOn.text)| ^( SET ^( RECORD_TTL ttl= INTLITERAL ) ) -> setTTL(source=$SET.sourcevalue=$ttl.text)| ^( SET ^( VIEW viewType ) ) -> setView(source=$SET.sourcetype=$viewType.text)| ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) ) -> setUserPath(source=$SET.sourcevalue=$luaUserPath.text.substring(1, $luaUserPath.text.length()-1))| ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) ) -> setSystemPath(source=$SET.sourcevalue=$luaSysPath.text));
	public final AQLCodeGenerator.set_return set() throws RecognitionException {
		AQLCodeGenerator.set_return retval = new AQLCodeGenerator.set_return();
		retval.start = input.LT(1);

		AQLTree timeOut=null;
		AQLTree ttl=null;
		AQLTree luaUserPath=null;
		AQLTree luaSysPath=null;
		AQLTree SET81=null;
		AQLTree SET82=null;
		AQLTree SET83=null;
		AQLTree SET84=null;
		AQLTree SET85=null;
		AQLTree SET87=null;
		AQLTree SET88=null;
		TreeRuleReturnScope verboseOn =null;
		TreeRuleReturnScope echoOn =null;
		TreeRuleReturnScope viewType86 =null;

		try {
			// AQLCodeGenerator.g:263:2: ( ^( SET ^( TIMEOUT timeOut= INTLITERAL ) ) -> setTimeOut(source=$SET.sourcevalue=$timeOut.text)| ^( SET ^( VERBOSE verboseOn= booleanLiteral ) ) -> setVerbose(source=$SET.sourcevalue=$verboseOn.text)| ^( SET ^( ECHO echoOn= booleanLiteral ) ) -> setEcho(source=$SET.sourcevalue=$echoOn.text)| ^( SET ^( RECORD_TTL ttl= INTLITERAL ) ) -> setTTL(source=$SET.sourcevalue=$ttl.text)| ^( SET ^( VIEW viewType ) ) -> setView(source=$SET.sourcetype=$viewType.text)| ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) ) -> setUserPath(source=$SET.sourcevalue=$luaUserPath.text.substring(1, $luaUserPath.text.length()-1))| ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) ) -> setSystemPath(source=$SET.sourcevalue=$luaSysPath.text))
			int alt22=7;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==SET) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case TIMEOUT:
						{
						alt22=1;
						}
						break;
					case VERBOSE:
						{
						alt22=2;
						}
						break;
					case ECHO:
						{
						alt22=3;
						}
						break;
					case RECORD_TTL:
						{
						alt22=4;
						}
						break;
					case VIEW:
						{
						alt22=5;
						}
						break;
					case LUA_USER_PATH:
						{
						alt22=6;
						}
						break;
					case LUA_SYSTEM_PATH:
						{
						alt22=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// AQLCodeGenerator.g:263:4: ^( SET ^( TIMEOUT timeOut= INTLITERAL ) )
					{
					SET81=(AQLTree)match(input,SET,FOLLOW_SET_in_set1816); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TIMEOUT,FOLLOW_TIMEOUT_in_set1819); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					timeOut=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set1823); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 264:3: -> setTimeOut(source=$SET.sourcevalue=$timeOut.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setTimeOut",new STAttrMap().put("source", SET81.source).put("value", (timeOut!=null?timeOut.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:265:4: ^( SET ^( VERBOSE verboseOn= booleanLiteral ) )
					{
					SET82=(AQLTree)match(input,SET,FOLLOW_SET_in_set1847); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,VERBOSE,FOLLOW_VERBOSE_in_set1850); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_booleanLiteral_in_set1854);
					verboseOn=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 266:3: -> setVerbose(source=$SET.sourcevalue=$verboseOn.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setVerbose",new STAttrMap().put("source", SET82.source).put("value", (verboseOn!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(verboseOn.start),input.getTreeAdaptor().getTokenStopIndex(verboseOn.start))):null)));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:267:4: ^( SET ^( ECHO echoOn= booleanLiteral ) )
					{
					SET83=(AQLTree)match(input,SET,FOLLOW_SET_in_set1878); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,ECHO,FOLLOW_ECHO_in_set1881); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_booleanLiteral_in_set1885);
					echoOn=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 268:3: -> setEcho(source=$SET.sourcevalue=$echoOn.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setEcho",new STAttrMap().put("source", SET83.source).put("value", (echoOn!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(echoOn.start),input.getTreeAdaptor().getTokenStopIndex(echoOn.start))):null)));
					  }


					}

					}
					break;
				case 4 :
					// AQLCodeGenerator.g:269:4: ^( SET ^( RECORD_TTL ttl= INTLITERAL ) )
					{
					SET84=(AQLTree)match(input,SET,FOLLOW_SET_in_set1910); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_set1913); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					ttl=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set1917); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 270:3: -> setTTL(source=$SET.sourcevalue=$ttl.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setTTL",new STAttrMap().put("source", SET84.source).put("value", (ttl!=null?ttl.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// AQLCodeGenerator.g:271:4: ^( SET ^( VIEW viewType ) )
					{
					SET85=(AQLTree)match(input,SET,FOLLOW_SET_in_set1941); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,VIEW,FOLLOW_VIEW_in_set1944); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_viewType_in_set1946);
					viewType86=viewType();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 272:3: -> setView(source=$SET.sourcetype=$viewType.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setView",new STAttrMap().put("source", SET85.source).put("type", (viewType86!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(viewType86.start),input.getTreeAdaptor().getTokenStopIndex(viewType86.start))):null)));
					  }


					}

					}
					break;
				case 6 :
					// AQLCodeGenerator.g:273:4: ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) )
					{
					SET87=(AQLTree)match(input,SET,FOLLOW_SET_in_set1970); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_set1973); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					luaUserPath=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set1977); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 274:3: -> setUserPath(source=$SET.sourcevalue=$luaUserPath.text.substring(1, $luaUserPath.text.length()-1))
					  {
					  	retval.st = templateLib.getInstanceOf("setUserPath",new STAttrMap().put("source", SET87.source).put("value", (luaUserPath!=null?luaUserPath.getText():null).substring(1, (luaUserPath!=null?luaUserPath.getText():null).length()-1)));
					  }


					}

					}
					break;
				case 7 :
					// AQLCodeGenerator.g:275:4: ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) )
					{
					SET88=(AQLTree)match(input,SET,FOLLOW_SET_in_set2001); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_set2004); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					luaSysPath=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set2008); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 276:3: -> setSystemPath(source=$SET.sourcevalue=$luaSysPath.text)
					  {
					  	retval.st = templateLib.getInstanceOf("setSystemPath",new STAttrMap().put("source", SET88.source).put("value", (luaSysPath!=null?luaSysPath.getText():null)));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set"


	public static class get_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "get"
	// AQLCodeGenerator.g:278:1: get : ( ^( GET TIMEOUT ) -> getTimeout(source=$GET.source)| ^( GET VERBOSE ) -> getVerbose(source=$GET.source)| ^( GET ECHO ) -> getEcho(source=$GET.source)| ^( GET RECORD_TTL ) -> getTTL(source=$GET.source)| ^( GET VIEW ) -> getView(source=$GET.source)| ^( GET LUA_USER_PATH ) -> getUserPath(source=$GET.source)| ^( GET LUA_SYSTEM_PATH ) -> getSystemPath(source=$GET.source));
	public final AQLCodeGenerator.get_return get() throws RecognitionException {
		AQLCodeGenerator.get_return retval = new AQLCodeGenerator.get_return();
		retval.start = input.LT(1);

		AQLTree GET89=null;
		AQLTree GET90=null;
		AQLTree GET91=null;
		AQLTree GET92=null;
		AQLTree GET93=null;
		AQLTree GET94=null;
		AQLTree GET95=null;

		try {
			// AQLCodeGenerator.g:279:2: ( ^( GET TIMEOUT ) -> getTimeout(source=$GET.source)| ^( GET VERBOSE ) -> getVerbose(source=$GET.source)| ^( GET ECHO ) -> getEcho(source=$GET.source)| ^( GET RECORD_TTL ) -> getTTL(source=$GET.source)| ^( GET VIEW ) -> getView(source=$GET.source)| ^( GET LUA_USER_PATH ) -> getUserPath(source=$GET.source)| ^( GET LUA_SYSTEM_PATH ) -> getSystemPath(source=$GET.source))
			int alt23=7;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==GET) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case TIMEOUT:
						{
						alt23=1;
						}
						break;
					case VERBOSE:
						{
						alt23=2;
						}
						break;
					case ECHO:
						{
						alt23=3;
						}
						break;
					case RECORD_TTL:
						{
						alt23=4;
						}
						break;
					case VIEW:
						{
						alt23=5;
						}
						break;
					case LUA_USER_PATH:
						{
						alt23=6;
						}
						break;
					case LUA_SYSTEM_PATH:
						{
						alt23=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 23, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// AQLCodeGenerator.g:279:4: ^( GET TIMEOUT )
					{
					GET89=(AQLTree)match(input,GET,FOLLOW_GET_in_get2037); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TIMEOUT,FOLLOW_TIMEOUT_in_get2039); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 279:24: -> getTimeout(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getTimeout",new STAttrMap().put("source", GET89.source));
					  }


					}

					}
					break;
				case 2 :
					// AQLCodeGenerator.g:280:4: ^( GET VERBOSE )
					{
					GET90=(AQLTree)match(input,GET,FOLLOW_GET_in_get2060); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,VERBOSE,FOLLOW_VERBOSE_in_get2062); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 280:23: -> getVerbose(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getVerbose",new STAttrMap().put("source", GET90.source));
					  }


					}

					}
					break;
				case 3 :
					// AQLCodeGenerator.g:281:4: ^( GET ECHO )
					{
					GET91=(AQLTree)match(input,GET,FOLLOW_GET_in_get2082); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,ECHO,FOLLOW_ECHO_in_get2084); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 281:22: -> getEcho(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getEcho",new STAttrMap().put("source", GET91.source));
					  }


					}

					}
					break;
				case 4 :
					// AQLCodeGenerator.g:282:4: ^( GET RECORD_TTL )
					{
					GET92=(AQLTree)match(input,GET,FOLLOW_GET_in_get2106); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_get2108); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 282:25: -> getTTL(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getTTL",new STAttrMap().put("source", GET92.source));
					  }


					}

					}
					break;
				case 5 :
					// AQLCodeGenerator.g:283:4: ^( GET VIEW )
					{
					GET93=(AQLTree)match(input,GET,FOLLOW_GET_in_get2127); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,VIEW,FOLLOW_VIEW_in_get2129); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 283:22: -> getView(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getView",new STAttrMap().put("source", GET93.source));
					  }


					}

					}
					break;
				case 6 :
					// AQLCodeGenerator.g:284:4: ^( GET LUA_USER_PATH )
					{
					GET94=(AQLTree)match(input,GET,FOLLOW_GET_in_get2151); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_get2153); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 284:26: -> getUserPath(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getUserPath",new STAttrMap().put("source", GET94.source));
					  }


					}

					}
					break;
				case 7 :
					// AQLCodeGenerator.g:285:4: ^( GET LUA_SYSTEM_PATH )
					{
					GET95=(AQLTree)match(input,GET,FOLLOW_GET_in_get2170); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_get2172); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 285:27: -> getSystemPath(source=$GET.source)
					  {
					  	retval.st = templateLib.getInstanceOf("getSystemPath",new STAttrMap().put("source", GET95.source));
					  }


					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "get"


	public static class run_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "run"
	// AQLCodeGenerator.g:291:1: run : ^( RUN STRINGLITERAL ) -> run(source=$RUN.sourcefileName=$STRINGLITERAL.text.replace(\"'\",\"\\\"\"));
	public final AQLCodeGenerator.run_return run() throws RecognitionException {
		AQLCodeGenerator.run_return retval = new AQLCodeGenerator.run_return();
		retval.start = input.LT(1);

		AQLTree RUN96=null;
		AQLTree STRINGLITERAL97=null;

		try {
			// AQLCodeGenerator.g:292:2: ( ^( RUN STRINGLITERAL ) -> run(source=$RUN.sourcefileName=$STRINGLITERAL.text.replace(\"'\",\"\\\"\")))
			// AQLCodeGenerator.g:292:4: ^( RUN STRINGLITERAL )
			{
			RUN96=(AQLTree)match(input,RUN,FOLLOW_RUN_in_run2197); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			STRINGLITERAL97=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_run2199); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 293:3: -> run(source=$RUN.sourcefileName=$STRINGLITERAL.text.replace(\"'\",\"\\\"\"))
			  {
			  	retval.st = templateLib.getInstanceOf("run",new STAttrMap().put("source", RUN96.source).put("fileName", (STRINGLITERAL97!=null?STRINGLITERAL97.getText():null).replace("'","\"")));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "run"


	public static class print_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "print"
	// AQLCodeGenerator.g:295:1: print : ^( PRINT ( STRINGLITERAL )? ) -> print(source=$PRINT.sourcevalue=($STRINGLITERAL.text == null)?\"\":$STRINGLITERAL.text.replace(\"'\",\"\\\"\"));
	public final AQLCodeGenerator.print_return print() throws RecognitionException {
		AQLCodeGenerator.print_return retval = new AQLCodeGenerator.print_return();
		retval.start = input.LT(1);

		AQLTree PRINT98=null;
		AQLTree STRINGLITERAL99=null;

		try {
			// AQLCodeGenerator.g:296:2: ( ^( PRINT ( STRINGLITERAL )? ) -> print(source=$PRINT.sourcevalue=($STRINGLITERAL.text == null)?\"\":$STRINGLITERAL.text.replace(\"'\",\"\\\"\")))
			// AQLCodeGenerator.g:296:4: ^( PRINT ( STRINGLITERAL )? )
			{
			PRINT98=(AQLTree)match(input,PRINT,FOLLOW_PRINT_in_print2229); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// AQLCodeGenerator.g:296:12: ( STRINGLITERAL )?
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==STRINGLITERAL) ) {
					alt24=1;
				}
				switch (alt24) {
					case 1 :
						// AQLCodeGenerator.g:296:12: STRINGLITERAL
						{
						STRINGLITERAL99=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_print2231); if (state.failed) return retval;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 297:3: -> print(source=$PRINT.sourcevalue=($STRINGLITERAL.text == null)?\"\":$STRINGLITERAL.text.replace(\"'\",\"\\\"\"))
			  {
			  	retval.st = templateLib.getInstanceOf("print",new STAttrMap().put("source", PRINT98.source).put("value", ((STRINGLITERAL99!=null?STRINGLITERAL99.getText():null) == null)?"":(STRINGLITERAL99!=null?STRINGLITERAL99.getText():null).replace("'","\"")));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print"


	public static class kill_query_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "kill_query"
	// AQLCodeGenerator.g:301:1: kill_query : ^( KILL_QUERY INTLITERAL ) -> killQuery(source=$KILL_QUERY.sourceid=$INTLITERAL.text);
	public final AQLCodeGenerator.kill_query_return kill_query() throws RecognitionException {
		AQLCodeGenerator.kill_query_return retval = new AQLCodeGenerator.kill_query_return();
		retval.start = input.LT(1);

		AQLTree KILL_QUERY100=null;
		AQLTree INTLITERAL101=null;

		try {
			// AQLCodeGenerator.g:302:2: ( ^( KILL_QUERY INTLITERAL ) -> killQuery(source=$KILL_QUERY.sourceid=$INTLITERAL.text))
			// AQLCodeGenerator.g:302:4: ^( KILL_QUERY INTLITERAL )
			{
			KILL_QUERY100=(AQLTree)match(input,KILL_QUERY,FOLLOW_KILL_QUERY_in_kill_query2266); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			INTLITERAL101=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_query2268); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 303:3: -> killQuery(source=$KILL_QUERY.sourceid=$INTLITERAL.text)
			  {
			  	retval.st = templateLib.getInstanceOf("killQuery",new STAttrMap().put("source", KILL_QUERY100.source).put("id", (INTLITERAL101!=null?INTLITERAL101.getText():null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "kill_query"


	public static class kill_scan_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "kill_scan"
	// AQLCodeGenerator.g:307:1: kill_scan : ^( KILL_SCAN INTLITERAL ) -> killScan(source=$KILL_SCAN.sourceid=$INTLITERAL.text);
	public final AQLCodeGenerator.kill_scan_return kill_scan() throws RecognitionException {
		AQLCodeGenerator.kill_scan_return retval = new AQLCodeGenerator.kill_scan_return();
		retval.start = input.LT(1);

		AQLTree KILL_SCAN102=null;
		AQLTree INTLITERAL103=null;

		try {
			// AQLCodeGenerator.g:308:2: ( ^( KILL_SCAN INTLITERAL ) -> killScan(source=$KILL_SCAN.sourceid=$INTLITERAL.text))
			// AQLCodeGenerator.g:308:4: ^( KILL_SCAN INTLITERAL )
			{
			KILL_SCAN102=(AQLTree)match(input,KILL_SCAN,FOLLOW_KILL_SCAN_in_kill_scan2300); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			INTLITERAL103=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_scan2302); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 309:3: -> killScan(source=$KILL_SCAN.sourceid=$INTLITERAL.text)
			  {
			  	retval.st = templateLib.getInstanceOf("killScan",new STAttrMap().put("source", KILL_SCAN102.source).put("id", (INTLITERAL103!=null?INTLITERAL103.getText():null)));
			  }


			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "kill_scan"


	public static class quit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quit"
	// AQLCodeGenerator.g:313:1: quit : ( QUIT | EXIT | 'q' );
	public final AQLCodeGenerator.quit_return quit() throws RecognitionException {
		AQLCodeGenerator.quit_return retval = new AQLCodeGenerator.quit_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:314:2: ( QUIT | EXIT | 'q' )
			// AQLCodeGenerator.g:
			{
			if ( input.LA(1)==EXIT||input.LA(1)==QUIT||input.LA(1)==93 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quit"


	public static class help_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "help"
	// AQLCodeGenerator.g:318:1: help : 'help' ;
	public final AQLCodeGenerator.help_return help() throws RecognitionException {
		AQLCodeGenerator.help_return retval = new AQLCodeGenerator.help_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:319:2: ( 'help' )
			// AQLCodeGenerator.g:319:4: 'help'
			{
			match(input,89,FOLLOW_89_in_help2354); if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "help"


	public static class viewType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "viewType"
	// AQLCodeGenerator.g:322:1: viewType : ( 'json' | 'table' );
	public final AQLCodeGenerator.viewType_return viewType() throws RecognitionException {
		AQLCodeGenerator.viewType_return retval = new AQLCodeGenerator.viewType_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:323:2: ( 'json' | 'table' )
			// AQLCodeGenerator.g:
			{
			if ( input.LA(1)==90||input.LA(1)==95 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "viewType"


	public static class primaryKey_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primaryKey"
	// AQLCodeGenerator.g:327:1: primaryKey returns [String value] : ^( PK STRINGLITERAL ) ;
	public final AQLCodeGenerator.primaryKey_return primaryKey() throws RecognitionException {
		AQLCodeGenerator.primaryKey_return retval = new AQLCodeGenerator.primaryKey_return();
		retval.start = input.LT(1);

		AQLTree STRINGLITERAL104=null;

		try {
			// AQLCodeGenerator.g:328:2: ( ^( PK STRINGLITERAL ) )
			// AQLCodeGenerator.g:328:4: ^( PK STRINGLITERAL )
			{
			match(input,PK,FOLLOW_PK_in_primaryKey2384); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			STRINGLITERAL104=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_primaryKey2386); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {retval.value = (STRINGLITERAL104!=null?STRINGLITERAL104.getText():null).replace("'","\"");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryKey"


	public static class package_name_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "package_name"
	// AQLCodeGenerator.g:331:1: package_name : IDENTIFIER ;
	public final AQLCodeGenerator.package_name_return package_name() throws RecognitionException {
		AQLCodeGenerator.package_name_return retval = new AQLCodeGenerator.package_name_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:332:2: ( IDENTIFIER )
			// AQLCodeGenerator.g:332:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_package_name2401); if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "package_name"


	public static class index_name_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "index_name"
	// AQLCodeGenerator.g:336:1: index_name : IDENTIFIER ;
	public final AQLCodeGenerator.index_name_return index_name() throws RecognitionException {
		AQLCodeGenerator.index_name_return retval = new AQLCodeGenerator.index_name_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:337:2: ( IDENTIFIER )
			// AQLCodeGenerator.g:337:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_index_name2413); if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index_name"


	public static class namespace_name_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namespace_name"
	// AQLCodeGenerator.g:340:1: namespace_name : IDENTIFIER ;
	public final AQLCodeGenerator.namespace_name_return namespace_name() throws RecognitionException {
		AQLCodeGenerator.namespace_name_return retval = new AQLCodeGenerator.namespace_name_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:341:2: ( IDENTIFIER )
			// AQLCodeGenerator.g:341:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_name2425); if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespace_name"


	public static class set_name_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "set_name"
	// AQLCodeGenerator.g:344:1: set_name : IDENTIFIER ;
	public final AQLCodeGenerator.set_name_return set_name() throws RecognitionException {
		AQLCodeGenerator.set_name_return retval = new AQLCodeGenerator.set_name_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:345:2: ( IDENTIFIER )
			// AQLCodeGenerator.g:345:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_set_name2438); if (state.failed) return retval;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_name"


	public static class bin_return extends TreeRuleReturnScope {
		public String name;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bin"
	// AQLCodeGenerator.g:348:1: bin returns [String name] : ident= IDENTIFIER ;
	public final AQLCodeGenerator.bin_return bin() throws RecognitionException {
		AQLCodeGenerator.bin_return retval = new AQLCodeGenerator.bin_return();
		retval.start = input.LT(1);

		AQLTree ident=null;

		try {
			// AQLCodeGenerator.g:349:2: (ident= IDENTIFIER )
			// AQLCodeGenerator.g:349:4: ident= IDENTIFIER
			{
			ident=(AQLTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bin2456); if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.name = (ident!=null?ident.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bin"


	public static class value_return extends TreeRuleReturnScope {
		public String text;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "value"
	// AQLCodeGenerator.g:353:1: value returns [String text] : ( STRINGLITERAL | INTLITERAL );
	public final AQLCodeGenerator.value_return value() throws RecognitionException {
		AQLCodeGenerator.value_return retval = new AQLCodeGenerator.value_return();
		retval.start = input.LT(1);

		AQLTree STRINGLITERAL105=null;
		AQLTree INTLITERAL106=null;

		try {
			// AQLCodeGenerator.g:354:2: ( STRINGLITERAL | INTLITERAL )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==STRINGLITERAL) ) {
				alt25=1;
			}
			else if ( (LA25_0==INTLITERAL) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// AQLCodeGenerator.g:354:4: STRINGLITERAL
					{
					STRINGLITERAL105=(AQLTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_value2476); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.text = (STRINGLITERAL105!=null?STRINGLITERAL105.getText():null).replace("'", "\"");}
					}
					break;
				case 2 :
					// AQLCodeGenerator.g:355:4: INTLITERAL
					{
					INTLITERAL106=(AQLTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_value2484); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.text = (INTLITERAL106!=null?INTLITERAL106.getText():null);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class booleanLiteral_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "booleanLiteral"
	// AQLCodeGenerator.g:358:1: booleanLiteral : ( TRUE | FALSE );
	public final AQLCodeGenerator.booleanLiteral_return booleanLiteral() throws RecognitionException {
		AQLCodeGenerator.booleanLiteral_return retval = new AQLCodeGenerator.booleanLiteral_return();
		retval.start = input.LT(1);

		try {
			// AQLCodeGenerator.g:359:3: ( TRUE | FALSE )
			// AQLCodeGenerator.g:
			{
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class moduleName_return extends TreeRuleReturnScope {
		public String text;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "moduleName"
	// AQLCodeGenerator.g:362:1: moduleName returns [String text] : ident= IDENTIFIER '.' ( 'lua' | 'so' ) ;
	public final AQLCodeGenerator.moduleName_return moduleName() throws RecognitionException {
		AQLCodeGenerator.moduleName_return retval = new AQLCodeGenerator.moduleName_return();
		retval.start = input.LT(1);

		AQLTree ident=null;

		try {
			// AQLCodeGenerator.g:363:3: (ident= IDENTIFIER '.' ( 'lua' | 'so' ) )
			// AQLCodeGenerator.g:363:5: ident= IDENTIFIER '.' ( 'lua' | 'so' )
			{
			ident=(AQLTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moduleName2522); if (state.failed) return retval;
			match(input,88,FOLLOW_88_in_moduleName2524); if (state.failed) return retval;
			// AQLCodeGenerator.g:364:3: ( 'lua' | 'so' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==91) ) {
				alt26=1;
			}
			else if ( (LA26_0==94) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// AQLCodeGenerator.g:364:4: 'lua'
					{
					match(input,91,FOLLOW_91_in_moduleName2530); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.text = (ident!=null?ident.getText():null) + ".lua";}
					}
					break;
				case 2 :
					// AQLCodeGenerator.g:365:4: 'so'
					{
					match(input,94,FOLLOW_94_in_moduleName2537); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.text = (ident!=null?ident.getText():null) + ".so";}
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "moduleName"

	// Delegated rules



	public static final BitSet FOLLOW_aqlStatement_in_aqlFile66 = new BitSet(new long[]{0x2A400184040CB812L,0x0000000022000156L});
	public static final BitSet FOLLOW_create_in_aqlStatement104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_in_aqlStatement118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_in_aqlStatement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_delete_in_aqlStatement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_aqlStatement161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_registerPackage_in_aqlStatement175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_in_aqlStatement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_aqlStatement203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_in_aqlStatement217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_desc_in_aqlStatement231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_aqlStatement245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_aqlStatement259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_get_in_aqlStatement273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_run_in_aqlStatement287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_query_in_aqlStatement301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_scan_in_aqlStatement315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quit_in_aqlStatement329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_help_in_aqlStatement343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_aqlStatement358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_index_name_in_create384 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_nameSet_in_create386 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_bin_in_create388 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexType_in_create390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_in_drop442 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_drop452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_index_name_in_drop454 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_nameSet_in_drop458 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULE_in_drop490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_moduleName_in_drop492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_drop514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_drop518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSERT_in_insert574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_insert576 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_primaryKey_in_insert578 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_binNameList_in_insert582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_insert586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DELETE_in_delete642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_delete644 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_primaryKey_in_delete646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SELECT_ALL_in_select691 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_from_in_select693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SELECT_EXPLICIT_in_select731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_binNameList_in_select735 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_from_in_select737 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FROM_in_from800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_from802 = new BitSet(new long[]{0x0004000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_from811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressions_in_from813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ORDER_in_from825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_orderby_in_from827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_order_in_orderby850 = new BitSet(new long[]{0x0000000000002002L,0x0000000100000000L});
	public static final BitSet FOLLOW_ASC_in_order873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_order875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_order893 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_order895 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PK_in_expressions921 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_expressions923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FILTERS_in_expressions941 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_filter_in_expressions945 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_filter977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter979 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_filter981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BETWEEN_in_filter1001 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter1005 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter1009 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter1013 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BETWEEN_in_filter1039 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter1043 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_in_filter1047 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_in_filter1051 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_function1083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1087 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_function1089 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIN_NAMES_in_binNameList1125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_binNameList1128 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_VALUES_in_valueList1155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_valueList1158 = new BitSet(new long[]{0x0000000800000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_NAMESET_in_nameSet1181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_nameSet1183 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_set_name_in_nameSet1187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REGISTER_in_registerPackage1208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_registerPackage1212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXECUTE_in_execute1244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_execute1246 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_packageFunction_in_execute1248 = new BitSet(new long[]{0x0020000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_primaryKey_in_execute1250 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_execute1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AGGREGATE_in_aggregate1317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_aggregate1319 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_packageFunction_in_aggregate1327 = new BitSet(new long[]{0x0020000000400008L,0x0000000000010000L});
	public static final BitSet FOLLOW_expressions_in_aggregate1329 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_aggregate1333 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_packageFunction1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_packageFunction1406 = new BitSet(new long[]{0x5000000084000000L});
	public static final BitSet FOLLOW_set_in_packageFunction1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show1442 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEXES_in_show1444 = new BitSet(new long[]{0x0000400000000008L});
	public static final BitSet FOLLOW_nameSet_in_show1446 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MODULES_in_show1479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PACKAGES_in_show1502 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NAMESPACES_in_show1528 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SETS_in_show1548 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BINS_in_show1571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1592 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SCANS_in_show1594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QUERIES_in_show1617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_desc1647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MODULE_in_desc1650 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_moduleName_in_desc1652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_desc1678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_desc1681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_desc1683 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_desc1685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_stat1731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_stat1733 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_stat1735 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QUERY_in_stat1770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SYSTEM_in_stat1790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TIMEOUT_in_set1819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_set1823 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VERBOSE_in_set1850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_booleanLiteral_in_set1854 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ECHO_in_set1881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_booleanLiteral_in_set1885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RECORD_TTL_in_set1913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_set1917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1941 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VIEW_in_set1944 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_viewType_in_set1946 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_set1973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set1977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set2001 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_set2004 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set2008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2037 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TIMEOUT_in_get2039 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VERBOSE_in_get2062 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ECHO_in_get2084 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RECORD_TTL_in_get2108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VIEW_in_get2129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_get2153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get2170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_get2172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RUN_in_run2197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_run2199 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print2229 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_print2231 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KILL_QUERY_in_kill_query2266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_query2268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KILL_SCAN_in_kill_scan2300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_scan2302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_help2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PK_in_primaryKey2384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_primaryKey2386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_package_name2401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_index_name2413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace_name2425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_set_name2438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_bin2456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_value2476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_value2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_moduleName2522 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_moduleName2524 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_91_in_moduleName2530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_moduleName2537 = new BitSet(new long[]{0x0000000000000002L});
}
