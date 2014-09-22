/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.impl;

import java.util.UUID;
import java.util.logging.Level;

import org.eclipse.emf.ecore.EClass;
import org.evesim.EveService;
import org.evesim.EvesimFactory;
import org.evesim.impl.EveComponentImpl;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;
import br.org.ipti.flypeer.trans.TransactionInitiator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Gateway SNA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */
public class EveGatewaySNAImpl extends EveComponentImpl implements EveGatewaySNA, PeerStatusNotifier {
	private static final long serialVersionUID = -2862979835018869072L;
	private boolean ready = false;
	private TransactionInitiator init;
	private CommandSimplePeer service_peer;


	/**
	 * 
	 */

	protected EveGatewaySNAImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	@Override
	public void execute() {
		this.service_peer = new CommandSimplePeer();
		AuthnData data = new AuthnData(TYPE.DEFAULT,UUID.randomUUID().toString(),"pass");
		service_peer.start(data, this);
	}

	@Override
	public void peerStarted() {
		this.init = service_peer.createTransactionInitiator();
		setReady(true);
		logger.log(Level.INFO,"Gateway was sucessfully initialised");
	}

	@Override
	protected EClass eStaticClass() {
		return SocialNetworkAnalysisPackage.Literals.EVE_GATEWAY_SNA;
	}

	public boolean isReady(){
		return ready;
	}
	public void setReady(boolean newReady){
		this.ready = newReady;
	}
	
	@Override
	public TransactionInitiator getTransactionInitiator() {
		if(isReady() == true){
			return init;
		}
		else{
			return null;
		}
	}
	public static void main(String[] args){
		UUID session = UUID.randomUUID();
		SocialNetworkAnalysisFactory fac = SocialNetworkAnalysisFactory.eINSTANCE;
		TimerFactory tfac = TimerFactory.eINSTANCE;
		EveStartingTimer start = tfac.createEveStartingTimer();
		
		EvesimFactory fact = EvesimFactory.eINSTANCE;
		EveGatewaySNA gate = fac.createEveGatewaySNA();
		gate.setName("Gate");
		start.setParent(gate);
		gate.addChild(start);

		EveService docI = fact.createEveService();
		docI.setName("DocumentI");

		EveService docII = fact.createEveService();
		docII.setName("DocumentII");

		EveService docIII = fact.createEveService();
		docIII.setName("DocumentIII");

		EveService docIV = fact.createEveService();
		docIV.setName("DocumentIV");

		EveAgentSNA agent = fac.createEveAgentSNA();
		agent.setParent(gate);
		agent.setSessionID(session);
		agent.setName("Doc_Agent_I");
		agent.getDemandedServices().add(docI);
		agent.getDemandedServices().add(docII);
		agent.getDemandedServices().add(docIII);
		agent.getDemandedServices().add(docIV);
		agent.setCreatingPropability(45);
		agent.setEditingPropability(50);
		agent.setDeletingPropability(0);
		System.out.println(agent.getDemandedServices().size());
		System.out.println(agent.getChildren().size());
		
		
		EveService Idoc = fact.createEveService();
		Idoc.setName("DocumentI");

		EveService IIdoc = fact.createEveService();
		IIdoc.setName("DocumentII");

		EveService IIIdoc = fact.createEveService();
		IIIdoc.setName("DocumentIII");

		EveService IVdoc = fact.createEveService();
		IVdoc.setName("DocumentIV");
		
		EveAgentSNA agentII = fac.createEveAgentSNA();
		agentII.setSessionID(session);
		agentII.setName("Doc_Agent_II");
		agentII.setParent(gate);
		agentII.setCreatingPropability(20);
		agentII.setEditingPropability(75);
		agentII.setDeletingPropability(0);
		agentII.getDemandedServices().add(Idoc);
		agentII.getDemandedServices().add(IIdoc);
		agentII.getDemandedServices().add(IIIdoc);
		agentII.getDemandedServices().add(IVdoc);
		System.out.println(agentII.getDemandedServices().size());
		
		gate.addChild(agent);
		gate.addChild(agentII);

		//start.run();
		gate.execute();
		while(gate.isReady() == false){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i = 0; i< 50; i++){
			agent.execute();
			agentII.execute();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}




} //EveGatewaySNAImpl
