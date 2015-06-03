package com.aerospike.jdbc;

import static com.aerospike.jdbc.Utility.NOT_SUPPORTED;
import static com.aerospike.jdbc.Utility.WAS_CLOSED_RSLT;
import static com.aerospike.jdbc.Utility.MUST_BE_POSITIVE;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.ByteBuffer;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aerospike.client.Record;
import com.aerospike.client.query.RecordSet;

/**
 * 
 * @author anandprakash
 *
 */
public class AerospikeResultSet extends AbstractResultSet implements ResultSet{
	
    public static final int DEFAULT_CONCURRENCY = ResultSet.CONCUR_READ_ONLY;
    public static final int DEFAULT_HOLDABILITY = ResultSet.HOLD_CURSORS_OVER_COMMIT;
    public static final int DEFAULT_TYPE = ResultSet.TYPE_FORWARD_ONLY;
    
    private Record rowsIterator;
    private RecordSet recordSet;
    private final AerospikeStatement statement;
    private int resultSetType;
    private int fetchDirection;
    private int fetchSize;
    private Map<String, Object> indexMap = new HashMap<String, Object>();
    int rowNumber = 0;
    
    
    private final ASResultSetMetaData metaData;
    
    //private List<TypedBin> values = new ArrayList<TypedBin>();
    private List<Record> values = new ArrayList<Record>();

    AerospikeResultSet()
    {
        statement = null;
        metaData = new ASResultSetMetaData();
    }
    
    AerospikeResultSet(AerospikeStatement statement, RecordSet resultSet) throws SQLException
    {
        this.statement = statement;
        this.resultSetType = statement.getResultSetType();
        this.fetchDirection = statement.getFetchDirection();
        this.fetchSize = statement.getFetchSize();
        //this.schema = resultSet.schema;

        // Initialize meta-data from schema
         populateMetaData(resultSet);

        //rowsIterator = resultSet.getRecord();//getRowsIterator();

        if (resultSet != null && resultSet.next())
        {
           // populateColumns();
            // reset the iterator back to the beginning.
        	recordSet = resultSet;
            rowsIterator = resultSet.getRecord();
        }

        metaData = new ASResultSetMetaData();
    }
    
    AerospikeResultSet(AerospikeStatement statement, Map<String, Object> resultSet) throws SQLException
    {
        this.statement = statement;
        this.resultSetType = statement.getResultSetType();
        this.fetchDirection = statement.getFetchDirection();
        this.fetchSize = statement.getFetchSize();
 
        if (resultSet != null )
        {
            // reset the iterator back to the beginning.
            rowsIterator =  new Record(resultSet, fetchDirection, fetchDirection);
        }

        metaData = new ASResultSetMetaData();
    }
   
    
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean next() throws SQLException {
        if (hasMoreRows())
        {
           /* if (rowNumber != 0) populateColumns();
            else rowsIterator.next();*/
        	recordSet.next();
          // populateBins();
            rowNumber++;
            return true;
        }
        else
        {
            rowNumber = Integer.MAX_VALUE;
            return false;
        }
		
	}
	
    private final void populateMetaData(RecordSet resultSet)
    {
        values.clear();
        indexMap.clear();
        while (resultSet.next()) {
        	if(resultSet.getRecord().bins != null){
        		/*for(Map.Entry<String, Object> entry : resultSet.getRecord().bins.entrySet()){
        			//values.add(new TypedBin(entry.getKey(),entry.getValue()));
        			values.add(resultSet.getRecord());
        			System.out.println("Name-"+entry.getKey()+" Value-"+entry.getValue());
        			
        		}*/
        		values.add(resultSet.getRecord());

        	}
        }

    }
	
    private final boolean hasMoreRows()
    {
       // return (rowsIterator != null && rowsIterator.next());
    	System.out.println("inside has more rows");
        return (recordSet != null && recordSet.next());
        
    }

