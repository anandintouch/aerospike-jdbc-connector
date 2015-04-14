package com.aerospike.jdbc;

import java.nio.ByteBuffer;

public abstract class AbstractJdbcType<T>
{
    public abstract boolean isCaseSensitive();
    public abstract int getScale(T obj);
    public abstract int getPrecision(T obj);
    public abstract boolean isCurrency();
    public abstract boolean isSigned();
    public abstract String toString(T obj);
    public abstract boolean needsQuotes();
    public abstract String getString(ByteBuffer bytes);
    public abstract Class<T> getType();
    public abstract int getJdbcType();
    public abstract T compose(ByteBuffer bytes);
    public abstract ByteBuffer decompose(T obj);
}
