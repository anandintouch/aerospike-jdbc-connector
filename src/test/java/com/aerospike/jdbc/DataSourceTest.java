/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */
package com.aerospike.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.DriverManager;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataSourceTest
{
    private static final String HOST = System.getProperty("host", "localhost");
    private static final int PORT = Integer.parseInt(System.getProperty("port", 3000+""));
    private static final String NAMESPACE = "test";
    private static final String USER = "Anand";
    private static final String PASSWORD = "aerospike";
    private static final String VERSION = "3.1.0";
    private static final String CONSISTENCY = "ONE";
    
    private static java.sql.Connection con = null;


    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        Class.forName("com.aerospike.jdbc.AerospikeDriver");
        con = DriverManager.getConnection(String.format("jdbc:aerospike://%s:%d/%s",HOST,PORT,NAMESPACE));
        
        if(con.isClosed()){
        	System.out.println("Connection is not established ");
        }else{
        	System.out.println("Connection established successfuly !!");
        }
        
        System.out.println("Connected to Node name : "+con.getCatalog());

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        if (con!=null) con.close();
    }


    @Test
    public void testConstructor() throws Exception
    {
        AerospikeDataSource aerods = new AerospikeDataSource(HOST,PORT,NAMESPACE,USER,PASSWORD,VERSION);
        assertEquals(HOST,aerods.getHostName());
        assertEquals(PORT,aerods.getPort());
        assertEquals(NAMESPACE,aerods.getNamespaceName());
        assertEquals(USER,aerods.getUser());
        assertEquals(PASSWORD,aerods.getPassword());
        assertEquals(VERSION, aerods.getVersion());
        
        DataSource ds = new AerospikeDataSource(HOST,PORT,NAMESPACE,USER,PASSWORD,VERSION);
        assertNotNull(ds);
        
        // null username and password
        java.sql.Connection cnx = ds.getConnection(null, null);
        assertNotNull(cnx);
        assertFalse(cnx.isClosed());
        ds.setLoginTimeout(5);
        assertEquals(5, ds.getLoginTimeout());

        // no username and password
        cnx = ds.getConnection();
        assertFalse(cnx.isClosed());
        ds.setLoginTimeout(5);
        assertEquals(VERSION, ((AerospikeConnection) cnx).getConnectionProps().get(Utility.AQL_VERSION));
        assertEquals(5, ds.getLoginTimeout());
    }

    
    @Test
    public void testIsWrapperFor() throws Exception
    {
        DataSource ds = new AerospikeDataSource(HOST,PORT,NAMESPACE,USER,PASSWORD,VERSION);
        
        boolean isIt = false;
                
        // it is a wrapper for DataSource
        isIt = ds.isWrapperFor(DataSource.class);        
        assertTrue(isIt);
        
        // it is not a wrapper for this test class
        isIt = ds.isWrapperFor(this.getClass());        
        assertFalse(isIt);
    }
 
/*    @Test(expected=SQLFeatureNotSupportedException.class)
    public void testUnwrap() throws Exception
    {
        DataSource ds = new AerospikeDataSource(HOST,PORT,NAMESPACE,USER,PASSWORD,VERSION);

        // it is a wrapper for DataSource
        DataSource newds = ds.unwrap(DataSource.class);        
        assertNotNull(newds);
        
        // it is not a wrapper for this test class
        newds = (DataSource) ds.unwrap(this.getClass());        
        assertNotNull(newds);
    }*/
}
