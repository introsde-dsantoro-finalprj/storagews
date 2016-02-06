package introsde.dsantoro.testclients;

import java.net.MalformedURLException;

import introsde.dsantoro.adpws.Adpws;

public class AdpwsClient {
	public static void main(String[] args) throws MalformedURLException {
		final String ADPWS_ENDPOINT = System.getenv("ADPWS_ENDPOINT");
		final String ADPWS_PORT = System.getenv("ADPWS_PORT");
		
		Adpws adpws = new Adpws(ADPWS_ENDPOINT, ADPWS_PORT);		
		System.out.println("Number of meals retrieved: " + adpws.searchFoods("orange", 5, 5).size());
	}
}
