package org.evesim.facebook;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Map;

import org.apache.axis2.deployment.util.TempFileManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.evesim.EveSimulation;
import org.evesim.EvesimPackage;
import org.evesim.xml.EveNetworkDescriptionXMLReader;


public class ImportFromFacebook extends AbstractHandler {

	public final static String COMMAND_IMPORTFACEBOOK = "EveSimViz.ImportFromFacebook";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try{

			File temp = TempFileManager.createTempFile("facebook", "temp");
			System.out.println(temp.getAbsolutePath());
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			URL url = new URL("http://evesim.org/~cruecker/evesimexporter/facebook.xml");
			URLConnection urlc = url.openConnection();

			bis = new BufferedInputStream( urlc.getInputStream() );
			bos = new BufferedOutputStream( new FileOutputStream(temp) );

			int i;
			while ((i = bis.read()) != -1)
			{
				bos.write( i );
			}
			bis.close();
			bos.close();

			//System.out.println(file);
			EveNetworkDescriptionXMLReader reader = new EveNetworkDescriptionXMLReader("EveAgent");
			EveSimulation sim = reader.getSimulationfromXML(temp.getPath());

			//System.out.println(sim);
			if(sim != null){
				//System.out.println(sim);
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
				System.out.println(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				if(ResourcesPlugin.getWorkspace().getRoot().getProjects().length != 0){
					//System.out.println(resource.getAllContents().toString());
					saveResource(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() +"//"+ ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName() + "//facebook_import.evesim",resource);	 
					//System.out.println("File written");
					//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName());
				} 
				else{
					saveResource(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() +"//Simulations//facebook_import.evesim",resource);	
					System.out.println("File written");
				}

				ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);



			}
			else {
				Status status = new Status(IStatus.ERROR, "EvESim", 0, "Import Facebook Error", null);
				ErrorDialog.openError(HandlerUtil.getActiveShell(event), "Import Facebook Error", "The network has not been exported yet", status);
				return null;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void saveResource(String urlStr, Resource resource){
		try{
			File fil = new File(urlStr);
			fil.createNewFile();

			BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(urlStr));

			resource.save(bs,Collections.EMPTY_MAP);
			bs.flush();
			bs.close();


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

