package org.evesim;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.gui.properties.EveSimClientSessionPropertySource;
import org.evesim.http.EveSimSyncService;
import org.evesim.msg.EveMessageBundle;
import org.evesim.timer.EveTimer;

/**
 * This class is used to distribute the simulation to the individual simulation
 * nodes.
 * 
 */
public class EveSimClientSession implements IAdaptable {

	public final static Logger logger = Logger.getLogger(EveSimClientSession.class.getName());

	private Hashtable<EveNode, EveSimSyncService> syncReg = new Hashtable<EveNode, EveSimSyncService>();

	Resource.Factory.Registry reg;

	private EveSimulation sim;
	
	private boolean running = false;

	public EveSimClientSession() {
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		reg = Resource.Factory.Registry.INSTANCE;
	}

	public EveSimClientSession(EveSimulation sim) {
		this.sim = sim;
	}

	public void start() {
		deployAndStart(sim);
	}

	protected void send(EveComponent cmp, URL target) {
		// Register the XMI resource factory for the .evesim extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("evesim/test.evesim"));

		resource.getContents().add(cmp);

		// Construct data
		// char[] data;

		URLConnection connection = null;
		try {
			// Send data
			connection = target.openConnection();
			connection.setDoOutput(true);
			BufferedOutputStream bs = new BufferedOutputStream(connection.getOutputStream());

			resource.save(bs, Collections.EMPTY_MAP);
			bs.flush();
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line = null;
			while ((line = rd.readLine()) != null) {
				// Process line...
			}
			bs.close();
			rd.close();

		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not send XMI content to " + target, e);
		}
	}

	protected void deployAndStart(EveSimulation root) {
		//root.setSessionID(UUID.randomUUID());
		logger.info("Deploying simulation: " + root.getUuid() + ".");
		deploy(root);
		logger.info("Start simulation synchronization: " + root.getUuid() + ".");
		startSync(root);
		logger.info("Start remote nodes: " + root.getUuid() + ".");
		startNode(root);
		logger.info("Start local nodes: " + root.getUuid() + ".");
		startLocal(root);
		logger.info("Start finished: " + root.getUuid() + ".");
	}
	
	protected void stopAndUndeploy(EveSimulation root) {
		logger.info("Stopping simulation: " + root.getUuid() + ".");
		
		logger.info("Stopping local nodes: " + root.getUuid() + ".");
		stopLocal(root); 
		
		logger.info("Stopping remote nodes: " + root.getUuid() + ".");
		stopNode(root);
		
		logger.info("Stopping simulation synchronization : " + root.getUuid() + ".");
		stopSync(root);
		
		logger.info("Deleting simulation session: " + root.getUuid() + ".");
		deleteNode(root);
		
		EveSimClientNode.getInstance().getSesstions().remove(this);
		
		
	}
	
	private void stopLocal(EveSimulation root) {
		iterateAndStopLocalNodes(root);
	}
	

	private void startLocal(EveSimulation root) {
		iterateAndStartLocalNodes(root);
	}
	
	private void iterateAndStopLocalNodes(EveComponent node) {
		// Abort a remote node is sepcified
		if (node instanceof EveNode) {
			EveNode en = (EveNode) node;
			if (en.getServerUrl() != null && !en.getServerUrl().isEmpty()) {
				logger.info("Skipping remote node: " + node.getUuid() + ".");
				return;
			}
		}

		// if it is a timer, start it
		if (node instanceof EveTimer) {
			logger.info("Stopping local node: " + node.getUuid() + ".");
			EveTimer timer = (EveTimer) node;
			timer.stop();
		}

		// else iterate through all children;
		EList<EveComponent> cl = node.getChildren();
		Iterator<EveComponent> iter = cl.iterator();
		while (iter.hasNext()) {
			EveComponent eveComponent = (EveComponent) iter.next();
			iterateAndStopLocalNodes(eveComponent);
		}
	}

	private void iterateAndStartLocalNodes(EveComponent node) {
		// Abort a remote node is sepcified
		if (node instanceof EveNode) {
			EveNode en = (EveNode) node;
			if (en.getServerUrl() != null && !en.getServerUrl().isEmpty()) {
				logger.info("Skipping remote node: " + node.getUuid() + ".");
				return;
			}
		}

		// if it is a timer, start it
		if (node instanceof EveTimer) {
			logger.info("Starting local node: " + node.getUuid() + ".");
			EveTimer timer = (EveTimer) node;
			timer.start();
		}

		// else iterate through all children;
		EList<EveComponent> cl = node.getChildren();
		Iterator<EveComponent> iter = cl.iterator();
		while (iter.hasNext()) {
			EveComponent eveComponent = (EveComponent) iter.next();
			iterateAndStartLocalNodes(eveComponent);
		}
	}

