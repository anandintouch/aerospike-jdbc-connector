group as_java;
aqlFile(className, statements, host, port) ::= <<

import gnu.crypto.util.Base64;

import java.io.File;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.AerospikeException;
import com.aerospike.client.Bin;
import com.aerospike.client.Host;
import com.aerospike.client.Info;
import com.aerospike.client.Key;
import com.aerospike.client.Language;
import com.aerospike.client.Record;
import com.aerospike.client.ScanCallback;
import com.aerospike.client.Value;
import com.aerospike.client.policy.Policy;
import com.aerospike.client.policy.ScanPolicy;
import com.aerospike.client.policy.WritePolicy;
import com.aerospike.client.query.Filter;
import com.aerospike.client.query.IndexType;
import com.aerospike.client.query.RecordSet;
import com.aerospike.client.query.ResultSet;
import com.aerospike.client.query.Statement;
import com.aerospike.client.task.RegisterTask;
import com.aerospike.client.task.IndexTask;
import com.aerospike.client.cluster.Node;
import com.aerospike.client.lua.LuaConfig;
import com.aerospike.client.policy.ClientPolicy;

public class <className> {
	private AerospikeClient client;
	private String seedHost;
	private int port = 3000;
	private Policy policy;
	private WritePolicy writePolicy;

	public <className>(String seedHost, int port) throws AerospikeException{
		this.policy = new Policy();
		this.writePolicy = new WritePolicy();
		this.seedHost = seedHost;
		this.port = port;
		this.client = new AerospikeClient(seedHost, port);
		
	}

	public <className>(Host[] hosts) throws AerospikeException{
		this.policy = new Policy();
		this.writePolicy = new WritePolicy();
		this.seedHost = hosts[0].name;
		this.port = hosts[0].port;
		this.client = new AerospikeClient(new ClientPolicy(), hosts);
		
	}

	public static void main(String[] args) throws AerospikeException{
		/*
		Host[] hosts = new Host[] {new Host("a.host", 3000),
									new Host("another.host", 3000),
									new Host("and.another.host", 300)};
		<className> worker = new <className>(hosts);
		*/
		<className> worker = new <className>("<host>", <port>);
		worker.run();
	}
	public void run() throws AerospikeException {
		Bin[] bins = null;
		Key key = null; 
		ScanPolicy scanPolicy = null;
		Record record = null;
		RecordSet recordSet = null;
		ResultSet resultSet = null;
		Statement stmt = null;	
		File udfFile = null;
		RegisterTask task =	null;
		IndexTask indexTask = null;
		Object result;
		LuaConfig.SourceDirectory = "udf"; // change this to match your UDF directory 
		String udfString;
		String[] udfparts;
		
		// AQL statements - start
		
		<statements>
		
		// AQL statements - finish, total: <length(statements)>
	}
	
	protected void finalize() throws Throwable {
	    if (this.client != null) {
	        this.client.close();
	        this.client = null;
	    }
	}
	protected void printInfo(String title, String infoString){
		if (infoString == null){
			System.out.println("Null info string");
			return;
		}
		String[] outerParts = infoString.split(";");
		System.out.println(title);
		for (String s : outerParts){

			String[] innerParts = s.split(":");
			for (String parts : innerParts){
				System.out.println("\t" + parts);
			}
			System.out.println();
		}
		
	}
	protected String infoAll(String cmd) throws AerospikeException{
		Node[] nodes = client.getNodes();
		StringBuilder results = new StringBuilder();
		for (Node node : nodes){
			results.append(Info.request(node.getHost().name, node.getHost().port, cmd)).append("\n");
		}
		return results.toString();
	}
}

>>

statement(stmt) ::= <<
<stmt>

>>

insertStmt(source, nameSpace, setName, primaryKey, binNames, values) ::= <<
/* <source> */
this.client.put(this.writePolicy, new Key("<nameSpace>", "<setName>", Value.get(<primaryKey>)), 
	<first(binNames),first(values):{z,vv|new Bin("<z>", Value.get(<vv>))}><rest(binNames),rest(values):{z,vv|,
new Bin("<z>", Value.get(<vv>))}>
	);
			
>>

deleteStmt(source, nameSpace, setName, primaryKey) ::= <<
/* <source> */
this.client.delete(this.writePolicy, 
	new Key("<nameSpace>", "<setName>", Value.get(<primaryKey>)));

>>

