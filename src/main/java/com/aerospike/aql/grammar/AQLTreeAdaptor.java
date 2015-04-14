package com.aerospike.aql.grammar;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class AQLTreeAdaptor extends CommonTreeAdaptor {

	public AQLTreeAdaptor() { 
		super();
	}
	@Override
	public Object create(Token payload) {
		return new AQLTree(payload);
	}
	@Override
	public Object errorNode(TokenStream input, Token start, Token stop,
			RecognitionException e) {
		return new AQLTreeErrorNode(input, start, stop, e);
	}
	@Override
	public Object dupNode(Object t) {
		if ( t==null ) return null;
        return create(((AQLTree)t).token);
	}
}
