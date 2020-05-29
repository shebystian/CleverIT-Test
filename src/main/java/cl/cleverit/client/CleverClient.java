package cl.cleverit.client;



import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Component
public class CleverClient {

	public static final String URL_LISTA_USUARIOS = "http://arsene.azurewebsites.net/User";
	public static final String URL_LICENSE_PLATE = "https://arsene.azurewebsites.net/LicensePlate";
	
	public String getClientUsuarios() throws Exception {
			URL url = new URL(URL_LISTA_USUARIOS);//your url i.e fetch data from .
		    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		    conn.setRequestMethod("GET");
		    conn.setRequestProperty("Accept", "application/json");
		    String json = "";
		    if (conn.getResponseCode() != 200) {
		        throw new RuntimeException("Failed : HTTP Error code : "
		                + conn.getResponseCode());
		    }
		    InputStreamReader in = new InputStreamReader(conn.getInputStream());
		    BufferedReader br = new BufferedReader(in);
		    String output;
		    while ((output = br.readLine()) != null) {
		    	json = json + output;
		    }
		    conn.disconnect();
		    
		    return json;
	}
	
	public String getClientPlacas() throws Exception {
		URL url = new URL(URL_LICENSE_PLATE);
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Accept", "application/json");
	    String json = "";
	    if (conn.getResponseCode() != 200) {
	        throw new RuntimeException("Failed : HTTP Error code : "
	                + conn.getResponseCode());
	    }
	    InputStreamReader in = new InputStreamReader(conn.getInputStream());
	    BufferedReader br = new BufferedReader(in);
	    String output;
	    while ((output = br.readLine()) != null) {
	    	json = json + output;
	    }
	    conn.disconnect();
	    
	    return json;
}
}
