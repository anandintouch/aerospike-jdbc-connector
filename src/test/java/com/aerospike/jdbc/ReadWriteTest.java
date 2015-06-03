package com.aerospike.jdbc;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aerospike.client.query.IndexType;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 * @author anand prakash
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
           System.out.println(String.format("URL= "+ DB_URL));

           
           if(con.isClosed()){
           	System.out.println("Connection is not established ");
           }else{
           	System.out.println("Connection established successfuly !!");
           }
        
    }
    
    @Test
    public void testInsert() throws Exception
    {
    	 String insert = "INSERT INTO myset (PK,name,city) VALUES('2','AP1','San Jose1')";
         Statement statement = con.createStatement();

         statement.executeUpdate(insert);
         System.out.println("\n");
         statement.close();
    	
    }
        
    @Test
    public void testReadWithWhere() throws Exception
    {

        Statement statement = con.createStatement();

        ResultSet result = statement.executeQuery("select * from myset");
        //ResultSet result = statement.executeQuery("select * from myset");
        assertNotNull(result);
      /*  
        Object myObj = result.getObject("name");
        System.out.println(String.format("Result from DB is: '%s'\n", myObj.toString()));*/
        
        ResultSetMetaData rsmd = result.getMetaData();

        System.out.println("Fetching each row with a next()");
        
        //while (result.next())
        int columnCount = rsmd.getColumnCount();
        while (columnCount !=0)
        {
        	System.out.println("Inside while");
            System.out.println("row is:"+columnCount);
            for (int i = 1; i <= columnCount; i++)
            {
                System.out.print(showColumn(i,result)+ "\n"); 
            }
            break;
        }
        
        statement.close();

    }
    
    @Test
    public void testReadWithoutWhere() throws Exception
    {

        Statement statement = con.createStatement();

        ResultSet result = statement.executeQuery("select city from myset");
        assertNotNull(result);
       // Object myObj = result.getObject("city");
        
       // System.out.println(String.format("Result from DB is: '%s'\n", myObj.toString()));
       
        ResultSetMetaData rsmd = result.getMetaData();
        int colCount =0;
        System.out.println("Fetching each row with a next()");
        
        //assertTrue("Make sure we do get a result", rsmd.getColumnDisplaySize(1) != 0);
        // assertNotNull("Make sure we do get a label",rsmd.getColumnLabel(1));
        
        //while (result.next())
        int columnCount = rsmd.getColumnCount();
        while (columnCount !=0)
        {
        	System.out.println("Inside while");
            System.out.println("row is:"+columnCount);
            for (int i = 1; i <= columnCount; i++)
            {
                System.out.print(showColumn(i,result)+ "\n"); 
            }
            break;
        }
        
       /* List<Long> myList = (List<Long>) myObj;
        assertEquals(3, myList.size());
        assertTrue(12345L == myList.get(2));
        assertTrue(myObj instanceof ArrayList);

        myList = (List<Long>) extras(result).getList("l");
        statement.close();
        assertTrue(3L == myList.get(1));*/
    }
    
    private final String  showColumn(int index, ResultSet result) throws SQLException
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(index).append("]");
        String colVal = result.getMetaData().getColumnLabel(index);//.getColumnName(index);
        sb.append("Record Value: ").append(colVal);
        //sb.append(result.getObject(index));
        return sb.toString();
    }
    
/*    @Test
    public void testDelete() throws Exception
    {

        Statement statement = con.createStatement();
        String delete = "Delete from myset where PK='1'";
        boolean result = statement.execute(delete);
        
        System.out.println(String.format("Record deleted-"+result));
        assertTrue(result);
        statement.close();

    }*/
    
    @Test
    public void testDescCatalog() throws Exception
    {

        Statement statement = con.createStatement();
        String info = "asinfo -v sets";
        
        ResultSet result = statement.executeQuery(info);
        
        Object myObj = result.getObject("");
        assertNotNull(myObj);
        System.out.println(String.format("Result from DB is: '%s'\n", myObj.toString()));

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
