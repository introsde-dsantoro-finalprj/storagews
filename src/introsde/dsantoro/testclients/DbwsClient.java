package introsde.dsantoro.testclients;

import java.net.MalformedURLException;
import java.net.URL;

import introsde.dsantoro.dbws.Dbws;
import introsde.dsantoro.dbws.DbwsService;

public class DbwsClient {
	public static void main(String[] args) throws MalformedURLException {
		final String DBWS_ENDPOINT = System.getenv("DBWS_ENDPOINT");
		final String DBWS_PORT = System.getenv("DBWS_PORT");
		DbwsService dbwsService = new DbwsService(new URL("http://"+DBWS_ENDPOINT+":"+DBWS_PORT+"/ws/dbws?wsdl"));
		Dbws dbws = dbwsService.getDbwsImplPort();
		dbws.readPersonList();
	}
}
