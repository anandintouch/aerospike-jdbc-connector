package com.aerospike.jdbc;


import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLSyntaxErrorException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

public class Utility {
	
    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 3000;
    
    public static final String PROTOCOL = "jdbc:aerospike:";
    public static final String USER = "user";
    public static final String PASSWORD = "password";
    public static final String NAMESPACE_NAME = "namespaceName";
    public static final String HOST_NAME = "hostName";
    public static final String PORT_NUMBER = "portNumber";
    public static final String KEY_VERSION = "version";
    public static final String AQL_VERSION = "aqlVersion";
    public static final String ACTIVE_AQL_VERSION = "activeAqlVersion";
    protected static final String BAD_NAMESPACE = "Namespace names must be composed of alphanumerics and underscores (parsed: '%s')";
    
    
    protected static final String HOST_REQUIRED = "A 'host' name is required to establish a Connection";
    protected static final String HOST_IN_URL = "Connection url must specify a host, e.g., jdbc:aerospike://localhost:3000/Namespace";
    protected static final String NOT_SUPPORTED = "Aerospike implementation does not support this method";
    protected static final String CLOSED_CONN = "Method was called on a closed Connection";
    protected static final String CLOSED_STMT = "Method was called on a closed Statement";
    protected static final String NO_RESULTSET = "No ResultSet returned from the AQL statement passed in an 'executeQuery()' method";
    protected static final String NO_INFORESULT = "No Result returned from the asinfo statement passed in an 'executeInfo()' method";
    protected static final String BAD_HOLD_RESULTSET = "Argument for result set holdability : %s is not a valid value";
    protected static final String BAD_TYPE_RESULTSET = "Argument for result set type : %s is not a valid value";
    protected static final String BAD_FETCH_DIR = "Fetch direction value of : %s is illegal";
    protected static final String BAD_FETCH_SIZE = "Fetch size of : %s rows may not be negative";
    protected static final String ONLY_AUTOCOMMIT = "Aerospike is always in auto-commit mode";
    protected static final String WAS_CLOSED_RSLT = "This method was called on a closed ResultSet";
    protected static final String MUST_BE_POSITIVE = "Index must be a positive number less or equal the count of returned records: %s";
    protected static final String NO_UPDATE_COUNT = "No Update Count was returned from the AQL statement passed in an 'executeUpdate()' method";
    
