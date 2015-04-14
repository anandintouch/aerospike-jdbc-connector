package com.aerospike.aql.grammar;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

public class NoCaseInputStream extends ANTLRInputStream {
	
	
	public NoCaseInputStream(InputStream arg0, int arg1, int arg2, String arg3)
			throws IOException {
		super(arg0, arg1, arg2, arg3);
	}

	public NoCaseInputStream(InputStream input, int size, String encoding)
			throws IOException {
		super(input, size, encoding);
	}

	public NoCaseInputStream(InputStream input, int size) throws IOException {
		super(input, size);
	}

	public NoCaseInputStream(InputStream input, String encoding)
			throws IOException {
		super(input, encoding);
	}

	public NoCaseInputStream(InputStream input) throws IOException {
		super(input);
	}


	public int LA(int i) {
        if ( i==0 ) {
            return 0; // undefined
        }
        if ( i<0 ) {
            i++; // e.g., translate LA(-1) to use offset 0
        }

        if ( (p+i-1) >= n ) {

            return CharStream.EOF;
        }
        return Character.toLowerCase(data[p+i-1]);
    }

}
