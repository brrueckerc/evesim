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
import org.evesim.timer.EveRepeatingTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.semanticSearch.impl.EveServiceSemanticSearchImpl;

import ec.util.MersenneTwister;

/**
 * 
 * This is an example of how to init an simulation and how to setup a EveSimSyncService gathering the information
 * generated on the node-side. Note that the simulation has to be started manually by invoking: <br>
 * <br>
 * <code>http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/start</code>
 * 
 * 
 * @author reder
 *
 */
public class EveSendModelTest {


	public static void main(String[] args){
		try {

			MersenneTwister mt = new MersenneTwister();
			// Initialize the model
			EvesimPackage.eINSTANCE.eClass();
			// Retrieve the default factory singleton
			EvesimFactory factory = EvesimFactory.eINSTANCE;
			SemanticSearchFactory sem_fac = SemanticSearchFactory.eINSTANCE;

			// Register the XMI resource factory for the .evesim extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("evesim", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			// Create a resource
			Resource resource_demanderI = resSet.createResource(org.eclipse.emf.common.util.URI
					.createURI("evesim/SemanticSearchDemanderI.evesim"));

			Resource resource_demanderII = resSet.createResource(org.eclipse.emf.common.util.URI
					.createURI("evesim/SemanticSearchDemanderII.evesim"));

			Resource resource_deployer = resSet.createResource(org.eclipse.emf.common.util.URI
					.createURI("evesim/SemanticSearchDeployer.evesim"));

			// Create a simulation
			EveSimulation sim_demander_I = factory.createEveSimulation();
			EveSimulation sim_demander_II = factory.createEveSimulation();
			EveSimulation sim_deployer= factory.createEveSimulation();

			sim_demander_I.setName("Simulation Semantic Search Demander I");
			sim_demander_II.setName("Simulation Semantic Search Demander II");
			sim_deployer.setName("Simulation Semantic Search Deployer");

			sim_demander_I.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			sim_demander_II.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));
			sim_deployer.setSessionID(UUID.fromString("550e8400-e29b-11d4-a716-446655440000"));

			sim_demander_I.getUuid();
			sim_demander_II.getUuid();
			sim_deployer.getUuid();


			EveAgentSemanticSearch demanding_agent_I = sem_fac.createEveAgentSemanticSearch();
			EveAgentSemanticSearch demanding_agent_II = sem_fac.createEveAgentSemanticSearch();
			EveAgentSemanticSearch demanding_agent_III = sem_fac.createEveAgentSemanticSearch();



			EveService ser = factory.createEveService();
			ser.setName("Complex Network Models");
			EveService ser1 = factory.createEveService();
			ser1.setName("Complex Robustness of Populations");
			EveService ser2 = factory.createEveService();
			ser2.setName("Robustness of spontaneous pattern formation in spatially distributed genetic populations");

			demanding_agent_I.addChild(ser);
			demanding_agent_I.addChild(ser1);
			demanding_agent_I.addChild(ser2);
			demanding_agent_I.getDemandedServices().add(ser);
			demanding_agent_I.getDemandedServices().add(ser1);
			demanding_agent_I.getDemandedServices().add(ser2);

			//			demanding_agent_II.addChild(ser);
			//			demanding_agent_II.addChild(ser1);
			//			demanding_agent_II.addChild(ser2);
			//			demanding_agent_II.getDemandedServices().add(ser);
			//			demanding_agent_II.getDemandedServices().add(ser1);
			//			demanding_agent_II.getDemandedServices().add(ser2);

			demanding_agent_III.addChild(ser);
			demanding_agent_III.addChild(ser1);
			demanding_agent_III.addChild(ser2);
			demanding_agent_III.getDemandedServices().add(ser);
			demanding_agent_III.getDemandedServices().add(ser1);
			demanding_agent_III.getDemandedServices().add(ser2);


			demanding_agent_I.setName("SemanticAgent I");
			demanding_agent_II.setName("SemanticAgent II");
			demanding_agent_III.setName("SemanticAgent III");


			EveService serv = factory.createEveService();
			serv.setName("Invasion and extinction of Wavepacks");
			EveService serv1 = factory.createEveService();
			serv1.setName("Spectral analysis of Populations");
			EveService serv2 = factory.createEveService();
			serv2.setName("Host-pathogen model");

			demanding_agent_II.addChild(serv);
			demanding_agent_II.addChild(serv1);
			demanding_agent_II.addChild(serv2);
			demanding_agent_II.getDemandedServices().add(serv);
			demanding_agent_II.getDemandedServices().add(serv1);
			demanding_agent_II.getDemandedServices().add(serv2);


			//sim_demander_I.addChild(demanding_agent_I);
			sim_demander_I.addChild(demanding_agent_II);
			sim_demander_I.addChild(demanding_agent_III);

			EveRepeatingTimer timerAgentA = TimerFactory.eINSTANCE.createEveRepeatingTimer();
			timerAgentA.setMaxRepeat(mt.nextInt(100));
			timerAgentA.setSleep(mt.nextInt(15000));
			EveRepeatingTimer timerAgentB = TimerFactory.eINSTANCE.createEveRepeatingTimer();
			timerAgentB.setMaxRepeat(mt.nextInt(100));
			timerAgentB.setSleep(mt.nextInt(15000));
			EveRepeatingTimer timerAgentC = TimerFactory.eINSTANCE.createEveRepeatingTimer();
			timerAgentC.setMaxRepeat(mt.nextInt(100));
			timerAgentC.setSleep(mt.nextInt(15000));
			demanding_agent_I.addChild(timerAgentA);
			demanding_agent_II.addChild(timerAgentB);
			demanding_agent_III.addChild(timerAgentC);

			EveServiceSemanticSearchImpl service = (EveServiceSemanticSearchImpl)sem_fac.createEveServiceSemanticSearch();
			service.setName("DocumentsOnOfferService");
			//System.out.println(service.isFilled());
			EveRepeatingTimer timerAgentD = TimerFactory.eINSTANCE.createEveRepeatingTimer();
			timerAgentD.setMaxRepeat(1);
			timerAgentD.setSleep(0);

			service.addChild(timerAgentD);
			//b.addChild(timerAgentB);
			//b.setTimer(timerAgentB);

			resource_deployer.getContents().add(service);
			resource_demanderI.getContents().add(sim_demander_I);

			// send data
			sendResource("http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource_demanderI);	        
			//sendResource("http://10.20.20.143:8080/eve/550e8400-e29b-11d4-a716-446655440000/init", resource_deployer);
			//sendResource("http://10.20.20.148:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource_demanderI);
			//sendResource("http://10.20.20.182:8080/eve/550e8400-e29b-11d4-a716-446655440000/init",resource_demanderI);

			EveSimSyncService sync = new EveSimSyncService(sim_demander_I);	
			sync.addConnection("http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//call
			//sync.addConnection("http://10.20.20.143:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//deploy
			//sync.addConnection("http://10.20.20.148:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");//call
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
