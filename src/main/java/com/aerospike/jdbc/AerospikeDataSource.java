package com.aerospike.jdbc;

import static com.aerospike.jdbc.Utility.HOST_NAME;
import static com.aerospike.jdbc.Utility.HOST_REQUIRED;
import static com.aerospike.jdbc.Utility.NAMESPACE_NAME;
import static com.aerospike.jdbc.Utility.PASSWORD;
import static com.aerospike.jdbc.Utility.PORT_NUMBER;
import static com.aerospike.jdbc.Utility.PROTOCOL;
import static com.aerospike.jdbc.Utility.USER;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLNonTransientConnectionException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.PooledConnection;

public class AerospikeDataSource implements ConnectionPoolDataSource, DataSource {
    protected String user;

	protected String password;

    protected String version = null;
    
    protected String consistency = null;
    
    protected String hostName;

	protected int    port = 3000;

    protected String namespaceName;
	
    static
    {
        try
        {
            Class.forName("com.aerospike.jdbc.AerospikeDriver");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    
    public AerospikeDataSource(String host, int port, String namespace, String user, String password, String version)
    {
        if (host != null) setHostName(host);
        if (port != -1) setPort(port);
        if (version != null) setVersion(version);
       // if (consistency != null) setConsistency(consistency);
        setNamespaceName(namespace);
        setUser(user);
        setPassword(password);
    }
    
    public AerospikeConnection getConnection() throws SQLException
    {
        return getConnection(null, null);
    }

    public AerospikeConnection getConnection(String user, String password) throws SQLException
    {
        Properties props = new Properties();
        
        this.user = user;
        this.password = password;
        
        if (this.hostName!=null) {
        	props.setProperty(HOST_NAME, this.hostName);
        } else{
        	throw new SQLNonTransientConnectionException(HOST_REQUIRED);
        }
        
        props.setProperty(PORT_NUMBER, ""+this.port);
        if (this.namespaceName!=null) props.setProperty(NAMESPACE_NAME, this.namespaceName);
        if (user!=null) props.setProperty(USER, user);
        if (password!=null) props.setProperty(PASSWORD, password);
       // if (this.version != null) props.setProperty(AQL_VERSION, version);
        //if (this.consistency != null) props.setProperty(CONSISTENCY_LEVEL, consistency);

        String url = PROTOCOL+Utility.createSubName(props);
        return (AerospikeConnection) DriverManager.getConnection(url, props);
    }
    
    public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getNamespaceName() {
		return namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}
    
    public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getConsistency() {
		return consistency;
	}

	public void setConsistency(String consistency) {
		this.consistency = consistency;
	}

	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setLoginTimeout(int timeout) throws SQLException {
		DriverManager.setLoginTimeout(timeout);
		
	}

	public int getLoginTimeout() throws SQLException {
		return DriverManager.getLoginTimeout();
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return iface.isAssignableFrom(getClass());
	}


	public PooledConnection getPooledConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public PooledConnection getPooledConnection(String user, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
