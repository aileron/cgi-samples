package bin;

import java.util.LinkedHashMap;
import java.util.Map;
import java.net.URLDecoder;
import java.net.URL;

public class hello {
    public static void main(String[] args) throws Exception {
        System.out.println("Content-type:text/html");
        System.out.println();
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Hello, world!</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.format("Hello, %s!", getQueryParams().get("name"));
        System.out.println("</body>");
        System.out.println("</html>");
    }

    static final String QUERY_STRING = System.getenv("QUERY_STRING");

    static Map<String, String> getQueryParams() throws Exception {
        if (QUERY_STRING == null) return new LinkedHashMap<String, String>();

        final URL url = new URL("http://localhost?" + QUERY_STRING);
        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        String query = url.getQuery();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            if (idx > 0) {
                query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
            }
        }
        return query_pairs;
    }
}