	public void close() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean wasNull() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public String getString(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getBoolean(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public byte getByte(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public short getShort(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getInt(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getLong(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getFloat(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDouble(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public BigDecimal getBigDecimal(int columnIndex, int scale)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] getBytes(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getDate(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Time getTime(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getString(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getBoolean(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public byte getByte(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public short getShort(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getInt(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getLong(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getFloat(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getDouble(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public BigDecimal getBigDecimal(String columnLabel, int scale)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] getBytes(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getDate(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Time getTime(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Timestamp getTimestamp(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getAsciiStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getUnicodeStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public InputStream getBinaryStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public String getCursorName() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		checkNotClosed();
        return metaData;
	}

	public Object getObject(int columnIndex) throws SQLException {
		/*checkIndex(columnIndex);
        return getObject(values.get(columnIndex - 1));*/
		return null;
	}

	public Object getObject(String name) throws SQLException {

		if (name == null) throw new SQLSyntaxErrorException( name);
		return rowsIterator.bins.toString();  

	}
	
    private final void checkNotClosed() throws SQLException
    {
        if (isClosed()) throw new SQLRecoverableException(WAS_CLOSED_RSLT);
    }

	public int findColumn(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Reader getCharacterStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Reader getCharacterStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isBeforeFirst() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfterLast() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isFirst() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isLast() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void beforeFirst() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void afterLast() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean first() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean last() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int getRow() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean absolute(int row) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean relative(int rows) throws SQLException {
		throw new SQLFeatureNotSupportedException(NOT_SUPPORTED);
	}

	public boolean previous() throws SQLException {
		throw new SQLFeatureNotSupportedException(NOT_SUPPORTED);
	}

	public void setFetchDirection(int direction) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getFetchDirection() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setFetchSize(int rows) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getFetchSize() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getType() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getConcurrency() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean rowUpdated() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rowInserted() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rowDeleted() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateNull(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateByte(int columnIndex, byte x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateShort(int columnIndex, short x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateInt(int columnIndex, int x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateLong(int columnIndex, long x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateFloat(int columnIndex, float x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateDouble(int columnIndex, double x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBigDecimal(int columnIndex, BigDecimal x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateString(int columnIndex, String x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateDate(int columnIndex, Date x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateTime(int columnIndex, Time x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateTimestamp(int columnIndex, Timestamp x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(int columnIndex, Reader x, int length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateObject(int columnIndex, Object x, int scaleOrLength)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateObject(int columnIndex, Object x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNull(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBoolean(String columnLabel, boolean x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateByte(String columnLabel, byte x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateShort(String columnLabel, short x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateInt(String columnLabel, int x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateLong(String columnLabel, long x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateFloat(String columnLabel, float x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateDouble(String columnLabel, double x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBigDecimal(String columnLabel, BigDecimal x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateString(String columnLabel, String x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBytes(String columnLabel, byte[] x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateDate(String columnLabel, Date x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateTime(String columnLabel, Time x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateTimestamp(String columnLabel, Timestamp x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(String columnLabel, InputStream x, int length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(String columnLabel, InputStream x, int length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(String columnLabel, Reader reader,
			int length) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateObject(String columnLabel, Object x, int scaleOrLength)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateObject(String columnLabel, Object x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void insertRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void refreshRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void cancelRowUpdates() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void moveToInsertRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void moveToCurrentRow() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Statement getStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getObject(int columnIndex, Map<String, Class<?>> map)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Ref getRef(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Blob getBlob(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Clob getClob(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Array getArray(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getObject(String columnLabel, Map<String, Class<?>> map)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Ref getRef(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Blob getBlob(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Clob getClob(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Array getArray(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getDate(String columnLabel, Calendar cal) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Time getTime(String columnLabel, Calendar cal) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Timestamp getTimestamp(int columnIndex, Calendar cal)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Timestamp getTimestamp(String columnLabel, Calendar cal)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public URL getURL(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public URL getURL(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRef(int columnIndex, Ref x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateRef(String columnLabel, Ref x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(String columnLabel, Blob x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(int columnIndex, Clob x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(String columnLabel, Clob x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateArray(int columnIndex, Array x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateArray(String columnLabel, Array x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public RowId getRowId(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public RowId getRowId(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateRowId(String columnLabel, RowId x) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public void updateNString(int columnIndex, String nString)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNString(String columnLabel, String nString)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(String columnLabel, NClob nClob)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public NClob getNClob(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public NClob getNClob(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public SQLXML getSQLXML(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public SQLXML getSQLXML(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateSQLXML(int columnIndex, SQLXML xmlObject)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateSQLXML(String columnLabel, SQLXML xmlObject)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public String getNString(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNString(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Reader getNCharacterStream(int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Reader getNCharacterStream(String columnLabel) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateNCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNCharacterStream(String columnLabel, Reader reader,
			long length) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(int columnIndex, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(int columnIndex, Reader x, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(String columnLabel, InputStream x, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(String columnLabel, InputStream x,
			long length) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(String columnLabel, Reader reader,
			long length) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(int columnIndex, InputStream inputStream, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(String columnLabel, InputStream inputStream,
			long length) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(int columnIndex, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(String columnLabel, Reader reader, long length)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(int columnIndex, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(int columnIndex, Reader x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateAsciiStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBinaryStream(String columnLabel, InputStream x)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateCharacterStream(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(int columnIndex, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateBlob(String columnLabel, InputStream inputStream)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(int columnIndex, Reader reader) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void updateNClob(String columnLabel, Reader reader)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getObject(String columnLabel, Class<T> type)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
    private final void checkIndex(int index) throws SQLException
    {
        // 1 <= index <= size()
        if (index < 1 || index > values.size()) throw new SQLSyntaxErrorException(String.format(MUST_BE_POSITIVE, String.valueOf(index)) + " " + values.size());
    }
	
    /**
     * RSMD implementation. The metadata returned refers to the column
     * values, not the column names.
     */
    class ASResultSetMetaData implements ResultSetMetaData
    {

		public <T> T unwrap(Class<T> iface) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isWrapperFor(Class<?> iface) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public int getColumnCount() throws SQLException {
			//System.out.println("Total column/record count is:"+values.size());
			return values.size();
		}

		public boolean isAutoIncrement(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isCaseSensitive(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isSearchable(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isCurrency(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public int isNullable(int column) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}

		public boolean isSigned(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public int getColumnDisplaySize(int column) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}

		public String getColumnLabel(int column) throws SQLException {
			checkIndex(column);
            return getColumnName(column);
		}

		public String getColumnName(int column) throws SQLException {
			checkIndex(column);
            //return values.get(column - 1).getBinValue().toString();
            return values.get(column - 1).toString();
		}

		public String getColumnValue(int column) throws SQLException {
			checkIndex(column);
			//return values.get(column - 1).getBinValue().toString();
			return values.get(column - 1).toString();
		}
		public String getSchemaName(int column) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		public int getPrecision(int column) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getScale(int column) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}

		public String getTableName(int column) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		public String getCatalogName(int column) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		public int getColumnType(int column) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}

		public String getColumnTypeName(int column) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isReadOnly(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isWritable(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isDefinitelyWritable(int column) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		public String getColumnClassName(int column) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
    	
    }

}