    private static final Pattern SELECT_BIN_PATTERN = Pattern.compile("(?:SELECT|DELETE)\\s+.+\\s+WHERE\\s+(\\w+).*", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
   // protected static final Logger logger = LoggerFactory.getLogger(Utils.class);

    public static final String createSubName(Properties props)throws SQLException
    {
        
        String namespace = props.getProperty(NAMESPACE_NAME);
     
        
        if (namespace != null) 
            if (!namespace.startsWith("/")) namespace = "/"  + namespace;
        
        String host = props.getProperty(HOST_NAME);
        if (host==null)throw new SQLNonTransientConnectionException(HOST_REQUIRED);
                
        // construct a valid URI from parts... 
        URI uri;
        try
        {
            uri = new URI(
                null,
                null,
                host,
                props.getProperty(PORT_NUMBER)==null ? DEFAULT_PORT : Integer.parseInt(props.getProperty(PORT_NUMBER)),
                namespace,
                makeQueryString(props),
                null);
        }
        catch (Exception e)
        {
            throw new SQLNonTransientConnectionException(e);
        }
        
      //  if (logger.isTraceEnabled()) logger.trace("Subname : '{}' created from : {}",uri.toString(), props);
        
        return uri.toString();
    }
    
    protected static String makeQueryString(Properties props)
    {
        StringBuilder sb = new StringBuilder();
        String version = (props.getProperty(AQL_VERSION));
      //  String consistency = (props.getProperty(TAG_CONSISTENCY_LEVEL));
       // if (consistency!=null) sb.append(KEY_CONSISTENCY).append("=").append(consistency);
        if (version!=null)
        {
            if (sb.length() != 0) sb.append("&");
            sb.append(KEY_VERSION).append("=").append(version);
        }
        
        return (sb.length()==0) ? null : sb.toString().trim();
    }
    
    public static final Properties parseURL(String url) throws SQLException
    {
        Properties props = new Properties();

        if (!(url == null))
        {
            props.setProperty(PORT_NUMBER, "" + DEFAULT_PORT);
            String rawUri = url.substring(PROTOCOL.length());
            URI uri = null;
            try
            {
                uri = new URI(rawUri);
            }
            catch (URISyntaxException e)
            {
                throw new SQLSyntaxErrorException(e);
            }

            String host = uri.getHost();
            if (host == null) throw new SQLNonTransientConnectionException(HOST_IN_URL);
            props.setProperty(HOST_NAME, host);

            int port = uri.getPort() >= 0 ? uri.getPort() : DEFAULT_PORT;
            props.setProperty(PORT_NUMBER, "" + port);

            String keyspace = uri.getPath();
            if ((keyspace != null) && (!keyspace.isEmpty()))
            {
                if (keyspace.startsWith("/")) keyspace = keyspace.substring(1);
                if (!keyspace.matches("[a-zA-Z]\\w+"))
                    throw new SQLNonTransientConnectionException(String.format(BAD_NAMESPACE, keyspace));
                props.setProperty(NAMESPACE_NAME, keyspace);
            }

         /*   if (uri.getUserInfo() != null)
                throw new SQLNonTransientConnectionException(URI_IS_SIMPLE);*/
            
            String query = uri.getQuery();
            if ((query != null) && (!query.isEmpty()))
            {
                Map<String,String> params = parseQueryPart(query);
                if (params.containsKey(KEY_VERSION) )
                {
                    props.setProperty(AQL_VERSION,params.get(KEY_VERSION));
                }
               /* if (params.containsKey(KEY_CONSISTENCY) )
                {
                    props.setProperty(TAG_CONSISTENCY_LEVEL,params.get(KEY_CONSISTENCY));
                }*/

//               String[] items = query.split("&");
//               if (items.length != 1) throw new SQLNonTransientConnectionException(URI_IS_SIMPLE);
//               
//               String[] option = query.split("=");
//               if (!option[0].equalsIgnoreCase("version")) throw new SQLNonTransientConnectionException(NOT_OPTION);
//               if (option.length!=2) throw new SQLNonTransientConnectionException(NOT_OPTION);
//               props.setProperty(TAG_AQL_VERSION, option[1]);
            }
        }

       // if (logger.isTraceEnabled()) logger.trace("URL : '{}' parses to: {}", url, props);

        return props;
    }
    
    protected static Map<String,String> parseQueryPart(String query) throws SQLException
    {
        Map<String,String> params = new HashMap<String,String>();
        for (String param : query.split("&"))
        {
            try
            {
                String pair[] = param.split("=");
                String key = URLDecoder.decode(pair[0], "UTF-8").toLowerCase();
                String value = "";
                if (pair.length > 1) value = URLDecoder.decode(pair[1], "UTF-8"); 
                params.put(key, value);
            }
            catch (UnsupportedEncodingException e)
            {
                throw new SQLSyntaxErrorException(e);
            }
        }
        return params;
    }
    
    public static String determineCurrentNamespace(String aql, String currNamespace)
    {
        String ns = currNamespace;
        /*Matcher isKeyspace = NAMESPACE_PATTERN.matcher(aql);
        if (currNamespace.matches()) ns = currNamespace.group(1);*/
        return ns;
    }
    
    public static String determineCurrentBin(String aql)
    {
        String bin = null;
        Matcher isNamespace = SELECT_BIN_PATTERN.matcher(aql);
        if (isNamespace.matches())
        	bin = isNamespace.group(1);
        return bin;
    }
}
