package introsde.dsantoro.endpoint;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.ws.Endpoint;

import introsde.dsantoro.dbws.Dbws;
import introsde.dsantoro.dbws.DbwsService;
import introsde.dsantoro.storagews.StoragewsImpl;

public class StoragewsPublisher {
	public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException{
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1"))
        {
            HOSTNAME = "localhost";
        }
        String PORT = "6903";
        String BASE_URL = "/ws/storagews";

        if (String.valueOf(System.getenv("PORT")) != "null"){
            PORT=String.valueOf(System.getenv("PORT"));
        }
        
        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting storage Service...");
        // Check south-bound services
        Dbws dbws = getDbwsHandle();
        if (dbws != null) {
        	// Proceed with startup
        	Endpoint.publish(endpointUrl, new StoragewsImpl(dbws));
            System.out.println("--> Published. Check out "+endpointUrl+"?wsdl");	
        }
        else {
        	// Cannot start dependent services
        	System.out.println("--> ERROR: Not published. Check out dependent services:");
        	System.out.println("----> dbws: " + dbws);
        }
        
    }
	
	private static Dbws getDbwsHandle() throws MalformedURLException {
		final String DBWS_ENDPOINT = System.getenv("DBWS_ENDPOINT");
		final String DBWS_PORT = System.getenv("DBWS_PORT");
		DbwsService dbwsService = new DbwsService(new URL("http://"+DBWS_ENDPOINT+":"+DBWS_PORT+"/ws/dbws?wsdl"));
		Dbws dbws = dbwsService.getDbwsImplPort();
		return dbws;		
	}
}
