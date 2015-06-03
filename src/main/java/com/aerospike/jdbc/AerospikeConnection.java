/**
 * 
 */
package com.aerospike.jdbc;

import java.io.StringReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;

import com.aerospike.aql.grammar.AQL;
import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Bin;
import com.aerospike.client.Info;
import com.aerospike.client.Key;
import com.aerospike.client.cluster.Node;
import com.aerospike.client.policy.QueryPolicy;
import com.aerospike.client.policy.RecordExistsAction;
import com.aerospike.client.policy.WritePolicy;
import com.aerospike.client.query.Filter;
import com.aerospike.client.query.IndexType;
import com.aerospike.client.query.RecordSet;
import com.aerospike.client.query.ResultSet;
import com.aerospike.client.task.IndexTask;

import static com.aerospike.jdbc.Utility.*;


/**
 * @author anandprakash
 *
 */
public class AerospikeConnection extends AbstractConnection implements Connection{
	
	public static final String DEFAULT_AQL_VERSION = "3.1.0";
    private Set<Statement> statements = new ConcurrentSkipListSet<Statement>();
    private WritePolicy writePolicy;
    private static Map<String,Object> nodeStatusMap = new HashMap<String,Object>();
    
    CCJSqlParserManager parserManager = new CCJSqlParserManager();
    
    /**
     * Connection Properties
     */
    private Properties connProperties;
    
    private Properties clientInfo = new Properties();
    
    protected String username = null;
    protected String url = null;
    protected String currNamespace;
    int majorAqlVersion;
    protected String clusterNode;
    private AerospikeClient client = null;
    protected long lastFailureTime = 0;
    
    /**
     * Instantiates a new Aerospike Connection.
     */
    public AerospikeConnection(Properties props) throws SQLException
    {
    	connProperties = (Properties)props.clone();
        clientInfo = new Properties();
        url = PROTOCOL + createSubName(props);
        try
        {
            String host = props.getProperty(HOST_NAME);
            int port = Integer.parseInt(props.getProperty(PORT_NUMBER));
            currNamespace = props.getProperty(NAMESPACE_NAME);
            username = props.getProperty(USER);
            String password = props.getProperty(PASSWORD);
            String version = props.getProperty(AQL_VERSION,DEFAULT_AQL_VERSION);
            connProperties.setProperty(AQL_VERSION, version);
            majorAqlVersion = getMajor(version);

            
            this.client = new AerospikeClient(host,port);
            
            if(!client.getNodeNames().isEmpty() && client.getNodeNames() != null)
            	clusterNode = client.getNodeNames().get(0);//describe_cluster_name();
/*
            if (username != null)
            {
                Map<String, String> credentials = new HashMap<String, String>();
                credentials.put("username", username);
                if (password != null) credentials.put("password", password);
                AdminCommand adminCommand = new AdminCommand(credentials);
                client.login(adminCommand);
            }
*/

            Object[] args = {host, port,currNamespace,clusterNode,version,}; 
            //System.out.println("Connection established '"+isConnected()+"' ,Namespace is '"+currNamespace+"'");
            
        }
        catch (AerospikeException e)
        {
            throw new SQLSyntaxErrorException(e);
        }
        
    }
    

    public String getClusterNode() {
		return clusterNode;
	}


	public void setClusterNode(String clusterNode) {
		this.clusterNode = clusterNode;
	}


	public Properties getConnectionProps()
    {
        return connProperties;
    }
    
