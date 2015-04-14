package com.aerospike.aql.grammar;

import com.aerospike.client.Record;
import com.aerospike.client.Log.Level;
import com.aerospike.client.query.RecordSet;
/**
 * This interface is used to report results to
 * the calling application
 * @author peter
 *
 */
public interface IResultReporter {
	public void report(String message);
	public void report(Level level, String message);
	public void report(Record record);
	public void report(RecordSet recordSet);
	public void report(String message, boolean clear);
	public void report(Level level, String message, boolean clear);
	public void report(Record record, boolean clear);
	public void report(RecordSet recordSet, boolean clear);
	public void reportInfo(String inforMessage, String...seperators);
	public void reportInfo(String inforMessage, boolean clear, String...seperators);
	public void cancel();
	public boolean isCancelled();
}