	protected void deploy(EveSimulation root) {
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {

				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() == null || node.getServerUrl().isEmpty()) {
					logger.info("Skipping deployment of local node: " + cmp.getUuid() + ".");
				} else {
					logger.info("Deploying remote node: " + cmp.getUuid());
					deployNode((EveNode) cmp);
				}
			}
		}
	}

	protected void startSync(EveSimulation root) {
		logger.info("Starting local sync for session: " + root.getSessionID());
		startSyncLocal(root);
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {
				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() != null && !node.getServerUrl().isEmpty()) {
					logger.info("Starting sync for remote node: " + cmp.getUuid());
					startSyncRemote((EveNode) cmp);
				} else {
					logger.info("Skipping sync for local node: " + cmp.getUuid());
				}
			}
		}
	}
	
	protected void stopSync(EveSimulation root) {
		logger.info("Stopping local sync for session: " + root.getSessionID());
		stopSyncLocal(root);
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {
				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() != null && !node.getServerUrl().isEmpty()) {
					logger.info("Stoppinh sync for remote node: " + cmp.getUuid());
					stopSyncRemote((EveNode) cmp);
				} else {
					logger.info("Skipping stop sync for local node: " + cmp.getUuid());
				}
			}
		}
	}

	protected void startNode(EveSimulation root) {
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {
				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() == null || node.getServerUrl().isEmpty()) {
					logger.info("Skipping starting of local node: " + cmp.getUuid() + ". Will be started locally lateron.");
				} else {
					logger.info("Starting node: " + cmp.getUuid());
					startNode(node);
				}
			}
		}
	}

	protected void stopNode(EveSimulation root) {
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {
				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() == null || node.getServerUrl().isEmpty()) {
					logger.info("Skipping stoppinh of local node: " + cmp.getUuid() + ". Will be stopped locally lateron.");
				} else {
					logger.info("Stopping node: " + cmp.getUuid());
					stopNode(node);
				}
			}
		}
	}
	
	protected void deleteNode(EveSimulation root) {
		Iterator<EveComponent> iter = root.getChildren().iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof EveNode) {
				EveNode node = ((EveNode) cmp);
				if (node.getServerUrl() == null || node.getServerUrl().isEmpty()) {
				} else {
					logger.info("Deleting node: " + cmp.getUuid());
					deleteNode(node);
				}
			}
		}
	}

	protected void deployNode(EveNode node) {

		try {
			String u = getEveNodeUrl(node) + "/init";
			EveNode copy = (EveNode) EcoreUtil.copy(node);
			URL url = new URL(u);
			send(copy, url);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	protected void startSyncRemote(EveNode node) {
		try {
			String u = getEveNodeUrl(node) + "/msg";
			EveSimSyncService sync = new EveSimSyncService(node);
			sync.addConnection(u);
			sync.start();
			syncReg.put(node, sync);
		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "Could not start EveSimSyncService", e);
		}
	}

	protected void stopSyncRemote(EveNode node) {
		EveSimSyncService sync = syncReg.get(node);
		syncReg.remove(node);
		sync.stop();
	}
	
	public boolean getRunning() {
		return running;
	}
	

	protected void stopSyncLocal(final EveSimulation root) {
		running = false;
	}
	
	protected void startSyncLocal(final EveSimulation root) {
		final EveSimSyncService sync = new EveSimSyncService(root);
		running = true;
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (getRunning()) {
					EveMessageBundle b = EveComponentRegistry.getInstance().getSession(root.getSessionID()).getMessages();
					sync.processEveMessageBundle(b);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}

		});
		t.start();
	}

	protected void startNode(EveNode node) {
		String u = getEveNodeUrl(node) + "/start";
		try {
			URL url = new URL(u);
			URLConnection connection = url.openConnection();
			connection.connect();
			connection.getContent();
		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "Could not start SimNode", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not start SimNode", e);
		}
	}

	protected void stopNode(EveNode node) {
		String u = getEveNodeUrl(node) + "/stop";
		try {
			URL url = new URL(u);
			URLConnection connection = url.openConnection();
			connection.connect();
			connection.getContent();
		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "Could not stop SimNode", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not stop SimNode", e);
		}
	}
	
	protected void deleteNode(EveNode node) {
		String u = getEveNodeUrl(node) + "/delete";
		try {
			URL url = new URL(u);
			URLConnection connection = url.openConnection();
			connection.connect();
			connection.getContent();
		} catch (MalformedURLException e) {
			logger.log(Level.SEVERE, "Could not stop SimNode", e);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not stop SimNode", e);
		}
	}

	protected String getEveNodeUrl(EveNode node) {
		String u = node.getServerUrl();
		if (!u.endsWith("/"))
			u = u + '/';
		u = u + "eve/" + node.getSessionID();
		return u;
	}

	@Override
	public Object getAdapter(Class adapter) {
		return new EveSimClientSessionPropertySource(this);
	}

	public void stop() {
		stopAndUndeploy(sim);		
	}
}
