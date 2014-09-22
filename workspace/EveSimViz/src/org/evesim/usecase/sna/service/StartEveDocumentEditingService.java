package org.evesim.usecase.sna.service;


import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;

public class StartEveDocumentEditingService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final CommandSimplePeer simple = new CommandSimplePeer();
		AuthnData data = new AuthnData(TYPE.DEFAULT, "Document-Editing-Service-Peer", "pass");
		simple.start(data, new PeerStatusNotifier() {

			@Override
			public void peerStarted() {
				System.out.println("PeerStarted");

			}
		});
	}
}
