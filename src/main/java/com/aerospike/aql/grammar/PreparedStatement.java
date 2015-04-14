package com.aerospike.aql.grammar;

import com.aerospike.aql.grammar.AQLastParser.aqlStatements_return;
import com.aerospike.client.query.Statement;

public class PreparedStatement {
	Statement statement;
	aqlStatements_return ast;
	public PreparedStatement(aqlStatements_return ast) {
		super();
		this.ast = ast;
	}
	public Statement getStatement() {
		return statement;
	}
	public aqlStatements_return getAst() {
		return ast;
	}
	
	
}