    private final int getMajor(String version)
    {
        int major = 0;
        String[] parts = version.split("\\.");
        try
        {
            major = Integer.valueOf(parts[0]);
        }
        catch (Exception e)
        {
            major = 2;
        }
        return major;
    }
        
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public Statement createStatement() throws SQLException {
		checkNotClosed();
	    Statement statement = new AerospikeStatement(this);
	    statements.add(statement);
	    return statement;
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public CallableStatement prepareCall(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String nativeSQL(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAutoCommit(boolean autoCommit) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void commit() throws SQLException {
		checkNotClosed();
        throw new SQLFeatureNotSupportedException(ONLY_AUTOCOMMIT);
		
	}

	public void rollback() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void close() throws SQLException {
        // Close all the statements associated with this connection
        for (Statement statement : statements)
            statement.close();
        statements.clear();
        
        if (isConnected())
        {
            // then disconnect from the transport                
            disconnect();
        }
		
	}

	public synchronized boolean isClosed() throws SQLException {
		return !isConnected();
	}
	
    /**
     * Shutdown the remote connection
     */
    protected void disconnect()
    {
        client.close();
    }

    /**
     * Connection state.
     */
    protected boolean isConnected()
    {
        return client.isConnected();
    }
    
    private final void checkNotClosed() throws SQLException
    {
        if (isClosed()) throw new SQLNonTransientConnectionException(CLOSED_CONN);
    }

	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setReadOnly(boolean readOnly) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void setCatalog(String catalog) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public String getCatalog() throws SQLException {
        checkNotClosed();
        return clusterNode;
	}

	public void setTransactionIsolation(int level) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Statement createStatement(int resultSetType, int resultSetConcurrency)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setHoldability(int holdability) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Savepoint setSavepoint(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

    protected void executeInsertUpdate(String queryStr) throws AerospikeException
    {
    	this.writePolicy = new WritePolicy();
    	currNamespace = determineCurrentNamespace(queryStr, currNamespace);
    	
    	List<Bin> lBins = new ArrayList<Bin>();
    	try {
			Insert ins = jSQL(queryStr);
			String setName = ins.getTable().getName();
			Object keyVal= null;
			
			for(Column bin : ins.getColumns()){
				Bin lBin = null;
				
				for(Expression exp : ((ExpressionList) ins.getItemsList()).getExpressions()){
					if (bin.toString().equals("PK")){
						keyVal = getUserKey(exp);
						((ExpressionList) ins.getItemsList()).getExpressions().remove(exp);
						break;
					}
					((ExpressionList) ins.getItemsList()).getExpressions().remove(exp);
						lBin = new Bin(bin.getColumnName(), exp.toString().replace("'", ""));
						lBins.add(lBin);	
						break;
				}
		
			}
			Bin[] binArr = lBins.toArray(new Bin[lBins.size()]);
			
			if(keyVal instanceof String){
				this.client.put(this.writePolicy, new Key(currNamespace,setName,keyVal.toString()), binArr);
			}else if(keyVal instanceof Integer){
				this.client.put(this.writePolicy, new Key(currNamespace,setName,Integer.parseInt(keyVal.toString())), binArr);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    /*	try {
			String result = testStringGeneration(queryStr, AQL.Language.JAVA);
			insertUpdateRecord(result);
		} catch (Exception e) {
			throw new AerospikeException("Query is not valid ",e);
			//e.printStackTrace();
		}*/
    	
		//return client.query(new QueryPolicy(), statement);
		
    }
    
    private Object getUserKey(Expression exp){
    	Object keyVal = null;
    	if(exp.toString().startsWith("'")) {
			 keyVal = exp.toString().replace("'", "");
		}else{
			 keyVal = Integer.valueOf(exp.toString());
		}
		return keyVal;
    }
    private void insertUpdateRecord(String query){
    	String run = query;
    }
    
    protected RecordSet execute(String queryStr) throws AerospikeException
    {
    	RecordSet record = null;
    	currNamespace = determineCurrentNamespace(queryStr, currNamespace);
    	com.aerospike.client.query.Statement statement = new com.aerospike.client.query.Statement();
    	
    	String setName = null;
    	try {
    		PlainSelect pSelect = getSelectAttributes(queryStr);
    		setName = pSelect.getFromItem().toString();
    		statement.setNamespace(currNamespace);
			statement.setSetName(setName);
			
			List<SelectItem> binNames = readBinNames(pSelect);
			
			if(binNames != null && !binNames.get(0).toString().equals("*")){
				
				Iterator<SelectItem> it = binNames.iterator();
				List<String> bins = new ArrayList<String>();
			    while (it.hasNext()){
			    	bins.add(it.next().toString());
			    }
			    statement.setBinNames(bins.toArray(new String[bins.size()]));
			}
			
			if( pSelect.getWhere() != null){
				String whereVal = pSelect.getWhere().toString();
				String[] whereArray = whereVal.split("=");
				
				//create index since where clause is there
				if(whereArray[1].trim().startsWith("'")){
					createIndex(pSelect,whereArray,"STRING");
					statement.setFilters(Filter.equal(whereArray[0].trim(),whereArray[1].replace("'", "").trim()));
				}else{
					createIndex(pSelect,whereArray,"NUMERIC");
					statement.setFilters(Filter.equal(whereArray[0].trim(),whereArray[1].trim()));
				}
	
			}
			record = client.query(new QueryPolicy(), statement);
			
		} catch (AerospikeException aeroEx) {
			lastFailureTime = System.currentTimeMillis();
	        throw aeroEx;
		}
		return record;

    }
    
    private List<SelectItem> readBinNames(PlainSelect plainSelect){
    	List<SelectItem> list = plainSelect.getSelectItems();
    	//below code is for checking alias
    	/*final Expression expr = ((SelectExpressionItem) plainSelect.getSelectItems().get(0)).getExpression();
        if(expr instanceof Column) {
        	Column col = (Column) expr;
        }*/
		return list;
        
    }
    
    /**
     * Create index
     * 
     * @param whereArray 
     * @param indexType 
     */
    private void createIndex(PlainSelect plainSelect, String[] whereArray, String indexType){
    	String indexName = "index_"+plainSelect.getFromItem().toString()+"_"+whereArray[0].trim();
    	IndexTask indexTask = null;
    	if(indexType.equals(IndexType.STRING.name())){
    		 indexTask = client.createIndex(null, currNamespace, plainSelect.getFromItem().toString(), indexName, whereArray[0].trim(), IndexType.STRING);
    	}else {
    		 indexTask = client.createIndex(null, currNamespace, plainSelect.getFromItem().toString(), indexName, whereArray[0].trim(), IndexType.NUMERIC);
    	}
    	
		indexTask.waitTillComplete();
    }
    
    private PlainSelect getSelectAttributes(String query)  {
    	PlainSelect plainSelect = null;
		try {
			plainSelect = (PlainSelect) ((Select) parserManager.parse(new StringReader(query ))).getSelectBody();
		} catch (JSQLParserException error) {
			lastFailureTime = System.currentTimeMillis();
			error.printStackTrace();
		}
		return plainSelect;
    	
    }
    
    public Insert jSQL(String query) throws Exception {
    	//CCJSqlParserManager parserManager = new CCJSqlParserManager();
		Insert insert = (Insert) parserManager.parse(new StringReader(query));
		return insert;
		
	}
    
	protected String testStringGeneration(String source, AQL.Language language) throws Exception{
		AQL aql = new AQL();
		String result = aql.compileAndGenerateSnipets(source, language);
		System.out.println("Final result->"+result.substring(result.indexOf("this")));
		return result.substring(result.indexOf("this"));
	}

	public void rollback(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Statement createStatement(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PreparedStatement prepareStatement(String sql, String[] columnNames)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isValid(int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void setClientInfo(String name, String value)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		
	}

	public void setClientInfo(Properties properties)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		
	}

	public String getClientInfo(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Array createArrayOf(String typeName, Object[] elements)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Struct createStruct(String typeName, Object[] attributes)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSchema(String schema) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public String getSchema() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void abort(Executor executor) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setNetworkTimeout(Executor executor, int milliseconds)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getNetworkTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	protected boolean executeDelete(String aql) throws AerospikeException {

    	this.writePolicy = new WritePolicy();
    	currNamespace = determineCurrentNamespace(aql, currNamespace);

    	try {
    		Delete delete = (Delete) parserManager.parse(new StringReader(aql));
    		
			String setName = delete.getTable().getName();
			String keyVal= null;
			String[] whereClause = delete.getWhere().toString().trim().split("=");
			
			
			if(whereClause[1].trim().startsWith("'")) {
				keyVal = whereClause[1].trim().replace("'", "");
				this.writePolicy.recordExistsAction = RecordExistsAction.REPLACE_ONLY;
				return this.client.delete(this.writePolicy, new Key(currNamespace,setName,keyVal));
			}else{
				keyVal = whereClause[1].trim();
				this.writePolicy.recordExistsAction = RecordExistsAction.REPLACE_ONLY;
				return this.client.delete(this.writePolicy, new Key(currNamespace,setName,Integer.valueOf(keyVal)));
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	protected Map<String, Object> executeInfo(String aql) throws AerospikeException {
		Node[] clusterNodes = getAllNodesInCluster();
		Map<String, List<String>> setList = null;
		
		try {
			String command = aql.substring(aql.indexOf("-v")+2).trim();
			
			for(Node node : clusterNodes ){
				//System.out.println("Node is:"+node.getAddress().getHostString());
				setList = getSetList(Info.request(node,command));
				nodeStatusMap.put(node.getAddress().getHostString(), (Object) setList);
			}
			
		} catch (AerospikeException e) {

			e.printStackTrace();
		}
		
		return nodeStatusMap;
	}
	
	private Node[] getAllNodesInCluster(){
		return client.getNodes();
	}
	
	private Map<String, List<String>> getSetList(String infoString){
		Map<String,List<String>> dbCatalog = new HashMap<String, List<String>>();
		List<String> setList = new ArrayList<String>();
		String nameSpace = null;
		
		for (String token : infoString.split(";")) { 
			if(token.contains("set_name") && token.contains("ns_name")){
				for (String setToken : token.split(":")) {
					if(setToken.contains("ns_name"))
						nameSpace = setToken.split("=")[1];
					if(setToken.contains("set_name") ){
						setList.add(Arrays.asList(setToken.split("=")).get(1));
						break;
					}
					
				}
				//setList.add(Arrays.asList(setName.split("=")).get(1));
			}
		}
		dbCatalog.put(nameSpace,setList);
		
		return dbCatalog;
		
	}


}
