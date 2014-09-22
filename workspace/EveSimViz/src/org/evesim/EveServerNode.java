package org.evesim;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * 
 * This class starts a server node waiting for connections from EveSimulation
 * clients
 * 
 * @author reder
 * 
 */
public class EveServerNode {

	public static void main(String[] args) {
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		// Create and setup server node
		EveNode node = factory.createEveNode();
		node.setNodeType(EveNodeType.SERVER);
		node.setServer(factory.createEveNodeServer());

		setPort(node.getServer(), args);
		node.getServer().init();

		// Start the server node
		node.getServer().start();
	}

	public static void setPort(EveNodeServer server, String[] args) {
		for (String a : args) {
			if (a.startsWith("-port=")) {
				String ps = a.substring("-port=".length());
				try {
					int port = Integer.parseInt(ps);
					server.setServerPort(port);
				} catch (Exception e) {
					System.out.println("Invalid port number: "+ps+". Aborting.");
					System.exit(0);
				}
			}
		}
		
	}

}
