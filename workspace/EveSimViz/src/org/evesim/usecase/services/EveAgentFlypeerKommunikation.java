package org.evesim.usecase.services;

import java.util.UUID;

import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;

public class EveAgentFlypeerKommunikation{
	private static EveAgentFlypeerKommunikation instance = null;
	private CommandSimplePeer service_peer;
	private static boolean isReady = false;

	protected EveAgentFlypeerKommunikation() {
		this.service_peer = new CommandSimplePeer();
		AuthnData data = new AuthnData(TYPE.DEFAULT, UUID.randomUUID().toString(), "pass");
		this.service_peer.start(data, new PeerStatusNotifier() {

			@Override
			public void peerStarted() {
				EveAgentFlypeerKommunikation.setReady();
			}
		});
	}

	public static EveAgentFlypeerKommunikation getInstance() {
		if(instance == null) {
			instance = new EveAgentFlypeerKommunikation();
			while(EveAgentFlypeerKommunikation.isReady == false){
				try {
					Thread.sleep(10);
					//System.out.println("Waiting");
				} catch (InterruptedException ex) {}
			}
			return instance;
		}
		else{
			return instance;
		}

	}
	
	public CommandSimplePeer getServicePeer() {
		if(instance != null){
			return service_peer;
		}
		else{
			return null;
		}
	}
	
	private static void setReady(){
		EveAgentFlypeerKommunikation.isReady = true;
	}
	
	public static boolean getReady(){
		return EveAgentFlypeerKommunikation.isReady;
	}
}
