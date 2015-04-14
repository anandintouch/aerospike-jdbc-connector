package com.aerospike.aql.grammar;

import com.aerospike.client.AerospikeException;
import com.aerospike.client.Key;
import com.aerospike.client.Log.Level;
import com.aerospike.client.Record;
import com.aerospike.client.command.Buffer;
import com.aerospike.client.query.RecordSet;

public class SystemOutReporter implements IResultReporter, IErrorReporter {
	boolean cancelled = false;
	int errors = 0;
	public SystemOutReporter() {
	}

	public void report(String message) {
		System.out.println(message);

	}

	
	public void report(Record record) {
		System.out.print("Record found: ");
		if (record != null){
			for (String binName :record.bins.keySet()){
				String result = (String)record.getValue(binName);
				System.out.print(" bin="+binName +" value="+ result);
			}
		}
		System.out.println();

	}

	public void report(RecordSet recordSet) {
		try {
			int count = 0;
			while (recordSet.next()) {
				Key key = recordSet.getKey();
				Record record = recordSet.getRecord();
				System.out.print("Record found: ns=" + key.namespace 
						+" set="+key.setName+" key="+Buffer.bytesToHexString(key.digest));
				for (String binName :record.bins.keySet()){
					String result = (String)record.getValue(binName);
					System.out.print(" bin="+binName +" value="+ result);
				}
				System.out.println();
				count++;
			}
			if (count == 0) {
				System.out.println("No records returned.");			
			}
		} catch (AerospikeException e) {
			e.printStackTrace();
		} finally {
			if (recordSet != null) {
				recordSet.close();
			}

		}
	}

	
	public void report(Level level, String message) {
		switch (level){
		case DEBUG:
			System.out.println("DEBUG: " + message);
			break;
		case ERROR:
			System.err.println("ERROR: " + message);
			break;
		case WARN:
			System.out.println("WARN: " + message);
			break;
		case INFO:
			System.out.println("INFO: " + message);
			break;
		}

	}

	
	public void report(String message, boolean clear) {
		this.report(message);

	}

	
	public void report(Level level, String message, boolean clear) {
		this.report(level, message);

	}

	
	public void report(Record record, boolean clear) {
		this.report(record);

	}

	
	public void report(RecordSet recordSet, boolean clear) {
		this.report(recordSet);

	}

	
	public void reportInfo(String inforMessage, String... seperators) {
		reportInfo(inforMessage, false, seperators);

	}

	
	public void reportInfo(String inforMessage, boolean clear,
			String... seperators) {

	}
	protected void printInfo(String title, String infoString, String... seperators){
		if (infoString == null || infoString.isEmpty() || seperators == null )
			return;
		System.out.println(title);
		if (seperators.length >= 1){
			String[] outerParts = infoString.split(seperators[0]);
			String rowFormat = null;
			for (int i = 0; i < outerParts.length; i++){
				if (seperators.length >= 2){
					String[] innerParts = outerParts[i].split(seperators[1]);
					if (i == 0){
						StringBuffer sb = new StringBuffer("| ");
						for (int j = 0; j < innerParts.length; j++){
							sb.append("%").append(innerParts[j].length()).append("s | ");
						}
						rowFormat = sb.toString();
						System.out.println(String.format(rowFormat, nameValueParts(innerParts, true)));
					}
					System.out.println(String.format(rowFormat, nameValueParts(innerParts, false)));
				}
			}
		}
	}
	private String[] nameValueParts(String[] parts, boolean headerRow){
		String[] nvs = new String[parts.length];
		for (int i = 0; i < parts.length; i++) {
			String[] nv = parts[i].split("=");
			if (headerRow){
				nvs[i] = nv[0];
			} else if (nv.length > 1){
				nvs[i] = nv[1];
			}
		}
		return nvs;
	}

	
	public void cancel() {
		this.cancelled = true;
	}

	
	public boolean isCancelled() {
		return this.cancelled;
		
	}

	
	public void reportError(int line, int charStart, int charEnd, String message) {
		this.errors++;
		System.out.println(String.format("Error on Line: %d at %d, %s", line, charStart, message));
	}

	public int getErrors() {
		return errors;
	}

	
}
