package com.aerospike.jdbc;

import static com.aerospike.jdbc.Utility.BAD_FETCH_DIR;
import static com.aerospike.jdbc.Utility.BAD_FETCH_SIZE;
import static com.aerospike.jdbc.Utility.BAD_HOLD_RESULTSET;
import static com.aerospike.jdbc.Utility.BAD_TYPE_RESULTSET;
import static com.aerospike.jdbc.Utility.CLOSED_STMT;
import static com.aerospike.jdbc.Utility.NO_RESULTSET;
import static com.aerospike.jdbc.Utility.NO_UPDATE_COUNT;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.regex.Matcher;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.query.RecordSet;

public class AerospikeStatement extends AbstractStatement implements Statement,Comparable<Object>{

	private AerospikeClient client;
	protected AerospikeConnection connection;
	protected int resultSetType = AerospikeResultSet.DEFAULT_TYPE;
	protected int resultSetConcurrency = AerospikeResultSet.DEFAULT_CONCURRENCY;
	protected int resultSetHoldability = AerospikeResultSet.DEFAULT_HOLDABILITY;
    protected ResultSet currentResultSet = null;

    protected int updateCount = -1;
	protected String aql;
	protected int fetchDirection = ResultSet.FETCH_FORWARD;
	protected int fetchSize = 0;
	boolean deleteStatus = false;
	
	public enum QueryType {SELECT,INSERT,DELETE,UPDATE};
	 
	AerospikeStatement(AerospikeConnection conn) throws SQLException
    {
        this(conn, null, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY, ResultSet.HOLD_CURSORS_OVER_COMMIT);
    }
	
	AerospikeStatement(AerospikeConnection conn, String cql, int resultSetType, int resultSetConcurrency,
            int resultSetHoldability) throws SQLException
            {
				this.connection = conn;
				this.aql = aql;
				
				if (!(resultSetType == ResultSet.TYPE_FORWARD_ONLY
				   || resultSetType == ResultSet.TYPE_SCROLL_INSENSITIVE
				   || resultSetType == ResultSet.TYPE_SCROLL_SENSITIVE))
					throw new SQLSyntaxErrorException(BAD_TYPE_RESULTSET);
				this.resultSetType = resultSetType;
				
				if (!(resultSetConcurrency == ResultSet.CONCUR_READ_ONLY
				   || resultSetConcurrency == ResultSet.CONCUR_UPDATABLE)) 
					throw new SQLSyntaxErrorException(BAD_TYPE_RESULTSET);
				this.resultSetConcurrency = resultSetConcurrency;
				
				
				if (!(resultSetHoldability == ResultSet.HOLD_CURSORS_OVER_COMMIT
				   || resultSetHoldability == ResultSet.CLOSE_CURSORS_AT_COMMIT))
					throw new SQLSyntaxErrorException(BAD_HOLD_RESULTSET);
				this.resultSetHoldability = resultSetHoldability;
            }
    
	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


    public ResultSet executeQuery(String query) throws SQLException
    {
        checkNotClosed();
        doExecute(query);
        if (currentResultSet == null)
            throw new SQLNonTransientException(NO_RESULTSET);
        return currentResultSet;
    }
    
    protected final void resetResults()
    {
        currentResultSet = null;
        updateCount = -1;
        deleteStatus = false;
    }
    
    private void doExecute(String aql) throws SQLException
    {
        try
        {
            System.out.println("AQL: "+ aql);
            
            resetResults();

            //Check whether its Get or Put call
            String queryType = getFirstWord(aql);
            
            if(queryType.equalsIgnoreCase(QueryType.SELECT.toString())) {
            	RecordSet resultSet = connection.execute(aql);
            	currentResultSet = new AerospikeResultSet(this, resultSet);
            } else if (queryType.equalsIgnoreCase(QueryType.INSERT.toString()) ||
            		queryType.equalsIgnoreCase(QueryType.UPDATE.toString())) {
            	connection.executeInsertUpdate(aql);
            } else if (queryType.equalsIgnoreCase(QueryType.DELETE.toString())){
            	 deleteStatus = connection.executeDelete(aql);
            }
            
            /*
            RecordSet resultSet = connection.execute(aql);
            currentResultSet = new AerospikeResultSet(this, resultSet);*/
           /* switch (queryType)
            {
                case SELECT:
                    currentResultSet = new AerospikeResultSet(this, resultSet);
                    break;
                case INSERT:
                    updateCount = resultSet.getRecord().getNum();
                    break;
                case UPDATE:
                    updateCount = 0;
                    break;
            }*/
        }catch (AerospikeException aEx){
        	throw new SQLSyntaxErrorException(aEx.getMessage()+"\n'"+aql+"'",aEx);
        }
    	
    }
    
    protected final void checkNotClosed() throws SQLException
    {
        if (isClosed()) throw new SQLRecoverableException(CLOSED_STMT);
    }

	public int executeUpdate(String sql) throws SQLException {
        checkNotClosed();
        doExecute(sql);
        if (currentResultSet != null)
            throw new SQLNonTransientException(NO_UPDATE_COUNT);
        return updateCount;
	}
	
	private String getFirstWord(String querySTring) {
	    if (querySTring.indexOf(' ') > -1) { // Check if there is more than one word.
	    	return querySTring.substring(0, querySTring.indexOf(' ')); // Extract first word.
	    } else {
	    	return querySTring; // Text is the first word itself.
	    }
	}

	public void close() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getMaxFieldSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setMaxFieldSize(int max) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getMaxRows() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setMaxRows(int max) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setEscapeProcessing(boolean enable) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getQueryTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setQueryTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}

    public boolean execute(String sql) throws SQLException
    {
        checkNotClosed();
        doExecute(sql);
        return deleteStatus;
    }

	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getUpdateCount() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getMoreResults() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void setFetchDirection(int direction) throws SQLException {
        checkNotClosed();

        if (direction == ResultSet.FETCH_FORWARD || direction == ResultSet.FETCH_REVERSE || direction == ResultSet.FETCH_UNKNOWN)
        {
            if ((getResultSetType() == ResultSet.TYPE_FORWARD_ONLY) && (direction != ResultSet.FETCH_FORWARD))
                throw new SQLSyntaxErrorException(String.format(BAD_FETCH_DIR, direction));
            fetchDirection = direction;
        }
        else throw new SQLSyntaxErrorException(String.format(BAD_FETCH_DIR, direction));
		
	}

	public int getFetchDirection() throws SQLException {
		checkNotClosed();
        return fetchDirection;
	}

	public void setFetchSize(int rows) throws SQLException {
		 checkNotClosed();
	        if (rows < 0) throw new SQLSyntaxErrorException(String.format(BAD_FETCH_SIZE, rows));
	        fetchSize = rows;
	}

	public int getFetchSize() throws SQLException {
		checkNotClosed();
        return fetchSize;
	}

	public int getResultSetConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getResultSetType() throws SQLException {
		checkNotClosed();
        return ResultSet.TYPE_FORWARD_ONLY;
	}

	public void addBatch(String sql) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void clearBatch() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int[] executeBatch() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getMoreResults(int current) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int executeUpdate(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean execute(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int getResultSetHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void setPoolable(boolean poolable) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean isPoolable() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int compareTo(Object o) {
		 if (this.equals(o)) return 0;
	        if (this.hashCode()< o.hashCode()) return -1;
	        else return 1;
	}

}
