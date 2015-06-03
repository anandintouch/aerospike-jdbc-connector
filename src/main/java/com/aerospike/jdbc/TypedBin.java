/**
 * 
 */
package com.aerospike.jdbc;

import com.aerospike.client.Bin;

/**
 * @author anandprakash
 *
 */
public class TypedBin {
	
/*	private final Bin rawBin;
	
	private final String nameString;
	private final String valueString;*/
	private final String binName ;
	private final Object binValue;
	
	public TypedBin(String name,Object value){
		this.binName = name;
		this.binValue = value.toString();
	}
	
/*	public TypedBin(Bin bin){
		rawBin = bin;
		this.nameString = bin.name;
	}*/
	
	public String getBinName() {
		return binName;
	}

	public Object getBinValue() {
		return binValue;
	}

}
