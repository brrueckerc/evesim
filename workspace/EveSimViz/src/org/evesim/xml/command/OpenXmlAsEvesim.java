package org.evesim.xml.command;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.evesim.EveSimulation;
import org.evesim.EvesimPackage;
import org.evesim.xml.EveNetworkDescriptionXMLReader;

public class OpenXmlAsEvesim extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final FileDialog dia = new FileDialog(HandlerUtil.getActiveShell(event),SWT.OPEN);
		dia.setFilterExtensions(new String[]{"*.xml"});
		dia.setText("Open A Network Description XML");
		final String file = dia.open();
		if(file != null){
			final EveXMLWindow win = new EveXMLWindow(HandlerUtil.getActiveShell(event));
			win.setBlockOnOpen(true);
			win.open();
			if(win.getReturnCode() == SWT.OK){
				ProgressMonitorDialog dialog = new ProgressMonitorDialog(HandlerUtil.getActiveShell(event));
				try {
					dialog.run(true, true, new IRunnableWithProgress(){
						public void run(IProgressMonitor monitor) {
							monitor.beginTask("Parsing XML file", 100);

							//System.out.println(win.choosenOne);		
							//System.out.println(file);
							EveNetworkDescriptionXMLReader reader = new EveNetworkDescriptionXMLReader(win.choosenOne,monitor);
							EveSimulation sim = reader.getSimulationfromXML(file);
							
							//System.out.println(sim);
							if(sim != null){
								try{
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
										saveResource(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() +"//"+ ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName() + "//" + dia.getFileName().substring(0, dia.getFileName().length() - 4) +".evesim",resource);	 
										//System.out.println("File written");
										//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName());
									}
									else{
										saveResource(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() +"//Simulations//" + dia.getFileName().substring(0, dia.getFileName().length() - 4) +"_gen.evesim",resource);	
										//System.out.println("File written");
									}

								}
								catch(Exception e){
									e.printStackTrace();
								}
								monitor.done();
							}
						}
					});
				} catch (InvocationTargetException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


				try {
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);

				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		else {
			//System.out.println("sim is null");
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