select(source, nameSpace, setName, binNames, as, where, key) ::= <<
/* <source> */
<if(key)>
<if(binNames)>
record = client.get(this.policy, new Key("<nameSpace>", "<setName>", Value.get(<key>)), <first(binNames):{b|"<b>"}><rest(binNames):{b|, "<b>"}>);
<else>
record = client.get(this.policy, new Key("<nameSpace>", "<setName>", Value.get(<key>)));
<endif>

System.out.println("Record: " + record);
<elseif(where)>
<where>
<if(binNames)>
stmt.setBinNames(<first(binNames):{b|"<b>"}><rest(binNames):{b|, "<b>"}>);
<endif>

// Execute the query
recordSet = client.query(null, stmt);

// Process the record set
try {
	while (recordSet != null && recordSet.next()) {
		key = recordSet.getKey();
		record = recordSet.getRecord();
		
		System.out.println("Record: " + record);
		
	}
}
finally {
	recordSet.close();
}


<else>
scanPolicy = new ScanPolicy();
this.client.scanAll(scanPolicy, "<nameSpace>", "<setName>", new ScanCallback() {
			
	@Override
	public void scanCallback(Key key, Record record) throws AerospikeException {
		System.out.println("Record: " + record);
		
	}
});



<endif>
<as>

>>



aggregate(source, nameSpace, setName, 
				package, function,  
				arguments, where) ::= <<
/* <source> */
<if(where)>
<where>

<else>
stmt = new Statement();
stmt.setNamespace("<nameSpace>");
stmt.setSetName("<setName>");

<endif>
resultSet = client.queryAggregate(null, stmt, 
	"<package>", "<function>" <if(arguments)><arguments:{qq|, Value.get(<qq>)}><endif>);
		
try {
	int count = 0;
	
	while (resultSet.next()) {
		Object object = resultSet.getObject();
		System.out.println("Result: " + object);
		count++;
	}
	
	if (count == 0) {
		System.out.println("No results returned.");			
	}
}
finally {
	resultSet.close();
}

				
>>


create(source, indexName, nameSpace, setName, binName, type) ::= <<
/* <source> */
indexTask = this.client.createIndex(this.policy, "<nameSpace>", "<setName>", "<indexName>", "<binName>", IndexType.<type>);
indexTask.waitTillComplete();
				
>>

drop(source, indexName, nameSpace, setName) ::= <<
/* <source> */
this.client.dropIndex(this.policy, "<nameSpace>", "<setName>", "<indexName>");

>>

showIndex(source, nameSpace, setName) ::= <<
/* <source> */
printInfo("Indexes", Info.request(this.seedHost, this.port, "sindex"));

>>

statIndex(source, nameSpace, indexName) ::= <<
/* <source> */

>>

register(source, path) ::= <<
/* <source> */
udfFile = new File("<path>");
task = this.client.register(null, 
	udfFile.getPath(), 
	udfFile.getName(), 
	Language.LUA); 
task.waitTillComplete();

>>

remove(source, package) ::= <<
/* <source> */
System.out.println("Drop module <package>: " + Info.request(this.seedHost, this.port, "udf-remove:filename=<package>"));

>>

deleteSet(source, namespace, set)::= <<
/* <source> */
printInfo("Drop set:",infoAll("set-config:context=namespace;id=<namespace>;set=<set>;set-delete=true;"));

>>

execute(source, nameSpace, setName, key, package, udf, arguments) ::= <<
/* <source> */
// <nameSpace>, <setName>, <key>, <package>, <udf>, <arguments>
<if(key)>
result = client.execute(this.policy, 
	new Key("<nameSpace>", "<setName>", Value.get(<key>)), 
	"<package>", "<udf>" <if(arguments)>, <first(arguments):{z|Value.get(<z>)}><rest(arguments):{x|, Value.get(<x>)}><endif> );
System.out.println("UDF result: " + result);

<else>
stmt = new Statement();
stmt.setNamespace("<nameSpace>");
stmt.setSetName("<setName>");
recordSet = client.query(null, stmt);

// Process the record set
try {
	while (recordSet != null && recordSet.next()) {
		key = recordSet.getKey();
		record = recordSet.getRecord();
		
		System.out.println("Record: " + record);
		
	}
}
finally {
	recordSet.close();
}

<endif>

>>

wherePK(value) ::= <<
new Key(<value>);
>>

