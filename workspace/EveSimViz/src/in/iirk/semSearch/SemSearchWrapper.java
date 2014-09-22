package in.iirk.semSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class SemSearchWrapper {
	
	@SuppressWarnings("deprecation")
	public static String callSemanticSearch(String searchString) {
		URL u;
		try {
			searchString = URLEncoder.encode(searchString);
			u = new URL("http://172.27.20.113:8080/opaals1/search_endpoint.jsp?q="+searchString);
			URLConnection con = u.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String s = null;
			StringBuffer result = new StringBuffer();
			while ((s = in.readLine()) != null) {
				result = result.append(s).append('\n');
			}
			return result.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(callSemanticSearch("software architecture"));
	}

}
