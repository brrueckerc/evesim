package org.evesim.test;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;

public class EveLoadModelTest {
	public static void main(String[] args) {
		try {

			// Initialize the model
			EvesimPackage.eINSTANCE.eClass();
			// Retrieve the default factory singleton
			EvesimFactory factory = EvesimFactory.eINSTANCE;

			// Register the XMI resource factory for the .website extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("evesim", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			// Create a resource
			String urlStr = "/home/reder/Desktop/msg.evesim";
			Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(urlStr));
			resource.load(Collections.EMPTY_MAP);
			
			System.out.println(resource.getContents());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
