JDBC Driver for Aerospike NOSQL Database.
Overview:
JDBC-compliant driver for Aerospike using AQL. It's JDBC driver to perform CRUD operation in Aerospike.

Build instructions

Clone the GitHub repository at https://github.com/helipilot50/aerospike-travel-aggregation.git

Execute the command:

mvn clean package
A runnable Jar will be produced in the target subdirectory, run this with the following command:

Example to Run:
* Write your JDBC application.
* Add the Aerospike JDBC Connector jar file 
  (aerospike-jdbc-connector-1.0.0-SNAPSHOT-jar-with-  dependencies) in the build path
* Create a database connection object using DriverManager by providing DB URL as below -
   String DB_URL = jdbc:aerospike://localhost:3000/test
   java.sql.Connection con = DriverManager.getConnection(DB_URL);
* Perform your CRUD operation


Sample application Example:
- Create a new class and have DB connection method to create DB connection instance.
	public static void main(String[] args) {
		
		AerospikeJDBCTest test = new AerospikeJDBCTest();
		test.testDBCOnnection();
		
		try {
			test.testInertQuery();
			test.testSelectWithWhere();
			test.testDelete();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

- Method samples as below
1.
 	public void testDBCOnnection(){
		try {
			Class.forName("com.aerospike.jdbc.AerospikeDriver");
		
			 String DB_URL = String.format("jdbc:aerospike://%s:%d/%s",HOST,PORT,NAMESPACE);
	         con = DriverManager.getConnection(DB_URL);
	         System.out.println(String.format("URL= "+ DB_URL));
	
	         
	         if(con.isClosed()){
	         	System.out.println("Connection is not established ");
	         }else{
	         	System.out.println("Connection established successfuly !!");
	         }
	         System.out.println("Connected to Node name : "+con.getCatalog());
	         System.out.println("\n");
         
		 } catch (ClassNotFoundException e) {
				e.printStackTrace();
		 }catch(SQLException sqEx) {
				sqEx.printStackTrace();
		 }
	}
	
2.

   public void testInertQuery() throws Exception
    {
	   System.out.println("Insert Query..");
	   String insert = "INSERT INTO aeroset (PK,name,city) VALUES(1,'AP','San Jose')";
       Statement statement = con.createStatement();

       statement.executeUpdate(insert);
       statement.close();
       System.out.println("Record Inserted !!");
       System.out.println("\n");
    }
3.
      public void testSelectWithWhere() throws Exception{

	   System.out.println("Select with Where Query..");
       Statement statement = con.createStatement();
       statement = con.createStatement();
       ResultSet result = statement.executeQuery("select * from aeroset where name='AP'");
       
       Object myObj = result.getObject("name");
       
       statement.close();
       System.out.println("Record Retrieved !!");
       System.out.println(String.format("Result from DB is: "+ myObj.toString())+"\n");
   }
4.
   public void testDelete() throws Exception
   {
	   Statement statement = con.createStatement();
	   String delete = "Delete from aeroset where PK=1";
	   boolean result = statement.execute(delete);
	   statement.close();
	        
	   System.out.println(String.format("Record deleted-"+result));
   }	
	  