// $ANTLR 3.5.1 AQLast.g 2014-10-20 13:56:19

package com.aerospike.aql.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AQLastParser extends Parser {
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
		"'q'", "'so'", "'table'"
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AQLastParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AQLastParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[120+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AQLastParser.tokenNames; }
	@Override public String getGrammarFileName() { return "AQLast.g"; }


	  private IErrorReporter errorReporter = null;
	  private IResultReporter resultReporter = new SystemOutReporter();
	   
	  public void setErrorReporter(IErrorReporter errorReporter) {
	      this.errorReporter = errorReporter;
	  }
	  public void setResultReporter(IResultReporter resultReporter) {
		  if (resultReporter != null)
		      this.resultReporter = resultReporter;
	  }

	  public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        super.displayRecognitionError(tokenNames, e);
	        
		  		if (errorReporter != null) {
		  			//String hdr = getErrorHeader(e);
		  			String msg = getErrorMessage(e, tokenNames);
		  			int line = e.line;
	    	  	int charStart = e.charPositionInLine;
	    	  	int charEnd = charStart + e.token.getText().length();
		  			errorReporter.reportError(line, charStart, charEnd, msg);
		  		}
	    }
	    


	public static class aqlFile_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "aqlFile"
	// AQLast.g:345:1: aqlFile : aqlStatements EOF ;
	public final AQLastParser.aqlFile_return aqlFile() throws RecognitionException {
		AQLastParser.aqlFile_return retval = new AQLastParser.aqlFile_return();
		retval.start = input.LT(1);
		int aqlFile_StartIndex = input.index();

		AQLTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope aqlStatements1 =null;

		AQLTree EOF2_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// AQLast.g:346:2: ( aqlStatements EOF )
			// AQLast.g:346:5: aqlStatements EOF
			{
			root_0 = (AQLTree)adaptor.nil();


			pushFollow(FOLLOW_aqlStatements_in_aqlFile690);
			aqlStatements1=aqlStatements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, aqlStatements1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_aqlFile692); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EOF2_tree = (AQLTree)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, aqlFile_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "aqlFile"


	public static class aqlStatements_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "aqlStatements"
	// AQLast.g:348:1: aqlStatements : ( aqlStatement )* ;
	public final AQLastParser.aqlStatements_return aqlStatements() throws RecognitionException {
		AQLastParser.aqlStatements_return retval = new AQLastParser.aqlStatements_return();
		retval.start = input.LT(1);
		int aqlStatements_StartIndex = input.index();

		AQLTree root_0 = null;

		ParserRuleReturnScope aqlStatement3 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// AQLast.g:349:3: ( ( aqlStatement )* )
			// AQLast.g:349:5: ( aqlStatement )*
			{
			root_0 = (AQLTree)adaptor.nil();


			// AQLast.g:349:5: ( aqlStatement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AGGREGATE||(LA1_0 >= CREATE && LA1_0 <= DESC)||LA1_0==DROP||(LA1_0 >= EXECUTE && LA1_0 <= EXIT)||LA1_0==GET||LA1_0==INSERT||(LA1_0 >= KILL && LA1_0 <= KILL_SCAN)||LA1_0==PRINT||LA1_0==QUIT||(LA1_0 >= REGISTER && LA1_0 <= RUN)||LA1_0==SELECT||LA1_0==SET||LA1_0==SHOW||LA1_0==STAT||LA1_0==89||LA1_0==93) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// AQLast.g:349:5: aqlStatement
					{
					pushFollow(FOLLOW_aqlStatement_in_aqlStatements703);
					aqlStatement3=aqlStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aqlStatement3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, aqlStatements_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "aqlStatements"


	public static class aqlStatement_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "aqlStatement"
	// AQLast.g:354:1: aqlStatement : ( create | drop | remove | insert | delete | select | registerPackage | execute | aggregate | show | desc | stat | set | get | run | kill_query | kill_scan | kill | quit | help | print );
	public final AQLastParser.aqlStatement_return aqlStatement() throws RecognitionException {
		AQLastParser.aqlStatement_return retval = new AQLastParser.aqlStatement_return();
		retval.start = input.LT(1);
		int aqlStatement_StartIndex = input.index();

		AQLTree root_0 = null;

		ParserRuleReturnScope create4 =null;
		ParserRuleReturnScope drop5 =null;
		ParserRuleReturnScope remove6 =null;
		ParserRuleReturnScope insert7 =null;
		ParserRuleReturnScope delete8 =null;
		ParserRuleReturnScope select9 =null;
		ParserRuleReturnScope registerPackage10 =null;
		ParserRuleReturnScope execute11 =null;
		ParserRuleReturnScope aggregate12 =null;
		ParserRuleReturnScope show13 =null;
		ParserRuleReturnScope desc14 =null;
		ParserRuleReturnScope stat15 =null;
		ParserRuleReturnScope set16 =null;
		ParserRuleReturnScope get17 =null;
		ParserRuleReturnScope run18 =null;
		ParserRuleReturnScope kill_query19 =null;
		ParserRuleReturnScope kill_scan20 =null;
		ParserRuleReturnScope kill21 =null;
		ParserRuleReturnScope quit22 =null;
		ParserRuleReturnScope help23 =null;
		ParserRuleReturnScope print24 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// AQLast.g:355:2: ( create | drop | remove | insert | delete | select | registerPackage | execute | aggregate | show | desc | stat | set | get | run | kill_query | kill_scan | kill | quit | help | print )
			int alt2=21;
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
			case REMOVE:
				{
				alt2=3;
				}
				break;
			case INSERT:
				{
				alt2=4;
				}
				break;
			case DELETE:
				{
				alt2=5;
				}
				break;
			case SELECT:
				{
				alt2=6;
				}
				break;
			case REGISTER:
				{
				alt2=7;
				}
				break;
			case EXECUTE:
				{
				alt2=8;
				}
				break;
			case AGGREGATE:
				{
				alt2=9;
				}
				break;
			case SHOW:
				{
				alt2=10;
				}
				break;
			case DESC:
				{
				alt2=11;
				}
				break;
			case STAT:
				{
				alt2=12;
				}
				break;
			case SET:
				{
				alt2=13;
				}
				break;
			case GET:
				{
				alt2=14;
				}
				break;
			case RUN:
				{
				alt2=15;
				}
				break;
			case KILL_QUERY:
				{
				alt2=16;
				}
				break;
			case KILL_SCAN:
				{
				alt2=17;
				}
				break;
			case KILL:
				{
				alt2=18;
				}
				break;
			case EXIT:
			case QUIT:
			case 93:
				{
				alt2=19;
				}
				break;
			case 89:
				{
				alt2=20;
				}
				break;
			case PRINT:
				{
				alt2=21;
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
					// AQLast.g:355:4: create
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_create_in_aqlStatement719);
					create4=create();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, create4.getTree());

					}
					break;
				case 2 :
					// AQLast.g:356:4: drop
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_drop_in_aqlStatement725);
					drop5=drop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, drop5.getTree());

					}
					break;
				case 3 :
					// AQLast.g:357:4: remove
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_remove_in_aqlStatement731);
					remove6=remove();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, remove6.getTree());

					}
					break;
				case 4 :
					// AQLast.g:358:4: insert
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_insert_in_aqlStatement736);
					insert7=insert();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, insert7.getTree());

					}
					break;
				case 5 :
					// AQLast.g:359:4: delete
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_delete_in_aqlStatement741);
					delete8=delete();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, delete8.getTree());

					}
					break;
				case 6 :
					// AQLast.g:360:4: select
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_select_in_aqlStatement746);
					select9=select();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, select9.getTree());

					}
					break;
				case 7 :
					// AQLast.g:361:4: registerPackage
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_registerPackage_in_aqlStatement751);
					registerPackage10=registerPackage();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, registerPackage10.getTree());

					}
					break;
				case 8 :
					// AQLast.g:362:4: execute
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_execute_in_aqlStatement756);
					execute11=execute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, execute11.getTree());

					}
					break;
				case 9 :
					// AQLast.g:363:4: aggregate
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_aggregate_in_aqlStatement761);
					aggregate12=aggregate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregate12.getTree());

					}
					break;
				case 10 :
					// AQLast.g:364:4: show
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_show_in_aqlStatement766);
					show13=show();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, show13.getTree());

					}
					break;
				case 11 :
					// AQLast.g:365:4: desc
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_desc_in_aqlStatement771);
					desc14=desc();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, desc14.getTree());

					}
					break;
				case 12 :
					// AQLast.g:366:4: stat
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_stat_in_aqlStatement776);
					stat15=stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stat15.getTree());

					}
					break;
				case 13 :
					// AQLast.g:367:4: set
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_set_in_aqlStatement781);
					set16=set();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, set16.getTree());

					}
					break;
				case 14 :
					// AQLast.g:368:4: get
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_get_in_aqlStatement786);
					get17=get();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, get17.getTree());

					}
					break;
				case 15 :
					// AQLast.g:369:4: run
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_run_in_aqlStatement791);
					run18=run();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, run18.getTree());

					}
					break;
				case 16 :
					// AQLast.g:370:4: kill_query
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_kill_query_in_aqlStatement796);
					kill_query19=kill_query();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, kill_query19.getTree());

					}
					break;
				case 17 :
					// AQLast.g:371:4: kill_scan
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_kill_scan_in_aqlStatement801);
					kill_scan20=kill_scan();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, kill_scan20.getTree());

					}
					break;
				case 18 :
					// AQLast.g:372:4: kill
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_kill_in_aqlStatement806);
					kill21=kill();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, kill21.getTree());

					}
					break;
				case 19 :
					// AQLast.g:373:4: quit
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_quit_in_aqlStatement811);
					quit22=quit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quit22.getTree());

					}
					break;
				case 20 :
					// AQLast.g:374:4: help
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_help_in_aqlStatement816);
					help23=help();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, help23.getTree());

					}
					break;
				case 21 :
					// AQLast.g:375:4: print
					{
					root_0 = (AQLTree)adaptor.nil();


					pushFollow(FOLLOW_print_in_aqlStatement821);
					print24=print();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print24.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, aqlStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "aqlStatement"


	public static class create_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "create"
	// AQLast.g:381:1: create : CREATE INDEX index_name ON nameSet '(' binName= bin ')' indexType -> ^( CREATE index_name nameSet bin indexType ) ;
	public final AQLastParser.create_return create() throws RecognitionException {
		AQLastParser.create_return retval = new AQLastParser.create_return();
		retval.start = input.LT(1);
		int create_StartIndex = input.index();

		AQLTree root_0 = null;

		Token CREATE25=null;
		Token INDEX26=null;
		Token ON28=null;
		Token char_literal30=null;
		Token char_literal31=null;
		ParserRuleReturnScope binName =null;
		ParserRuleReturnScope index_name27 =null;
		ParserRuleReturnScope nameSet29 =null;
		ParserRuleReturnScope indexType32 =null;

		AQLTree CREATE25_tree=null;
		AQLTree INDEX26_tree=null;
		AQLTree ON28_tree=null;
		AQLTree char_literal30_tree=null;
		AQLTree char_literal31_tree=null;
		RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
		RewriteRuleSubtreeStream stream_indexType=new RewriteRuleSubtreeStream(adaptor,"rule indexType");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_bin=new RewriteRuleSubtreeStream(adaptor,"rule bin");
		RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// AQLast.g:383:2: ( CREATE INDEX index_name ON nameSet '(' binName= bin ')' indexType -> ^( CREATE index_name nameSet bin indexType ) )
			// AQLast.g:383:4: CREATE INDEX index_name ON nameSet '(' binName= bin ')' indexType
			{
			CREATE25=(Token)match(input,CREATE,FOLLOW_CREATE_in_create839); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CREATE.add(CREATE25);

			INDEX26=(Token)match(input,INDEX,FOLLOW_INDEX_in_create841); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INDEX.add(INDEX26);

			pushFollow(FOLLOW_index_name_in_create843);
			index_name27=index_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_index_name.add(index_name27.getTree());
			ON28=(Token)match(input,ON,FOLLOW_ON_in_create845); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ON.add(ON28);

			pushFollow(FOLLOW_nameSet_in_create847);
			nameSet29=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet29.getTree());
			char_literal30=(Token)match(input,85,FOLLOW_85_in_create851); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(char_literal30);

			pushFollow(FOLLOW_bin_in_create855);
			binName=bin();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_bin.add(binName.getTree());
			char_literal31=(Token)match(input,86,FOLLOW_86_in_create857); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal31);

			pushFollow(FOLLOW_indexType_in_create859);
			indexType32=indexType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_indexType.add(indexType32.getTree());
			// AST REWRITE
			// elements: index_name, CREATE, nameSet, bin, indexType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 385:3: -> ^( CREATE index_name nameSet bin indexType )
			{
				// AQLast.g:385:6: ^( CREATE index_name nameSet bin indexType )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_CREATE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_index_name.nextTree());
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				adaptor.addChild(root_1, stream_bin.nextTree());
				adaptor.addChild(root_1, stream_indexType.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, create_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "create"


	public static class drop_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "drop"
	// AQLast.g:392:1: drop : DROP ( INDEX nameSet index_name -> ^( DROP ^( INDEX index_name nameSet ) ) | MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) | SET nameSet -> ^( DROP ^( SET nameSet ) ) ) ;
	public final AQLastParser.drop_return drop() throws RecognitionException {
		AQLastParser.drop_return retval = new AQLastParser.drop_return();
		retval.start = input.LT(1);
		int drop_StartIndex = input.index();

		AQLTree root_0 = null;

		Token DROP33=null;
		Token INDEX34=null;
		Token MODULE37=null;
		Token SET39=null;
		ParserRuleReturnScope nameSet35 =null;
		ParserRuleReturnScope index_name36 =null;
		ParserRuleReturnScope moduleName38 =null;
		ParserRuleReturnScope nameSet40 =null;

		AQLTree DROP33_tree=null;
		AQLTree INDEX34_tree=null;
		AQLTree MODULE37_tree=null;
		AQLTree SET39_tree=null;
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_moduleName=new RewriteRuleSubtreeStream(adaptor,"rule moduleName");
		RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// AQLast.g:394:2: ( DROP ( INDEX nameSet index_name -> ^( DROP ^( INDEX index_name nameSet ) ) | MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) | SET nameSet -> ^( DROP ^( SET nameSet ) ) ) )
			// AQLast.g:394:4: DROP ( INDEX nameSet index_name -> ^( DROP ^( INDEX index_name nameSet ) ) | MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) | SET nameSet -> ^( DROP ^( SET nameSet ) ) )
			{
			DROP33=(Token)match(input,DROP,FOLLOW_DROP_in_drop895); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DROP.add(DROP33);

			// AQLast.g:394:9: ( INDEX nameSet index_name -> ^( DROP ^( INDEX index_name nameSet ) ) | MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) | SET nameSet -> ^( DROP ^( SET nameSet ) ) )
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
					// AQLast.g:395:6: INDEX nameSet index_name
					{
					INDEX34=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop904); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INDEX.add(INDEX34);

					pushFollow(FOLLOW_nameSet_in_drop906);
					nameSet35=nameSet();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameSet.add(nameSet35.getTree());
					pushFollow(FOLLOW_index_name_in_drop908);
					index_name36=index_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_index_name.add(index_name36.getTree());
					// AST REWRITE
					// elements: index_name, DROP, INDEX, nameSet
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 395:31: -> ^( DROP ^( INDEX index_name nameSet ) )
					{
						// AQLast.g:395:34: ^( DROP ^( INDEX index_name nameSet ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_DROP.nextNode(), root_1);
						// AQLast.g:395:41: ^( INDEX index_name nameSet )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_INDEX.nextNode(), root_2);
						adaptor.addChild(root_2, stream_index_name.nextTree());
						adaptor.addChild(root_2, stream_nameSet.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:396:4: MODULE moduleName
					{
					MODULE37=(Token)match(input,MODULE,FOLLOW_MODULE_in_drop927); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODULE.add(MODULE37);

					pushFollow(FOLLOW_moduleName_in_drop929);
					moduleName38=moduleName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_moduleName.add(moduleName38.getTree());
					// AST REWRITE
					// elements: MODULE, moduleName, DROP
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 396:22: -> ^( DROP ^( MODULE moduleName ) )
					{
						// AQLast.g:396:25: ^( DROP ^( MODULE moduleName ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_DROP.nextNode(), root_1);
						// AQLast.g:396:32: ^( MODULE moduleName )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_2);
						adaptor.addChild(root_2, stream_moduleName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:397:4: SET nameSet
					{
					SET39=(Token)match(input,SET,FOLLOW_SET_in_drop946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SET.add(SET39);

					pushFollow(FOLLOW_nameSet_in_drop948);
					nameSet40=nameSet();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameSet.add(nameSet40.getTree());
					// AST REWRITE
					// elements: SET, DROP, nameSet
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 397:16: -> ^( DROP ^( SET nameSet ) )
					{
						// AQLast.g:397:19: ^( DROP ^( SET nameSet ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_DROP.nextNode(), root_1);
						// AQLast.g:397:26: ^( SET nameSet )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_2);
						adaptor.addChild(root_2, stream_nameSet.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, drop_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "drop"


	public static class remove_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "remove"
	// AQLast.g:402:1: remove : REMOVE MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) ;
	public final AQLastParser.remove_return remove() throws RecognitionException {
		AQLastParser.remove_return retval = new AQLastParser.remove_return();
		retval.start = input.LT(1);
		int remove_StartIndex = input.index();

		AQLTree root_0 = null;

		Token REMOVE41=null;
		Token MODULE42=null;
		ParserRuleReturnScope moduleName43 =null;

		AQLTree REMOVE41_tree=null;
		AQLTree MODULE42_tree=null;
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleTokenStream stream_REMOVE=new RewriteRuleTokenStream(adaptor,"token REMOVE");
		RewriteRuleSubtreeStream stream_moduleName=new RewriteRuleSubtreeStream(adaptor,"rule moduleName");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// AQLast.g:404:3: ( REMOVE MODULE moduleName -> ^( DROP ^( MODULE moduleName ) ) )
			// AQLast.g:404:5: REMOVE MODULE moduleName
			{
			REMOVE41=(Token)match(input,REMOVE,FOLLOW_REMOVE_in_remove982); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REMOVE.add(REMOVE41);

			MODULE42=(Token)match(input,MODULE,FOLLOW_MODULE_in_remove984); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MODULE.add(MODULE42);

			pushFollow(FOLLOW_moduleName_in_remove986);
			moduleName43=moduleName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_moduleName.add(moduleName43.getTree());
			// AST REWRITE
			// elements: MODULE, moduleName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 404:30: -> ^( DROP ^( MODULE moduleName ) )
			{
				// AQLast.g:404:33: ^( DROP ^( MODULE moduleName ) )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(DROP, "DROP"), root_1);
				// AQLast.g:404:40: ^( MODULE moduleName )
				{
				AQLTree root_2 = (AQLTree)adaptor.nil();
				root_2 = (AQLTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_2);
				adaptor.addChild(root_2, stream_moduleName.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, remove_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "remove"


	public static class indexType_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "indexType"
	// AQLast.g:408:1: indexType : ( NUMERIC | STRING );
	public final AQLastParser.indexType_return indexType() throws RecognitionException {
		AQLastParser.indexType_return retval = new AQLastParser.indexType_return();
		retval.start = input.LT(1);
		int indexType_StartIndex = input.index();

		AQLTree root_0 = null;

		Token set44=null;

		AQLTree set44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// AQLast.g:409:2: ( NUMERIC | STRING )
			// AQLast.g:
			{
			root_0 = (AQLTree)adaptor.nil();


			set44=input.LT(1);
			if ( input.LA(1)==NUMERIC||input.LA(1)==STRING ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set44));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, indexType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "indexType"


	public static class insert_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "insert"
	// AQLast.g:422:1: insert : INSERT INTO nameSet '(' PK ( ',' binNameList ) ')' VALUES '(' primaryKey ( ',' valueList ) ')' -> ^( INSERT nameSet primaryKey binNameList valueList ) ;
	public final AQLastParser.insert_return insert() throws RecognitionException {
		AQLastParser.insert_return retval = new AQLastParser.insert_return();
		retval.start = input.LT(1);
		int insert_StartIndex = input.index();

		AQLTree root_0 = null;

		Token INSERT45=null;
		Token INTO46=null;
		Token char_literal48=null;
		Token PK49=null;
		Token char_literal50=null;
		Token char_literal52=null;
		Token VALUES53=null;
		Token char_literal54=null;
		Token char_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope nameSet47 =null;
		ParserRuleReturnScope binNameList51 =null;
		ParserRuleReturnScope primaryKey55 =null;
		ParserRuleReturnScope valueList57 =null;

		AQLTree INSERT45_tree=null;
		AQLTree INTO46_tree=null;
		AQLTree char_literal48_tree=null;
		AQLTree PK49_tree=null;
		AQLTree char_literal50_tree=null;
		AQLTree char_literal52_tree=null;
		AQLTree VALUES53_tree=null;
		AQLTree char_literal54_tree=null;
		AQLTree char_literal56_tree=null;
		AQLTree char_literal58_tree=null;
		RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
		RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
		RewriteRuleTokenStream stream_VALUES=new RewriteRuleTokenStream(adaptor,"token VALUES");
		RewriteRuleTokenStream stream_PK=new RewriteRuleTokenStream(adaptor,"token PK");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_valueList=new RewriteRuleSubtreeStream(adaptor,"rule valueList");
		RewriteRuleSubtreeStream stream_binNameList=new RewriteRuleSubtreeStream(adaptor,"rule binNameList");
		RewriteRuleSubtreeStream stream_primaryKey=new RewriteRuleSubtreeStream(adaptor,"rule primaryKey");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// AQLast.g:424:2: ( INSERT INTO nameSet '(' PK ( ',' binNameList ) ')' VALUES '(' primaryKey ( ',' valueList ) ')' -> ^( INSERT nameSet primaryKey binNameList valueList ) )
			// AQLast.g:424:4: INSERT INTO nameSet '(' PK ( ',' binNameList ) ')' VALUES '(' primaryKey ( ',' valueList ) ')'
			{
			INSERT45=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert1037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INSERT.add(INSERT45);

			INTO46=(Token)match(input,INTO,FOLLOW_INTO_in_insert1039); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTO.add(INTO46);

			pushFollow(FOLLOW_nameSet_in_insert1041);
			nameSet47=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet47.getTree());
			char_literal48=(Token)match(input,85,FOLLOW_85_in_insert1043); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(char_literal48);

			PK49=(Token)match(input,PK,FOLLOW_PK_in_insert1045); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PK.add(PK49);

			// AQLast.g:424:31: ( ',' binNameList )
			// AQLast.g:424:32: ',' binNameList
			{
			char_literal50=(Token)match(input,87,FOLLOW_87_in_insert1048); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_87.add(char_literal50);

			pushFollow(FOLLOW_binNameList_in_insert1050);
			binNameList51=binNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_binNameList.add(binNameList51.getTree());
			}

			char_literal52=(Token)match(input,86,FOLLOW_86_in_insert1053); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal52);

			VALUES53=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert1057); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VALUES.add(VALUES53);

			char_literal54=(Token)match(input,85,FOLLOW_85_in_insert1059); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(char_literal54);

			pushFollow(FOLLOW_primaryKey_in_insert1061);
			primaryKey55=primaryKey();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryKey.add(primaryKey55.getTree());
			// AQLast.g:425:25: ( ',' valueList )
			// AQLast.g:425:26: ',' valueList
			{
			char_literal56=(Token)match(input,87,FOLLOW_87_in_insert1064); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_87.add(char_literal56);

			pushFollow(FOLLOW_valueList_in_insert1066);
			valueList57=valueList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueList.add(valueList57.getTree());
			}

			char_literal58=(Token)match(input,86,FOLLOW_86_in_insert1069); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal58);

			// AST REWRITE
			// elements: nameSet, primaryKey, INSERT, valueList, binNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 426:3: -> ^( INSERT nameSet primaryKey binNameList valueList )
			{
				// AQLast.g:426:6: ^( INSERT nameSet primaryKey binNameList valueList )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_INSERT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				adaptor.addChild(root_1, stream_primaryKey.nextTree());
				adaptor.addChild(root_1, stream_binNameList.nextTree());
				adaptor.addChild(root_1, stream_valueList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, insert_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "insert"


	public static class delete_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "delete"
	// AQLast.g:432:1: delete : DELETE FROM nameSet WHERE PK '=' primaryKey -> ^( DELETE nameSet primaryKey ) ;
	public final AQLastParser.delete_return delete() throws RecognitionException {
		AQLastParser.delete_return retval = new AQLastParser.delete_return();
		retval.start = input.LT(1);
		int delete_StartIndex = input.index();

		AQLTree root_0 = null;

		Token DELETE59=null;
		Token FROM60=null;
		Token WHERE62=null;
		Token PK63=null;
		Token char_literal64=null;
		ParserRuleReturnScope nameSet61 =null;
		ParserRuleReturnScope primaryKey65 =null;

		AQLTree DELETE59_tree=null;
		AQLTree FROM60_tree=null;
		AQLTree WHERE62_tree=null;
		AQLTree PK63_tree=null;
		AQLTree char_literal64_tree=null;
		RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_PK=new RewriteRuleTokenStream(adaptor,"token PK");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_primaryKey=new RewriteRuleSubtreeStream(adaptor,"rule primaryKey");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// AQLast.g:434:2: ( DELETE FROM nameSet WHERE PK '=' primaryKey -> ^( DELETE nameSet primaryKey ) )
			// AQLast.g:434:4: DELETE FROM nameSet WHERE PK '=' primaryKey
			{
			DELETE59=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete1106); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DELETE.add(DELETE59);

			FROM60=(Token)match(input,FROM,FOLLOW_FROM_in_delete1108); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM60);

			pushFollow(FOLLOW_nameSet_in_delete1110);
			nameSet61=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet61.getTree());
			WHERE62=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete1112); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHERE.add(WHERE62);

			PK63=(Token)match(input,PK,FOLLOW_PK_in_delete1114); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PK.add(PK63);

			char_literal64=(Token)match(input,EQ,FOLLOW_EQ_in_delete1116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQ.add(char_literal64);

			pushFollow(FOLLOW_primaryKey_in_delete1118);
			primaryKey65=primaryKey();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primaryKey.add(primaryKey65.getTree());
			// AST REWRITE
			// elements: DELETE, primaryKey, nameSet
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 435:3: -> ^( DELETE nameSet primaryKey )
			{
				// AQLast.g:435:6: ^( DELETE nameSet primaryKey )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_DELETE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				adaptor.addChild(root_1, stream_primaryKey.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, delete_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "delete"


	public static class select_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "select"
	// AQLast.g:446:1: select : SELECT ( STAR from -> ^( SELECT_ALL from ) | binNameList from -> ^( SELECT_EXPLICIT binNameList from ) ) ;
	public final AQLastParser.select_return select() throws RecognitionException {
		AQLastParser.select_return retval = new AQLastParser.select_return();
		retval.start = input.LT(1);
		int select_StartIndex = input.index();

		AQLTree root_0 = null;

		Token SELECT66=null;
		Token STAR67=null;
		ParserRuleReturnScope from68 =null;
		ParserRuleReturnScope binNameList69 =null;
		ParserRuleReturnScope from70 =null;

		AQLTree SELECT66_tree=null;
		AQLTree STAR67_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
		RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from");
		RewriteRuleSubtreeStream stream_binNameList=new RewriteRuleSubtreeStream(adaptor,"rule binNameList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// AQLast.g:448:2: ( SELECT ( STAR from -> ^( SELECT_ALL from ) | binNameList from -> ^( SELECT_EXPLICIT binNameList from ) ) )
			// AQLast.g:448:4: SELECT ( STAR from -> ^( SELECT_ALL from ) | binNameList from -> ^( SELECT_EXPLICIT binNameList from ) )
			{
			SELECT66=(Token)match(input,SELECT,FOLLOW_SELECT_in_select1149); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SELECT.add(SELECT66);

			// AQLast.g:449:2: ( STAR from -> ^( SELECT_ALL from ) | binNameList from -> ^( SELECT_EXPLICIT binNameList from ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STAR) ) {
				alt4=1;
			}
			else if ( (LA4_0==IDENTIFIER) ) {
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
					// AQLast.g:449:4: STAR from
					{
					STAR67=(Token)match(input,STAR,FOLLOW_STAR_in_select1155); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR67);

					pushFollow(FOLLOW_from_in_select1158);
					from68=from();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from.add(from68.getTree());
					// AST REWRITE
					// elements: from
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 449:15: -> ^( SELECT_ALL from )
					{
						// AQLast.g:449:18: ^( SELECT_ALL from )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(SELECT_ALL, "SELECT_ALL"), root_1);
						adaptor.addChild(root_1, stream_from.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:450:4: binNameList from
					{
					pushFollow(FOLLOW_binNameList_in_select1172);
					binNameList69=binNameList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binNameList.add(binNameList69.getTree());
					pushFollow(FOLLOW_from_in_select1174);
					from70=from();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_from.add(from70.getTree());
					// AST REWRITE
					// elements: from, binNameList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 450:21: -> ^( SELECT_EXPLICIT binNameList from )
					{
						// AQLast.g:450:24: ^( SELECT_EXPLICIT binNameList from )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(SELECT_EXPLICIT, "SELECT_EXPLICIT"), root_1);
						adaptor.addChild(root_1, stream_binNameList.nextTree());
						adaptor.addChild(root_1, stream_from.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, select_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "select"


	public static class from_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "from"
	// AQLast.g:454:1: from : FROM nameSet ( WHERE expressions )? -> ^( FROM nameSet ( ^( WHERE expressions ) )? ) ;
	public final AQLastParser.from_return from() throws RecognitionException {
		AQLastParser.from_return retval = new AQLastParser.from_return();
		retval.start = input.LT(1);
		int from_StartIndex = input.index();

		AQLTree root_0 = null;

		Token FROM71=null;
		Token WHERE73=null;
		ParserRuleReturnScope nameSet72 =null;
		ParserRuleReturnScope expressions74 =null;

		AQLTree FROM71_tree=null;
		AQLTree WHERE73_tree=null;
		RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
		RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// AQLast.g:455:2: ( FROM nameSet ( WHERE expressions )? -> ^( FROM nameSet ( ^( WHERE expressions ) )? ) )
			// AQLast.g:455:4: FROM nameSet ( WHERE expressions )?
			{
			FROM71=(Token)match(input,FROM,FOLLOW_FROM_in_from1200); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FROM.add(FROM71);

			pushFollow(FOLLOW_nameSet_in_from1202);
			nameSet72=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet72.getTree());
			// AQLast.g:455:17: ( WHERE expressions )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WHERE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// AQLast.g:455:18: WHERE expressions
					{
					WHERE73=(Token)match(input,WHERE,FOLLOW_WHERE_in_from1205); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHERE.add(WHERE73);

					pushFollow(FOLLOW_expressions_in_from1207);
					expressions74=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions74.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: FROM, WHERE, expressions, nameSet
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 456:3: -> ^( FROM nameSet ( ^( WHERE expressions ) )? )
			{
				// AQLast.g:456:6: ^( FROM nameSet ( ^( WHERE expressions ) )? )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_FROM.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				// AQLast.g:456:21: ( ^( WHERE expressions ) )?
				if ( stream_WHERE.hasNext()||stream_expressions.hasNext() ) {
					// AQLast.g:456:22: ^( WHERE expressions )
					{
					AQLTree root_2 = (AQLTree)adaptor.nil();
					root_2 = (AQLTree)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);
					adaptor.addChild(root_2, stream_expressions.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_WHERE.reset();
				stream_expressions.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, from_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "from"


	public static class expressions_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "expressions"
	// AQLast.g:459:1: expressions : ( PK '=' value -> ^( PK value ) | ( filter )+ -> ^( FILTERS filter ) );
	public final AQLastParser.expressions_return expressions() throws RecognitionException {
		AQLastParser.expressions_return retval = new AQLastParser.expressions_return();
		retval.start = input.LT(1);
		int expressions_StartIndex = input.index();

		AQLTree root_0 = null;

		Token PK75=null;
		Token char_literal76=null;
		ParserRuleReturnScope value77 =null;
		ParserRuleReturnScope filter78 =null;

		AQLTree PK75_tree=null;
		AQLTree char_literal76_tree=null;
		RewriteRuleTokenStream stream_PK=new RewriteRuleTokenStream(adaptor,"token PK");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_filter=new RewriteRuleSubtreeStream(adaptor,"rule filter");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// AQLast.g:460:2: ( PK '=' value -> ^( PK value ) | ( filter )+ -> ^( FILTERS filter ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PK) ) {
				alt7=1;
			}
			else if ( (LA7_0==IDENTIFIER) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// AQLast.g:460:4: PK '=' value
					{
					PK75=(Token)match(input,PK,FOLLOW_PK_in_expressions1242); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PK.add(PK75);

					char_literal76=(Token)match(input,EQ,FOLLOW_EQ_in_expressions1244); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQ.add(char_literal76);

					pushFollow(FOLLOW_value_in_expressions1246);
					value77=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(value77.getTree());
					// AST REWRITE
					// elements: value, PK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 460:17: -> ^( PK value )
					{
						// AQLast.g:460:20: ^( PK value )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_PK.nextNode(), root_1);
						adaptor.addChild(root_1, stream_value.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:461:4: ( filter )+
					{
					// AQLast.g:461:4: ( filter )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IDENTIFIER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// AQLast.g:461:4: filter
							{
							pushFollow(FOLLOW_filter_in_expressions1260);
							filter78=filter();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_filter.add(filter78.getTree());
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// AST REWRITE
					// elements: filter
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 461:12: -> ^( FILTERS filter )
					{
						// AQLast.g:461:15: ^( FILTERS filter )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(FILTERS, "FILTERS"), root_1);
						adaptor.addChild(root_1, stream_filter.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, expressions_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressions"


	public static class filter_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "filter"
	// AQLast.g:465:1: filter : ( bin '=' value -> ^( EQ bin value ) |b2= bin BETWEEN low= INTLITERAL AND high= INTLITERAL -> ^( BETWEEN $b2 $low $high) |b2= bin BETWEEN lowF= function AND highF= function -> ^( BETWEEN $b2 $low $high) );
	public final AQLastParser.filter_return filter() throws RecognitionException {
		AQLastParser.filter_return retval = new AQLastParser.filter_return();
		retval.start = input.LT(1);
		int filter_StartIndex = input.index();

		AQLTree root_0 = null;

		Token low=null;
		Token high=null;
		Token char_literal80=null;
		Token BETWEEN82=null;
		Token AND83=null;
		Token BETWEEN84=null;
		Token AND85=null;
		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope lowF =null;
		ParserRuleReturnScope highF =null;
		ParserRuleReturnScope bin79 =null;
		ParserRuleReturnScope value81 =null;

		AQLTree low_tree=null;
		AQLTree high_tree=null;
		AQLTree char_literal80_tree=null;
		AQLTree BETWEEN82_tree=null;
		AQLTree AND83_tree=null;
		AQLTree BETWEEN84_tree=null;
		AQLTree AND85_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
		RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_bin=new RewriteRuleSubtreeStream(adaptor,"rule bin");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// AQLast.g:466:2: ( bin '=' value -> ^( EQ bin value ) |b2= bin BETWEEN low= INTLITERAL AND high= INTLITERAL -> ^( BETWEEN $b2 $low $high) |b2= bin BETWEEN lowF= function AND highF= function -> ^( BETWEEN $b2 $low $high) )
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENTIFIER) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==EQ) ) {
					alt8=1;
				}
				else if ( (LA8_1==BETWEEN) ) {
					int LA8_3 = input.LA(3);
					if ( (LA8_3==INTLITERAL) ) {
						alt8=2;
					}
					else if ( (LA8_3==IDENTIFIER) ) {
						alt8=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 3, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// AQLast.g:466:4: bin '=' value
					{
					pushFollow(FOLLOW_bin_in_filter1285);
					bin79=bin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bin.add(bin79.getTree());
					char_literal80=(Token)match(input,EQ,FOLLOW_EQ_in_filter1287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQ.add(char_literal80);

					pushFollow(FOLLOW_value_in_filter1289);
					value81=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(value81.getTree());
					// AST REWRITE
					// elements: bin, value
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 466:18: -> ^( EQ bin value )
					{
						// AQLast.g:466:21: ^( EQ bin value )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(EQ, "EQ"), root_1);
						adaptor.addChild(root_1, stream_bin.nextTree());
						adaptor.addChild(root_1, stream_value.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:467:4: b2= bin BETWEEN low= INTLITERAL AND high= INTLITERAL
					{
					pushFollow(FOLLOW_bin_in_filter1306);
					b2=bin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bin.add(b2.getTree());
					BETWEEN82=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_filter1308); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN82);

					low=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter1312); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(low);

					AND83=(Token)match(input,AND,FOLLOW_AND_in_filter1314); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND.add(AND83);

					high=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter1318); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(high);

					// AST REWRITE
					// elements: low, BETWEEN, high, b2
					// token labels: high, low
					// rule labels: b2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_high=new RewriteRuleTokenStream(adaptor,"token high",high);
					RewriteRuleTokenStream stream_low=new RewriteRuleTokenStream(adaptor,"token low",low);
					RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 467:54: -> ^( BETWEEN $b2 $low $high)
					{
						// AQLast.g:467:57: ^( BETWEEN $b2 $low $high)
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_b2.nextTree());
						adaptor.addChild(root_1, stream_low.nextNode());
						adaptor.addChild(root_1, stream_high.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:468:5: b2= bin BETWEEN lowF= function AND highF= function
					{
					pushFollow(FOLLOW_bin_in_filter1341);
					b2=bin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bin.add(b2.getTree());
					BETWEEN84=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_filter1343); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BETWEEN.add(BETWEEN84);

					pushFollow(FOLLOW_function_in_filter1347);
					lowF=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(lowF.getTree());
					AND85=(Token)match(input,AND,FOLLOW_AND_in_filter1349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND.add(AND85);

					pushFollow(FOLLOW_function_in_filter1353);
					highF=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(highF.getTree());
					// AST REWRITE
					// elements: BETWEEN, b2, low, high
					// token labels: high, low
					// rule labels: b2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_high=new RewriteRuleTokenStream(adaptor,"token high",high);
					RewriteRuleTokenStream stream_low=new RewriteRuleTokenStream(adaptor,"token low",low);
					RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 468:53: -> ^( BETWEEN $b2 $low $high)
					{
						// AQLast.g:468:56: ^( BETWEEN $b2 $low $high)
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_b2.nextTree());
						adaptor.addChild(root_1, stream_low.nextNode());
						adaptor.addChild(root_1, stream_high.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, filter_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "filter"


	public static class function_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// AQLast.g:471:1: function : id= IDENTIFIER '(' value ')' -> ^( FUNCTION $id value ) ;
	public final AQLastParser.function_return function() throws RecognitionException {
		AQLastParser.function_return retval = new AQLastParser.function_return();
		retval.start = input.LT(1);
		int function_StartIndex = input.index();

		AQLTree root_0 = null;

		Token id=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope value87 =null;

		AQLTree id_tree=null;
		AQLTree char_literal86_tree=null;
		AQLTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// AQLast.g:472:3: (id= IDENTIFIER '(' value ')' -> ^( FUNCTION $id value ) )
			// AQLast.g:472:5: id= IDENTIFIER '(' value ')'
			{
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1382); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);

			char_literal86=(Token)match(input,85,FOLLOW_85_in_function1384); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(char_literal86);

			pushFollow(FOLLOW_value_in_function1386);
			value87=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_value.add(value87.getTree());
			char_literal88=(Token)match(input,86,FOLLOW_86_in_function1388); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal88);

			// AST REWRITE
			// elements: value, id
			// token labels: id
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 472:33: -> ^( FUNCTION $id value )
			{
				// AQLast.g:472:36: ^( FUNCTION $id value )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, function_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "function"


	public static class nameSet_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "nameSet"
	// AQLast.g:474:1: nameSet : namespace_name ( '.' set_name )? -> ^( NAMESET namespace_name ( set_name )? ) ;
	public final AQLastParser.nameSet_return nameSet() throws RecognitionException {
		AQLastParser.nameSet_return retval = new AQLastParser.nameSet_return();
		retval.start = input.LT(1);
		int nameSet_StartIndex = input.index();

		AQLTree root_0 = null;

		Token char_literal90=null;
		ParserRuleReturnScope namespace_name89 =null;
		ParserRuleReturnScope set_name91 =null;

		AQLTree char_literal90_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleSubtreeStream stream_set_name=new RewriteRuleSubtreeStream(adaptor,"rule set_name");
		RewriteRuleSubtreeStream stream_namespace_name=new RewriteRuleSubtreeStream(adaptor,"rule namespace_name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// AQLast.g:475:2: ( namespace_name ( '.' set_name )? -> ^( NAMESET namespace_name ( set_name )? ) )
			// AQLast.g:475:4: namespace_name ( '.' set_name )?
			{
			pushFollow(FOLLOW_namespace_name_in_nameSet1411);
			namespace_name89=namespace_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_namespace_name.add(namespace_name89.getTree());
			// AQLast.g:475:19: ( '.' set_name )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==88) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// AQLast.g:475:20: '.' set_name
					{
					char_literal90=(Token)match(input,88,FOLLOW_88_in_nameSet1414); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_88.add(char_literal90);

					pushFollow(FOLLOW_set_name_in_nameSet1416);
					set_name91=set_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_set_name.add(set_name91.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: set_name, namespace_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 476:3: -> ^( NAMESET namespace_name ( set_name )? )
			{
				// AQLast.g:476:6: ^( NAMESET namespace_name ( set_name )? )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(NAMESET, "NAMESET"), root_1);
				adaptor.addChild(root_1, stream_namespace_name.nextTree());
				// AQLast.g:476:31: ( set_name )?
				if ( stream_set_name.hasNext() ) {
					adaptor.addChild(root_1, stream_set_name.nextTree());
				}
				stream_set_name.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, nameSet_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nameSet"


	public static class registerPackage_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "registerPackage"
	// AQLast.g:495:1: registerPackage : REGISTER MODULE filepath= filePath -> ^( REGISTER $filepath) ;
	public final AQLastParser.registerPackage_return registerPackage() throws RecognitionException {
		AQLastParser.registerPackage_return retval = new AQLastParser.registerPackage_return();
		retval.start = input.LT(1);
		int registerPackage_StartIndex = input.index();

		AQLTree root_0 = null;

		Token REGISTER92=null;
		Token MODULE93=null;
		ParserRuleReturnScope filepath =null;

		AQLTree REGISTER92_tree=null;
		AQLTree MODULE93_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleSubtreeStream stream_filePath=new RewriteRuleSubtreeStream(adaptor,"rule filePath");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// AQLast.g:497:2: ( REGISTER MODULE filepath= filePath -> ^( REGISTER $filepath) )
			// AQLast.g:497:4: REGISTER MODULE filepath= filePath
			{
			REGISTER92=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_registerPackage1453); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REGISTER.add(REGISTER92);

			MODULE93=(Token)match(input,MODULE,FOLLOW_MODULE_in_registerPackage1455); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_MODULE.add(MODULE93);

			pushFollow(FOLLOW_filePath_in_registerPackage1459);
			filepath=filePath();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_filePath.add(filepath.getTree());
			// AST REWRITE
			// elements: REGISTER, filepath
			// token labels: 
			// rule labels: filepath, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_filepath=new RewriteRuleSubtreeStream(adaptor,"rule filepath",filepath!=null?filepath.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 498:3: -> ^( REGISTER $filepath)
			{
				// AQLast.g:498:6: ^( REGISTER $filepath)
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_REGISTER.nextNode(), root_1);
				adaptor.addChild(root_1, stream_filepath.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, registerPackage_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "registerPackage"


	public static class execute_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "execute"
	// AQLast.g:505:1: execute : EXECUTE moduleFunction '(' ( valueList )? ')' ON nameSet ( WHERE PK '=' primaryKey )? -> ^( EXECUTE nameSet moduleFunction ( primaryKey )? ( valueList )? ) ;
	public final AQLastParser.execute_return execute() throws RecognitionException {
		AQLastParser.execute_return retval = new AQLastParser.execute_return();
		retval.start = input.LT(1);
		int execute_StartIndex = input.index();

		AQLTree root_0 = null;

		Token EXECUTE94=null;
		Token char_literal96=null;
		Token char_literal98=null;
		Token ON99=null;
		Token WHERE101=null;
		Token PK102=null;
		Token char_literal103=null;
		ParserRuleReturnScope moduleFunction95 =null;
		ParserRuleReturnScope valueList97 =null;
		ParserRuleReturnScope nameSet100 =null;
		ParserRuleReturnScope primaryKey104 =null;

		AQLTree EXECUTE94_tree=null;
		AQLTree char_literal96_tree=null;
		AQLTree char_literal98_tree=null;
		AQLTree ON99_tree=null;
		AQLTree WHERE101_tree=null;
		AQLTree PK102_tree=null;
		AQLTree char_literal103_tree=null;
		RewriteRuleTokenStream stream_EXECUTE=new RewriteRuleTokenStream(adaptor,"token EXECUTE");
		RewriteRuleTokenStream stream_PK=new RewriteRuleTokenStream(adaptor,"token PK");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_valueList=new RewriteRuleSubtreeStream(adaptor,"rule valueList");
		RewriteRuleSubtreeStream stream_moduleFunction=new RewriteRuleSubtreeStream(adaptor,"rule moduleFunction");
		RewriteRuleSubtreeStream stream_primaryKey=new RewriteRuleSubtreeStream(adaptor,"rule primaryKey");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// AQLast.g:507:2: ( EXECUTE moduleFunction '(' ( valueList )? ')' ON nameSet ( WHERE PK '=' primaryKey )? -> ^( EXECUTE nameSet moduleFunction ( primaryKey )? ( valueList )? ) )
			// AQLast.g:507:4: EXECUTE moduleFunction '(' ( valueList )? ')' ON nameSet ( WHERE PK '=' primaryKey )?
			{
			EXECUTE94=(Token)match(input,EXECUTE,FOLLOW_EXECUTE_in_execute1488); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXECUTE.add(EXECUTE94);

			pushFollow(FOLLOW_moduleFunction_in_execute1490);
			moduleFunction95=moduleFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_moduleFunction.add(moduleFunction95.getTree());
			char_literal96=(Token)match(input,85,FOLLOW_85_in_execute1492); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(char_literal96);

			// AQLast.g:507:31: ( valueList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==INTLITERAL||LA10_0==STRINGLITERAL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// AQLast.g:507:31: valueList
					{
					pushFollow(FOLLOW_valueList_in_execute1494);
					valueList97=valueList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueList.add(valueList97.getTree());
					}
					break;

			}

			char_literal98=(Token)match(input,86,FOLLOW_86_in_execute1497); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal98);

			ON99=(Token)match(input,ON,FOLLOW_ON_in_execute1501); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ON.add(ON99);

			pushFollow(FOLLOW_nameSet_in_execute1503);
			nameSet100=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet100.getTree());
			// AQLast.g:508:14: ( WHERE PK '=' primaryKey )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WHERE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// AQLast.g:508:15: WHERE PK '=' primaryKey
					{
					WHERE101=(Token)match(input,WHERE,FOLLOW_WHERE_in_execute1506); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHERE.add(WHERE101);

					PK102=(Token)match(input,PK,FOLLOW_PK_in_execute1508); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PK.add(PK102);

					char_literal103=(Token)match(input,EQ,FOLLOW_EQ_in_execute1510); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQ.add(char_literal103);

					pushFollow(FOLLOW_primaryKey_in_execute1512);
					primaryKey104=primaryKey();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primaryKey.add(primaryKey104.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: moduleFunction, valueList, nameSet, primaryKey, EXECUTE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 509:3: -> ^( EXECUTE nameSet moduleFunction ( primaryKey )? ( valueList )? )
			{
				// AQLast.g:509:6: ^( EXECUTE nameSet moduleFunction ( primaryKey )? ( valueList )? )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_EXECUTE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				adaptor.addChild(root_1, stream_moduleFunction.nextTree());
				// AQLast.g:509:39: ( primaryKey )?
				if ( stream_primaryKey.hasNext() ) {
					adaptor.addChild(root_1, stream_primaryKey.nextTree());
				}
				stream_primaryKey.reset();

				// AQLast.g:509:51: ( valueList )?
				if ( stream_valueList.hasNext() ) {
					adaptor.addChild(root_1, stream_valueList.nextTree());
				}
				stream_valueList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, execute_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "execute"


	public static class aggregate_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "aggregate"
	// AQLast.g:516:1: aggregate : AGGREGATE moduleFunction ( '(' ( valueList )? ')' )? ON nameSet ( WHERE expressions )? -> ^( AGGREGATE nameSet moduleFunction ( expressions )? ( valueList )? ) ;
	public final AQLastParser.aggregate_return aggregate() throws RecognitionException {
		AQLastParser.aggregate_return retval = new AQLastParser.aggregate_return();
		retval.start = input.LT(1);
		int aggregate_StartIndex = input.index();

		AQLTree root_0 = null;

		Token AGGREGATE105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		Token ON110=null;
		Token WHERE112=null;
		ParserRuleReturnScope moduleFunction106 =null;
		ParserRuleReturnScope valueList108 =null;
		ParserRuleReturnScope nameSet111 =null;
		ParserRuleReturnScope expressions113 =null;

		AQLTree AGGREGATE105_tree=null;
		AQLTree char_literal107_tree=null;
		AQLTree char_literal109_tree=null;
		AQLTree ON110_tree=null;
		AQLTree WHERE112_tree=null;
		RewriteRuleTokenStream stream_AGGREGATE=new RewriteRuleTokenStream(adaptor,"token AGGREGATE");
		RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");
		RewriteRuleSubtreeStream stream_valueList=new RewriteRuleSubtreeStream(adaptor,"rule valueList");
		RewriteRuleSubtreeStream stream_moduleFunction=new RewriteRuleSubtreeStream(adaptor,"rule moduleFunction");
		RewriteRuleSubtreeStream stream_expressions=new RewriteRuleSubtreeStream(adaptor,"rule expressions");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// AQLast.g:518:2: ( AGGREGATE moduleFunction ( '(' ( valueList )? ')' )? ON nameSet ( WHERE expressions )? -> ^( AGGREGATE nameSet moduleFunction ( expressions )? ( valueList )? ) )
			// AQLast.g:518:4: AGGREGATE moduleFunction ( '(' ( valueList )? ')' )? ON nameSet ( WHERE expressions )?
			{
			AGGREGATE105=(Token)match(input,AGGREGATE,FOLLOW_AGGREGATE_in_aggregate1551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_AGGREGATE.add(AGGREGATE105);

			pushFollow(FOLLOW_moduleFunction_in_aggregate1553);
			moduleFunction106=moduleFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_moduleFunction.add(moduleFunction106.getTree());
			// AQLast.g:518:29: ( '(' ( valueList )? ')' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==85) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// AQLast.g:518:30: '(' ( valueList )? ')'
					{
					char_literal107=(Token)match(input,85,FOLLOW_85_in_aggregate1556); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_85.add(char_literal107);

					// AQLast.g:518:34: ( valueList )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==INTLITERAL||LA12_0==STRINGLITERAL) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// AQLast.g:518:35: valueList
							{
							pushFollow(FOLLOW_valueList_in_aggregate1559);
							valueList108=valueList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_valueList.add(valueList108.getTree());
							}
							break;

					}

					char_literal109=(Token)match(input,86,FOLLOW_86_in_aggregate1563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal109);

					}
					break;

			}

			ON110=(Token)match(input,ON,FOLLOW_ON_in_aggregate1567); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ON.add(ON110);

			pushFollow(FOLLOW_nameSet_in_aggregate1569);
			nameSet111=nameSet();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameSet.add(nameSet111.getTree());
			// AQLast.g:518:64: ( WHERE expressions )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WHERE) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// AQLast.g:518:65: WHERE expressions
					{
					WHERE112=(Token)match(input,WHERE,FOLLOW_WHERE_in_aggregate1572); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHERE.add(WHERE112);

					pushFollow(FOLLOW_expressions_in_aggregate1574);
					expressions113=expressions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressions.add(expressions113.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: valueList, moduleFunction, nameSet, AGGREGATE, expressions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 519:3: -> ^( AGGREGATE nameSet moduleFunction ( expressions )? ( valueList )? )
			{
				// AQLast.g:519:6: ^( AGGREGATE nameSet moduleFunction ( expressions )? ( valueList )? )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_AGGREGATE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameSet.nextTree());
				adaptor.addChild(root_1, stream_moduleFunction.nextTree());
				// AQLast.g:519:41: ( expressions )?
				if ( stream_expressions.hasNext() ) {
					adaptor.addChild(root_1, stream_expressions.nextTree());
				}
				stream_expressions.reset();

				// AQLast.g:519:54: ( valueList )?
				if ( stream_valueList.hasNext() ) {
					adaptor.addChild(root_1, stream_valueList.nextTree());
				}
				stream_valueList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, aggregate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "aggregate"


	public static class moduleFunction_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "moduleFunction"
	// AQLast.g:522:1: moduleFunction : packageName= IDENTIFIER '.' functionName= ( IDENTIFIER | SCAN | GET | REMOVE ) ;
	public final AQLastParser.moduleFunction_return moduleFunction() throws RecognitionException {
		AQLastParser.moduleFunction_return retval = new AQLastParser.moduleFunction_return();
		retval.start = input.LT(1);
		int moduleFunction_StartIndex = input.index();

		AQLTree root_0 = null;

		Token packageName=null;
		Token functionName=null;
		Token char_literal114=null;

		AQLTree packageName_tree=null;
		AQLTree functionName_tree=null;
		AQLTree char_literal114_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// AQLast.g:523:2: (packageName= IDENTIFIER '.' functionName= ( IDENTIFIER | SCAN | GET | REMOVE ) )
			// AQLast.g:523:4: packageName= IDENTIFIER '.' functionName= ( IDENTIFIER | SCAN | GET | REMOVE )
			{
			root_0 = (AQLTree)adaptor.nil();


			packageName=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moduleFunction1607); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			packageName_tree = (AQLTree)adaptor.create(packageName);
			adaptor.addChild(root_0, packageName_tree);
			}

			char_literal114=(Token)match(input,88,FOLLOW_88_in_moduleFunction1609); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal114_tree = (AQLTree)adaptor.create(char_literal114);
			adaptor.addChild(root_0, char_literal114_tree);
			}

			functionName=input.LT(1);
			if ( input.LA(1)==GET||input.LA(1)==IDENTIFIER||input.LA(1)==REMOVE||input.LA(1)==SCAN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(functionName));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, moduleFunction_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "moduleFunction"


	public static class binNameList_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "binNameList"
	// AQLast.g:526:1: binNameList : bin ( ',' bin )* -> ^( BIN_NAMES ( bin )+ ) ;
	public final AQLastParser.binNameList_return binNameList() throws RecognitionException {
		AQLastParser.binNameList_return retval = new AQLastParser.binNameList_return();
		retval.start = input.LT(1);
		int binNameList_StartIndex = input.index();

		AQLTree root_0 = null;

		Token char_literal116=null;
		ParserRuleReturnScope bin115 =null;
		ParserRuleReturnScope bin117 =null;

		AQLTree char_literal116_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_bin=new RewriteRuleSubtreeStream(adaptor,"rule bin");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// AQLast.g:527:2: ( bin ( ',' bin )* -> ^( BIN_NAMES ( bin )+ ) )
			// AQLast.g:527:4: bin ( ',' bin )*
			{
			pushFollow(FOLLOW_bin_in_binNameList1634);
			bin115=bin();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_bin.add(bin115.getTree());
			// AQLast.g:527:8: ( ',' bin )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==87) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// AQLast.g:527:9: ',' bin
					{
					char_literal116=(Token)match(input,87,FOLLOW_87_in_binNameList1637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal116);

					pushFollow(FOLLOW_bin_in_binNameList1639);
					bin117=bin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bin.add(bin117.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			// AST REWRITE
			// elements: bin
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 527:19: -> ^( BIN_NAMES ( bin )+ )
			{
				// AQLast.g:527:22: ^( BIN_NAMES ( bin )+ )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(BIN_NAMES, "BIN_NAMES"), root_1);
				if ( !(stream_bin.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bin.hasNext() ) {
					adaptor.addChild(root_1, stream_bin.nextTree());
				}
				stream_bin.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, binNameList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "binNameList"


	public static class valueList_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "valueList"
	// AQLast.g:530:1: valueList : value ( ',' value )* -> ^( VALUES ( value )+ ) ;
	public final AQLastParser.valueList_return valueList() throws RecognitionException {
		AQLastParser.valueList_return retval = new AQLastParser.valueList_return();
		retval.start = input.LT(1);
		int valueList_StartIndex = input.index();

		AQLTree root_0 = null;

		Token char_literal119=null;
		ParserRuleReturnScope value118 =null;
		ParserRuleReturnScope value120 =null;

		AQLTree char_literal119_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// AQLast.g:531:2: ( value ( ',' value )* -> ^( VALUES ( value )+ ) )
			// AQLast.g:531:5: value ( ',' value )*
			{
			pushFollow(FOLLOW_value_in_valueList1664);
			value118=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_value.add(value118.getTree());
			// AQLast.g:531:11: ( ',' value )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==87) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// AQLast.g:531:12: ',' value
					{
					char_literal119=(Token)match(input,87,FOLLOW_87_in_valueList1667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_87.add(char_literal119);

					pushFollow(FOLLOW_value_in_valueList1669);
					value120=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(value120.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			// AST REWRITE
			// elements: value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 531:25: -> ^( VALUES ( value )+ )
			{
				// AQLast.g:531:28: ^( VALUES ( value )+ )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(VALUES, "VALUES"), root_1);
				if ( !(stream_value.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_value.hasNext() ) {
					adaptor.addChild(root_1, stream_value.nextTree());
				}
				stream_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, valueList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "valueList"


	public static class show_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "show"
	// AQLast.g:552:1: show : SHOW ( INDEXES ( nameSet )? -> ^( SHOW INDEXES ( nameSet )? ) | MODULES -> ^( SHOW MODULES ) | NAMESPACES -> ^( SHOW NAMESPACES ) | SETS -> ^( SHOW SETS ) | BINS -> ^( SHOW BINS ) | SCANS -> ^( SHOW SCANS ) | QUERIES -> ^( SHOW QUERIES ) | PACKAGES -> ^( SHOW PACKAGES ) ) ;
	public final AQLastParser.show_return show() throws RecognitionException {
		AQLastParser.show_return retval = new AQLastParser.show_return();
		retval.start = input.LT(1);
		int show_StartIndex = input.index();

		AQLTree root_0 = null;

		Token SHOW121=null;
		Token INDEXES122=null;
		Token MODULES124=null;
		Token NAMESPACES125=null;
		Token SETS126=null;
		Token BINS127=null;
		Token SCANS128=null;
		Token QUERIES129=null;
		Token PACKAGES130=null;
		ParserRuleReturnScope nameSet123 =null;

		AQLTree SHOW121_tree=null;
		AQLTree INDEXES122_tree=null;
		AQLTree MODULES124_tree=null;
		AQLTree NAMESPACES125_tree=null;
		AQLTree SETS126_tree=null;
		AQLTree BINS127_tree=null;
		AQLTree SCANS128_tree=null;
		AQLTree QUERIES129_tree=null;
		AQLTree PACKAGES130_tree=null;
		RewriteRuleTokenStream stream_QUERIES=new RewriteRuleTokenStream(adaptor,"token QUERIES");
		RewriteRuleTokenStream stream_MODULES=new RewriteRuleTokenStream(adaptor,"token MODULES");
		RewriteRuleTokenStream stream_BINS=new RewriteRuleTokenStream(adaptor,"token BINS");
		RewriteRuleTokenStream stream_SETS=new RewriteRuleTokenStream(adaptor,"token SETS");
		RewriteRuleTokenStream stream_SCANS=new RewriteRuleTokenStream(adaptor,"token SCANS");
		RewriteRuleTokenStream stream_NAMESPACES=new RewriteRuleTokenStream(adaptor,"token NAMESPACES");
		RewriteRuleTokenStream stream_PACKAGES=new RewriteRuleTokenStream(adaptor,"token PACKAGES");
		RewriteRuleTokenStream stream_SHOW=new RewriteRuleTokenStream(adaptor,"token SHOW");
		RewriteRuleTokenStream stream_INDEXES=new RewriteRuleTokenStream(adaptor,"token INDEXES");
		RewriteRuleSubtreeStream stream_nameSet=new RewriteRuleSubtreeStream(adaptor,"rule nameSet");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// AQLast.g:554:2: ( SHOW ( INDEXES ( nameSet )? -> ^( SHOW INDEXES ( nameSet )? ) | MODULES -> ^( SHOW MODULES ) | NAMESPACES -> ^( SHOW NAMESPACES ) | SETS -> ^( SHOW SETS ) | BINS -> ^( SHOW BINS ) | SCANS -> ^( SHOW SCANS ) | QUERIES -> ^( SHOW QUERIES ) | PACKAGES -> ^( SHOW PACKAGES ) ) )
			// AQLast.g:554:4: SHOW ( INDEXES ( nameSet )? -> ^( SHOW INDEXES ( nameSet )? ) | MODULES -> ^( SHOW MODULES ) | NAMESPACES -> ^( SHOW NAMESPACES ) | SETS -> ^( SHOW SETS ) | BINS -> ^( SHOW BINS ) | SCANS -> ^( SHOW SCANS ) | QUERIES -> ^( SHOW QUERIES ) | PACKAGES -> ^( SHOW PACKAGES ) )
			{
			SHOW121=(Token)match(input,SHOW,FOLLOW_SHOW_in_show1701); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SHOW.add(SHOW121);

			// AQLast.g:555:2: ( INDEXES ( nameSet )? -> ^( SHOW INDEXES ( nameSet )? ) | MODULES -> ^( SHOW MODULES ) | NAMESPACES -> ^( SHOW NAMESPACES ) | SETS -> ^( SHOW SETS ) | BINS -> ^( SHOW BINS ) | SCANS -> ^( SHOW SCANS ) | QUERIES -> ^( SHOW QUERIES ) | PACKAGES -> ^( SHOW PACKAGES ) )
			int alt18=8;
			switch ( input.LA(1) ) {
			case INDEXES:
				{
				alt18=1;
				}
				break;
			case MODULES:
				{
				alt18=2;
				}
				break;
			case NAMESPACES:
				{
				alt18=3;
				}
				break;
			case SETS:
				{
				alt18=4;
				}
				break;
			case BINS:
				{
				alt18=5;
				}
				break;
			case SCANS:
				{
				alt18=6;
				}
				break;
			case QUERIES:
				{
				alt18=7;
				}
				break;
			case PACKAGES:
				{
				alt18=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// AQLast.g:555:4: INDEXES ( nameSet )?
					{
					INDEXES122=(Token)match(input,INDEXES,FOLLOW_INDEXES_in_show1707); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INDEXES.add(INDEXES122);

					// AQLast.g:555:12: ( nameSet )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==IDENTIFIER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// AQLast.g:555:12: nameSet
							{
							pushFollow(FOLLOW_nameSet_in_show1709);
							nameSet123=nameSet();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_nameSet.add(nameSet123.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: nameSet, SHOW, INDEXES
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 556:3: -> ^( SHOW INDEXES ( nameSet )? )
					{
						// AQLast.g:556:6: ^( SHOW INDEXES ( nameSet )? )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_INDEXES.nextNode());
						// AQLast.g:556:21: ( nameSet )?
						if ( stream_nameSet.hasNext() ) {
							adaptor.addChild(root_1, stream_nameSet.nextTree());
						}
						stream_nameSet.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:557:4: MODULES
					{
					MODULES124=(Token)match(input,MODULES,FOLLOW_MODULES_in_show1729); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODULES.add(MODULES124);

					// AST REWRITE
					// elements: MODULES, SHOW
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 558:3: -> ^( SHOW MODULES )
					{
						// AQLast.g:558:6: ^( SHOW MODULES )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_MODULES.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:559:4: NAMESPACES
					{
					NAMESPACES125=(Token)match(input,NAMESPACES,FOLLOW_NAMESPACES_in_show1744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMESPACES.add(NAMESPACES125);

					// AST REWRITE
					// elements: SHOW, NAMESPACES
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 560:3: -> ^( SHOW NAMESPACES )
					{
						// AQLast.g:560:6: ^( SHOW NAMESPACES )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_NAMESPACES.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AQLast.g:561:4: SETS
					{
					SETS126=(Token)match(input,SETS,FOLLOW_SETS_in_show1759); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SETS.add(SETS126);

					// AST REWRITE
					// elements: SETS, SHOW
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 562:3: -> ^( SHOW SETS )
					{
						// AQLast.g:562:6: ^( SHOW SETS )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_SETS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AQLast.g:563:4: BINS
					{
					BINS127=(Token)match(input,BINS,FOLLOW_BINS_in_show1774); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BINS.add(BINS127);

					// AST REWRITE
					// elements: SHOW, BINS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 564:3: -> ^( SHOW BINS )
					{
						// AQLast.g:564:6: ^( SHOW BINS )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_BINS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AQLast.g:565:4: SCANS
					{
					SCANS128=(Token)match(input,SCANS,FOLLOW_SCANS_in_show1789); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCANS.add(SCANS128);

					// AST REWRITE
					// elements: SHOW, SCANS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 566:3: -> ^( SHOW SCANS )
					{
						// AQLast.g:566:6: ^( SHOW SCANS )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_SCANS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// AQLast.g:567:4: QUERIES
					{
					QUERIES129=(Token)match(input,QUERIES,FOLLOW_QUERIES_in_show1804); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUERIES.add(QUERIES129);

					// AST REWRITE
					// elements: SHOW, QUERIES
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 568:3: -> ^( SHOW QUERIES )
					{
						// AQLast.g:568:6: ^( SHOW QUERIES )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_QUERIES.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// AQLast.g:569:5: PACKAGES
					{
					PACKAGES130=(Token)match(input,PACKAGES,FOLLOW_PACKAGES_in_show1820); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PACKAGES.add(PACKAGES130);

					// AST REWRITE
					// elements: PACKAGES, SHOW
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 570:5: -> ^( SHOW PACKAGES )
					{
						// AQLast.g:570:8: ^( SHOW PACKAGES )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SHOW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_PACKAGES.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, show_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "show"


	public static class desc_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "desc"
	// AQLast.g:578:1: desc : DESC ( MODULE moduleName -> ^( DESC ^( MODULE moduleName ) ) | INDEX namespace_name index_name -> ^( DESC ^( INDEX namespace_name index_name ) ) ) ;
	public final AQLastParser.desc_return desc() throws RecognitionException {
		AQLastParser.desc_return retval = new AQLastParser.desc_return();
		retval.start = input.LT(1);
		int desc_StartIndex = input.index();

		AQLTree root_0 = null;

		Token DESC131=null;
		Token MODULE132=null;
		Token INDEX134=null;
		ParserRuleReturnScope moduleName133 =null;
		ParserRuleReturnScope namespace_name135 =null;
		ParserRuleReturnScope index_name136 =null;

		AQLTree DESC131_tree=null;
		AQLTree MODULE132_tree=null;
		AQLTree INDEX134_tree=null;
		RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
		RewriteRuleSubtreeStream stream_moduleName=new RewriteRuleSubtreeStream(adaptor,"rule moduleName");
		RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name");
		RewriteRuleSubtreeStream stream_namespace_name=new RewriteRuleSubtreeStream(adaptor,"rule namespace_name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// AQLast.g:580:2: ( DESC ( MODULE moduleName -> ^( DESC ^( MODULE moduleName ) ) | INDEX namespace_name index_name -> ^( DESC ^( INDEX namespace_name index_name ) ) ) )
			// AQLast.g:580:4: DESC ( MODULE moduleName -> ^( DESC ^( MODULE moduleName ) ) | INDEX namespace_name index_name -> ^( DESC ^( INDEX namespace_name index_name ) ) )
			{
			DESC131=(Token)match(input,DESC,FOLLOW_DESC_in_desc1854); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DESC.add(DESC131);

			// AQLast.g:581:3: ( MODULE moduleName -> ^( DESC ^( MODULE moduleName ) ) | INDEX namespace_name index_name -> ^( DESC ^( INDEX namespace_name index_name ) ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==MODULE) ) {
				alt19=1;
			}
			else if ( (LA19_0==INDEX) ) {
				alt19=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// AQLast.g:582:3: MODULE moduleName
					{
					MODULE132=(Token)match(input,MODULE,FOLLOW_MODULE_in_desc1863); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MODULE.add(MODULE132);

					pushFollow(FOLLOW_moduleName_in_desc1865);
					moduleName133=moduleName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_moduleName.add(moduleName133.getTree());
					// AST REWRITE
					// elements: MODULE, DESC, moduleName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 582:21: -> ^( DESC ^( MODULE moduleName ) )
					{
						// AQLast.g:582:24: ^( DESC ^( MODULE moduleName ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_DESC.nextNode(), root_1);
						// AQLast.g:582:31: ^( MODULE moduleName )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_2);
						adaptor.addChild(root_2, stream_moduleName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:583:5: INDEX namespace_name index_name
					{
					INDEX134=(Token)match(input,INDEX,FOLLOW_INDEX_in_desc1883); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INDEX.add(INDEX134);

					pushFollow(FOLLOW_namespace_name_in_desc1885);
					namespace_name135=namespace_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namespace_name.add(namespace_name135.getTree());
					pushFollow(FOLLOW_index_name_in_desc1887);
					index_name136=index_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_index_name.add(index_name136.getTree());
					// AST REWRITE
					// elements: index_name, DESC, namespace_name, INDEX
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 583:37: -> ^( DESC ^( INDEX namespace_name index_name ) )
					{
						// AQLast.g:583:40: ^( DESC ^( INDEX namespace_name index_name ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_DESC.nextNode(), root_1);
						// AQLast.g:583:47: ^( INDEX namespace_name index_name )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_INDEX.nextNode(), root_2);
						adaptor.addChild(root_2, stream_namespace_name.nextTree());
						adaptor.addChild(root_2, stream_index_name.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, desc_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "desc"


	public static class stat_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// AQLast.g:592:1: stat : STAT ( INDEX namespace_name index_name -> ^( STAT ^( INDEX namespace_name index_name ) ) | QUERY -> ^( STAT QUERY ) | SYSTEM -> ^( STAT SYSTEM ) ) ;
	public final AQLastParser.stat_return stat() throws RecognitionException {
		AQLastParser.stat_return retval = new AQLastParser.stat_return();
		retval.start = input.LT(1);
		int stat_StartIndex = input.index();

		AQLTree root_0 = null;

		Token STAT137=null;
		Token INDEX138=null;
		Token QUERY141=null;
		Token SYSTEM142=null;
		ParserRuleReturnScope namespace_name139 =null;
		ParserRuleReturnScope index_name140 =null;

		AQLTree STAT137_tree=null;
		AQLTree INDEX138_tree=null;
		AQLTree QUERY141_tree=null;
		AQLTree SYSTEM142_tree=null;
		RewriteRuleTokenStream stream_SYSTEM=new RewriteRuleTokenStream(adaptor,"token SYSTEM");
		RewriteRuleTokenStream stream_STAT=new RewriteRuleTokenStream(adaptor,"token STAT");
		RewriteRuleTokenStream stream_QUERY=new RewriteRuleTokenStream(adaptor,"token QUERY");
		RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
		RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name");
		RewriteRuleSubtreeStream stream_namespace_name=new RewriteRuleSubtreeStream(adaptor,"rule namespace_name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// AQLast.g:594:2: ( STAT ( INDEX namespace_name index_name -> ^( STAT ^( INDEX namespace_name index_name ) ) | QUERY -> ^( STAT QUERY ) | SYSTEM -> ^( STAT SYSTEM ) ) )
			// AQLast.g:594:4: STAT ( INDEX namespace_name index_name -> ^( STAT ^( INDEX namespace_name index_name ) ) | QUERY -> ^( STAT QUERY ) | SYSTEM -> ^( STAT SYSTEM ) )
			{
			STAT137=(Token)match(input,STAT,FOLLOW_STAT_in_stat1924); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STAT.add(STAT137);

			// AQLast.g:595:2: ( INDEX namespace_name index_name -> ^( STAT ^( INDEX namespace_name index_name ) ) | QUERY -> ^( STAT QUERY ) | SYSTEM -> ^( STAT SYSTEM ) )
			int alt20=3;
			switch ( input.LA(1) ) {
			case INDEX:
				{
				alt20=1;
				}
				break;
			case QUERY:
				{
				alt20=2;
				}
				break;
			case SYSTEM:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// AQLast.g:595:3: INDEX namespace_name index_name
					{
					INDEX138=(Token)match(input,INDEX,FOLLOW_INDEX_in_stat1928); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INDEX.add(INDEX138);

					pushFollow(FOLLOW_namespace_name_in_stat1930);
					namespace_name139=namespace_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namespace_name.add(namespace_name139.getTree());
					pushFollow(FOLLOW_index_name_in_stat1932);
					index_name140=index_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_index_name.add(index_name140.getTree());
					// AST REWRITE
					// elements: INDEX, index_name, STAT, namespace_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 595:35: -> ^( STAT ^( INDEX namespace_name index_name ) )
					{
						// AQLast.g:595:38: ^( STAT ^( INDEX namespace_name index_name ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_STAT.nextNode(), root_1);
						// AQLast.g:595:45: ^( INDEX namespace_name index_name )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_INDEX.nextNode(), root_2);
						adaptor.addChild(root_2, stream_namespace_name.nextTree());
						adaptor.addChild(root_2, stream_index_name.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:596:4: QUERY
					{
					QUERY141=(Token)match(input,QUERY,FOLLOW_QUERY_in_stat1951); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUERY.add(QUERY141);

					// AST REWRITE
					// elements: STAT, QUERY
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 596:10: -> ^( STAT QUERY )
					{
						// AQLast.g:596:13: ^( STAT QUERY )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_STAT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_QUERY.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:597:4: SYSTEM
					{
					SYSTEM142=(Token)match(input,SYSTEM,FOLLOW_SYSTEM_in_stat1964); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SYSTEM.add(SYSTEM142);

					// AST REWRITE
					// elements: SYSTEM, STAT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 597:11: -> ^( STAT SYSTEM )
					{
						// AQLast.g:597:14: ^( STAT SYSTEM )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_STAT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_SYSTEM.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, stat_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class set_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "set"
	// AQLast.g:627:1: set : SET ( TIMEOUT timeOut= INTLITERAL -> ^( SET ^( TIMEOUT $timeOut) ) | VERBOSE verboseOn= booleanLiteral -> ^( SET ^( VERBOSE $verboseOn) ) | ECHO echoOn= booleanLiteral -> ^( SET ^( ECHO $echoOn) ) | RECORD_TTL ttl= INTLITERAL -> ^( SET ^( RECORD_TTL $ttl) ) | VIEW viewType -> ^( SET ^( VIEW viewType ) ) | OUTPUT viewType -> ^( SET ^( OUTPUT viewType ) ) | LUA_USER_PATH luaUserPath= STRINGLITERAL -> ^( SET ^( LUA_USER_PATH $luaUserPath) ) | LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL -> ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) ) ) ;
	public final AQLastParser.set_return set() throws RecognitionException {
		AQLastParser.set_return retval = new AQLastParser.set_return();
		retval.start = input.LT(1);
		int set_StartIndex = input.index();

		AQLTree root_0 = null;

		Token timeOut=null;
		Token ttl=null;
		Token luaUserPath=null;
		Token luaSysPath=null;
		Token SET143=null;
		Token TIMEOUT144=null;
		Token VERBOSE145=null;
		Token ECHO146=null;
		Token RECORD_TTL147=null;
		Token VIEW148=null;
		Token OUTPUT150=null;
		Token LUA_USER_PATH152=null;
		Token LUA_SYSTEM_PATH153=null;
		ParserRuleReturnScope verboseOn =null;
		ParserRuleReturnScope echoOn =null;
		ParserRuleReturnScope viewType149 =null;
		ParserRuleReturnScope viewType151 =null;

		AQLTree timeOut_tree=null;
		AQLTree ttl_tree=null;
		AQLTree luaUserPath_tree=null;
		AQLTree luaSysPath_tree=null;
		AQLTree SET143_tree=null;
		AQLTree TIMEOUT144_tree=null;
		AQLTree VERBOSE145_tree=null;
		AQLTree ECHO146_tree=null;
		AQLTree RECORD_TTL147_tree=null;
		AQLTree VIEW148_tree=null;
		AQLTree OUTPUT150_tree=null;
		AQLTree LUA_USER_PATH152_tree=null;
		AQLTree LUA_SYSTEM_PATH153_tree=null;
		RewriteRuleTokenStream stream_LUA_SYSTEM_PATH=new RewriteRuleTokenStream(adaptor,"token LUA_SYSTEM_PATH");
		RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
		RewriteRuleTokenStream stream_ECHO=new RewriteRuleTokenStream(adaptor,"token ECHO");
		RewriteRuleTokenStream stream_RECORD_TTL=new RewriteRuleTokenStream(adaptor,"token RECORD_TTL");
		RewriteRuleTokenStream stream_OUTPUT=new RewriteRuleTokenStream(adaptor,"token OUTPUT");
		RewriteRuleTokenStream stream_LUA_USER_PATH=new RewriteRuleTokenStream(adaptor,"token LUA_USER_PATH");
		RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
		RewriteRuleTokenStream stream_TIMEOUT=new RewriteRuleTokenStream(adaptor,"token TIMEOUT");
		RewriteRuleTokenStream stream_VERBOSE=new RewriteRuleTokenStream(adaptor,"token VERBOSE");
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
		RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
		RewriteRuleSubtreeStream stream_viewType=new RewriteRuleSubtreeStream(adaptor,"rule viewType");
		RewriteRuleSubtreeStream stream_booleanLiteral=new RewriteRuleSubtreeStream(adaptor,"rule booleanLiteral");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// AQLast.g:629:2: ( SET ( TIMEOUT timeOut= INTLITERAL -> ^( SET ^( TIMEOUT $timeOut) ) | VERBOSE verboseOn= booleanLiteral -> ^( SET ^( VERBOSE $verboseOn) ) | ECHO echoOn= booleanLiteral -> ^( SET ^( ECHO $echoOn) ) | RECORD_TTL ttl= INTLITERAL -> ^( SET ^( RECORD_TTL $ttl) ) | VIEW viewType -> ^( SET ^( VIEW viewType ) ) | OUTPUT viewType -> ^( SET ^( OUTPUT viewType ) ) | LUA_USER_PATH luaUserPath= STRINGLITERAL -> ^( SET ^( LUA_USER_PATH $luaUserPath) ) | LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL -> ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) ) ) )
			// AQLast.g:629:4: SET ( TIMEOUT timeOut= INTLITERAL -> ^( SET ^( TIMEOUT $timeOut) ) | VERBOSE verboseOn= booleanLiteral -> ^( SET ^( VERBOSE $verboseOn) ) | ECHO echoOn= booleanLiteral -> ^( SET ^( ECHO $echoOn) ) | RECORD_TTL ttl= INTLITERAL -> ^( SET ^( RECORD_TTL $ttl) ) | VIEW viewType -> ^( SET ^( VIEW viewType ) ) | OUTPUT viewType -> ^( SET ^( OUTPUT viewType ) ) | LUA_USER_PATH luaUserPath= STRINGLITERAL -> ^( SET ^( LUA_USER_PATH $luaUserPath) ) | LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL -> ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) ) )
			{
			SET143=(Token)match(input,SET,FOLLOW_SET_in_set1994); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SET.add(SET143);

			// AQLast.g:630:2: ( TIMEOUT timeOut= INTLITERAL -> ^( SET ^( TIMEOUT $timeOut) ) | VERBOSE verboseOn= booleanLiteral -> ^( SET ^( VERBOSE $verboseOn) ) | ECHO echoOn= booleanLiteral -> ^( SET ^( ECHO $echoOn) ) | RECORD_TTL ttl= INTLITERAL -> ^( SET ^( RECORD_TTL $ttl) ) | VIEW viewType -> ^( SET ^( VIEW viewType ) ) | OUTPUT viewType -> ^( SET ^( OUTPUT viewType ) ) | LUA_USER_PATH luaUserPath= STRINGLITERAL -> ^( SET ^( LUA_USER_PATH $luaUserPath) ) | LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL -> ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) ) )
			int alt21=8;
			switch ( input.LA(1) ) {
			case TIMEOUT:
				{
				alt21=1;
				}
				break;
			case VERBOSE:
				{
				alt21=2;
				}
				break;
			case ECHO:
				{
				alt21=3;
				}
				break;
			case RECORD_TTL:
				{
				alt21=4;
				}
				break;
			case VIEW:
				{
				alt21=5;
				}
				break;
			case OUTPUT:
				{
				alt21=6;
				}
				break;
			case LUA_USER_PATH:
				{
				alt21=7;
				}
				break;
			case LUA_SYSTEM_PATH:
				{
				alt21=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// AQLast.g:630:3: TIMEOUT timeOut= INTLITERAL
					{
					TIMEOUT144=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_set1999); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMEOUT.add(TIMEOUT144);

					timeOut=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set2003); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(timeOut);

					// AST REWRITE
					// elements: TIMEOUT, SET, timeOut
					// token labels: timeOut
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_timeOut=new RewriteRuleTokenStream(adaptor,"token timeOut",timeOut);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 630:37: -> ^( SET ^( TIMEOUT $timeOut) )
					{
						// AQLast.g:630:40: ^( SET ^( TIMEOUT $timeOut) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:630:46: ^( TIMEOUT $timeOut)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_TIMEOUT.nextNode(), root_2);
						adaptor.addChild(root_2, stream_timeOut.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:631:4: VERBOSE verboseOn= booleanLiteral
					{
					VERBOSE145=(Token)match(input,VERBOSE,FOLLOW_VERBOSE_in_set2028); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VERBOSE.add(VERBOSE145);

					pushFollow(FOLLOW_booleanLiteral_in_set2032);
					verboseOn=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_booleanLiteral.add(verboseOn.getTree());
					// AST REWRITE
					// elements: SET, VERBOSE, verboseOn
					// token labels: 
					// rule labels: verboseOn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_verboseOn=new RewriteRuleSubtreeStream(adaptor,"rule verboseOn",verboseOn!=null?verboseOn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 631:43: -> ^( SET ^( VERBOSE $verboseOn) )
					{
						// AQLast.g:631:46: ^( SET ^( VERBOSE $verboseOn) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:631:52: ^( VERBOSE $verboseOn)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_VERBOSE.nextNode(), root_2);
						adaptor.addChild(root_2, stream_verboseOn.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:632:4: ECHO echoOn= booleanLiteral
					{
					ECHO146=(Token)match(input,ECHO,FOLLOW_ECHO_in_set2056); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ECHO.add(ECHO146);

					pushFollow(FOLLOW_booleanLiteral_in_set2060);
					echoOn=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_booleanLiteral.add(echoOn.getTree());
					// AST REWRITE
					// elements: echoOn, SET, ECHO
					// token labels: 
					// rule labels: echoOn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_echoOn=new RewriteRuleSubtreeStream(adaptor,"rule echoOn",echoOn!=null?echoOn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 632:38: -> ^( SET ^( ECHO $echoOn) )
					{
						// AQLast.g:632:41: ^( SET ^( ECHO $echoOn) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:632:47: ^( ECHO $echoOn)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_ECHO.nextNode(), root_2);
						adaptor.addChild(root_2, stream_echoOn.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AQLast.g:633:4: RECORD_TTL ttl= INTLITERAL
					{
					RECORD_TTL147=(Token)match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_set2085); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RECORD_TTL.add(RECORD_TTL147);

					ttl=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set2089); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(ttl);

					// AST REWRITE
					// elements: RECORD_TTL, SET, ttl
					// token labels: ttl
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_ttl=new RewriteRuleTokenStream(adaptor,"token ttl",ttl);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 633:38: -> ^( SET ^( RECORD_TTL $ttl) )
					{
						// AQLast.g:633:41: ^( SET ^( RECORD_TTL $ttl) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:633:47: ^( RECORD_TTL $ttl)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_RECORD_TTL.nextNode(), root_2);
						adaptor.addChild(root_2, stream_ttl.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AQLast.g:634:4: VIEW viewType
					{
					VIEW148=(Token)match(input,VIEW,FOLLOW_VIEW_in_set2115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW148);

					pushFollow(FOLLOW_viewType_in_set2117);
					viewType149=viewType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_viewType.add(viewType149.getTree());
					// AST REWRITE
					// elements: SET, VIEW, viewType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 634:37: -> ^( SET ^( VIEW viewType ) )
					{
						// AQLast.g:634:40: ^( SET ^( VIEW viewType ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:634:46: ^( VIEW viewType )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_VIEW.nextNode(), root_2);
						adaptor.addChild(root_2, stream_viewType.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AQLast.g:635:5: OUTPUT viewType
					{
					OUTPUT150=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_set2154); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTPUT.add(OUTPUT150);

					pushFollow(FOLLOW_viewType_in_set2156);
					viewType151=viewType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_viewType.add(viewType151.getTree());
					// AST REWRITE
					// elements: viewType, OUTPUT, SET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 635:50: -> ^( SET ^( OUTPUT viewType ) )
					{
						// AQLast.g:635:53: ^( SET ^( OUTPUT viewType ) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:635:59: ^( OUTPUT viewType )
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_OUTPUT.nextNode(), root_2);
						adaptor.addChild(root_2, stream_viewType.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// AQLast.g:636:4: LUA_USER_PATH luaUserPath= STRINGLITERAL
					{
					LUA_USER_PATH152=(Token)match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_set2202); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LUA_USER_PATH.add(LUA_USER_PATH152);

					luaUserPath=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set2206); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRINGLITERAL.add(luaUserPath);

					// AST REWRITE
					// elements: SET, LUA_USER_PATH, luaUserPath
					// token labels: luaUserPath
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_luaUserPath=new RewriteRuleTokenStream(adaptor,"token luaUserPath",luaUserPath);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 636:47: -> ^( SET ^( LUA_USER_PATH $luaUserPath) )
					{
						// AQLast.g:636:50: ^( SET ^( LUA_USER_PATH $luaUserPath) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:636:56: ^( LUA_USER_PATH $luaUserPath)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_LUA_USER_PATH.nextNode(), root_2);
						adaptor.addChild(root_2, stream_luaUserPath.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// AQLast.g:637:4: LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL
					{
					LUA_SYSTEM_PATH153=(Token)match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_set2227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LUA_SYSTEM_PATH.add(LUA_SYSTEM_PATH153);

					luaSysPath=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set2231); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRINGLITERAL.add(luaSysPath);

					// AST REWRITE
					// elements: SET, LUA_SYSTEM_PATH, luaSysPath
					// token labels: luaSysPath
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_luaSysPath=new RewriteRuleTokenStream(adaptor,"token luaSysPath",luaSysPath);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 637:48: -> ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) )
					{
						// AQLast.g:637:51: ^( SET ^( LUA_SYSTEM_PATH $luaSysPath) )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);
						// AQLast.g:637:57: ^( LUA_SYSTEM_PATH $luaSysPath)
						{
						AQLTree root_2 = (AQLTree)adaptor.nil();
						root_2 = (AQLTree)adaptor.becomeRoot(stream_LUA_SYSTEM_PATH.nextNode(), root_2);
						adaptor.addChild(root_2, stream_luaSysPath.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, set_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set"


	public static class get_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "get"
	// AQLast.g:640:1: get : GET ( TIMEOUT -> ^( GET TIMEOUT ) | VERBOSE -> ^( GET VERBOSE ) | ECHO -> ^( GET ECHO ) | RECORD_TTL -> ^( GET RECORD_TTL ) | VIEW -> ^( GET VIEW ) | OUTPUT -> ^( GET OUTPUT ) | LUA_USER_PATH -> ^( GET LUA_USER_PATH ) | LUA_SYSTEM_PATH -> ^( GET LUA_SYSTEM_PATH ) ) ;
	public final AQLastParser.get_return get() throws RecognitionException {
		AQLastParser.get_return retval = new AQLastParser.get_return();
		retval.start = input.LT(1);
		int get_StartIndex = input.index();

		AQLTree root_0 = null;

		Token GET154=null;
		Token TIMEOUT155=null;
		Token VERBOSE156=null;
		Token ECHO157=null;
		Token RECORD_TTL158=null;
		Token VIEW159=null;
		Token OUTPUT160=null;
		Token LUA_USER_PATH161=null;
		Token LUA_SYSTEM_PATH162=null;

		AQLTree GET154_tree=null;
		AQLTree TIMEOUT155_tree=null;
		AQLTree VERBOSE156_tree=null;
		AQLTree ECHO157_tree=null;
		AQLTree RECORD_TTL158_tree=null;
		AQLTree VIEW159_tree=null;
		AQLTree OUTPUT160_tree=null;
		AQLTree LUA_USER_PATH161_tree=null;
		AQLTree LUA_SYSTEM_PATH162_tree=null;
		RewriteRuleTokenStream stream_LUA_SYSTEM_PATH=new RewriteRuleTokenStream(adaptor,"token LUA_SYSTEM_PATH");
		RewriteRuleTokenStream stream_ECHO=new RewriteRuleTokenStream(adaptor,"token ECHO");
		RewriteRuleTokenStream stream_RECORD_TTL=new RewriteRuleTokenStream(adaptor,"token RECORD_TTL");
		RewriteRuleTokenStream stream_OUTPUT=new RewriteRuleTokenStream(adaptor,"token OUTPUT");
		RewriteRuleTokenStream stream_GET=new RewriteRuleTokenStream(adaptor,"token GET");
		RewriteRuleTokenStream stream_LUA_USER_PATH=new RewriteRuleTokenStream(adaptor,"token LUA_USER_PATH");
		RewriteRuleTokenStream stream_TIMEOUT=new RewriteRuleTokenStream(adaptor,"token TIMEOUT");
		RewriteRuleTokenStream stream_VERBOSE=new RewriteRuleTokenStream(adaptor,"token VERBOSE");
		RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// AQLast.g:642:2: ( GET ( TIMEOUT -> ^( GET TIMEOUT ) | VERBOSE -> ^( GET VERBOSE ) | ECHO -> ^( GET ECHO ) | RECORD_TTL -> ^( GET RECORD_TTL ) | VIEW -> ^( GET VIEW ) | OUTPUT -> ^( GET OUTPUT ) | LUA_USER_PATH -> ^( GET LUA_USER_PATH ) | LUA_SYSTEM_PATH -> ^( GET LUA_SYSTEM_PATH ) ) )
			// AQLast.g:642:4: GET ( TIMEOUT -> ^( GET TIMEOUT ) | VERBOSE -> ^( GET VERBOSE ) | ECHO -> ^( GET ECHO ) | RECORD_TTL -> ^( GET RECORD_TTL ) | VIEW -> ^( GET VIEW ) | OUTPUT -> ^( GET OUTPUT ) | LUA_USER_PATH -> ^( GET LUA_USER_PATH ) | LUA_SYSTEM_PATH -> ^( GET LUA_SYSTEM_PATH ) )
			{
			GET154=(Token)match(input,GET,FOLLOW_GET_in_get2264); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_GET.add(GET154);

			// AQLast.g:643:2: ( TIMEOUT -> ^( GET TIMEOUT ) | VERBOSE -> ^( GET VERBOSE ) | ECHO -> ^( GET ECHO ) | RECORD_TTL -> ^( GET RECORD_TTL ) | VIEW -> ^( GET VIEW ) | OUTPUT -> ^( GET OUTPUT ) | LUA_USER_PATH -> ^( GET LUA_USER_PATH ) | LUA_SYSTEM_PATH -> ^( GET LUA_SYSTEM_PATH ) )
			int alt22=8;
			switch ( input.LA(1) ) {
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
			case OUTPUT:
				{
				alt22=6;
				}
				break;
			case LUA_USER_PATH:
				{
				alt22=7;
				}
				break;
			case LUA_SYSTEM_PATH:
				{
				alt22=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// AQLast.g:643:4: TIMEOUT
					{
					TIMEOUT155=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_get2270); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TIMEOUT.add(TIMEOUT155);

					// AST REWRITE
					// elements: TIMEOUT, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 643:17: -> ^( GET TIMEOUT )
					{
						// AQLast.g:643:20: ^( GET TIMEOUT )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_TIMEOUT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:644:4: VERBOSE
					{
					VERBOSE156=(Token)match(input,VERBOSE,FOLLOW_VERBOSE_in_get2289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VERBOSE.add(VERBOSE156);

					// AST REWRITE
					// elements: VERBOSE, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 644:16: -> ^( GET VERBOSE )
					{
						// AQLast.g:644:19: ^( GET VERBOSE )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VERBOSE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// AQLast.g:645:4: ECHO
					{
					ECHO157=(Token)match(input,ECHO,FOLLOW_ECHO_in_get2306); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ECHO.add(ECHO157);

					// AST REWRITE
					// elements: ECHO, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 645:14: -> ^( GET ECHO )
					{
						// AQLast.g:645:17: ^( GET ECHO )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ECHO.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// AQLast.g:646:4: RECORD_TTL
					{
					RECORD_TTL158=(Token)match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_get2324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RECORD_TTL.add(RECORD_TTL158);

					// AST REWRITE
					// elements: RECORD_TTL, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 646:18: -> ^( GET RECORD_TTL )
					{
						// AQLast.g:646:21: ^( GET RECORD_TTL )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_RECORD_TTL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// AQLast.g:647:4: VIEW
					{
					VIEW159=(Token)match(input,VIEW,FOLLOW_VIEW_in_get2340); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VIEW.add(VIEW159);

					// AST REWRITE
					// elements: VIEW, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 647:14: -> ^( GET VIEW )
					{
						// AQLast.g:647:17: ^( GET VIEW )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_VIEW.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// AQLast.g:648:5: OUTPUT
					{
					OUTPUT160=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_get2359); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OUTPUT.add(OUTPUT160);

					// AST REWRITE
					// elements: GET, OUTPUT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 648:21: -> ^( GET OUTPUT )
					{
						// AQLast.g:648:24: ^( GET OUTPUT )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_OUTPUT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// AQLast.g:649:4: LUA_USER_PATH
					{
					LUA_USER_PATH161=(Token)match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_get2381); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LUA_USER_PATH.add(LUA_USER_PATH161);

					// AST REWRITE
					// elements: LUA_USER_PATH, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 649:19: -> ^( GET LUA_USER_PATH )
					{
						// AQLast.g:649:22: ^( GET LUA_USER_PATH )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_LUA_USER_PATH.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// AQLast.g:650:4: LUA_SYSTEM_PATH
					{
					LUA_SYSTEM_PATH162=(Token)match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_get2395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LUA_SYSTEM_PATH.add(LUA_SYSTEM_PATH162);

					// AST REWRITE
					// elements: LUA_SYSTEM_PATH, GET
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 650:20: -> ^( GET LUA_SYSTEM_PATH )
					{
						// AQLast.g:650:23: ^( GET LUA_SYSTEM_PATH )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot(stream_GET.nextNode(), root_1);
						adaptor.addChild(root_1, stream_LUA_SYSTEM_PATH.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, get_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "get"


	public static class viewType_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "viewType"
	// AQLast.g:654:1: viewType : ( 'json' | 'table' | 'nosql' | 'lua' );
	public final AQLastParser.viewType_return viewType() throws RecognitionException {
		AQLastParser.viewType_return retval = new AQLastParser.viewType_return();
		retval.start = input.LT(1);
		int viewType_StartIndex = input.index();

		AQLTree root_0 = null;

		Token set163=null;

		AQLTree set163_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// AQLast.g:655:2: ( 'json' | 'table' | 'nosql' | 'lua' )
			// AQLast.g:
			{
			root_0 = (AQLTree)adaptor.nil();


			set163=input.LT(1);
			if ( (input.LA(1) >= 90 && input.LA(1) <= 92)||input.LA(1)==95 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set163));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, viewType_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "viewType"


	public static class run_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "run"
	// AQLast.g:662:1: run : RUN STRINGLITERAL -> ^( RUN STRINGLITERAL ) ;
	public final AQLastParser.run_return run() throws RecognitionException {
		AQLastParser.run_return retval = new AQLastParser.run_return();
		retval.start = input.LT(1);
		int run_StartIndex = input.index();

		AQLTree root_0 = null;

		Token RUN164=null;
		Token STRINGLITERAL165=null;

		AQLTree RUN164_tree=null;
		AQLTree STRINGLITERAL165_tree=null;
		RewriteRuleTokenStream stream_RUN=new RewriteRuleTokenStream(adaptor,"token RUN");
		RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// AQLast.g:664:2: ( RUN STRINGLITERAL -> ^( RUN STRINGLITERAL ) )
			// AQLast.g:664:4: RUN STRINGLITERAL
			{
			RUN164=(Token)match(input,RUN,FOLLOW_RUN_in_run2441); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RUN.add(RUN164);

			STRINGLITERAL165=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_run2443); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL165);

			// AST REWRITE
			// elements: RUN, STRINGLITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 664:22: -> ^( RUN STRINGLITERAL )
			{
				// AQLast.g:664:25: ^( RUN STRINGLITERAL )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_RUN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_STRINGLITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, run_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "run"


	public static class print_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "print"
	// AQLast.g:669:1: print : PRINT ( STRINGLITERAL )? -> ^( PRINT ( STRINGLITERAL )? ) ;
	public final AQLastParser.print_return print() throws RecognitionException {
		AQLastParser.print_return retval = new AQLastParser.print_return();
		retval.start = input.LT(1);
		int print_StartIndex = input.index();

		AQLTree root_0 = null;

		Token PRINT166=null;
		Token STRINGLITERAL167=null;

		AQLTree PRINT166_tree=null;
		AQLTree STRINGLITERAL167_tree=null;
		RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
		RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// AQLast.g:671:2: ( PRINT ( STRINGLITERAL )? -> ^( PRINT ( STRINGLITERAL )? ) )
			// AQLast.g:671:4: PRINT ( STRINGLITERAL )?
			{
			PRINT166=(Token)match(input,PRINT,FOLLOW_PRINT_in_print2467); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PRINT.add(PRINT166);

			// AQLast.g:671:10: ( STRINGLITERAL )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==STRINGLITERAL) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// AQLast.g:671:10: STRINGLITERAL
					{
					STRINGLITERAL167=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_print2469); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL167);

					}
					break;

			}

			// AST REWRITE
			// elements: STRINGLITERAL, PRINT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 671:25: -> ^( PRINT ( STRINGLITERAL )? )
			{
				// AQLast.g:671:28: ^( PRINT ( STRINGLITERAL )? )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);
				// AQLast.g:671:36: ( STRINGLITERAL )?
				if ( stream_STRINGLITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_STRINGLITERAL.nextNode());
				}
				stream_STRINGLITERAL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, print_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "print"


	public static class kill_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "kill"
	// AQLast.g:674:1: kill : KILL ( QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) | SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) ) ;
	public final AQLastParser.kill_return kill() throws RecognitionException {
		AQLastParser.kill_return retval = new AQLastParser.kill_return();
		retval.start = input.LT(1);
		int kill_StartIndex = input.index();

		AQLTree root_0 = null;

		Token KILL168=null;
		Token QUERY169=null;
		Token INTLITERAL170=null;
		Token SCAN171=null;
		Token INTLITERAL172=null;

		AQLTree KILL168_tree=null;
		AQLTree QUERY169_tree=null;
		AQLTree INTLITERAL170_tree=null;
		AQLTree SCAN171_tree=null;
		AQLTree INTLITERAL172_tree=null;
		RewriteRuleTokenStream stream_QUERY=new RewriteRuleTokenStream(adaptor,"token QUERY");
		RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
		RewriteRuleTokenStream stream_SCAN=new RewriteRuleTokenStream(adaptor,"token SCAN");
		RewriteRuleTokenStream stream_KILL=new RewriteRuleTokenStream(adaptor,"token KILL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// AQLast.g:676:2: ( KILL ( QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) | SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) ) )
			// AQLast.g:676:4: KILL ( QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) | SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) )
			{
			KILL168=(Token)match(input,KILL,FOLLOW_KILL_in_kill2496); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KILL.add(KILL168);

			// AQLast.g:677:2: ( QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) | SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==QUERY) ) {
				alt24=1;
			}
			else if ( (LA24_0==SCAN) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// AQLast.g:677:4: QUERY INTLITERAL
					{
					QUERY169=(Token)match(input,QUERY,FOLLOW_QUERY_in_kill2501); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUERY.add(QUERY169);

					INTLITERAL170=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill2503); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL170);

					// AST REWRITE
					// elements: INTLITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 677:21: -> ^( KILL_QUERY INTLITERAL )
					{
						// AQLast.g:677:24: ^( KILL_QUERY INTLITERAL )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(KILL_QUERY, "KILL_QUERY"), root_1);
						adaptor.addChild(root_1, stream_INTLITERAL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// AQLast.g:678:4: SCAN INTLITERAL
					{
					SCAN171=(Token)match(input,SCAN,FOLLOW_SCAN_in_kill2516); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCAN.add(SCAN171);

					INTLITERAL172=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill2518); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL172);

					// AST REWRITE
					// elements: INTLITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AQLTree)adaptor.nil();
					// 678:20: -> ^( KILL_SCAN INTLITERAL )
					{
						// AQLast.g:678:23: ^( KILL_SCAN INTLITERAL )
						{
						AQLTree root_1 = (AQLTree)adaptor.nil();
						root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(KILL_SCAN, "KILL_SCAN"), root_1);
						adaptor.addChild(root_1, stream_INTLITERAL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, kill_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "kill"


	public static class kill_query_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "kill_query"
	// AQLast.g:686:1: kill_query : KILL_QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) ;
	public final AQLastParser.kill_query_return kill_query() throws RecognitionException {
		AQLastParser.kill_query_return retval = new AQLastParser.kill_query_return();
		retval.start = input.LT(1);
		int kill_query_StartIndex = input.index();

		AQLTree root_0 = null;

		Token KILL_QUERY173=null;
		Token INTLITERAL174=null;

		AQLTree KILL_QUERY173_tree=null;
		AQLTree INTLITERAL174_tree=null;
		RewriteRuleTokenStream stream_KILL_QUERY=new RewriteRuleTokenStream(adaptor,"token KILL_QUERY");
		RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// AQLast.g:688:2: ( KILL_QUERY INTLITERAL -> ^( KILL_QUERY INTLITERAL ) )
			// AQLast.g:688:4: KILL_QUERY INTLITERAL
			{
			KILL_QUERY173=(Token)match(input,KILL_QUERY,FOLLOW_KILL_QUERY_in_kill_query2549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KILL_QUERY.add(KILL_QUERY173);

			INTLITERAL174=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_query2551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL174);

			// AST REWRITE
			// elements: INTLITERAL, KILL_QUERY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 688:26: -> ^( KILL_QUERY INTLITERAL )
			{
				// AQLast.g:688:29: ^( KILL_QUERY INTLITERAL )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_KILL_QUERY.nextNode(), root_1);
				adaptor.addChild(root_1, stream_INTLITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, kill_query_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "kill_query"


	public static class kill_scan_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "kill_scan"
	// AQLast.g:694:1: kill_scan : KILL_SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) ;
	public final AQLastParser.kill_scan_return kill_scan() throws RecognitionException {
		AQLastParser.kill_scan_return retval = new AQLastParser.kill_scan_return();
		retval.start = input.LT(1);
		int kill_scan_StartIndex = input.index();

		AQLTree root_0 = null;

		Token KILL_SCAN175=null;
		Token INTLITERAL176=null;

		AQLTree KILL_SCAN175_tree=null;
		AQLTree INTLITERAL176_tree=null;
		RewriteRuleTokenStream stream_KILL_SCAN=new RewriteRuleTokenStream(adaptor,"token KILL_SCAN");
		RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// AQLast.g:696:2: ( KILL_SCAN INTLITERAL -> ^( KILL_SCAN INTLITERAL ) )
			// AQLast.g:696:4: KILL_SCAN INTLITERAL
			{
			KILL_SCAN175=(Token)match(input,KILL_SCAN,FOLLOW_KILL_SCAN_in_kill_scan2576); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KILL_SCAN.add(KILL_SCAN175);

			INTLITERAL176=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_scan2578); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL176);

			// AST REWRITE
			// elements: KILL_SCAN, INTLITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 696:25: -> ^( KILL_SCAN INTLITERAL )
			{
				// AQLast.g:696:28: ^( KILL_SCAN INTLITERAL )
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot(stream_KILL_SCAN.nextNode(), root_1);
				adaptor.addChild(root_1, stream_INTLITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, kill_scan_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "kill_scan"


	public static class quit_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "quit"
	// AQLast.g:702:1: quit : ( QUIT | EXIT | 'q' );
	public final AQLastParser.quit_return quit() throws RecognitionException {
		AQLastParser.quit_return retval = new AQLastParser.quit_return();
		retval.start = input.LT(1);
		int quit_StartIndex = input.index();

		AQLTree root_0 = null;

		Token set177=null;

		AQLTree set177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// AQLast.g:704:2: ( QUIT | EXIT | 'q' )
			// AQLast.g:
			{
			root_0 = (AQLTree)adaptor.nil();


			set177=input.LT(1);
			if ( input.LA(1)==EXIT||input.LA(1)==QUIT||input.LA(1)==93 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set177));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, quit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "quit"


	public static class help_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "help"
	// AQLast.g:711:1: help : 'help' ;
	public final AQLastParser.help_return help() throws RecognitionException {
		AQLastParser.help_return retval = new AQLastParser.help_return();
		retval.start = input.LT(1);
		int help_StartIndex = input.index();

		AQLTree root_0 = null;

		Token string_literal178=null;

		AQLTree string_literal178_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// AQLast.g:713:2: ( 'help' )
			// AQLast.g:713:4: 'help'
			{
			root_0 = (AQLTree)adaptor.nil();


			string_literal178=(Token)match(input,89,FOLLOW_89_in_help2630); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal178_tree = (AQLTree)adaptor.create(string_literal178);
			adaptor.addChild(root_0, string_literal178_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {retval.tree.source = input.toString(retval.start,input.LT(-1));}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, help_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "help"


	public static class primaryKey_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "primaryKey"
	// AQLast.g:716:1: primaryKey : key= STRINGLITERAL -> ^( PK $key) ;
	public final AQLastParser.primaryKey_return primaryKey() throws RecognitionException {
		AQLastParser.primaryKey_return retval = new AQLastParser.primaryKey_return();
		retval.start = input.LT(1);
		int primaryKey_StartIndex = input.index();

		AQLTree root_0 = null;

		Token key=null;

		AQLTree key_tree=null;
		RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// AQLast.g:717:2: (key= STRINGLITERAL -> ^( PK $key) )
			// AQLast.g:717:4: key= STRINGLITERAL
			{
			key=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_primaryKey2643); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRINGLITERAL.add(key);

			// AST REWRITE
			// elements: key
			// token labels: key
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_key=new RewriteRuleTokenStream(adaptor,"token key",key);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AQLTree)adaptor.nil();
			// 717:22: -> ^( PK $key)
			{
				// AQLast.g:717:25: ^( PK $key)
				{
				AQLTree root_1 = (AQLTree)adaptor.nil();
				root_1 = (AQLTree)adaptor.becomeRoot((AQLTree)adaptor.create(PK, "PK"), root_1);
				adaptor.addChild(root_1, stream_key.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, primaryKey_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primaryKey"


	public static class package_name_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "package_name"
	// AQLast.g:720:1: package_name : IDENTIFIER ;
	public final AQLastParser.package_name_return package_name() throws RecognitionException {
		AQLastParser.package_name_return retval = new AQLastParser.package_name_return();
		retval.start = input.LT(1);
		int package_name_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER179=null;

		AQLTree IDENTIFIER179_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// AQLast.g:721:2: ( IDENTIFIER )
			// AQLast.g:721:4: IDENTIFIER
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER179=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_package_name2664); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER179_tree = (AQLTree)adaptor.create(IDENTIFIER179);
			adaptor.addChild(root_0, IDENTIFIER179_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, package_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "package_name"


	public static class index_name_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "index_name"
	// AQLast.g:725:1: index_name : IDENTIFIER ;
	public final AQLastParser.index_name_return index_name() throws RecognitionException {
		AQLastParser.index_name_return retval = new AQLastParser.index_name_return();
		retval.start = input.LT(1);
		int index_name_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER180=null;

		AQLTree IDENTIFIER180_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// AQLast.g:726:2: ( IDENTIFIER )
			// AQLast.g:726:4: IDENTIFIER
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER180=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_index_name2676); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER180_tree = (AQLTree)adaptor.create(IDENTIFIER180);
			adaptor.addChild(root_0, IDENTIFIER180_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, index_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "index_name"


	public static class namespace_name_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "namespace_name"
	// AQLast.g:729:1: namespace_name : IDENTIFIER ;
	public final AQLastParser.namespace_name_return namespace_name() throws RecognitionException {
		AQLastParser.namespace_name_return retval = new AQLastParser.namespace_name_return();
		retval.start = input.LT(1);
		int namespace_name_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER181=null;

		AQLTree IDENTIFIER181_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// AQLast.g:730:2: ( IDENTIFIER )
			// AQLast.g:730:4: IDENTIFIER
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER181=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_name2688); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER181_tree = (AQLTree)adaptor.create(IDENTIFIER181);
			adaptor.addChild(root_0, IDENTIFIER181_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, namespace_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "namespace_name"


	public static class set_name_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "set_name"
	// AQLast.g:733:1: set_name : IDENTIFIER ;
	public final AQLastParser.set_name_return set_name() throws RecognitionException {
		AQLastParser.set_name_return retval = new AQLastParser.set_name_return();
		retval.start = input.LT(1);
		int set_name_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER182=null;

		AQLTree IDENTIFIER182_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// AQLast.g:734:2: ( IDENTIFIER )
			// AQLast.g:734:4: IDENTIFIER
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER182=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_set_name2701); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER182_tree = (AQLTree)adaptor.create(IDENTIFIER182);
			adaptor.addChild(root_0, IDENTIFIER182_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, set_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "set_name"


	public static class bin_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "bin"
	// AQLast.g:737:1: bin : IDENTIFIER ;
	public final AQLastParser.bin_return bin() throws RecognitionException {
		AQLastParser.bin_return retval = new AQLastParser.bin_return();
		retval.start = input.LT(1);
		int bin_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER183=null;

		AQLTree IDENTIFIER183_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// AQLast.g:738:2: ( IDENTIFIER )
			// AQLast.g:738:4: IDENTIFIER
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER183=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bin2713); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER183_tree = (AQLTree)adaptor.create(IDENTIFIER183);
			adaptor.addChild(root_0, IDENTIFIER183_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, bin_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bin"


	public static class value_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "value"
	// AQLast.g:741:1: value : ( STRINGLITERAL | INTLITERAL );
	public final AQLastParser.value_return value() throws RecognitionException {
		AQLastParser.value_return retval = new AQLastParser.value_return();
		retval.start = input.LT(1);
		int value_StartIndex = input.index();

		AQLTree root_0 = null;

		Token set184=null;

		AQLTree set184_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// AQLast.g:742:2: ( STRINGLITERAL | INTLITERAL )
			// AQLast.g:
			{
			root_0 = (AQLTree)adaptor.nil();


			set184=input.LT(1);
			if ( input.LA(1)==INTLITERAL||input.LA(1)==STRINGLITERAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set184));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, value_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "value"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// AQLast.g:746:1: booleanLiteral : ( TRUE | FALSE );
	public final AQLastParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		AQLastParser.booleanLiteral_return retval = new AQLastParser.booleanLiteral_return();
		retval.start = input.LT(1);
		int booleanLiteral_StartIndex = input.index();

		AQLTree root_0 = null;

		Token set185=null;

		AQLTree set185_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// AQLast.g:747:3: ( TRUE | FALSE )
			// AQLast.g:
			{
			root_0 = (AQLTree)adaptor.nil();


			set185=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set185));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, booleanLiteral_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class moduleName_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "moduleName"
	// AQLast.g:750:1: moduleName : IDENTIFIER '.' ( 'lua' | 'so' ) ;
	public final AQLastParser.moduleName_return moduleName() throws RecognitionException {
		AQLastParser.moduleName_return retval = new AQLastParser.moduleName_return();
		retval.start = input.LT(1);
		int moduleName_StartIndex = input.index();

		AQLTree root_0 = null;

		Token IDENTIFIER186=null;
		Token char_literal187=null;
		Token set188=null;

		AQLTree IDENTIFIER186_tree=null;
		AQLTree char_literal187_tree=null;
		AQLTree set188_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// AQLast.g:751:3: ( IDENTIFIER '.' ( 'lua' | 'so' ) )
			// AQLast.g:751:5: IDENTIFIER '.' ( 'lua' | 'so' )
			{
			root_0 = (AQLTree)adaptor.nil();


			IDENTIFIER186=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moduleName2760); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER186_tree = (AQLTree)adaptor.create(IDENTIFIER186);
			adaptor.addChild(root_0, IDENTIFIER186_tree);
			}

			char_literal187=(Token)match(input,88,FOLLOW_88_in_moduleName2762); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			char_literal187_tree = (AQLTree)adaptor.create(char_literal187);
			adaptor.addChild(root_0, char_literal187_tree);
			}

			set188=input.LT(1);
			if ( input.LA(1)==91||input.LA(1)==94 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AQLTree)adaptor.create(set188));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, moduleName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "moduleName"


	public static class filePath_return extends ParserRuleReturnScope {
		AQLTree tree;
		@Override
		public AQLTree getTree() { return tree; }
	};


	// $ANTLR start "filePath"
	// AQLast.g:754:1: filePath : STRINGLITERAL ;
	public final AQLastParser.filePath_return filePath() throws RecognitionException {
		AQLastParser.filePath_return retval = new AQLastParser.filePath_return();
		retval.start = input.LT(1);
		int filePath_StartIndex = input.index();

		AQLTree root_0 = null;

		Token STRINGLITERAL189=null;

		AQLTree STRINGLITERAL189_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// AQLast.g:755:3: ( STRINGLITERAL )
			// AQLast.g:755:5: STRINGLITERAL
			{
			root_0 = (AQLTree)adaptor.nil();


			STRINGLITERAL189=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_filePath2781); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRINGLITERAL189_tree = (AQLTree)adaptor.create(STRINGLITERAL189);
			adaptor.addChild(root_0, STRINGLITERAL189_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AQLTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AQLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, filePath_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "filePath"

	// Delegated rules



	public static final BitSet FOLLOW_aqlStatements_in_aqlFile690 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_aqlFile692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aqlStatement_in_aqlStatements703 = new BitSet(new long[]{0x3A4001C4040CB812L,0x0000000022000151L});
	public static final BitSet FOLLOW_create_in_aqlStatement719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_in_aqlStatement725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_remove_in_aqlStatement731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_in_aqlStatement736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_delete_in_aqlStatement741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_aqlStatement746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_registerPackage_in_aqlStatement751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_in_aqlStatement756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_aqlStatement761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_in_aqlStatement766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_desc_in_aqlStatement771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_aqlStatement776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_aqlStatement781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_get_in_aqlStatement786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_run_in_aqlStatement791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_query_in_aqlStatement796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_scan_in_aqlStatement801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_in_aqlStatement806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quit_in_aqlStatement811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_help_in_aqlStatement816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_aqlStatement821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create839 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INDEX_in_create841 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_create843 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ON_in_create845 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_create847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_create851 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_bin_in_create855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_create857 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexType_in_create859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_drop895 = new BitSet(new long[]{0x0000100100000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_INDEX_in_drop904 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_drop906 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_drop908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODULE_in_drop927 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_moduleName_in_drop929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_drop946 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_drop948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMOVE_in_remove982 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_MODULE_in_remove984 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_moduleName_in_remove986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert1037 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_INTO_in_insert1039 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_insert1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_insert1043 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_PK_in_insert1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_insert1048 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_binNameList_in_insert1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_insert1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_VALUES_in_insert1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_insert1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_primaryKey_in_insert1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_insert1064 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_valueList_in_insert1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_insert1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_delete1106 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FROM_in_delete1108 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_delete1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_delete1112 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_PK_in_delete1114 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQ_in_delete1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_primaryKey_in_delete1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select1149 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_STAR_in_select1155 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_from_in_select1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binNameList_in_select1172 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_from_in_select1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from1200 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_from1202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_from1205 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_expressions_in_from1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PK_in_expressions1242 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQ_in_expressions1244 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_expressions1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filter_in_expressions1260 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_bin_in_filter1285 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQ_in_filter1287 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_filter1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bin_in_filter1306 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BETWEEN_in_filter1308 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter1312 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_filter1314 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bin_in_filter1341 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BETWEEN_in_filter1343 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_function_in_filter1347 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AND_in_filter1349 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_function_in_filter1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_function1384 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_function1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_function1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespace_name_in_nameSet1411 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_nameSet1414 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_set_name_in_nameSet1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_registerPackage1453 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_MODULE_in_registerPackage1455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_filePath_in_registerPackage1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXECUTE_in_execute1488 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_moduleFunction_in_execute1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_execute1492 = new BitSet(new long[]{0x0000000800000000L,0x0000000000400400L});
	public static final BitSet FOLLOW_valueList_in_execute1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_execute1497 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ON_in_execute1501 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_execute1503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_execute1506 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_PK_in_execute1508 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQ_in_execute1510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_primaryKey_in_execute1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGGREGATE_in_aggregate1551 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_moduleFunction_in_aggregate1553 = new BitSet(new long[]{0x0002000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_aggregate1556 = new BitSet(new long[]{0x0000000800000000L,0x0000000000400400L});
	public static final BitSet FOLLOW_valueList_in_aggregate1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_aggregate1563 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ON_in_aggregate1567 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_nameSet_in_aggregate1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_aggregate1572 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_expressions_in_aggregate1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_moduleFunction1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_moduleFunction1609 = new BitSet(new long[]{0x5000000084000000L});
	public static final BitSet FOLLOW_set_in_moduleFunction1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bin_in_binNameList1634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_binNameList1637 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_bin_in_binNameList1639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_value_in_valueList1664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_valueList1667 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_valueList1669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_SHOW_in_show1701 = new BitSet(new long[]{0x8090A00200000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_INDEXES_in_show1707 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_nameSet_in_show1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODULES_in_show1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACES_in_show1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SETS_in_show1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BINS_in_show1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANS_in_show1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUERIES_in_show1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGES_in_show1820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESC_in_desc1854 = new BitSet(new long[]{0x0000100100000000L});
	public static final BitSet FOLLOW_MODULE_in_desc1863 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_moduleName_in_desc1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INDEX_in_desc1883 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_namespace_name_in_desc1885 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_desc1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAT_in_stat1924 = new BitSet(new long[]{0x0100000100000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_INDEX_in_stat1928 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_namespace_name_in_stat1930 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_stat1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUERY_in_stat1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYSTEM_in_stat1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_set1994 = new BitSet(new long[]{0x04080C0000010000L,0x0000000000061000L});
	public static final BitSet FOLLOW_TIMEOUT_in_set1999 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_set2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERBOSE_in_set2028 = new BitSet(new long[]{0x0000000000200000L,0x0000000000002000L});
	public static final BitSet FOLLOW_booleanLiteral_in_set2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ECHO_in_set2056 = new BitSet(new long[]{0x0000000000200000L,0x0000000000002000L});
	public static final BitSet FOLLOW_booleanLiteral_in_set2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECORD_TTL_in_set2085 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_set2089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VIEW_in_set2115 = new BitSet(new long[]{0x0000000000000000L,0x000000009C000000L});
	public static final BitSet FOLLOW_viewType_in_set2117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OUTPUT_in_set2154 = new BitSet(new long[]{0x0000000000000000L,0x000000009C000000L});
	public static final BitSet FOLLOW_viewType_in_set2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_set2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set2206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_set2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set2231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_get2264 = new BitSet(new long[]{0x04080C0000010000L,0x0000000000061000L});
	public static final BitSet FOLLOW_TIMEOUT_in_get2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERBOSE_in_get2289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ECHO_in_get2306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECORD_TTL_in_get2324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VIEW_in_get2340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OUTPUT_in_get2359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_get2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_get2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUN_in_run2441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_run2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print2467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_print2469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KILL_in_kill2496 = new BitSet(new long[]{0x4100000000000000L});
	public static final BitSet FOLLOW_QUERY_in_kill2501 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill2503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCAN_in_kill2516 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KILL_QUERY_in_kill_query2549 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_query2551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KILL_SCAN_in_kill_scan2576 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_scan2578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_help2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_primaryKey2643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_package_name2664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_index_name2676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace_name2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_set_name2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_bin2713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_moduleName2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_moduleName2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_set_in_moduleName2764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_filePath2781 = new BitSet(new long[]{0x0000000000000002L});
}
