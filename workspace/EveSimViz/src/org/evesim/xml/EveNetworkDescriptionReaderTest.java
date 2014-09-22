package org.evesim.xml;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveSimulation;
import org.evesim.EvesimPackage;

public class EveNetworkDescriptionReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EveNetworkDescriptionXMLReader reader = new EveNetworkDescriptionXMLReader("EveAgent");
		EveSimulation sim = reader.getSimulationfromXML("C:\\Dokumente und Einstellungen\\ChristophRuecker\\Desktop\\DA\\da_sna\\data\\facebook_cruecker.xml");
		System.out.println(sim);
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .evesim extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI
				.createURI("evesim/resource.evesim"));
		
		resource.getContents().add(sim);
		
		//System.out.println(resource.getAllContents().toString());
		sendResource("C:\\Temp\\temp.evesim",resource);	 
		
	}
	public static void sendResource(String urlStr, Resource resource){
		try{
			BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(urlStr));

			resource.save(bs,Collections.EMPTY_MAP);
			bs.flush();


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
