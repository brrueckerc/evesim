
package org.evesim.usecase.sna.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;
import br.org.ipti.flypeer.trans.FlypeerResponseListener;
import br.org.ipti.flypeer.trans.TransactionInitiator;
import br.org.ipti.flypeer.trans.xml.context.generator.SequentialFlow;
import br.org.ipti.flypeer.trans.xml.context.generator.Service;
import br.org.ipti.flypeer.trans.xml.context.generator.TransactionFlow;

public class TestEveDocumentEditing {

	public static void main(String[] args){
		final CommandSimplePeer peer = new CommandSimplePeer();
		AuthnData data = new AuthnData(TYPE.DEFAULT,UUID.randomUUID().toString(),"pass");
		peer.start(data, new PeerStatusNotifier() {
			
			@Override
			public void peerStarted() {
				TransactionInitiator init = peer.createTransactionInitiator();
				
				TransactionFlow flow = new TransactionFlow();
				SequentialFlow seq = new SequentialFlow();
				Service dem_serv = new Service("DOCUMENT_EDITING_SERVICE");
				seq.addService(dem_serv);
				flow.setGenericFlow(seq);
				flow.addTransactionResult("result", dem_serv);
				
				HashMap<String, Serializable> param = new HashMap<String, Serializable>();
				//param.put("demandedService", sAttributes.toString());
				param.put("type", "CREATE");
				param.put("agent", "agent_name");
				param.put("document", "test_doc");
				param.put("content", "test_content");
				param.put("timestamp", System.currentTimeMillis());
				param.put("session", UUID.randomUUID().toString());
				param.put("count", 2);
		
				
				init.startTransaction(param, flow,new FlypeerResponseListener() {
					
					@Override
					public void processResponse(Map<String, Serializable> arg0) {
						System.out.println(arg0	.toString());
						TransactionInitiator init = peer.createTransactionInitiator();
						
						TransactionFlow flow = new TransactionFlow();
						SequentialFlow seq = new SequentialFlow();
						Service dem_serv = new Service("DOCUMENT_EDITING_SERVICE");
						seq.addService(dem_serv);
						flow.setGenericFlow(seq);
						flow.addTransactionResult("result", dem_serv);
						
						HashMap<String, Serializable> param = new HashMap<String, Serializable>();
						//param.put("demandedService", sAttributes.toString());
						param.put("type", "CREATE");
						param.put("agent", "agent_name");
						param.put("document", "test_doc");
						param.put("content", "test_content");
						param.put("timestamp", System.currentTimeMillis());
						param.put("session", UUID.randomUUID().toString());
						param.put("count", 2);
						init.startTransaction(param, flow,new FlypeerResponseListener() {
							
							@Override
							public void processResponse(Map<String, Serializable> arg0) {
								System.out.println(arg0	.toString());
								
							}
							
							@Override
							public void processFail(Map<String, Exception> arg0) {
								// TODO Auto-generated method stub
								
							}
						});
						
					}
					
					@Override
					public void processFail(Map<String, Exception> arg0) {
						// TODO Auto-generated method stub
						
					}
				});
				
			}
		});
	}
}
