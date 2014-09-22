package org.evesim;

import java.util.Hashtable;
import java.util.UUID;

public class EveSimClientNode {
	
	Hashtable<UUID,EveSimClientSession> sessions;

	private static EveSimClientNode instance = null;
	
	public static EveSimClientNode getInstance() {
		if (instance == null)
			instance = new EveSimClientNode();
		return instance;
	}
	
	public EveSimClientNode() {
		sessions = new Hashtable<UUID, EveSimClientSession>();
	}
	
	public Hashtable<UUID, EveSimClientSession> getSesstions() {
		return sessions;
	}
	
	public EveSimClientSession createAndAddSession(EveSimulation sim) {
		EveSimClientSession session = new EveSimClientSession(sim);
		getSesstions().put(sim.getSessionID(), session);
		return session;
	}

}
