package org.evesim.earth;

import java.util.Hashtable;
import java.util.UUID;

import org.evesim.EveComponent;

public class GEarthViewController {
	
	private Hashtable<UUID,GEarthSession> sessions; 
	
	private GEarthWebServer server;
	
	int webServerPort = 0;
	
	private static GEarthViewController INSTANCE = null;	
	
	public static GEarthViewController getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new GEarthViewController();
		}
		return INSTANCE;
	}
	
	public GEarthViewController() {
		sessions = new Hashtable<UUID, GEarthSession>();
		webServerPort = GEarthUtil.findFreePort();
		
		server = new GEarthWebServer(webServerPort);
		server.startup();
		
	}
	
	public int getWebServerPort() {
		return webServerPort;
	}
	
	public void resetSession(UUID sid) {
		
	}
	
	public void registerTree(EveComponent rootComponent) {
		sessions.put(rootComponent.getSessionID(), new GEarthSession(rootComponent));
	}
	
	public GEarthSession getSession(UUID uuid) {
		return sessions.get(uuid);		
	}
	
}
