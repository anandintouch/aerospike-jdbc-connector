package com.aerospike.jdbc;

import java.sql.Blob;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

import static com.aerospike.jdbc.Utility.NOT_SUPPORTED; 

public abstract class AbstractConnection {

	
    public Blob createBlob() throws SQLException
    {
        throw new SQLFeatureNotSupportedException(NOT_SUPPORTED);
    }
    
}
