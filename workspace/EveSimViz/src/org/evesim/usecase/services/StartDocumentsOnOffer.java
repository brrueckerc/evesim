package org.evesim.usecase.services;


import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;

public class StartDocumentsOnOffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommandSimplePeer simple = new CommandSimplePeer();
		AuthnData data = new AuthnData(TYPE.DEFAULT, "Services_On_Offer", "pass");
		simple.start(data, new PeerStatusNotifier() {
			
			@Override
			public void peerStarted() {
				System.out.println("PeerStarted");
				
			}
		});

	}

}
