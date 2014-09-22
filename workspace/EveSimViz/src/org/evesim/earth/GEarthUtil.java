package org.evesim.earth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.evesim.EveComponent;
import org.evesim.EvesimFactory;

public class GEarthUtil {

	public final static String WEB_SERVER_BASE = "http://localhost:@@port@@";
	public final static String WEB_STATICSERVLET_EXTENSION = "/default"; 
	public final static String WEB_KMLSERVLET_EXTENSION = "/kml/earth.kml?sid=";

	public final static String WEB_KMLSERVLETSTYLE_EXTENTION = "/vml/earth/styles.kml#";
	

	public final static String KML_STYLE_EVECOMPONENT = "EveComponent";
	public final static String KML_STYLE_EVECONNECTION = "EveConnection";
	public final static String KML_STYLE_MONITORING_OK = "EveMonitoringNode_OK";
	public final static String KML_STYLE_MONITORING_FAIL = "EveMonitoringNode_FAIL";
	public final static String KML_STYLE_MONITORING_RECOVERING = "EveMonitoringNode_RECOVERING";

	public final static Logger logger = Logger.getLogger(GEarthUtil.class.getName());

	public final static String GEOCODER_URL = "http://maps.google.com/maps/geo?output=csv&sensor=false&key=abcdefg&q=";

	public static String getServerBase() {
		String port = String.valueOf(GEarthViewController.getInstance().getWebServerPort());
		String result = WEB_SERVER_BASE.replaceAll("@@port@@", port);
		return result;
	}
	
	
	public static String getStaticServletBase() {
		return getServerBase() + WEB_STATICSERVLET_EXTENSION;
	}

	public static String getKMLServletBase() {
		return getServerBase() + WEB_KMLSERVLET_EXTENSION;
	}

	public static String getKMLStyleBase() {
		return getServerBase() + WEB_KMLSERVLETSTYLE_EXTENTION;
	}

	public static String getKMLStyleBase(String style) {
		return getKMLStyleBase() + style;
	}

	public static URI getKMLUriForSession(UUID sessionId) {
		URI uri = null;
		try {
			uri = new URI(getKMLServletBase() + sessionId.toString());
		} catch (URISyntaxException e1) {
			throw new RuntimeException("Error creating KML URI for session: " + sessionId);
		}
		return uri;
	}

	public static void geocodeLookup(EveComponent comp) {
		EStructuralFeature attributeLatitude = (EStructuralFeature)EvesimFactory.eINSTANCE.getEvesimPackage().getEveComponent_LocLatitude();
		EStructuralFeature attributeLongitude = (EStructuralFeature)EvesimFactory.eINSTANCE.getEvesimPackage().getEveComponent_LocLongitude();
		
		try {
			URL u = new URL(GEOCODER_URL + getGeocdeSearchUrl(comp));
			logger.info(u.toString());
			URLConnection con = u.openConnection();
			String in = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
			String[] arg = in.split(",");
			
			float newLatitude = Float.parseFloat(arg[2]);
			comp.setLocLatitude(newLatitude);

			float newLongitude = Float.parseFloat(arg[3]);
			comp.setLocLongitude(newLongitude);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getGeocdeSearchUrl(EveComponent comp) {
		StringBuffer result = new StringBuffer();
		result = result.append(EC(comp.getLocCountry())).append('+');
		result = result.append(EC(comp.getLocPONr())).append('+').append(EC(comp.getLocCity())).append('+');
		result = result.append(EC(comp.getLocAddress()));
		return result.toString();
	}

	/**
	 * Convert "null" to "" and URL Encode
	 * 
	 * @param in
	 * @return
	 */
	public static String EC(String in) {
		if (in == null)
			return "";

		return URLEncoder.encode(in);

	}

	public static int findFreePort() {
		ServerSocket server;
		try {
			server = new ServerSocket(0);
			int port = server.getLocalPort();
			server.close();
			return port;
		} catch (IOException e) {
			throw new RuntimeException("Could not find free port for WebServer.");
		}
	}

}
