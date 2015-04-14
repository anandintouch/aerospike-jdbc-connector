package com.aerospike.aql.grammar;


@SuppressWarnings("serial")
public class AQLException extends RuntimeException {

	public AQLException(String message, Throwable e) {
		super(message, e);
	}

}
