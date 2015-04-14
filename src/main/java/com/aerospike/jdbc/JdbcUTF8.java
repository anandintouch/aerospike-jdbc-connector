package com.aerospike.jdbc;



import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.sql.Types;


public class JdbcUTF8 extends AbstractJdbcType<String>
{
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final JdbcUTF8 instance = new JdbcUTF8();

    public JdbcUTF8() {}

    public boolean isCaseSensitive()
    {
        return true;
    }

    public int getScale(String obj)
    {
        return -1;
    }

    public int getPrecision(String obj)
    {
        return -1;
    }

    public boolean isCurrency()
    {
        return false;
    }

    public boolean isSigned()
    {
        return false;
    }

    public String toString(String obj)
    {
        return obj;
    }

    public boolean needsQuotes()
    {
        return true;
    }

    public Class<String> getType()
    {
        return String.class;
    }

    public int getJdbcType()
    {
        return Types.VARCHAR;
    }

    public String compose(ByteBuffer bytes)
    {
        return getString(bytes);
    }

	@Override
	public String getString(ByteBuffer bytes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*    public String getString(ByteBuffer bytes)
    {
        try
        {
            return ByteBufferUtil.string(bytes);
        }
        catch (CharacterCodingException e)
        {
            throw new MarshalException("invalid UTF8 bytes " + ByteBufferUtil.bytesToHex(bytes));
        }
    }*/

	@Override
	public ByteBuffer decompose(String obj) {
		// TODO Auto-generated method stub
		return null;
	}

    /*public ByteBuffer decompose(String value)
    {
        return ByteBufferUtil.bytes(value, UTF_8);
    }*/
}
