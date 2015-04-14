// $ANTLR 3.5.1 AQLExecutor.g 2014-10-20 13:56:20

package com.aerospike.aql.grammar;

import gnu.crypto.util.Base64;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.io.UnsupportedEncodingException;

import com.aerospike.aql.grammar.NoCaseFileStream;
import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Bin;
import com.aerospike.client.Info;
import com.aerospike.client.Key;
import com.aerospike.client.Language;
import com.aerospike.client.Record;
import com.aerospike.client.Value;
import com.aerospike.client.cluster.Node;
import com.aerospike.client.lua.LuaConfig;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.WritePolicy;
import com.aerospike.client.query.Filter;
import com.aerospike.client.query.IndexType;
import com.aerospike.client.query.RecordSet;
import com.aerospike.client.query.ResultSet;
import com.aerospike.client.query.Statement;
import com.aerospike.client.task.RegisterTask;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class AQLExecutor extends ExecutorParser {
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
	public ExecutorParser[] getDelegates() {
		return new ExecutorParser[] {};
	}

	// delegators


	public AQLExecutor(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public AQLExecutor(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AQLExecutor.tokenNames; }
	@Override public String getGrammarFileName() { return "AQLExecutor.g"; }


	public AQLExecutor(TreeNodeStream input, AerospikeClient client) {
		super(input, client);
	}




	// $ANTLR start "aqlFile"
	// AQLExecutor.g:51:1: aqlFile : ( aqlStatement )+ ;
	public final void aqlFile() throws AerospikeException, RecognitionException {
		try {
			// AQLExecutor.g:52:2: ( ( aqlStatement )+ )
			// AQLExecutor.g:52:4: ( aqlStatement )+
			{
			// AQLExecutor.g:52:4: ( aqlStatement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AGGREGATE||(LA1_0 >= CREATE && LA1_0 <= DESC)||LA1_0==DROP||(LA1_0 >= EXECUTE && LA1_0 <= EXIT)||LA1_0==GET||LA1_0==INSERT||(LA1_0 >= KILL_QUERY && LA1_0 <= KILL_SCAN)||LA1_0==PRINT||LA1_0==QUIT||LA1_0==REGISTER||LA1_0==RUN||(LA1_0 >= SELECT_ALL && LA1_0 <= SELECT_EXPLICIT)||LA1_0==SET||LA1_0==SHOW||LA1_0==STAT||LA1_0==89||LA1_0==93) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// AQLExecutor.g:52:4: aqlStatement
					{
					pushFollow(FOLLOW_aqlStatement_in_aqlFile85);
					aqlStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
	}
	// $ANTLR end "aqlFile"


	public static class aqlStatement_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "aqlStatement"
	// AQLExecutor.g:55:1: aqlStatement : ( create | drop | insert | delete | select | registerPackage | execute | aggregate | show | desc | stat | set | get | run | kill_query | kill_scan | quit | help | print );
	public final AQLExecutor.aqlStatement_return aqlStatement() throws AerospikeException, RecognitionException {
		AQLExecutor.aqlStatement_return retval = new AQLExecutor.aqlStatement_return();
		retval.start = input.LT(1);

		try {
			// AQLExecutor.g:56:2: ( create | drop | insert | delete | select | registerPackage | execute | aggregate | show | desc | stat | set | get | run | kill_query | kill_scan | quit | help | print )
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
					// AQLExecutor.g:56:4: create
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_create_in_aqlStatement105);
					create();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// AQLExecutor.g:57:4: drop
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_drop_in_aqlStatement113);
					drop();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// AQLExecutor.g:58:4: insert
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_insert_in_aqlStatement123);
					insert();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 4 :
					// AQLExecutor.g:59:4: delete
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_delete_in_aqlStatement131);
					delete();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 5 :
					// AQLExecutor.g:60:4: select
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_select_in_aqlStatement139);
					select();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 6 :
					// AQLExecutor.g:61:4: registerPackage
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_registerPackage_in_aqlStatement147);
					registerPackage();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 7 :
					// AQLExecutor.g:62:4: execute
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_execute_in_aqlStatement155);
					execute();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 8 :
					// AQLExecutor.g:63:4: aggregate
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_aggregate_in_aqlStatement163);
					aggregate();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 9 :
					// AQLExecutor.g:64:4: show
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_show_in_aqlStatement171);
					show();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 10 :
					// AQLExecutor.g:65:4: desc
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_desc_in_aqlStatement181);
					desc();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 11 :
					// AQLExecutor.g:66:4: stat
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_stat_in_aqlStatement191);
					stat();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 12 :
					// AQLExecutor.g:67:4: set
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_set_in_aqlStatement200);
					set();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 13 :
					// AQLExecutor.g:68:4: get
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_get_in_aqlStatement211);
					get();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 14 :
					// AQLExecutor.g:69:4: run
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_run_in_aqlStatement222);
					run();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 15 :
					// AQLExecutor.g:70:4: kill_query
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_kill_query_in_aqlStatement233);
					kill_query();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 16 :
					// AQLExecutor.g:71:4: kill_scan
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_kill_scan_in_aqlStatement241);
					kill_scan();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 17 :
					// AQLExecutor.g:72:4: quit
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_quit_in_aqlStatement249);
					quit();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 18 :
					// AQLExecutor.g:73:4: help
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_help_in_aqlStatement259);
					help();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 19 :
					// AQLExecutor.g:74:5: print
					{
					if ( state.backtracking==0 ) {reportStatement(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
					pushFollow(FOLLOW_print_in_aqlStatement270);
					print();
					state._fsp--;
					if (state.failed) return retval;
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



	// $ANTLR start "create"
	// AQLExecutor.g:83:1: create : ^( CREATE index_name nameSet bin indexType ) ;
	public final void create() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope nameSet1 =null;
		TreeRuleReturnScope index_name2 =null;
		TreeRuleReturnScope bin3 =null;
		TreeRuleReturnScope indexType4 =null;

		try {
			// AQLExecutor.g:84:2: ( ^( CREATE index_name nameSet bin indexType ) )
			// AQLExecutor.g:84:4: ^( CREATE index_name nameSet bin indexType )
			{
			match(input,CREATE,FOLLOW_CREATE_in_create290); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_index_name_in_create292);
			index_name2=index_name();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_create294);
			nameSet1=nameSet();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_bin_in_create296);
			bin3=bin();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_indexType_in_create298);
			indexType4=indexType();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {createIndex( (nameSet1!=null?((AQLExecutor.nameSet_return)nameSet1).nameSpace:null), (nameSet1!=null?((AQLExecutor.nameSet_return)nameSet1).setName:null), (index_name2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name2.start),input.getTreeAdaptor().getTokenStopIndex(index_name2.start))):null), (bin3!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(bin3.start),input.getTreeAdaptor().getTokenStopIndex(bin3.start))):null), (indexType4!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(indexType4.start),input.getTreeAdaptor().getTokenStopIndex(indexType4.start))):null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "create"



	// $ANTLR start "drop"
	// AQLExecutor.g:88:1: drop : ^( DROP ( ^( INDEX index_name ins= nameSet ) | ^( MODULE moduleName ) | ^( SET sns= nameSet ) ) ) ;
	public final void drop() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope ins =null;
		TreeRuleReturnScope sns =null;
		TreeRuleReturnScope index_name5 =null;
		TreeRuleReturnScope moduleName6 =null;

		try {
			// AQLExecutor.g:89:2: ( ^( DROP ( ^( INDEX index_name ins= nameSet ) | ^( MODULE moduleName ) | ^( SET sns= nameSet ) ) ) )
			// AQLExecutor.g:89:4: ^( DROP ( ^( INDEX index_name ins= nameSet ) | ^( MODULE moduleName ) | ^( SET sns= nameSet ) ) )
			{
			match(input,DROP,FOLLOW_DROP_in_drop320); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// AQLExecutor.g:90:4: ( ^( INDEX index_name ins= nameSet ) | ^( MODULE moduleName ) | ^( SET sns= nameSet ) )
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
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// AQLExecutor.g:91:6: ^( INDEX index_name ins= nameSet )
					{
					match(input,INDEX,FOLLOW_INDEX_in_drop334); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_index_name_in_drop336);
					index_name5=index_name();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_nameSet_in_drop340);
					ins=nameSet();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { dropIndex((index_name5!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name5.start),input.getTreeAdaptor().getTokenStopIndex(index_name5.start))):null), (ins!=null?((AQLExecutor.nameSet_return)ins).nameSpace:null), (ins!=null?((AQLExecutor.nameSet_return)ins).setName:null));}
					}
					break;
				case 2 :
					// AQLExecutor.g:92:6: ^( MODULE moduleName )
					{
					match(input,MODULE,FOLLOW_MODULE_in_drop351); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_moduleName_in_drop353);
					moduleName6=moduleName();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { removePackage((moduleName6!=null?((AQLExecutor.moduleName_return)moduleName6).value:null));}
					}
					break;
				case 3 :
					// AQLExecutor.g:93:6: ^( SET sns= nameSet )
					{
					match(input,SET,FOLLOW_SET_in_drop365); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_nameSet_in_drop369);
					sns=nameSet();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {dropSet((sns!=null?((AQLExecutor.nameSet_return)sns).nameSpace:null), (sns!=null?((AQLExecutor.nameSet_return)sns).setName:null));}
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "drop"


	public static class indexType_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "indexType"
	// AQLExecutor.g:97:1: indexType : ( NUMERIC | STRING );
	public final AQLExecutor.indexType_return indexType() throws RecognitionException {
		AQLExecutor.indexType_return retval = new AQLExecutor.indexType_return();
		retval.start = input.LT(1);

		try {
			// AQLExecutor.g:98:2: ( NUMERIC | STRING )
			// AQLExecutor.g:
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



	// $ANTLR start "insert"
	// AQLExecutor.g:109:1: insert : ^( INSERT nameSet primaryKey binNames= binNameList binValues= valueList ) ;
	public final void insert() throws AerospikeException, RecognitionException {
		List<String> binNames =null;
		List<Value> binValues =null;
		TreeRuleReturnScope nameSet7 =null;
		String primaryKey8 =null;

		try {
			// AQLExecutor.g:110:2: ( ^( INSERT nameSet primaryKey binNames= binNameList binValues= valueList ) )
			// AQLExecutor.g:110:4: ^( INSERT nameSet primaryKey binNames= binNameList binValues= valueList )
			{
			match(input,INSERT,FOLLOW_INSERT_in_insert415); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_insert417);
			nameSet7=nameSet();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_primaryKey_in_insert419);
			primaryKey8=primaryKey();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_binNameList_in_insert423);
			binNames=binNameList();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_valueList_in_insert427);
			binValues=valueList();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) { insertRecord((nameSet7!=null?((AQLExecutor.nameSet_return)nameSet7).nameSpace:null), (nameSet7!=null?((AQLExecutor.nameSet_return)nameSet7).setName:null), primaryKey8, binNames, binValues);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "insert"



	// $ANTLR start "delete"
	// AQLExecutor.g:114:1: delete : ^( DELETE ns= nameSet pk= primaryKey ) ;
	public final void delete() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope ns =null;
		String pk =null;

		try {
			// AQLExecutor.g:115:2: ( ^( DELETE ns= nameSet pk= primaryKey ) )
			// AQLExecutor.g:115:4: ^( DELETE ns= nameSet pk= primaryKey )
			{
			match(input,DELETE,FOLLOW_DELETE_in_delete449); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_delete453);
			ns=nameSet();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_primaryKey_in_delete457);
			pk=primaryKey();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) { deleteRecord((ns!=null?((AQLExecutor.nameSet_return)ns).nameSpace:null), (ns!=null?((AQLExecutor.nameSet_return)ns).setName:null), pk);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "delete"


	protected static class select_scope {
		String nameSpace;
		String setName;
		String key;
		Filter filter;
	}
	protected Stack<select_scope> select_stack = new Stack<select_scope>();


	// $ANTLR start "select"
	// AQLExecutor.g:128:1: select : ( ^( SELECT_ALL from ) | ^( SELECT_EXPLICIT binNames= binNameList from ) );
	public final void select() throws AerospikeException, RecognitionException {
		select_stack.push(new select_scope());
		List<String> binNames =null;

		try {
			// AQLExecutor.g:129:2: ( ^( SELECT_ALL from ) | ^( SELECT_EXPLICIT binNames= binNameList from ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==SELECT_ALL) ) {
				alt4=1;
			}
			else if ( (LA4_0==SELECT_EXPLICIT) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// AQLExecutor.g:129:4: ^( SELECT_ALL from )
					{
					match(input,SELECT_ALL,FOLLOW_SELECT_ALL_in_select484); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_from_in_select486);
					from();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {selectRecord(select_stack.peek().nameSpace, select_stack.peek().setName, null, select_stack.peek().key, null);}
					}
					break;
				case 2 :
					// AQLExecutor.g:130:4: ^( SELECT_EXPLICIT binNames= binNameList from )
					{
					match(input,SELECT_EXPLICIT,FOLLOW_SELECT_EXPLICIT_in_select495); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_binNameList_in_select499);
					binNames=binNameList();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_from_in_select501);
					from();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {selectRecord(select_stack.peek().nameSpace, select_stack.peek().setName, binNames, select_stack.peek().key, select_stack.peek().filter);}
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
	}
	// $ANTLR end "select"



	// $ANTLR start "from"
	// AQLExecutor.g:134:1: from : ^( FROM nameSet ( ^( WHERE expressions[$nameSet.nameSpace, $nameSet.setName] ) )? ) ;
	public final void from() throws RecognitionException {
		TreeRuleReturnScope nameSet9 =null;
		Filter expressions10 =null;

		try {
			// AQLExecutor.g:135:2: ( ^( FROM nameSet ( ^( WHERE expressions[$nameSet.nameSpace, $nameSet.setName] ) )? ) )
			// AQLExecutor.g:135:4: ^( FROM nameSet ( ^( WHERE expressions[$nameSet.nameSpace, $nameSet.setName] ) )? )
			{
			match(input,FROM,FOLLOW_FROM_in_from520); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_from522);
			nameSet9=nameSet();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {select_stack.peek().nameSpace = (nameSet9!=null?((AQLExecutor.nameSet_return)nameSet9).nameSpace:null); select_stack.peek().setName = (nameSet9!=null?((AQLExecutor.nameSet_return)nameSet9).setName:null); }
			// AQLExecutor.g:136:3: ( ^( WHERE expressions[$nameSet.nameSpace, $nameSet.setName] ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WHERE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// AQLExecutor.g:136:4: ^( WHERE expressions[$nameSet.nameSpace, $nameSet.setName] )
					{
					match(input,WHERE,FOLLOW_WHERE_in_from531); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_expressions_in_from533);
					expressions10=expressions((nameSet9!=null?((AQLExecutor.nameSet_return)nameSet9).nameSpace:null), (nameSet9!=null?((AQLExecutor.nameSet_return)nameSet9).setName:null));
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {select_stack.peek().filter = expressions10;}
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "from"



	// $ANTLR start "orderby"
	// AQLExecutor.g:138:1: orderby : ( order )+ ;
	public final void orderby() throws RecognitionException {
		try {
			// AQLExecutor.g:139:2: ( ( order )+ )
			// AQLExecutor.g:139:4: ( order )+
			{
			// AQLExecutor.g:139:4: ( order )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DESC||LA6_0==ASC) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// AQLExecutor.g:139:4: order
					{
					pushFollow(FOLLOW_order_in_orderby551);
					order();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
	}
	// $ANTLR end "orderby"



	// $ANTLR start "order"
	// AQLExecutor.g:142:1: order : ( ^( ASC bin ) | ^( DESC bin ) );
	public final void order() throws RecognitionException {
		try {
			// AQLExecutor.g:143:2: ( ^( ASC bin ) | ^( DESC bin ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASC) ) {
				alt7=1;
			}
			else if ( (LA7_0==DESC) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// AQLExecutor.g:143:4: ^( ASC bin )
					{
					match(input,ASC,FOLLOW_ASC_in_order565); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_bin_in_order567);
					bin();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// AQLExecutor.g:144:4: ^( DESC bin )
					{
					match(input,DESC,FOLLOW_DESC_in_order575); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_bin_in_order577);
					bin();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

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
	}
	// $ANTLR end "order"



	// $ANTLR start "expressions"
	// AQLExecutor.g:147:1: expressions[String nameSpace, String setName] returns [Filter fil] : ( ^( PK value ) | ^( FILTERS filter ) );
	public final Filter expressions(String nameSpace, String setName) throws RecognitionException {
		Filter fil = null;


		TreeRuleReturnScope value11 =null;
		Filter filter12 =null;

		try {
			// AQLExecutor.g:148:2: ( ^( PK value ) | ^( FILTERS filter ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==PK) ) {
				alt8=1;
			}
			else if ( (LA8_0==FILTERS) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return fil;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// AQLExecutor.g:148:4: ^( PK value )
					{
					match(input,PK,FOLLOW_PK_in_expressions597); if (state.failed) return fil;
					match(input, Token.DOWN, null); if (state.failed) return fil;
					pushFollow(FOLLOW_value_in_expressions599);
					value11=value();
					state._fsp--;
					if (state.failed) return fil;
					if ( state.backtracking==0 ) {select_stack.peek().key = (value11!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value11.start),input.getTreeAdaptor().getTokenStopIndex(value11.start))):null);}
					match(input, Token.UP, null); if (state.failed) return fil;

					}
					break;
				case 2 :
					// AQLExecutor.g:149:4: ^( FILTERS filter )
					{
					match(input,FILTERS,FOLLOW_FILTERS_in_expressions609); if (state.failed) return fil;
					match(input, Token.DOWN, null); if (state.failed) return fil;
					pushFollow(FOLLOW_filter_in_expressions611);
					filter12=filter();
					state._fsp--;
					if (state.failed) return fil;
					if ( state.backtracking==0 ) {fil = filter12;}
					match(input, Token.UP, null); if (state.failed) return fil;

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
		return fil;
	}
	// $ANTLR end "expressions"



	// $ANTLR start "filter"
	// AQLExecutor.g:151:1: filter returns [Filter filter] : ( ^( EQ bin value ) | ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL ) | ^( BETWEEN b2= bin lowF= function highF= function ) );
	public final Filter filter() throws RecognitionException {
		Filter filter = null;


		CommonTree low=null;
		CommonTree high=null;
		TreeRuleReturnScope b2 =null;
		TreeRuleReturnScope bin13 =null;
		TreeRuleReturnScope value14 =null;

		try {
			// AQLExecutor.g:152:2: ( ^( EQ bin value ) | ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL ) | ^( BETWEEN b2= bin lowF= function highF= function ) )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==EQ) ) {
				alt9=1;
			}
			else if ( (LA9_0==BETWEEN) ) {
				int LA9_2 = input.LA(2);
				if ( (LA9_2==DOWN) ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3==IDENTIFIER) ) {
						int LA9_4 = input.LA(4);
						if ( (LA9_4==INTLITERAL) ) {
							alt9=2;
						}
						else if ( (LA9_4==FUNCTION) ) {
							alt9=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return filter;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return filter;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return filter;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return filter;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// AQLExecutor.g:152:4: ^( EQ bin value )
					{
					match(input,EQ,FOLLOW_EQ_in_filter630); if (state.failed) return filter;
					match(input, Token.DOWN, null); if (state.failed) return filter;
					pushFollow(FOLLOW_bin_in_filter632);
					bin13=bin();
					state._fsp--;
					if (state.failed) return filter;
					pushFollow(FOLLOW_value_in_filter634);
					value14=value();
					state._fsp--;
					if (state.failed) return filter;
					match(input, Token.UP, null); if (state.failed) return filter;

					if ( state.backtracking==0 ) {filter = Filter.equal((bin13!=null?((AQLExecutor.bin_return)bin13).name:null), (value14!=null?((AQLExecutor.value_return)value14).asValue:null));}
					}
					break;
				case 2 :
					// AQLExecutor.g:153:4: ^( BETWEEN b2= bin low= INTLITERAL high= INTLITERAL )
					{
					match(input,BETWEEN,FOLLOW_BETWEEN_in_filter643); if (state.failed) return filter;
					match(input, Token.DOWN, null); if (state.failed) return filter;
					pushFollow(FOLLOW_bin_in_filter647);
					b2=bin();
					state._fsp--;
					if (state.failed) return filter;
					low=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter651); if (state.failed) return filter;
					high=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_filter655); if (state.failed) return filter;
					match(input, Token.UP, null); if (state.failed) return filter;

					if ( state.backtracking==0 ) {filter = Filter.range((b2!=null?((AQLExecutor.bin_return)b2).name:null), Value.get(Long.parseLong((low!=null?low.getText():null))), Value.get(Long.parseLong((high!=null?high.getText():null))));}
					}
					break;
				case 3 :
					// AQLExecutor.g:154:5: ^( BETWEEN b2= bin lowF= function highF= function )
					{
					match(input,BETWEEN,FOLLOW_BETWEEN_in_filter666); if (state.failed) return filter;
					match(input, Token.DOWN, null); if (state.failed) return filter;
					pushFollow(FOLLOW_bin_in_filter670);
					b2=bin();
					state._fsp--;
					if (state.failed) return filter;
					pushFollow(FOLLOW_function_in_filter674);
					function();
					state._fsp--;
					if (state.failed) return filter;
					pushFollow(FOLLOW_function_in_filter678);
					function();
					state._fsp--;
					if (state.failed) return filter;
					match(input, Token.UP, null); if (state.failed) return filter;

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
		return filter;
	}
	// $ANTLR end "filter"



	// $ANTLR start "function"
	// AQLExecutor.g:156:1: function : ^( FUNCTION id= IDENTIFIER value ) ;
	public final void function() throws RecognitionException {
		CommonTree id=null;

		try {
			// AQLExecutor.g:157:3: ( ^( FUNCTION id= IDENTIFIER value ) )
			// AQLExecutor.g:157:5: ^( FUNCTION id= IDENTIFIER value )
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_function692); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function696); if (state.failed) return;
			pushFollow(FOLLOW_value_in_function698);
			value();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "binNameList"
	// AQLExecutor.g:160:1: binNameList returns [List<String> bins] : ^( BIN_NAMES ( bin )+ ) ;
	public final List<String> binNameList() throws RecognitionException {
		List<String> bins = null;


		TreeRuleReturnScope bin15 =null;


			bins = new ArrayList<String>();

		try {
			// AQLExecutor.g:164:2: ( ^( BIN_NAMES ( bin )+ ) )
			// AQLExecutor.g:164:4: ^( BIN_NAMES ( bin )+ )
			{
			match(input,BIN_NAMES,FOLLOW_BIN_NAMES_in_binNameList722); if (state.failed) return bins;
			match(input, Token.DOWN, null); if (state.failed) return bins;
			// AQLExecutor.g:164:16: ( bin )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==IDENTIFIER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// AQLExecutor.g:164:17: bin
					{
					pushFollow(FOLLOW_bin_in_binNameList725);
					bin15=bin();
					state._fsp--;
					if (state.failed) return bins;
					if ( state.backtracking==0 ) {bins.add((bin15!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(bin15.start),input.getTreeAdaptor().getTokenStopIndex(bin15.start))):null));}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return bins;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input, Token.UP, null); if (state.failed) return bins;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return bins;
	}
	// $ANTLR end "binNameList"



	// $ANTLR start "valueList"
	// AQLExecutor.g:167:1: valueList returns [List<Value> list] : ^( VALUES ( value )+ ) ;
	public final List<Value> valueList() throws RecognitionException {
		List<Value> list = null;


		TreeRuleReturnScope value16 =null;


			list = new ArrayList<Value>();

		try {
			// AQLExecutor.g:171:2: ( ^( VALUES ( value )+ ) )
			// AQLExecutor.g:171:4: ^( VALUES ( value )+ )
			{
			match(input,VALUES,FOLLOW_VALUES_in_valueList752); if (state.failed) return list;
			match(input, Token.DOWN, null); if (state.failed) return list;
			// AQLExecutor.g:171:13: ( value )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INTLITERAL||LA11_0==STRINGLITERAL) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// AQLExecutor.g:171:14: value
					{
					pushFollow(FOLLOW_value_in_valueList755);
					value16=value();
					state._fsp--;
					if (state.failed) return list;
					if ( state.backtracking==0 ) {list.add((value16!=null?((AQLExecutor.value_return)value16).asValue:null));}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return list;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input, Token.UP, null); if (state.failed) return list;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "valueList"


	public static class nameSet_return extends TreeRuleReturnScope {
		public String nameSpace;
		public String setName;
	};


	// $ANTLR start "nameSet"
	// AQLExecutor.g:175:1: nameSet returns [String nameSpace, String setName] : ^( NAMESET namespace_name ( set_name )? ) ;
	public final AQLExecutor.nameSet_return nameSet() throws RecognitionException {
		AQLExecutor.nameSet_return retval = new AQLExecutor.nameSet_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope namespace_name17 =null;
		TreeRuleReturnScope set_name18 =null;

		try {
			// AQLExecutor.g:176:2: ( ^( NAMESET namespace_name ( set_name )? ) )
			// AQLExecutor.g:176:4: ^( NAMESET namespace_name ( set_name )? )
			{
			match(input,NAMESET,FOLLOW_NAMESET_in_nameSet778); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_namespace_name_in_nameSet780);
			namespace_name17=namespace_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.nameSpace =(namespace_name17!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(namespace_name17.start),input.getTreeAdaptor().getTokenStopIndex(namespace_name17.start))):null);}
			// AQLExecutor.g:176:64: ( set_name )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENTIFIER) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// AQLExecutor.g:176:64: set_name
					{
					pushFollow(FOLLOW_set_name_in_nameSet784);
					set_name18=set_name();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			if ( state.backtracking==0 ) {retval.setName =(set_name18!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(set_name18.start),input.getTreeAdaptor().getTokenStopIndex(set_name18.start))):null);}
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



	// $ANTLR start "registerPackage"
	// AQLExecutor.g:192:1: registerPackage : ^( REGISTER p= STRINGLITERAL ) ;
	public final void registerPackage() throws AerospikeException, RecognitionException {
		CommonTree p=null;

		try {
			// AQLExecutor.g:193:2: ( ^( REGISTER p= STRINGLITERAL ) )
			// AQLExecutor.g:193:4: ^( REGISTER p= STRINGLITERAL )
			{
			match(input,REGISTER,FOLLOW_REGISTER_in_registerPackage809); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			p=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_registerPackage813); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) { registerPackage((p!=null?p.getText():null)); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "registerPackage"



	// $ANTLR start "removePackage"
	// AQLExecutor.g:197:1: removePackage : ^( REMOVE IDENTIFIER ) ;
	public final void removePackage() throws AerospikeException, RecognitionException {
		CommonTree IDENTIFIER19=null;

		try {
			// AQLExecutor.g:198:2: ( ^( REMOVE IDENTIFIER ) )
			// AQLExecutor.g:198:4: ^( REMOVE IDENTIFIER )
			{
			match(input,REMOVE,FOLLOW_REMOVE_in_removePackage833); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			IDENTIFIER19=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_removePackage835); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) { removePackage((IDENTIFIER19!=null?IDENTIFIER19.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "removePackage"



	// $ANTLR start "execute"
	// AQLExecutor.g:203:1: execute : ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? ) ;
	public final void execute() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope packageFunction20 =null;
		TreeRuleReturnScope nameSet21 =null;
		String primaryKey22 =null;
		List<Value> valueList23 =null;

		try {
			// AQLExecutor.g:204:2: ( ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? ) )
			// AQLExecutor.g:204:4: ^( EXECUTE nameSet packageFunction ( primaryKey )? ( valueList )? )
			{
			match(input,EXECUTE,FOLLOW_EXECUTE_in_execute861); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_execute863);
			nameSet21=nameSet();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_packageFunction_in_execute865);
			packageFunction20=packageFunction();
			state._fsp--;
			if (state.failed) return;
			// AQLExecutor.g:204:38: ( primaryKey )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==PK) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// AQLExecutor.g:204:38: primaryKey
					{
					pushFollow(FOLLOW_primaryKey_in_execute867);
					primaryKey22=primaryKey();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// AQLExecutor.g:204:50: ( valueList )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==VALUES) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// AQLExecutor.g:204:50: valueList
					{
					pushFollow(FOLLOW_valueList_in_execute870);
					valueList23=valueList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
					
				// TODO Execute with query - AKA scan UDF
				
					executeRecordUDF((packageFunction20!=null?((AQLExecutor.packageFunction_return)packageFunction20).packageName:null), (packageFunction20!=null?((AQLExecutor.packageFunction_return)packageFunction20).functionName:null), 
					  (nameSet21!=null?((AQLExecutor.nameSet_return)nameSet21).nameSpace:null), (nameSet21!=null?((AQLExecutor.nameSet_return)nameSet21).setName:null), 
					  primaryKey22, valueList23);
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
	}
	// $ANTLR end "execute"



	// $ANTLR start "aggregate"
	// AQLExecutor.g:218:1: aggregate : ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? ) ;
	public final void aggregate() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope nameSet24 =null;
		TreeRuleReturnScope packageFunction25 =null;
		List<Value> valueList26 =null;
		Filter expressions27 =null;

		try {
			// AQLExecutor.g:219:2: ( ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? ) )
			// AQLExecutor.g:219:4: ^( AGGREGATE nameSet packageFunction ( expressions[$nameSet.nameSpace, $nameSet.setName] )? ( valueList )? )
			{
			match(input,AGGREGATE,FOLLOW_AGGREGATE_in_aggregate896); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_nameSet_in_aggregate898);
			nameSet24=nameSet();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_packageFunction_in_aggregate900);
			packageFunction25=packageFunction();
			state._fsp--;
			if (state.failed) return;
			// AQLExecutor.g:219:40: ( expressions[$nameSet.nameSpace, $nameSet.setName] )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FILTERS||LA15_0==PK) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// AQLExecutor.g:219:40: expressions[$nameSet.nameSpace, $nameSet.setName]
					{
					pushFollow(FOLLOW_expressions_in_aggregate902);
					expressions27=expressions((nameSet24!=null?((AQLExecutor.nameSet_return)nameSet24).nameSpace:null), (nameSet24!=null?((AQLExecutor.nameSet_return)nameSet24).setName:null));
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// AQLExecutor.g:219:91: ( valueList )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==VALUES) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// AQLExecutor.g:219:91: valueList
					{
					pushFollow(FOLLOW_valueList_in_aggregate906);
					valueList26=valueList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
				executeAggregation((nameSet24!=null?((AQLExecutor.nameSet_return)nameSet24).nameSpace:null), (nameSet24!=null?((AQLExecutor.nameSet_return)nameSet24).setName:null), (packageFunction25!=null?((AQLExecutor.packageFunction_return)packageFunction25).packageName:null), (packageFunction25!=null?((AQLExecutor.packageFunction_return)packageFunction25).functionName:null), 
				  valueList26,  
				  expressions27);
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
	}
	// $ANTLR end "aggregate"


	public static class packageFunction_return extends TreeRuleReturnScope {
		public String packageName;
		public String functionName;
	};


	// $ANTLR start "packageFunction"
	// AQLExecutor.g:228:1: packageFunction returns [String packageName, String functionName] : p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE ) ;
	public final AQLExecutor.packageFunction_return packageFunction() throws RecognitionException {
		AQLExecutor.packageFunction_return retval = new AQLExecutor.packageFunction_return();
		retval.start = input.LT(1);

		CommonTree p=null;
		CommonTree f=null;

		try {
			// AQLExecutor.g:229:2: (p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE ) )
			// AQLExecutor.g:229:4: p= IDENTIFIER '.' f= ( IDENTIFIER | SCAN | GET | REMOVE )
			{
			p=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_packageFunction930); if (state.failed) return retval;
			match(input,88,FOLLOW_88_in_packageFunction932); if (state.failed) return retval;
			f=(CommonTree)input.LT(1);
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



	// $ANTLR start "show"
	// AQLExecutor.g:250:1: show : ( ^( SHOW INDEXES nameSet ) | ^( SHOW MODULES ) | ^( SHOW PACKAGES ) | ^( SHOW NAMESPACES ) | ^( SHOW SETS ) | ^( SHOW BINS ) | ^( SHOW SCANS ) | ^( SHOW QUERIES ) );
	public final void show() throws AerospikeException, RecognitionException {
		try {
			// AQLExecutor.g:251:2: ( ^( SHOW INDEXES nameSet ) | ^( SHOW MODULES ) | ^( SHOW PACKAGES ) | ^( SHOW NAMESPACES ) | ^( SHOW SETS ) | ^( SHOW BINS ) | ^( SHOW SCANS ) | ^( SHOW QUERIES ) )
			int alt17=8;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==SHOW) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case INDEXES:
						{
						alt17=1;
						}
						break;
					case MODULES:
						{
						alt17=2;
						}
						break;
					case PACKAGES:
						{
						alt17=3;
						}
						break;
					case NAMESPACES:
						{
						alt17=4;
						}
						break;
					case SETS:
						{
						alt17=5;
						}
						break;
					case BINS:
						{
						alt17=6;
						}
						break;
					case SCANS:
						{
						alt17=7;
						}
						break;
					case QUERIES:
						{
						alt17=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// AQLExecutor.g:251:4: ^( SHOW INDEXES nameSet )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show971); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,INDEXES,FOLLOW_INDEXES_in_show973); if (state.failed) return;
					pushFollow(FOLLOW_nameSet_in_show975);
					nameSet();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {showIndexes();}
					}
					break;
				case 2 :
					// AQLExecutor.g:252:4: ^( SHOW MODULES )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show984); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,MODULES,FOLLOW_MODULES_in_show986); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {showPackages();}
					}
					break;
				case 3 :
					// AQLExecutor.g:253:5: ^( SHOW PACKAGES )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show998); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,PACKAGES,FOLLOW_PACKAGES_in_show1000); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {showPackages();}
					}
					break;
				case 4 :
					// AQLExecutor.g:254:4: ^( SHOW NAMESPACES )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show1012); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,NAMESPACES,FOLLOW_NAMESPACES_in_show1014); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { showNameSpaces(); }
					}
					break;
				case 5 :
					// AQLExecutor.g:255:4: ^( SHOW SETS )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show1023); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,SETS,FOLLOW_SETS_in_show1025); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { showSets(); }
					}
					break;
				case 6 :
					// AQLExecutor.g:256:4: ^( SHOW BINS )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show1034); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,BINS,FOLLOW_BINS_in_show1036); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { showBins();}
					}
					break;
				case 7 :
					// AQLExecutor.g:257:4: ^( SHOW SCANS )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show1050); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,SCANS,FOLLOW_SCANS_in_show1052); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { showScans(); }
					}
					break;
				case 8 :
					// AQLExecutor.g:258:4: ^( SHOW QUERIES )
					{
					match(input,SHOW,FOLLOW_SHOW_in_show1067); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,QUERIES,FOLLOW_QUERIES_in_show1069); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { showQueries();}
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
	}
	// $ANTLR end "show"



	// $ANTLR start "desc"
	// AQLExecutor.g:263:1: desc : ( ^( DESC ^( MODULE moduleName ) ) | ^( DESC ^( INDEX namespace_name index_name ) ) );
	public final void desc() throws AerospikeException, RecognitionException {
		TreeRuleReturnScope moduleName28 =null;
		TreeRuleReturnScope namespace_name29 =null;
		TreeRuleReturnScope index_name30 =null;

		try {
			// AQLExecutor.g:264:2: ( ^( DESC ^( MODULE moduleName ) ) | ^( DESC ^( INDEX namespace_name index_name ) ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DESC) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==MODULE) ) {
						alt18=1;
					}
					else if ( (LA18_2==INDEX) ) {
						alt18=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// AQLExecutor.g:264:4: ^( DESC ^( MODULE moduleName ) )
					{
					match(input,DESC,FOLLOW_DESC_in_desc1094); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,MODULE,FOLLOW_MODULE_in_desc1097); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_moduleName_in_desc1099);
					moduleName28=moduleName();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) { describeModule((moduleName28!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(moduleName28.start),input.getTreeAdaptor().getTokenStopIndex(moduleName28.start))):null));	}
					}
					break;
				case 2 :
					// AQLExecutor.g:265:4: ^( DESC ^( INDEX namespace_name index_name ) )
					{
					match(input,DESC,FOLLOW_DESC_in_desc1109); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,INDEX,FOLLOW_INDEX_in_desc1112); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_namespace_name_in_desc1114);
					namespace_name29=namespace_name();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_index_name_in_desc1116);
					index_name30=index_name();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {describeIndex((namespace_name29!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(namespace_name29.start),input.getTreeAdaptor().getTokenStopIndex(namespace_name29.start))):null), (index_name30!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index_name30.start),input.getTreeAdaptor().getTokenStopIndex(index_name30.start))):null));}
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
	}
	// $ANTLR end "desc"



	// $ANTLR start "stat"
	// AQLExecutor.g:271:1: stat : ( ^( STAT ^( INDEX namespace_name index_name ) ) | ^( STAT QUERY ) | ^( STAT SYSTEM ) );
	public final void stat() throws AerospikeException, RecognitionException {
		try {
			// AQLExecutor.g:272:2: ( ^( STAT ^( INDEX namespace_name index_name ) ) | ^( STAT QUERY ) | ^( STAT SYSTEM ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==STAT) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case INDEX:
						{
						alt19=1;
						}
						break;
					case QUERY:
						{
						alt19=2;
						}
						break;
					case SYSTEM:
						{
						alt19=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
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
					if (state.backtracking>0) {state.failed=true; return;}
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
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// AQLExecutor.g:272:4: ^( STAT ^( INDEX namespace_name index_name ) )
					{
					match(input,STAT,FOLLOW_STAT_in_stat1140); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,INDEX,FOLLOW_INDEX_in_stat1143); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_namespace_name_in_stat1145);
					namespace_name();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_index_name_in_stat1147);
					index_name();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 2 :
					// AQLExecutor.g:273:4: ^( STAT QUERY )
					{
					match(input,STAT,FOLLOW_STAT_in_stat1155); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,QUERY,FOLLOW_QUERY_in_stat1157); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {printInfo("Query statistics", info("query-stat"));}
					}
					break;
				case 3 :
					// AQLExecutor.g:274:4: ^( STAT SYSTEM )
					{
					match(input,STAT,FOLLOW_STAT_in_stat1166); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,SYSTEM,FOLLOW_SYSTEM_in_stat1168); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {printInfo("Statistics", info("statistics"));}
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
	}
	// $ANTLR end "stat"



	// $ANTLR start "set"
	// AQLExecutor.g:299:1: set : ( ^( SET ^( TIMEOUT timeOut= INTLITERAL ) ) | ^( SET ^( VERBOSE verboseOn= booleanLiteral ) ) | ^( SET ^( ECHO echoOn= booleanLiteral ) ) | ^( SET ^( RECORD_TTL ttl= INTLITERAL ) ) | ^( SET ^( VIEW viewType ) ) | ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) ) | ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) ) );
	public final void set() throws RecognitionException {
		CommonTree timeOut=null;
		CommonTree ttl=null;
		CommonTree luaUserPath=null;
		CommonTree luaSysPath=null;

		try {
			// AQLExecutor.g:300:2: ( ^( SET ^( TIMEOUT timeOut= INTLITERAL ) ) | ^( SET ^( VERBOSE verboseOn= booleanLiteral ) ) | ^( SET ^( ECHO echoOn= booleanLiteral ) ) | ^( SET ^( RECORD_TTL ttl= INTLITERAL ) ) | ^( SET ^( VIEW viewType ) ) | ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) ) | ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) ) )
			int alt20=7;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==SET) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case TIMEOUT:
						{
						alt20=1;
						}
						break;
					case VERBOSE:
						{
						alt20=2;
						}
						break;
					case ECHO:
						{
						alt20=3;
						}
						break;
					case RECORD_TTL:
						{
						alt20=4;
						}
						break;
					case VIEW:
						{
						alt20=5;
						}
						break;
					case LUA_USER_PATH:
						{
						alt20=6;
						}
						break;
					case LUA_SYSTEM_PATH:
						{
						alt20=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
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
					if (state.backtracking>0) {state.failed=true; return;}
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
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// AQLExecutor.g:300:4: ^( SET ^( TIMEOUT timeOut= INTLITERAL ) )
					{
					match(input,SET,FOLLOW_SET_in_set1186); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,TIMEOUT,FOLLOW_TIMEOUT_in_set1189); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					timeOut=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set1193); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
						this.policy.timeout = Integer.parseInt((timeOut!=null?timeOut.getText():null));
						this.writePolicy.timeout = Integer.parseInt((timeOut!=null?timeOut.getText():null));
						}
					}
					break;
				case 2 :
					// AQLExecutor.g:305:4: ^( SET ^( VERBOSE verboseOn= booleanLiteral ) )
					{
					match(input,SET,FOLLOW_SET_in_set1205); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,VERBOSE,FOLLOW_VERBOSE_in_set1208); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_booleanLiteral_in_set1212);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// AQLExecutor.g:306:4: ^( SET ^( ECHO echoOn= booleanLiteral ) )
					{
					match(input,SET,FOLLOW_SET_in_set1220); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ECHO,FOLLOW_ECHO_in_set1223); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_booleanLiteral_in_set1227);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// AQLExecutor.g:307:4: ^( SET ^( RECORD_TTL ttl= INTLITERAL ) )
					{
					match(input,SET,FOLLOW_SET_in_set1235); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_set1238); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					ttl=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_set1242); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {this.writePolicy.expiration = Integer.parseInt((ttl!=null?ttl.getText():null));}
					}
					break;
				case 5 :
					// AQLExecutor.g:308:4: ^( SET ^( VIEW viewType ) )
					{
					match(input,SET,FOLLOW_SET_in_set1252); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,VIEW,FOLLOW_VIEW_in_set1255); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					pushFollow(FOLLOW_viewType_in_set1257);
					viewType();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// AQLExecutor.g:309:4: ^( SET ^( LUA_USER_PATH luaUserPath= STRINGLITERAL ) )
					{
					match(input,SET,FOLLOW_SET_in_set1265); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_set1268); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					luaUserPath=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set1272); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {LuaConfig.SourceDirectory = removeQuotes((luaUserPath!=null?luaUserPath.getText():null)); }
					}
					break;
				case 7 :
					// AQLExecutor.g:310:4: ^( SET ^( LUA_SYSTEM_PATH luaSysPath= STRINGLITERAL ) )
					{
					match(input,SET,FOLLOW_SET_in_set1282); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_set1285); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					luaSysPath=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_set1289); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					match(input, Token.UP, null); if (state.failed) return;

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
	}
	// $ANTLR end "set"



	// $ANTLR start "get"
	// AQLExecutor.g:312:1: get : ( ^( GET TIMEOUT ) | ^( GET VERBOSE ) | ^( GET ECHO ) | ^( GET RECORD_TTL ) | ^( GET VIEW ) | ^( GET LUA_USER_PATH ) | ^( GET LUA_SYSTEM_PATH ) );
	public final void get() throws RecognitionException {
		try {
			// AQLExecutor.g:313:2: ( ^( GET TIMEOUT ) | ^( GET VERBOSE ) | ^( GET ECHO ) | ^( GET RECORD_TTL ) | ^( GET VIEW ) | ^( GET LUA_USER_PATH ) | ^( GET LUA_SYSTEM_PATH ) )
			int alt21=7;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==GET) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					switch ( input.LA(3) ) {
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
					case LUA_USER_PATH:
						{
						alt21=6;
						}
						break;
					case LUA_SYSTEM_PATH:
						{
						alt21=7;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
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
					if (state.backtracking>0) {state.failed=true; return;}
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
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// AQLExecutor.g:313:4: ^( GET TIMEOUT )
					{
					match(input,GET,FOLLOW_GET_in_get1302); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,TIMEOUT,FOLLOW_TIMEOUT_in_get1304); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
						this.resultReporter.report("Policy timeout: " + this.policy.timeout);
						this.resultReporter.report("Write policy timeout: " + this.writePolicy.timeout);
						}
					}
					break;
				case 2 :
					// AQLExecutor.g:318:4: ^( GET VERBOSE )
					{
					match(input,GET,FOLLOW_GET_in_get1314); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,VERBOSE,FOLLOW_VERBOSE_in_get1316); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 3 :
					// AQLExecutor.g:319:4: ^( GET ECHO )
					{
					match(input,GET,FOLLOW_GET_in_get1328); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,ECHO,FOLLOW_ECHO_in_get1330); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 4 :
					// AQLExecutor.g:320:4: ^( GET RECORD_TTL )
					{
					match(input,GET,FOLLOW_GET_in_get1344); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,RECORD_TTL,FOLLOW_RECORD_TTL_in_get1346); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {this.resultReporter.report("Write policy expiration: " + this.writePolicy.expiration);}
					}
					break;
				case 5 :
					// AQLExecutor.g:321:4: ^( GET VIEW )
					{
					match(input,GET,FOLLOW_GET_in_get1356); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,VIEW,FOLLOW_VIEW_in_get1358); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;
				case 6 :
					// AQLExecutor.g:322:4: ^( GET LUA_USER_PATH )
					{
					match(input,GET,FOLLOW_GET_in_get1372); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,LUA_USER_PATH,FOLLOW_LUA_USER_PATH_in_get1374); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {this.resultReporter.report("Lua source directory: " + LuaConfig.SourceDirectory);}
					}
					break;
				case 7 :
					// AQLExecutor.g:323:4: ^( GET LUA_SYSTEM_PATH )
					{
					match(input,GET,FOLLOW_GET_in_get1384); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					match(input,LUA_SYSTEM_PATH,FOLLOW_LUA_SYSTEM_PATH_in_get1386); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

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
	}
	// $ANTLR end "get"



	// $ANTLR start "run"
	// AQLExecutor.g:329:1: run : ^( RUN STRINGLITERAL ) ;
	public final void run() throws RecognitionException {
		try {
			// AQLExecutor.g:330:2: ( ^( RUN STRINGLITERAL ) )
			// AQLExecutor.g:330:4: ^( RUN STRINGLITERAL )
			{
			match(input,RUN,FOLLOW_RUN_in_run1403); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_run1405); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "run"



	// $ANTLR start "print"
	// AQLExecutor.g:332:1: print : ^( PRINT ( STRINGLITERAL )? ) ;
	public final void print() throws RecognitionException {
		CommonTree STRINGLITERAL31=null;

		try {
			// AQLExecutor.g:333:2: ( ^( PRINT ( STRINGLITERAL )? ) )
			// AQLExecutor.g:333:4: ^( PRINT ( STRINGLITERAL )? )
			{
			match(input,PRINT,FOLLOW_PRINT_in_print1417); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// AQLExecutor.g:333:12: ( STRINGLITERAL )?
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==STRINGLITERAL) ) {
					alt22=1;
				}
				switch (alt22) {
					case 1 :
						// AQLExecutor.g:333:12: STRINGLITERAL
						{
						STRINGLITERAL31=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_print1419); if (state.failed) return;
						}
						break;

				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			if ( state.backtracking==0 ) {
				this.resultReporter.report(removeQuotes((STRINGLITERAL31!=null?STRINGLITERAL31.getText():null)));
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
	}
	// $ANTLR end "print"



	// $ANTLR start "kill_query"
	// AQLExecutor.g:339:1: kill_query : ^( KILL_QUERY INTLITERAL ) ;
	public final void kill_query() throws AerospikeException, RecognitionException {
		CommonTree INTLITERAL32=null;

		try {
			// AQLExecutor.g:340:2: ( ^( KILL_QUERY INTLITERAL ) )
			// AQLExecutor.g:340:4: ^( KILL_QUERY INTLITERAL )
			{
			match(input,KILL_QUERY,FOLLOW_KILL_QUERY_in_kill_query1441); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			INTLITERAL32=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_query1443); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
				info("query-kill="+(INTLITERAL32!=null?INTLITERAL32.getText():null));
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
	}
	// $ANTLR end "kill_query"



	// $ANTLR start "kill_scan"
	// AQLExecutor.g:347:1: kill_scan : ^( KILL_SCAN INTLITERAL ) ;
	public final void kill_scan() throws AerospikeException, RecognitionException {
		CommonTree INTLITERAL33=null;

		try {
			// AQLExecutor.g:348:2: ( ^( KILL_SCAN INTLITERAL ) )
			// AQLExecutor.g:348:4: ^( KILL_SCAN INTLITERAL )
			{
			match(input,KILL_SCAN,FOLLOW_KILL_SCAN_in_kill_scan1464); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			INTLITERAL33=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_kill_scan1466); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
				info("scan-kill="+(INTLITERAL33!=null?INTLITERAL33.getText():null));
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
	}
	// $ANTLR end "kill_scan"



	// $ANTLR start "quit"
	// AQLExecutor.g:355:1: quit : ( QUIT | EXIT | 'q' );
	public final void quit() throws RecognitionException {
		try {
			// AQLExecutor.g:356:2: ( QUIT | EXIT | 'q' )
			int alt23=3;
			switch ( input.LA(1) ) {
			case QUIT:
				{
				alt23=1;
				}
				break;
			case EXIT:
				{
				alt23=2;
				}
				break;
			case 93:
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// AQLExecutor.g:356:4: QUIT
					{
					match(input,QUIT,FOLLOW_QUIT_in_quit1482); if (state.failed) return;
					}
					break;
				case 2 :
					// AQLExecutor.g:357:4: EXIT
					{
					match(input,EXIT,FOLLOW_EXIT_in_quit1488); if (state.failed) return;
					}
					break;
				case 3 :
					// AQLExecutor.g:358:4: 'q'
					{
					match(input,93,FOLLOW_93_in_quit1493); if (state.failed) return;
					if ( state.backtracking==0 ) {
						System.exit(0);
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
	}
	// $ANTLR end "quit"



	// $ANTLR start "help"
	// AQLExecutor.g:363:1: help : 'help' ;
	public final void help() throws RecognitionException {
		try {
			// AQLExecutor.g:364:2: ( 'help' )
			// AQLExecutor.g:364:4: 'help'
			{
			match(input,89,FOLLOW_89_in_help1506); if (state.failed) return;
			if ( state.backtracking==0 ) {printHelp();}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "help"



	// $ANTLR start "viewType"
	// AQLExecutor.g:367:1: viewType : ( 'json' | 'table' );
	public final void viewType() throws RecognitionException {
		try {
			// AQLExecutor.g:368:2: ( 'json' | 'table' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==90) ) {
				alt24=1;
			}
			else if ( (LA24_0==95) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// AQLExecutor.g:368:4: 'json'
					{
					match(input,90,FOLLOW_90_in_viewType1520); if (state.failed) return;
					if ( state.backtracking==0 ) {this.viewType = ExecutorParser.ViewType.JSON;}
					}
					break;
				case 2 :
					// AQLExecutor.g:369:3: 'table'
					{
					match(input,95,FOLLOW_95_in_viewType1526); if (state.failed) return;
					if ( state.backtracking==0 ) {this.viewType = ExecutorParser.ViewType.TABLE;}
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
	}
	// $ANTLR end "viewType"



	// $ANTLR start "primaryKey"
	// AQLExecutor.g:373:1: primaryKey returns [String value] : ^( PK STRINGLITERAL ) ;
	public final String primaryKey() throws RecognitionException {
		String value = null;


		CommonTree STRINGLITERAL34=null;

		try {
			// AQLExecutor.g:374:2: ( ^( PK STRINGLITERAL ) )
			// AQLExecutor.g:374:4: ^( PK STRINGLITERAL )
			{
			match(input,PK,FOLLOW_PK_in_primaryKey1545); if (state.failed) return value;
			match(input, Token.DOWN, null); if (state.failed) return value;
			STRINGLITERAL34=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_primaryKey1547); if (state.failed) return value;
			match(input, Token.UP, null); if (state.failed) return value;

			if ( state.backtracking==0 ) {value = (STRINGLITERAL34!=null?STRINGLITERAL34.getText():null).replace("'","\"");}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "primaryKey"



	// $ANTLR start "package_name"
	// AQLExecutor.g:377:1: package_name : IDENTIFIER ;
	public final void package_name() throws RecognitionException {
		try {
			// AQLExecutor.g:378:2: ( IDENTIFIER )
			// AQLExecutor.g:378:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_package_name1562); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_name"


	public static class index_name_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "index_name"
	// AQLExecutor.g:382:1: index_name : IDENTIFIER ;
	public final AQLExecutor.index_name_return index_name() throws RecognitionException {
		AQLExecutor.index_name_return retval = new AQLExecutor.index_name_return();
		retval.start = input.LT(1);

		try {
			// AQLExecutor.g:383:2: ( IDENTIFIER )
			// AQLExecutor.g:383:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_index_name1574); if (state.failed) return retval;
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
	};


	// $ANTLR start "namespace_name"
	// AQLExecutor.g:386:1: namespace_name : IDENTIFIER ;
	public final AQLExecutor.namespace_name_return namespace_name() throws RecognitionException {
		AQLExecutor.namespace_name_return retval = new AQLExecutor.namespace_name_return();
		retval.start = input.LT(1);

		try {
			// AQLExecutor.g:387:2: ( IDENTIFIER )
			// AQLExecutor.g:387:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace_name1586); if (state.failed) return retval;
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
	};


	// $ANTLR start "set_name"
	// AQLExecutor.g:390:1: set_name : IDENTIFIER ;
	public final AQLExecutor.set_name_return set_name() throws RecognitionException {
		AQLExecutor.set_name_return retval = new AQLExecutor.set_name_return();
		retval.start = input.LT(1);

		try {
			// AQLExecutor.g:391:2: ( IDENTIFIER )
			// AQLExecutor.g:391:4: IDENTIFIER
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_set_name1599); if (state.failed) return retval;
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
	};


	// $ANTLR start "bin"
	// AQLExecutor.g:394:1: bin returns [String name] : ident= IDENTIFIER ;
	public final AQLExecutor.bin_return bin() throws RecognitionException {
		AQLExecutor.bin_return retval = new AQLExecutor.bin_return();
		retval.start = input.LT(1);

		CommonTree ident=null;

		try {
			// AQLExecutor.g:395:2: (ident= IDENTIFIER )
			// AQLExecutor.g:395:4: ident= IDENTIFIER
			{
			ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bin1617); if (state.failed) return retval;
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
		public Value asValue;
	};


	// $ANTLR start "value"
	// AQLExecutor.g:399:1: value returns [Value asValue] : ( STRINGLITERAL | INTLITERAL );
	public final AQLExecutor.value_return value() throws RecognitionException {
		AQLExecutor.value_return retval = new AQLExecutor.value_return();
		retval.start = input.LT(1);

		CommonTree STRINGLITERAL35=null;
		CommonTree INTLITERAL36=null;

		try {
			// AQLExecutor.g:400:2: ( STRINGLITERAL | INTLITERAL )
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
					// AQLExecutor.g:400:4: STRINGLITERAL
					{
					STRINGLITERAL35=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_value1637); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.asValue = Value.get((STRINGLITERAL35!=null?STRINGLITERAL35.getText():null).replace("'", ""));}
					}
					break;
				case 2 :
					// AQLExecutor.g:401:4: INTLITERAL
					{
					INTLITERAL36=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_value1645); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.asValue = Value.get(Long.parseLong((INTLITERAL36!=null?INTLITERAL36.getText():null)));}
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



	// $ANTLR start "booleanLiteral"
	// AQLExecutor.g:404:1: booleanLiteral : ( TRUE | FALSE );
	public final void booleanLiteral() throws RecognitionException {
		try {
			// AQLExecutor.g:405:3: ( TRUE | FALSE )
			// AQLExecutor.g:
			{
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
	}
	// $ANTLR end "booleanLiteral"


	public static class moduleName_return extends TreeRuleReturnScope {
		public String value;
	};


	// $ANTLR start "moduleName"
	// AQLExecutor.g:408:1: moduleName returns [String value] : ident= IDENTIFIER '.' ( 'lua' | 'so' ) ;
	public final AQLExecutor.moduleName_return moduleName() throws RecognitionException {
		AQLExecutor.moduleName_return retval = new AQLExecutor.moduleName_return();
		retval.start = input.LT(1);

		CommonTree ident=null;

		try {
			// AQLExecutor.g:409:3: (ident= IDENTIFIER '.' ( 'lua' | 'so' ) )
			// AQLExecutor.g:409:5: ident= IDENTIFIER '.' ( 'lua' | 'so' )
			{
			ident=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_moduleName1683); if (state.failed) return retval;
			match(input,88,FOLLOW_88_in_moduleName1685); if (state.failed) return retval;
			// AQLExecutor.g:410:3: ( 'lua' | 'so' )
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
					// AQLExecutor.g:410:4: 'lua'
					{
					match(input,91,FOLLOW_91_in_moduleName1691); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (ident!=null?ident.getText():null) + ".lua";}
					}
					break;
				case 2 :
					// AQLExecutor.g:411:4: 'so'
					{
					match(input,94,FOLLOW_94_in_moduleName1698); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.value = (ident!=null?ident.getText():null) + ".so";}
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



	public static final BitSet FOLLOW_aqlStatement_in_aqlFile85 = new BitSet(new long[]{0x2A400184040CB812L,0x0000000022000156L});
	public static final BitSet FOLLOW_create_in_aqlStatement105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_drop_in_aqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_in_aqlStatement123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_delete_in_aqlStatement131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_aqlStatement139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_registerPackage_in_aqlStatement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_execute_in_aqlStatement155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregate_in_aqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_show_in_aqlStatement171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_desc_in_aqlStatement181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_aqlStatement191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_aqlStatement200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_get_in_aqlStatement211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_run_in_aqlStatement222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_query_in_aqlStatement233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_kill_scan_in_aqlStatement241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quit_in_aqlStatement249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_help_in_aqlStatement259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_aqlStatement270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_index_name_in_create292 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_nameSet_in_create294 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_bin_in_create296 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexType_in_create298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DROP_in_drop320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_drop334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_index_name_in_drop336 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_nameSet_in_drop340 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULE_in_drop351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_moduleName_in_drop353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_drop365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_drop369 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSERT_in_insert415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_insert417 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_primaryKey_in_insert419 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_binNameList_in_insert423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_insert427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DELETE_in_delete449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_delete453 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_primaryKey_in_delete457 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SELECT_ALL_in_select484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_from_in_select486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SELECT_EXPLICIT_in_select495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_binNameList_in_select499 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_from_in_select501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FROM_in_from520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_from522 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_from531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressions_in_from533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_order_in_orderby551 = new BitSet(new long[]{0x0000000000002002L,0x0000000100000000L});
	public static final BitSet FOLLOW_ASC_in_order565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_order567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_order575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_order577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PK_in_expressions597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_expressions599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FILTERS_in_expressions609 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_filter_in_expressions611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_filter630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter632 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_filter634 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BETWEEN_in_filter643 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter647 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter651 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_INTLITERAL_in_filter655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BETWEEN_in_filter666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_filter670 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_in_filter674 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_function_in_filter678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_in_function692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function696 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_value_in_function698 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIN_NAMES_in_binNameList722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bin_in_binNameList725 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_VALUES_in_valueList752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_valueList755 = new BitSet(new long[]{0x0000000800000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_NAMESET_in_nameSet778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_nameSet780 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_set_name_in_nameSet784 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REGISTER_in_registerPackage809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_registerPackage813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REMOVE_in_removePackage833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_removePackage835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXECUTE_in_execute861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_execute863 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_packageFunction_in_execute865 = new BitSet(new long[]{0x0020000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_primaryKey_in_execute867 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_execute870 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AGGREGATE_in_aggregate896 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameSet_in_aggregate898 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_packageFunction_in_aggregate900 = new BitSet(new long[]{0x0020000000400008L,0x0000000000010000L});
	public static final BitSet FOLLOW_expressions_in_aggregate902 = new BitSet(new long[]{0x0000000000000008L,0x0000000000010000L});
	public static final BitSet FOLLOW_valueList_in_aggregate906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_packageFunction930 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_packageFunction932 = new BitSet(new long[]{0x5000000084000000L});
	public static final BitSet FOLLOW_set_in_packageFunction936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHOW_in_show971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEXES_in_show973 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_nameSet_in_show975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MODULES_in_show986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PACKAGES_in_show1000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1012 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NAMESPACES_in_show1014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1023 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SETS_in_show1025 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1034 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BINS_in_show1036 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SCANS_in_show1052 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHOW_in_show1067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QUERIES_in_show1069 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_desc1094 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MODULE_in_desc1097 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_moduleName_in_desc1099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESC_in_desc1109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_desc1112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_desc1114 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_desc1116 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INDEX_in_stat1143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namespace_name_in_stat1145 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_index_name_in_stat1147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QUERY_in_stat1157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAT_in_stat1166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SYSTEM_in_stat1168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TIMEOUT_in_set1189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_set1193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VERBOSE_in_set1208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_booleanLiteral_in_set1212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ECHO_in_set1223 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_booleanLiteral_in_set1227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RECORD_TTL_in_set1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_set1242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VIEW_in_set1255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_viewType_in_set1257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_set1268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set1272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set1282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_set1285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_set1289 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TIMEOUT_in_get1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VERBOSE_in_get1316 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ECHO_in_get1330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RECORD_TTL_in_get1346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VIEW_in_get1358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_USER_PATH_in_get1374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GET_in_get1384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LUA_SYSTEM_PATH_in_get1386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RUN_in_run1403 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_run1405 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_print1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_print1419 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KILL_QUERY_in_kill_query1441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_query1443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_KILL_SCAN_in_kill_scan1464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTLITERAL_in_kill_scan1466 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUIT_in_quit1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXIT_in_quit1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_quit1493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_help1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_viewType1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_viewType1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PK_in_primaryKey1545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_primaryKey1547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_package_name1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_index_name1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace_name1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_set_name1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_bin1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_value1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_value1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_moduleName1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_moduleName1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000048000000L});
	public static final BitSet FOLLOW_91_in_moduleName1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_moduleName1698 = new BitSet(new long[]{0x0000000000000002L});
}
