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
	
	private final Bin rawBin;
	
	private final String nameString;
	
	public TypedBin(Bin bin){
		rawBin = bin;
		this.nameString = bin.name;
		
	}
	
    public String getNameString()
    {
        return nameString;
    }

}
