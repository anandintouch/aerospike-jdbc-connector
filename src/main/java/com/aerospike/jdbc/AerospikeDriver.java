package com.aerospike.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

import static com.aerospike.jdbc.Utility.PROTOCOL;
import static com.aerospike.jdbc.Utility.NOT_SUPPORTED;


public class AerospikeDriver implements Driver {
	
	//private static final Logger logger = LoggerFactory.getLogger(AerospikeDriver.class);
	
    static
    {
        // Register the AerospikeDriver with DriverManager
        try
        {
        	AerospikeDriver driverObj = new AerospikeDriver();
            DriverManager.registerDriver(driverObj);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

	public Connection connect(String url, Properties info) throws SQLException {
        Properties finalProps;
        if (acceptsURL(url))
        {
            // parse the URL into a set of Properties
            finalProps = Utility.parseURL(url);

            // override any matching values in finalProps with values from props
            finalProps.putAll(info);

           /* if (logger.isDebugEnabled()) 
            	logger.debug("Final Properties to Connection: {}", finalProps);*/

            return new AerospikeConnection(finalProps);
        }
        else
        {
            return null; // signal it is the wrong driver for this protocol:subprotocol
        }
	}

	public boolean acceptsURL(String url) throws SQLException {
		return url.startsWith(PROTOCOL);
	}

	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
		throw new SQLFeatureNotSupportedException(String.format(NOT_SUPPORTED));
	}

}
