package org.evesim.test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.http.EveSimSyncService;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.timer.EveStartingTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;

import ec.util.MersenneTwister;

public class EveSendDocumentEditingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			MersenneTwister mt = new MersenneTwister();
			// Initialize the model
			EvesimPackage.eINSTANCE.eClass();
			// Retrieve the default factory singleton
			EvesimFactory factory = EvesimFactory.eINSTANCE;
			SocialNetworkAnalysisFactory doc_factory = SocialNetworkAnalysisFactory.eINSTANCE;
			TimerFactory timer_factory = TimerFactory.eINSTANCE;
			
			// Register the XMI resource factory for the .evesim extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("evesim", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			// Create a resource
			Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI
					.createURI("evesim/simulation.evesim"));


			// Create a simulation
			EveSimulation sim = factory.createEveSimulation();

			sim.setName("DocumentEditingSimulation");
			sim.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));

			EveGatewaySNA gateway = doc_factory.createEveGatewaySNA();
			gateway.setName("Gateway");
			gateway.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			EveStartingTimer start = timer_factory.createEveStartingTimer();
			start.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			start.setParent(gateway);
			gateway.addChild(start);

			EveAgentSNA agent = doc_factory.createEveAgentSNA();
			agent.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			EveAgentSNA agentII = doc_factory.createEveAgentSNA();
			agentII.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			

			gateway.addChild(agent);
			gateway.addChild(agentII);
			agent.setParent(gateway);
			agentII.setParent(gateway);


			EveService ser = factory.createEveService();
			ser.setName("Complex Network Models");
			ser.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			EveService ser1 = factory.createEveService();
			ser1.setName("Complex Robustness of Populations");
			ser1.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			EveService ser2 = factory.createEveService();
			ser2.setName("Robustness of spontaneous pattern formation in spatially distributed genetic populations");
			ser2.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
		
			EveService serv = factory.createEveService();
			serv.setName("Complex Network Models");
			EveService serv1 = factory.createEveService();
			serv1.setName("Complex Robustness of Populations");
			EveService serv2 = factory.createEveService();
			serv2.setName("Robustness of spontaneous pattern formation in spatially distributed genetic populations");
		
			agent.setName("DocumentAgentI");
			agent.addChild(ser);
			agent.addChild(ser1);
			agent.addChild(ser2);
			agent.getDemandedServices().add(serv);
			agent.getDemandedServices().add(serv1);
			agent.getDemandedServices().add(serv2);
			agent.setCreatingPropability(25);
			agent.setEditingPropability(70);
			agent.setDeletingPropability(5);
			

			agentII.setName("DocumentAgentII");
			agentII.addChild(ser);
			agentII.addChild(ser1);
			agentII.addChild(ser2);
			agentII.getDemandedServices().add(ser);
			agentII.getDemandedServices().add(ser1);
			agentII.getDemandedServices().add(ser2);
			agentII.setCreatingPropability(25);
			agentII.setEditingPropability(70);
			agentII.setDeletingPropability(5);
			
			EveFunctionTimer timer = timer_factory.createEveFunctionTimer();
			timer.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			timer.setGradient(new Float(500.0));
			timer.setConstant(new Float(1000.0));
			timer.setIsLogarithmic(true);
			timer.setMaxRepeat(50);
			timer.setParent(agent);
			agent.addChild(timer);
			
			EveFunctionTimer timerII = timer_factory.createEveFunctionTimer();
			timerII.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			timerII.setGradient(new Float(500.0));
			timerII.setConstant(new Float(1000.0));
			timerII.setMaxRepeat(50);
			timerII.setIsLogarithmic(true);
			timerII.setParent(agentII);
			agentII.addChild(timerII);
			
			sim.addChild(gateway);
			resource.getContents().add(sim);

			// send data
			sendResource("http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource);	        
			//sendResource("http://10.20.20.157:8080/eve/550e8400-e29b-11d4-a716-446655440000/init", resource);
			//sendResource("http://10.20.20.196:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource);
			//sendResource("http://10.20.20.182:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource_demanderI);

			EveSimSyncService sync = new EveSimSyncService(sim);	
			sync.addConnection("http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//call
			//sync.addConnection("http://10.20.20.157:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//deploy
			//sync.addConnection("http://10.20.20.196:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//call
			//sync.addConnection("http://10.20.20.182:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//deploy
			sync.start();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static void sendResource(String urlStr, Resource resource){
		try{
			// Send data
			URL url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			BufferedOutputStream bs = new BufferedOutputStream(conn.getOutputStream());

			resource.save(bs,Collections.EMPTY_MAP);
			bs.flush();


			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				// Process line...
			}
			bs.close();
			rd.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}