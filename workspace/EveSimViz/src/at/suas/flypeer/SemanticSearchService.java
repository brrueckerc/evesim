package at.suas.flypeer;

import in.iirk.semSearch.SemSearchWrapper;

import java.io.Serializable;

import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;
import br.org.ipti.flypeer.model.BasicPeer;
import br.org.ipti.flypeer.model.FlypeerRollbackListener;
import br.org.ipti.flypeer.model.FlypeerServiceListener;
import br.org.ipti.flypeer.model.ServiceContext;
import br.org.ipti.flypeer.services.FlypeerBusinessService;
import br.org.ipti.flypeer.services.wsdl.WSDLFile;

@SuppressWarnings("unchecked")
@WSDLFile(name="IITKSemanticSearch.wsdl")
public class SemanticSearchService implements FlypeerBusinessService,
		FlypeerServiceListener {

	@Override
	public void clear(String arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public FlypeerRollbackListener getRollbackListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlypeerServiceListener getServiceListener() {
		return new SemanticSearchService();
	}

	@Override
	public void start(BasicPeer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public Serializable serviceEvent(ServiceContext parameters) {
		String parameter = (String) parameters.getParameter("inputParameter");
		
		// call semantic search and generate response
		String result = SemSearchWrapper.callSemanticSearch(parameter);
		
		return result;
	}
	
	public static void main(String[] args ) {
		CommandSimplePeer simple = new CommandSimplePeer();
        AuthnData data = new AuthnData(TYPE.DEFAULT, "SEMSEARCH_Service", "pass");
        simple.start(data, new PeerStatusNotifier() {
                
                @Override
                public void peerStarted() {
                        System.out.println("PeerStarted");
                        
                }
        });
        
	}

}