whereFilter(nameSpace, setName, filters, binNames) ::= <<
stmt = new Statement();
stmt.setNamespace("<nameSpace>");
stmt.setSetName("<setName>");
<if(binNames)>
stmt.setBinNames(<first(binNames):{z|"<z>"}><rest(binNames):{x|, "<x>"}>);
<endif>
<if(filters)>
stmt.setFilters(<first(filters):{f|<f>}><rest(filters):{f|, <f>}>);
<endif>

>>

orderBy(list) ::= <<
//Ordeby not supported <list>
>>

ascend(bin) ::= <<
<bin> ASC
>>

descend(bin) ::= <<
<bin> DESC
>>

setTimeOut(source, value) ::= <<
/* <source> */
this.policy.timeout = <value>;
this.writePolicy.timeout = <value>;

>>
 
setVerbose(source, value) ::= <<
/* <source> */

>>

setEcho(source, value) ::= <<
/* <source> */

>>

setTTL(source, value) ::= <<
/* <source> */
this.writePolicy.expiration = <value>;

>>

setView(source, type) ::= <<
/* <source> */

>>

useSmd(source, value) ::= <<
/* <source> */

>>

setUserPath(source, value) ::= <<
/* <source> */
LuaConfig.SourceDirectory = "<value>"; 

>>

setSystemPath(source, value) ::= <<
/* <source> */

>>

getTimeout(source) ::= <<
/* <source> */
System.out.println("Policy timeout: " + this.policy.timeout);
System.out.println("Write policy timeout: " + this.writePolicy.timeout);

>>
getVerbose(source) ::= <<
/* <source> */

>>
getEcho(source) ::= <<
/* <source> */

>>
getTTL(source) ::= <<
/* <source> */
System.out.println("Write policy expiration: " + this.writePolicy.expiration);

>>
getView(source) ::= <<
/* <source> */

>>
getUseSMD(source) ::= <<
/* <source> */

>>
getUserPath(source) ::= <<
/* <source> */
System.out.println("Lua source directory: " + LuaConfig.SourceDirectory);

>>
getSystemPath(source) ::= <<
/* <source> */

>>

statQuery(source) ::= <<
/* <source> */
printInfo("Query statistics", Info.request(this.seedHost, this.port, "query-stat"));

>>

statSystem(source) ::= <<
/* <source> */
printInfo("Statistics", Info.request(this.seedHost, this.port, "statistics"));

>>


filterEquals(bin, value) ::= <<
Filter.equal("<bin>", Value.get(<value>))
>>

filterRange(bin, low, high) ::= <<
Filter.range("<bin>", Value.get(<low>), Value.get(<high>))
>>

valueText(value) ::= <<
<value>
>>

stringValueText(value) ::= <<
"<value>"
>>

showPackages(source) ::= <<
/* <source> */
printInfo("Packages", Info.request(this.seedHost, this.port, "udf-list"));

>>

showNamespaces(source) ::= <<
/* <source> */
printInfo("Name Spaces", Info.request(this.seedHost, this.port, "namespaces"));

>>

showSets(source) ::= <<
/* <source> */
printInfo("Sets", Info.request(this.seedHost, this.port, "sets"));

>>

showBins(source) ::= <<
/* <source> */
printInfo("Bins", Info.request(this.seedHost, this.port, "bins"));


>>

showScans(source) ::= <<
/* <source> */
printInfo("Scans", Info.request(this.seedHost, this.port, "jobs:module=scan"));

>>

showQueries(source) ::= <<
/* <source> */
printInfo("Queries", Info.request(this.seedHost, this.port, "jobs:module=query"));


>>

descIndex(source, nameSpace, indexName) ::= <<
/* <source> */
printInfo("Describe Index", Info.request(this.seedHost, this.port, "sindex-describe"));

>>


descPackage(source, name) ::= <<
/* <source> */
System.out.println("Module: <name>");
udfString = Info.request(this.seedHost, this.port, "udf-get:filename=<name>");
udfparts = udfString.split(";");
System.out.println(new String(Base64.decode(udfparts[2].getBytes(), 8, udfparts[2].length()-2)));

>>

killQuery(source, id) ::= <<
/* <source> */
Info.request(this.seedHost, this.port, "query-kill=<id>");

>>

killScan(source, id) ::= <<
/* <source> */
Info.request(this.seedHost, this.port, "scan-kill=<id>");

>>

run(source, fileName) ::= <<
/* <source> */
System.out.println("Run file: " + <fileName>);

>>
print(source, value) ::= <<
/* <source> */
System.out.println(<value>);

>>