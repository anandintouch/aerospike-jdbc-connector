// $ANTLR 3.5.1 AQLast.g 2014-10-20 13:56:19

package com.aerospike.aql.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AQLastLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AQLastLexer() {} 
	public AQLastLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AQLastLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "AQLast.g"; }

	// $ANTLR start "AGGREGATE"
	public final void mAGGREGATE() throws RecognitionException {
		try {
			int _type = AGGREGATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:11:11: ( 'aggregate' )
			// AQLast.g:11:13: 'aggregate'
			{
			match("aggregate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGGREGATE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:12:5: ( 'and' )
			// AQLast.g:12:7: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "BETWEEN"
	public final void mBETWEEN() throws RecognitionException {
		try {
			int _type = BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:13:9: ( 'between' )
			// AQLast.g:13:11: 'between'
			{
			match("between"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETWEEN"

	// $ANTLR start "BINS"
	public final void mBINS() throws RecognitionException {
		try {
			int _type = BINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:14:6: ( 'bins' )
			// AQLast.g:14:8: 'bins'
			{
			match("bins"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINS"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:15:4: ( 'by' )
			// AQLast.g:15:6: 'by'
			{
			match("by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:16:8: ( 'create' )
			// AQLast.g:16:10: 'create'
			{
			match("create"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:17:8: ( 'delete' )
			// AQLast.g:17:10: 'delete'
			{
			match("delete"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELETE"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:18:6: ( 'desc' )
			// AQLast.g:18:8: 'desc'
			{
			match("desc"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESC"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:19:6: ( 'drop' )
			// AQLast.g:19:8: 'drop'
			{
			match("drop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DROP"

	// $ANTLR start "ECHO"
	public final void mECHO() throws RecognitionException {
		try {
			int _type = ECHO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:20:6: ( 'echo' )
			// AQLast.g:20:8: 'echo'
			{
			match("echo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ECHO"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:21:4: ( '=' )
			// AQLast.g:21:6: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "EXECUTE"
	public final void mEXECUTE() throws RecognitionException {
		try {
			int _type = EXECUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:22:9: ( 'execute' )
			// AQLast.g:22:11: 'execute'
			{
			match("execute"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXECUTE"

	// $ANTLR start "EXIT"
	public final void mEXIT() throws RecognitionException {
		try {
			int _type = EXIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:23:6: ( 'exit' )
			// AQLast.g:23:8: 'exit'
			{
			match("exit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXIT"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:24:6: ( 'from' )
			// AQLast.g:24:8: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:25:10: ( 'function' )
			// AQLast.g:25:12: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:26:5: ( 'get' )
			// AQLast.g:26:7: 'get'
			{
			match("get"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "INDEX"
	public final void mINDEX() throws RecognitionException {
		try {
			int _type = INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:27:7: ( 'index' )
			// AQLast.g:27:9: 'index'
			{
			match("index"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEX"

	// $ANTLR start "INDEXES"
	public final void mINDEXES() throws RecognitionException {
		try {
			int _type = INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:28:9: ( 'indexes' )
			// AQLast.g:28:11: 'indexes'
			{
			match("indexes"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEXES"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:29:8: ( 'insert' )
			// AQLast.g:29:10: 'insert'
			{
			match("insert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:30:6: ( 'into' )
			// AQLast.g:30:8: 'into'
			{
			match("into"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTO"

	// $ANTLR start "KILL"
	public final void mKILL() throws RecognitionException {
		try {
			int _type = KILL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:31:6: ( 'kill' )
			// AQLast.g:31:8: 'kill'
			{
			match("kill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KILL"

	// $ANTLR start "KILL_QUERY"
	public final void mKILL_QUERY() throws RecognitionException {
		try {
			int _type = KILL_QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:32:12: ( 'kill_query' )
			// AQLast.g:32:14: 'kill_query'
			{
			match("kill_query"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KILL_QUERY"

	// $ANTLR start "KILL_SCAN"
	public final void mKILL_SCAN() throws RecognitionException {
		try {
			int _type = KILL_SCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:33:11: ( 'kill_scan' )
			// AQLast.g:33:13: 'kill_scan'
			{
			match("kill_scan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KILL_SCAN"

	// $ANTLR start "LUA_SYSTEM_PATH"
	public final void mLUA_SYSTEM_PATH() throws RecognitionException {
		try {
			int _type = LUA_SYSTEM_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:34:17: ( 'lua_syspath' )
			// AQLast.g:34:19: 'lua_syspath'
			{
			match("lua_syspath"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUA_SYSTEM_PATH"

	// $ANTLR start "LUA_USER_PATH"
	public final void mLUA_USER_PATH() throws RecognitionException {
		try {
			int _type = LUA_USER_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:35:15: ( 'lua_userpath' )
			// AQLast.g:35:17: 'lua_userpath'
			{
			match("lua_userpath"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LUA_USER_PATH"

	// $ANTLR start "MODULE"
	public final void mMODULE() throws RecognitionException {
		try {
			int _type = MODULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:36:8: ( 'module' )
			// AQLast.g:36:10: 'module'
			{
			match("module"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULE"

	// $ANTLR start "MODULES"
	public final void mMODULES() throws RecognitionException {
		try {
			int _type = MODULES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:37:9: ( 'modules' )
			// AQLast.g:37:11: 'modules'
			{
			match("modules"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULES"

	// $ANTLR start "NAMESPACES"
	public final void mNAMESPACES() throws RecognitionException {
		try {
			int _type = NAMESPACES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:38:12: ( 'namespaces' )
			// AQLast.g:38:14: 'namespaces'
			{
			match("namespaces"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAMESPACES"

	// $ANTLR start "NUMERIC"
	public final void mNUMERIC() throws RecognitionException {
		try {
			int _type = NUMERIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:39:9: ( 'numeric' )
			// AQLast.g:39:11: 'numeric'
			{
			match("numeric"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERIC"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:40:4: ( 'on' )
			// AQLast.g:40:6: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:41:7: ( 'order' )
			// AQLast.g:41:9: 'order'
			{
			match("order"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "OUTPUT"
	public final void mOUTPUT() throws RecognitionException {
		try {
			int _type = OUTPUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:42:8: ( 'output' )
			// AQLast.g:42:10: 'output'
			{
			match("output"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTPUT"

	// $ANTLR start "PACKAGES"
	public final void mPACKAGES() throws RecognitionException {
		try {
			int _type = PACKAGES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:43:10: ( 'packages' )
			// AQLast.g:43:12: 'packages'
			{
			match("packages"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGES"

	// $ANTLR start "PK"
	public final void mPK() throws RecognitionException {
		try {
			int _type = PK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:44:4: ( 'pk' )
			// AQLast.g:44:6: 'pk'
			{
			match("pk"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PK"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:45:7: ( 'print' )
			// AQLast.g:45:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "QUERIES"
	public final void mQUERIES() throws RecognitionException {
		try {
			int _type = QUERIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:46:9: ( 'queries' )
			// AQLast.g:46:11: 'queries'
			{
			match("queries"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERIES"

	// $ANTLR start "QUERY"
	public final void mQUERY() throws RecognitionException {
		try {
			int _type = QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:47:7: ( 'query' )
			// AQLast.g:47:9: 'query'
			{
			match("query"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY"

	// $ANTLR start "QUIT"
	public final void mQUIT() throws RecognitionException {
		try {
			int _type = QUIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:48:6: ( 'quit' )
			// AQLast.g:48:8: 'quit'
			{
			match("quit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUIT"

	// $ANTLR start "RECORD_TTL"
	public final void mRECORD_TTL() throws RecognitionException {
		try {
			int _type = RECORD_TTL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:49:12: ( 'record_ttl' )
			// AQLast.g:49:14: 'record_ttl'
			{
			match("record_ttl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECORD_TTL"

	// $ANTLR start "REGISTER"
	public final void mREGISTER() throws RecognitionException {
		try {
			int _type = REGISTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:50:10: ( 'register' )
			// AQLast.g:50:12: 'register'
			{
			match("register"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REGISTER"

	// $ANTLR start "REMOVE"
	public final void mREMOVE() throws RecognitionException {
		try {
			int _type = REMOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:51:8: ( 'remove' )
			// AQLast.g:51:10: 'remove'
			{
			match("remove"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REMOVE"

	// $ANTLR start "RUN"
	public final void mRUN() throws RecognitionException {
		try {
			int _type = RUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:52:5: ( 'run' )
			// AQLast.g:52:7: 'run'
			{
			match("run"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUN"

	// $ANTLR start "SCAN"
	public final void mSCAN() throws RecognitionException {
		try {
			int _type = SCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:53:6: ( 'scan' )
			// AQLast.g:53:8: 'scan'
			{
			match("scan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN"

	// $ANTLR start "SCANS"
	public final void mSCANS() throws RecognitionException {
		try {
			int _type = SCANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:54:7: ( 'scans' )
			// AQLast.g:54:9: 'scans'
			{
			match("scans"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANS"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:55:8: ( 'select' )
			// AQLast.g:55:10: 'select'
			{
			match("select"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:56:5: ( 'set' )
			// AQLast.g:56:7: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "SETS"
	public final void mSETS() throws RecognitionException {
		try {
			int _type = SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:57:6: ( 'sets' )
			// AQLast.g:57:8: 'sets'
			{
			match("sets"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SETS"

	// $ANTLR start "SHOW"
	public final void mSHOW() throws RecognitionException {
		try {
			int _type = SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:58:6: ( 'show' )
			// AQLast.g:58:8: 'show'
			{
			match("show"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHOW"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:59:6: ( '*' )
			// AQLast.g:59:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "STAT"
	public final void mSTAT() throws RecognitionException {
		try {
			int _type = STAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:60:6: ( 'stat' )
			// AQLast.g:60:8: 'stat'
			{
			match("stat"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:61:8: ( 'string' )
			// AQLast.g:61:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "SYSTEM"
	public final void mSYSTEM() throws RecognitionException {
		try {
			int _type = SYSTEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:62:8: ( 'system' )
			// AQLast.g:62:10: 'system'
			{
			match("system"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSTEM"

	// $ANTLR start "TIMEOUT"
	public final void mTIMEOUT() throws RecognitionException {
		try {
			int _type = TIMEOUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:63:9: ( 'timeout' )
			// AQLast.g:63:11: 'timeout'
			{
			match("timeout"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMEOUT"

	// $ANTLR start "USE_SMD"
	public final void mUSE_SMD() throws RecognitionException {
		try {
			int _type = USE_SMD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:64:9: ( 'use_smd' )
			// AQLast.g:64:11: 'use_smd'
			{
			match("use_smd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE_SMD"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:65:8: ( 'values' )
			// AQLast.g:65:10: 'values'
			{
			match("values"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUES"

	// $ANTLR start "VERBOSE"
	public final void mVERBOSE() throws RecognitionException {
		try {
			int _type = VERBOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:66:9: ( 'verbose' )
			// AQLast.g:66:11: 'verbose'
			{
			match("verbose"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VERBOSE"

	// $ANTLR start "VIEW"
	public final void mVIEW() throws RecognitionException {
		try {
			int _type = VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:67:6: ( 'view' )
			// AQLast.g:67:8: 'view'
			{
			match("view"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIEW"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:68:7: ( 'where' )
			// AQLast.g:68:9: 'where'
			{
			match("where"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:69:7: ( '(' )
			// AQLast.g:69:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:70:7: ( ')' )
			// AQLast.g:70:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:71:7: ( ',' )
			// AQLast.g:71:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:72:7: ( '.' )
			// AQLast.g:72:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:73:7: ( 'help' )
			// AQLast.g:73:9: 'help'
			{
			match("help"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:74:7: ( 'json' )
			// AQLast.g:74:9: 'json'
			{
			match("json"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:75:7: ( 'lua' )
			// AQLast.g:75:9: 'lua'
			{
			match("lua"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:76:7: ( 'nosql' )
			// AQLast.g:76:9: 'nosql'
			{
			match("nosql"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:77:7: ( 'q' )
			// AQLast.g:77:9: 'q'
			{
			match('q'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:78:7: ( 'so' )
			// AQLast.g:78:9: 'so'
			{
			match("so"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:79:7: ( 'table' )
			// AQLast.g:79:9: 'table'
			{
			match("table"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:767:2: ( 'true' )
			// AQLast.g:767:4: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:767:2: ( 'false' )
			// AQLast.g:767:4: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:771:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// AQLast.g:771:9: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:789:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '#' (~ ( '\\n' | '\\r' ) )* )
			int alt4=2;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// AQLast.g:789:9: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
					{
					match('#'); 
					// AQLast.g:789:13: (~ ( '\\n' | '\\r' ) )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// AQLast.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					// AQLast.g:789:28: ( '\\r\\n' | '\\r' | '\\n' )
					int alt2=3;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='\r') ) {
						int LA2_1 = input.LA(2);
						if ( (LA2_1=='\n') ) {
							alt2=1;
						}

						else {
							alt2=2;
						}

					}
					else if ( (LA2_0=='\n') ) {
						alt2=3;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// AQLast.g:789:29: '\\r\\n'
							{
							match("\r\n"); 

							}
							break;
						case 2 :
							// AQLast.g:789:38: '\\r'
							{
							match('\r'); 
							}
							break;
						case 3 :
							// AQLast.g:789:45: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					_channel = HIDDEN;
					}
					break;
				case 2 :
					// AQLast.g:791:9: '#' (~ ( '\\n' | '\\r' ) )*
					{
					match('#'); 
					// AQLast.g:791:13: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// AQLast.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					_channel = HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:793:12: ( ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE | HYPHEN )* )
			// AQLast.g:793:14: ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE | HYPHEN )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// AQLast.g:793:37: ( LETTER | DIGIT | UNDERSCORE | HYPHEN )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='-'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// AQLast.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "STRINGLITERAL"
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:805:5: ( '\\'' ( EscapeSequence |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// AQLast.g:805:9: '\\'' ( EscapeSequence |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// AQLast.g:806:5: ( EscapeSequence |~ ( '\\\\' | '\\'' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// AQLast.g:806:7: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// AQLast.g:806:24: ~ ( '\\\\' | '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "FLOATLITERAL"
	public final void mFLOATLITERAL() throws RecognitionException {
		try {
			int _type = FLOATLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:807:3: ( ( '+' | '-' )? IntegerNumber '.' ( IntegerNumber )? )
			// AQLast.g:807:5: ( '+' | '-' )? IntegerNumber '.' ( IntegerNumber )?
			{
			// AQLast.g:807:5: ( '+' | '-' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='+'||LA7_0=='-') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// AQLast.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mIntegerNumber(); 

			match('.'); 
			// AQLast.g:807:34: ( IntegerNumber )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// AQLast.g:807:34: IntegerNumber
					{
					mIntegerNumber(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATLITERAL"

	// $ANTLR start "INTLITERAL"
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:811:5: ( ( '+' | '-' )? IntegerNumber ( 'L' )? )
			// AQLast.g:811:9: ( '+' | '-' )? IntegerNumber ( 'L' )?
			{
			// AQLast.g:811:9: ( '+' | '-' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='+'||LA9_0=='-') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// AQLast.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mIntegerNumber(); 

			// AQLast.g:811:34: ( 'L' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='L') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// AQLast.g:811:34: 'L'
					{
					match('L'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLITERAL"

	// $ANTLR start "HEXLITERAL"
	public final void mHEXLITERAL() throws RecognitionException {
		try {
			int _type = HEXLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// AQLast.g:815:3: ( HexPrefix HexDigit HexDigit )
			// AQLast.g:815:5: HexPrefix HexDigit HexDigit
			{
			mHexPrefix(); 

			mHexDigit(); 

			mHexDigit(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEXLITERAL"

	// $ANTLR start "IntegerNumber"
	public final void mIntegerNumber() throws RecognitionException {
		try {
			// AQLast.g:826:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='0') ) {
				int LA13_1 = input.LA(2);
				if ( ((LA13_1 >= '0' && LA13_1 <= '7')) ) {
					alt13=3;
				}

				else {
					alt13=1;
				}

			}
			else if ( ((LA13_0 >= '1' && LA13_0 <= '9')) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// AQLast.g:826:9: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// AQLast.g:827:9: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// AQLast.g:827:18: ( '0' .. '9' )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// AQLast.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;
				case 3 :
					// AQLast.g:828:9: '0' ( '0' .. '7' )+
					{
					match('0'); 
					// AQLast.g:828:13: ( '0' .. '7' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '7')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// AQLast.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerNumber"

	// $ANTLR start "HexPrefix"
	public final void mHexPrefix() throws RecognitionException {
		try {
			// AQLast.g:833:5: ( '\\\\x' | '\\\\X' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='\\') ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1=='x') ) {
					alt14=1;
				}
				else if ( (LA14_1=='X') ) {
					alt14=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// AQLast.g:833:9: '\\\\x'
					{
					match("\\x"); 

					}
					break;
				case 2 :
					// AQLast.g:833:17: '\\\\X'
					{
					match("\\X"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexPrefix"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// AQLast.g:836:5: ( ( DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
			// AQLast.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// AQLast.g:839:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// AQLast.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// AQLast.g:840:16: ( '0' .. '9' )
			// AQLast.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// AQLast.g:841:21: ( '_' )
			// AQLast.g:841:23: '_'
			{
			match('_'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	// $ANTLR start "HYPHEN"
	public final void mHYPHEN() throws RecognitionException {
		try {
			// AQLast.g:842:17: ( '-' )
			// AQLast.g:842:19: '-'
			{
			match('-'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HYPHEN"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			// AQLast.g:843:20: ( ';' )
			// AQLast.g:843:22: ';'
			{
			match(';'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// AQLast.g:846:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\'' | '\\\\' ) )
			// AQLast.g:846:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	@Override
	public void mTokens() throws RecognitionException {
		// AQLast.g:1:8: ( AGGREGATE | AND | BETWEEN | BINS | BY | CREATE | DELETE | DESC | DROP | ECHO | EQ | EXECUTE | EXIT | FROM | FUNCTION | GET | INDEX | INDEXES | INSERT | INTO | KILL | KILL_QUERY | KILL_SCAN | LUA_SYSTEM_PATH | LUA_USER_PATH | MODULE | MODULES | NAMESPACES | NUMERIC | ON | ORDER | OUTPUT | PACKAGES | PK | PRINT | QUERIES | QUERY | QUIT | RECORD_TTL | REGISTER | REMOVE | RUN | SCAN | SCANS | SELECT | SET | SETS | SHOW | STAR | STAT | STRING | SYSTEM | TIMEOUT | USE_SMD | VALUES | VERBOSE | VIEW | WHERE | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | TRUE | FALSE | WS | COMMENT | IDENTIFIER | STRINGLITERAL | FLOATLITERAL | INTLITERAL | HEXLITERAL )
		int alt15=78;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// AQLast.g:1:10: AGGREGATE
				{
				mAGGREGATE(); 

				}
				break;
			case 2 :
				// AQLast.g:1:20: AND
				{
				mAND(); 

				}
				break;
			case 3 :
				// AQLast.g:1:24: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 4 :
				// AQLast.g:1:32: BINS
				{
				mBINS(); 

				}
				break;
			case 5 :
				// AQLast.g:1:37: BY
				{
				mBY(); 

				}
				break;
			case 6 :
				// AQLast.g:1:40: CREATE
				{
				mCREATE(); 

				}
				break;
			case 7 :
				// AQLast.g:1:47: DELETE
				{
				mDELETE(); 

				}
				break;
			case 8 :
				// AQLast.g:1:54: DESC
				{
				mDESC(); 

				}
				break;
			case 9 :
				// AQLast.g:1:59: DROP
				{
				mDROP(); 

				}
				break;
			case 10 :
				// AQLast.g:1:64: ECHO
				{
				mECHO(); 

				}
				break;
			case 11 :
				// AQLast.g:1:69: EQ
				{
				mEQ(); 

				}
				break;
			case 12 :
				// AQLast.g:1:72: EXECUTE
				{
				mEXECUTE(); 

				}
				break;
			case 13 :
				// AQLast.g:1:80: EXIT
				{
				mEXIT(); 

				}
				break;
			case 14 :
				// AQLast.g:1:85: FROM
				{
				mFROM(); 

				}
				break;
			case 15 :
				// AQLast.g:1:90: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 16 :
				// AQLast.g:1:99: GET
				{
				mGET(); 

				}
				break;
			case 17 :
				// AQLast.g:1:103: INDEX
				{
				mINDEX(); 

				}
				break;
			case 18 :
				// AQLast.g:1:109: INDEXES
				{
				mINDEXES(); 

				}
				break;
			case 19 :
				// AQLast.g:1:117: INSERT
				{
				mINSERT(); 

				}
				break;
			case 20 :
				// AQLast.g:1:124: INTO
				{
				mINTO(); 

				}
				break;
			case 21 :
				// AQLast.g:1:129: KILL
				{
				mKILL(); 

				}
				break;
			case 22 :
				// AQLast.g:1:134: KILL_QUERY
				{
				mKILL_QUERY(); 

				}
				break;
			case 23 :
				// AQLast.g:1:145: KILL_SCAN
				{
				mKILL_SCAN(); 

				}
				break;
			case 24 :
				// AQLast.g:1:155: LUA_SYSTEM_PATH
				{
				mLUA_SYSTEM_PATH(); 

				}
				break;
			case 25 :
				// AQLast.g:1:171: LUA_USER_PATH
				{
				mLUA_USER_PATH(); 

				}
				break;
			case 26 :
				// AQLast.g:1:185: MODULE
				{
				mMODULE(); 

				}
				break;
			case 27 :
				// AQLast.g:1:192: MODULES
				{
				mMODULES(); 

				}
				break;
			case 28 :
				// AQLast.g:1:200: NAMESPACES
				{
				mNAMESPACES(); 

				}
				break;
			case 29 :
				// AQLast.g:1:211: NUMERIC
				{
				mNUMERIC(); 

				}
				break;
			case 30 :
				// AQLast.g:1:219: ON
				{
				mON(); 

				}
				break;
			case 31 :
				// AQLast.g:1:222: ORDER
				{
				mORDER(); 

				}
				break;
			case 32 :
				// AQLast.g:1:228: OUTPUT
				{
				mOUTPUT(); 

				}
				break;
			case 33 :
				// AQLast.g:1:235: PACKAGES
				{
				mPACKAGES(); 

				}
				break;
			case 34 :
				// AQLast.g:1:244: PK
				{
				mPK(); 

				}
				break;
			case 35 :
				// AQLast.g:1:247: PRINT
				{
				mPRINT(); 

				}
				break;
			case 36 :
				// AQLast.g:1:253: QUERIES
				{
				mQUERIES(); 

				}
				break;
			case 37 :
				// AQLast.g:1:261: QUERY
				{
				mQUERY(); 

				}
				break;
			case 38 :
				// AQLast.g:1:267: QUIT
				{
				mQUIT(); 

				}
				break;
			case 39 :
				// AQLast.g:1:272: RECORD_TTL
				{
				mRECORD_TTL(); 

				}
				break;
			case 40 :
				// AQLast.g:1:283: REGISTER
				{
				mREGISTER(); 

				}
				break;
			case 41 :
				// AQLast.g:1:292: REMOVE
				{
				mREMOVE(); 

				}
				break;
			case 42 :
				// AQLast.g:1:299: RUN
				{
				mRUN(); 

				}
				break;
			case 43 :
				// AQLast.g:1:303: SCAN
				{
				mSCAN(); 

				}
				break;
			case 44 :
				// AQLast.g:1:308: SCANS
				{
				mSCANS(); 

				}
				break;
			case 45 :
				// AQLast.g:1:314: SELECT
				{
				mSELECT(); 

				}
				break;
			case 46 :
				// AQLast.g:1:321: SET
				{
				mSET(); 

				}
				break;
			case 47 :
				// AQLast.g:1:325: SETS
				{
				mSETS(); 

				}
				break;
			case 48 :
				// AQLast.g:1:330: SHOW
				{
				mSHOW(); 

				}
				break;
			case 49 :
				// AQLast.g:1:335: STAR
				{
				mSTAR(); 

				}
				break;
			case 50 :
				// AQLast.g:1:340: STAT
				{
				mSTAT(); 

				}
				break;
			case 51 :
				// AQLast.g:1:345: STRING
				{
				mSTRING(); 

				}
				break;
			case 52 :
				// AQLast.g:1:352: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 53 :
				// AQLast.g:1:359: TIMEOUT
				{
				mTIMEOUT(); 

				}
				break;
			case 54 :
				// AQLast.g:1:367: USE_SMD
				{
				mUSE_SMD(); 

				}
				break;
			case 55 :
				// AQLast.g:1:375: VALUES
				{
				mVALUES(); 

				}
				break;
			case 56 :
				// AQLast.g:1:382: VERBOSE
				{
				mVERBOSE(); 

				}
				break;
			case 57 :
				// AQLast.g:1:390: VIEW
				{
				mVIEW(); 

				}
				break;
			case 58 :
				// AQLast.g:1:395: WHERE
				{
				mWHERE(); 

				}
				break;
			case 59 :
				// AQLast.g:1:401: T__85
				{
				mT__85(); 

				}
				break;
			case 60 :
				// AQLast.g:1:407: T__86
				{
				mT__86(); 

				}
				break;
			case 61 :
				// AQLast.g:1:413: T__87
				{
				mT__87(); 

				}
				break;
			case 62 :
				// AQLast.g:1:419: T__88
				{
				mT__88(); 

				}
				break;
			case 63 :
				// AQLast.g:1:425: T__89
				{
				mT__89(); 

				}
				break;
			case 64 :
				// AQLast.g:1:431: T__90
				{
				mT__90(); 

				}
				break;
			case 65 :
				// AQLast.g:1:437: T__91
				{
				mT__91(); 

				}
				break;
			case 66 :
				// AQLast.g:1:443: T__92
				{
				mT__92(); 

				}
				break;
			case 67 :
				// AQLast.g:1:449: T__93
				{
				mT__93(); 

				}
				break;
			case 68 :
				// AQLast.g:1:455: T__94
				{
				mT__94(); 

				}
				break;
			case 69 :
				// AQLast.g:1:461: T__95
				{
				mT__95(); 

				}
				break;
			case 70 :
				// AQLast.g:1:467: TRUE
				{
				mTRUE(); 

				}
				break;
			case 71 :
				// AQLast.g:1:472: FALSE
				{
				mFALSE(); 

				}
				break;
			case 72 :
				// AQLast.g:1:478: WS
				{
				mWS(); 

				}
				break;
			case 73 :
				// AQLast.g:1:481: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 74 :
				// AQLast.g:1:489: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 75 :
				// AQLast.g:1:500: STRINGLITERAL
				{
				mSTRINGLITERAL(); 

				}
				break;
			case 76 :
				// AQLast.g:1:514: FLOATLITERAL
				{
				mFLOATLITERAL(); 

				}
				break;
			case 77 :
				// AQLast.g:1:527: INTLITERAL
				{
				mINTLITERAL(); 

				}
				break;
			case 78 :
				// AQLast.g:1:538: HEXLITERAL
				{
				mHEXLITERAL(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA4_eotS =
		"\1\uffff\2\4\2\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\1\43\2\0\2\uffff";
	static final String DFA4_maxS =
		"\1\43\2\uffff\2\uffff";
	static final String DFA4_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA4_specialS =
		"\1\uffff\1\0\1\1\2\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1",
			"\12\2\1\3\2\2\1\3\ufff2\2",
			"\12\2\1\3\2\2\1\3\ufff2\2",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "788:1: COMMENT : ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '#' (~ ( '\\n' | '\\r' ) )* );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA4_1 = input.LA(1);
						s = -1;
						if ( ((LA4_1 >= '\u0000' && LA4_1 <= '\t')||(LA4_1 >= '\u000B' && LA4_1 <= '\f')||(LA4_1 >= '\u000E' && LA4_1 <= '\uFFFF')) ) {s = 2;}
						else if ( (LA4_1=='\n'||LA4_1=='\r') ) {s = 3;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA4_2 = input.LA(1);
						s = -1;
						if ( (LA4_2=='\n'||LA4_2=='\r') ) {s = 3;}
						else if ( ((LA4_2 >= '\u0000' && LA4_2 <= '\t')||(LA4_2 >= '\u000B' && LA4_2 <= '\f')||(LA4_2 >= '\u000E' && LA4_2 <= '\uFFFF')) ) {s = 2;}
						else s = 4;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 4, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA15_eotS =
		"\1\uffff\5\40\1\uffff\11\40\1\102\2\40\1\uffff\4\40\4\uffff\2\40\5\uffff"+
		"\2\125\1\uffff\4\40\1\135\20\40\1\162\3\40\1\166\2\40\1\uffff\7\40\1\u0085"+
		"\12\40\2\uffff\2\125\1\40\1\u0091\2\40\1\uffff\12\40\1\u009e\4\40\1\u00a4"+
		"\4\40\1\uffff\3\40\1\uffff\6\40\1\u00b2\2\40\1\u00b6\4\40\1\uffff\13\40"+
		"\1\uffff\1\40\1\u00c7\2\40\1\u00ca\1\u00cb\1\u00cc\1\40\1\u00ce\1\u00cf"+
		"\2\40\1\uffff\2\40\1\u00d4\1\u00d6\1\40\1\uffff\11\40\1\u00e3\3\40\1\uffff"+
		"\1\u00e8\1\40\1\u00ea\1\uffff\1\u00eb\1\u00ec\4\40\1\u00f1\3\40\1\u00f5"+
		"\1\40\1\u00f7\1\u00f8\2\40\1\uffff\2\40\3\uffff\1\40\2\uffff\1\40\1\u00ff"+
		"\1\u0101\1\40\1\uffff\1\40\1\uffff\5\40\1\u010a\1\u010b\2\40\1\u010e\1"+
		"\40\1\u0110\1\uffff\3\40\1\u0114\1\uffff\1\40\3\uffff\3\40\1\u0119\1\uffff"+
		"\3\40\1\uffff\1\u011d\2\uffff\2\40\1\u0120\1\u0121\2\40\1\uffff\1\40\1"+
		"\uffff\1\u0125\4\40\1\u012b\2\40\2\uffff\1\u012e\1\40\1\uffff\1\40\1\uffff"+
		"\2\40\1\u0133\1\uffff\1\u0134\1\u0135\1\u0136\1\40\1\uffff\1\40\1\u0139"+
		"\1\40\1\uffff\1\40\1\u013c\2\uffff\1\u013d\1\40\1\u013f\1\uffff\4\40\1"+
		"\u0144\1\uffff\1\40\1\u0146\1\uffff\1\40\1\u0148\2\40\4\uffff\1\u014b"+
		"\1\u014c\1\uffff\1\u014d\1\40\2\uffff\1\u014f\1\uffff\4\40\1\uffff\1\40"+
		"\1\uffff\1\u0155\1\uffff\1\40\1\u0157\3\uffff\1\u0158\1\uffff\1\40\1\u015a"+
		"\3\40\1\uffff\1\40\2\uffff\1\u015f\1\uffff\2\40\1\u0162\1\u0163\1\uffff"+
		"\1\u0164\1\40\3\uffff\1\u0166\1\uffff";
	static final String DFA15_eofS =
		"\u0167\uffff";
	static final String DFA15_minS =
		"\1\11\1\147\1\145\1\162\1\145\1\143\1\uffff\1\141\1\145\1\156\1\151\1"+
		"\165\1\157\1\141\1\156\1\141\1\55\1\145\1\143\1\uffff\1\141\1\163\1\141"+
		"\1\150\4\uffff\1\145\1\163\4\uffff\1\60\2\56\1\uffff\1\147\1\144\1\164"+
		"\1\156\1\55\1\145\1\154\1\157\1\150\1\145\1\157\1\156\1\154\1\164\1\144"+
		"\1\154\1\141\1\144\2\155\1\163\1\55\1\144\1\164\1\143\1\55\1\151\1\145"+
		"\1\uffff\1\143\1\156\1\141\1\154\1\157\1\141\1\163\1\55\1\155\1\142\1"+
		"\165\1\145\1\154\1\162\2\145\1\154\1\157\2\uffff\2\56\1\162\1\55\1\167"+
		"\1\163\1\uffff\1\141\1\145\1\143\1\160\1\157\1\143\1\164\1\155\1\143\1"+
		"\163\1\55\2\145\1\157\1\154\1\55\1\165\2\145\1\161\1\uffff\1\145\1\160"+
		"\1\153\1\uffff\1\156\1\162\1\164\1\157\1\151\1\157\1\55\1\156\1\145\1"+
		"\55\1\167\1\164\1\151\1\164\1\uffff\1\145\1\154\1\145\1\137\1\165\1\142"+
		"\1\167\1\162\1\160\1\156\1\145\1\uffff\1\145\1\55\2\164\3\55\1\165\2\55"+
		"\1\164\1\145\1\uffff\1\170\1\162\2\55\1\163\1\uffff\1\154\1\163\1\162"+
		"\1\154\1\162\1\165\1\141\1\164\1\151\1\55\1\162\1\163\1\166\1\uffff\1"+
		"\55\1\143\1\55\1\uffff\2\55\1\156\1\145\1\157\1\145\1\55\1\163\1\145\1"+
		"\157\1\55\1\145\2\55\1\147\1\145\1\uffff\2\145\3\uffff\1\164\2\uffff\1"+
		"\151\2\55\1\164\1\uffff\1\161\1\uffff\1\171\1\163\1\145\1\160\1\151\2"+
		"\55\1\164\1\147\1\55\1\145\1\55\1\uffff\1\144\1\164\1\145\1\55\1\uffff"+
		"\1\164\3\uffff\1\147\1\155\1\165\1\55\1\uffff\1\155\2\163\1\uffff\1\55"+
		"\2\uffff\1\141\1\156\2\55\1\145\1\157\1\uffff\1\163\1\uffff\1\55\1\165"+
		"\1\143\1\163\1\145\1\55\1\141\1\143\2\uffff\1\55\1\145\1\uffff\1\163\1"+
		"\uffff\1\137\1\145\1\55\1\uffff\3\55\1\164\1\uffff\1\144\1\55\1\145\1"+
		"\uffff\1\164\1\55\2\uffff\1\55\1\156\1\55\1\uffff\1\145\1\141\1\160\1"+
		"\162\1\55\1\uffff\1\143\1\55\1\uffff\1\163\1\55\1\164\1\162\4\uffff\2"+
		"\55\1\uffff\1\55\1\145\2\uffff\1\55\1\uffff\1\162\1\156\1\141\1\160\1"+
		"\uffff\1\145\1\uffff\1\55\1\uffff\1\164\1\55\3\uffff\1\55\1\uffff\1\171"+
		"\1\55\1\164\1\141\1\163\1\uffff\1\154\2\uffff\1\55\1\uffff\1\150\1\164"+
		"\2\55\1\uffff\1\55\1\150\3\uffff\1\55\1\uffff";
	static final String DFA15_maxS =
		"\1\172\1\156\1\171\2\162\1\170\1\uffff\1\165\1\145\1\156\1\151\1\165\1"+
		"\157\2\165\1\162\1\172\1\165\1\171\1\uffff\1\162\1\163\1\151\1\150\4\uffff"+
		"\1\145\1\163\4\uffff\1\71\1\67\1\71\1\uffff\1\147\1\144\1\164\1\156\1"+
		"\172\1\145\1\163\1\157\1\150\1\151\1\157\1\156\1\154\2\164\1\154\1\141"+
		"\1\144\2\155\1\163\1\172\1\144\1\164\1\143\1\172\2\151\1\uffff\1\155\1"+
		"\156\1\141\1\164\1\157\1\162\1\163\1\172\1\155\1\142\1\165\1\145\1\154"+
		"\1\162\2\145\1\154\1\157\2\uffff\1\67\1\71\1\162\1\172\1\167\1\163\1\uffff"+
		"\1\141\1\145\1\143\1\160\1\157\1\143\1\164\1\155\1\143\1\163\1\172\2\145"+
		"\1\157\1\154\1\172\1\165\2\145\1\161\1\uffff\1\145\1\160\1\153\1\uffff"+
		"\1\156\1\162\1\164\1\157\1\151\1\157\1\172\1\156\1\145\1\172\1\167\1\164"+
		"\1\151\1\164\1\uffff\1\145\1\154\1\145\1\137\1\165\1\142\1\167\1\162\1"+
		"\160\1\156\1\145\1\uffff\1\145\1\172\2\164\3\172\1\165\2\172\1\164\1\145"+
		"\1\uffff\1\170\1\162\2\172\1\165\1\uffff\1\154\1\163\1\162\1\154\1\162"+
		"\1\165\1\141\1\164\1\171\1\172\1\162\1\163\1\166\1\uffff\1\172\1\143\1"+
		"\172\1\uffff\2\172\1\156\1\145\1\157\1\145\1\172\1\163\1\145\1\157\1\172"+
		"\1\145\2\172\1\147\1\145\1\uffff\2\145\3\uffff\1\164\2\uffff\1\151\2\172"+
		"\1\164\1\uffff\1\163\1\uffff\1\171\1\163\1\145\1\160\1\151\2\172\1\164"+
		"\1\147\1\172\1\145\1\172\1\uffff\1\144\1\164\1\145\1\172\1\uffff\1\164"+
		"\3\uffff\1\147\1\155\1\165\1\172\1\uffff\1\155\2\163\1\uffff\1\172\2\uffff"+
		"\1\141\1\156\2\172\1\145\1\157\1\uffff\1\163\1\uffff\1\172\1\165\1\143"+
		"\1\163\1\145\1\172\1\141\1\143\2\uffff\1\172\1\145\1\uffff\1\163\1\uffff"+
		"\1\137\1\145\1\172\1\uffff\3\172\1\164\1\uffff\1\144\1\172\1\145\1\uffff"+
		"\1\164\1\172\2\uffff\1\172\1\156\1\172\1\uffff\1\145\1\141\1\160\1\162"+
		"\1\172\1\uffff\1\143\1\172\1\uffff\1\163\1\172\1\164\1\162\4\uffff\2\172"+
		"\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff\1\162\1\156\1\141\1\160\1\uffff"+
		"\1\145\1\uffff\1\172\1\uffff\1\164\1\172\3\uffff\1\172\1\uffff\1\171\1"+
		"\172\1\164\1\141\1\163\1\uffff\1\154\2\uffff\1\172\1\uffff\1\150\1\164"+
		"\2\172\1\uffff\1\172\1\150\3\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\6\uffff\1\13\14\uffff\1\61\4\uffff\1\73\1\74\1\75\1\76\2\uffff\1\110"+
		"\1\111\1\112\1\113\3\uffff\1\116\34\uffff\1\103\22\uffff\1\115\1\114\6"+
		"\uffff\1\5\24\uffff\1\36\3\uffff\1\42\16\uffff\1\104\13\uffff\1\2\14\uffff"+
		"\1\20\5\uffff\1\101\15\uffff\1\52\3\uffff\1\56\20\uffff\1\4\2\uffff\1"+
		"\10\1\11\1\12\1\uffff\1\15\1\16\4\uffff\1\24\1\uffff\1\25\14\uffff\1\46"+
		"\4\uffff\1\53\1\uffff\1\57\1\60\1\62\4\uffff\1\106\3\uffff\1\71\1\uffff"+
		"\1\77\1\100\6\uffff\1\107\1\uffff\1\21\10\uffff\1\102\1\37\2\uffff\1\43"+
		"\1\uffff\1\45\3\uffff\1\54\4\uffff\1\105\3\uffff\1\72\2\uffff\1\6\1\7"+
		"\3\uffff\1\23\5\uffff\1\32\2\uffff\1\40\4\uffff\1\51\1\55\1\63\1\64\2"+
		"\uffff\1\67\2\uffff\1\3\1\14\1\uffff\1\22\4\uffff\1\33\1\uffff\1\35\1"+
		"\uffff\1\44\2\uffff\1\65\1\66\1\70\1\uffff\1\17\5\uffff\1\41\1\uffff\1"+
		"\50\1\1\1\uffff\1\27\4\uffff\1\26\2\uffff\1\34\1\47\1\30\1\uffff\1\31";
	static final String DFA15_specialS =
		"\u0167\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\36\1\uffff\2\36\22\uffff\1\36\2\uffff\1\37\3\uffff\1\41\1\30\1\31"+
			"\1\23\1\42\1\32\1\42\1\33\1\uffff\1\43\11\44\3\uffff\1\6\3\uffff\32\40"+
			"\1\uffff\1\45\2\uffff\1\40\1\uffff\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\34"+
			"\1\11\1\35\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26"+
			"\1\27\3\40",
			"\1\46\6\uffff\1\47",
			"\1\50\3\uffff\1\51\17\uffff\1\52",
			"\1\53",
			"\1\54\14\uffff\1\55",
			"\1\56\24\uffff\1\57",
			"",
			"\1\62\20\uffff\1\60\2\uffff\1\61",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70\15\uffff\1\72\5\uffff\1\71",
			"\1\73\3\uffff\1\74\2\uffff\1\75",
			"\1\76\11\uffff\1\77\6\uffff\1\100",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\101\5"+
			"\40",
			"\1\103\17\uffff\1\104",
			"\1\105\1\uffff\1\106\2\uffff\1\107\6\uffff\1\112\4\uffff\1\110\4\uffff"+
			"\1\111",
			"",
			"\1\114\7\uffff\1\113\10\uffff\1\115",
			"\1\116",
			"\1\117\3\uffff\1\120\3\uffff\1\121",
			"\1\122",
			"",
			"",
			"",
			"",
			"\1\123",
			"\1\124",
			"",
			"",
			"",
			"",
			"\1\43\11\44",
			"\1\126\1\uffff\10\127",
			"\1\126\1\uffff\12\130",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\136",
			"\1\137\6\uffff\1\140",
			"\1\141",
			"\1\142",
			"\1\143\3\uffff\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151\16\uffff\1\152\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\167",
			"\1\170\3\uffff\1\171",
			"",
			"\1\172\3\uffff\1\173\5\uffff\1\174",
			"\1\175",
			"\1\176",
			"\1\177\7\uffff\1\u0080",
			"\1\u0081",
			"\1\u0082\20\uffff\1\u0083",
			"\1\u0084",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"",
			"",
			"\1\126\1\uffff\10\127",
			"\1\126\1\uffff\12\130",
			"\1\u0090",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0092",
			"\1\u0093",
			"",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\u00a3\1\uffff\32\40",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00b3",
			"\1\u00b4",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\u00b5"+
			"\7\40",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"",
			"\1\u00c6",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00c8",
			"\1\u00c9",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00cd",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00d0",
			"\1\u00d1",
			"",
			"\1\u00d2",
			"\1\u00d3",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\u00d5\1\uffff\32\40",
			"\1\u00d7\1\uffff\1\u00d8",
			"",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1\17\uffff\1\u00e2",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\u00e7"+
			"\7\40",
			"\1\u00e9",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00f6",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u00f9",
			"\1\u00fa",
			"",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"",
			"",
			"\1\u00fd",
			"",
			"",
			"\1\u00fe",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\u0100"+
			"\25\40",
			"\1\u0102",
			"",
			"\1\u0103\1\uffff\1\u0104",
			"",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u010c",
			"\1\u010d",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u010f",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0115",
			"",
			"",
			"",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\u011e",
			"\1\u011f",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0122",
			"\1\u0123",
			"",
			"\1\u0124",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\22\40\1\u012a"+
			"\7\40",
			"\1\u012c",
			"\1\u012d",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u012f",
			"",
			"\1\u0130",
			"",
			"\1\u0131",
			"\1\u0132",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0137",
			"",
			"\1\u0138",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u013a",
			"",
			"\1\u013b",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u013e",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0145",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0147",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0149",
			"\1\u014a",
			"",
			"",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u014e",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"",
			"\1\u0154",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0156",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0159",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"",
			"\1\u015e",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\u0160",
			"\1\u0161",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0165",
			"",
			"",
			"",
			"\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AGGREGATE | AND | BETWEEN | BINS | BY | CREATE | DELETE | DESC | DROP | ECHO | EQ | EXECUTE | EXIT | FROM | FUNCTION | GET | INDEX | INDEXES | INSERT | INTO | KILL | KILL_QUERY | KILL_SCAN | LUA_SYSTEM_PATH | LUA_USER_PATH | MODULE | MODULES | NAMESPACES | NUMERIC | ON | ORDER | OUTPUT | PACKAGES | PK | PRINT | QUERIES | QUERY | QUIT | RECORD_TTL | REGISTER | REMOVE | RUN | SCAN | SCANS | SELECT | SET | SETS | SHOW | STAR | STAT | STRING | SYSTEM | TIMEOUT | USE_SMD | VALUES | VERBOSE | VIEW | WHERE | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | TRUE | FALSE | WS | COMMENT | IDENTIFIER | STRINGLITERAL | FLOATLITERAL | INTLITERAL | HEXLITERAL );";
		}
	}

}
