package com.aerospike.jdbc;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aerospike.client.query.IndexType;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ReadWriteTest 
{
	
    private static final String HOST = System.getProperty("host", "localhost");
    private static final int PORT = Integer.parseInt(System.getProperty("port", 3000+""));
    private static final String NAMESPACE = "test";
    private static final String USER = "Anand";
    private static final String PASSWORD = "aerospike";
    private static final String VERSION = "3.0.0";
    private static final String CONSISTENCY = "ONE";
    
    private static java.sql.Connection con = null;


    /**
     * @return the suite of tests being tested
     */
    
  /*  public static TestSuite suite()
    {
        return new TestSuite( ReadWriteTest.class );
    }*/

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    	   Class.forName("com.aerospike.jdbc.AerospikeDriver");
    	   String DB_URL = String.format("jdbc:aerospike://%s:%d/%s",HOST,PORT,NAMESPACE);
           con = DriverManager.getConnection(DB_URL);
           System.out.println(String.format("URL= ", DB_URL));

           
           if(con.isClosed()){
           	System.out.println("Connection is not established ");
           }else{
           	System.out.println("Connection established successfuly !!");
           }
        
    }
    
    @Test
    public void testInsert() throws Exception
    {
    	 String insert = "INSERT INTO mytable (PK,name,city) VALUES('1','anand','fremont')";
    	// String insert = "INSERT INTO test.demo(PK, bn2, bn3, bn4) VALUES ('3', 3, '2', 2)";
         Statement statement = con.createStatement();

         statement.executeUpdate(insert);
         statement.close();
    	
    }
        
    @Test
    public void testReadWithWhere() throws Exception
    {

        Statement statement = con.createStatement();

        ResultSet result = statement.executeQuery("select * from mytable where name='anand'");
        
        Object myObj = result.getObject("name");
        assertNotNull(result);
        System.out.println(String.format("Result from DB is: '%s'\n", myObj.toString()));

    }
    
    @Test
    public void testReadWithoutWhere() throws Exception
    {

        Statement statement = con.createStatement();

        ResultSet result = statement.executeQuery("select city from mytable");
        
        Object myObj = result.getObject("city");
        assertNotNull(result);
        System.out.println(String.format("Result from DB is: '%s'\n", myObj.toString()));
       
       /* List<Long> myList = (List<Long>) myObj;
        assertEquals(3, myList.size());
        assertTrue(12345L == myList.get(2));
        assertTrue(myObj instanceof ArrayList);

        myList = (List<Long>) extras(result).getList("l");
        statement.close();
        assertTrue(3L == myList.get(1));*/
    }
    
    @Test
    public void testDelete() throws Exception
    {

        Statement statement = con.createStatement();
        String delete = "Delete from mytable where PK='1'";
        boolean result = statement.execute(delete);
        
        System.out.println(String.format("Record deleted-"+result));
        assertTrue(result);
        statement.close();

    }

    /**
     * Close down the connection when complete
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        if (con != null) con.close();
    }
}
