package org.evesim.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveComponent;
import org.evesim.EveComponentRegistry;
import org.evesim.EveMessageSink;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.impl.EveComponentImpl;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveMessage;
import org.evesim.msg.EveMessageBundle;
import org.evesim.msg.EveUpdateMessage;

/**
 * This service contacts the message servlet of the eve network nodes and
 * processes the messages return by the service.
 * 
 * @author reder
 * 
 */
public class EveSimSyncService implements Runnable {

	static {
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
	}

	public final Logger logger = Logger.getLogger(EveSimSyncService.class.getName());

	/**
	 * sleeptime between the sync runs
	 */
	private long sleepTime = 1000 * 15; // 15 sec

	/**
	 * Reference to this service's thread
	 */
	private Thread t = null;

	/**
	 * Root component of this session
	 */
	private EveComponent rootComponent = null;

	/**
	 * List of nodes to connect
	 */
	private ArrayList<URL> connections = null;

	/**
	 * ResourceSet for the XMI deserialisation
	 */
	private ResourceSet resSet = null;
	
	private boolean running = false;

	/**
	 * Initializes the service
	 */
	public EveSimSyncService() {
		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		connections = new ArrayList<URL>();
		resSet = new ResourceSetImpl();
	}

	/**
	 * Initializes the sync service and binds the root component. The root
	 * component is needed for the receiver lookup. Nodes that are not part of
	 * the hierarchy cannot be located and errors may occur while delivering
	 * messages.
	 * 
	 * @param rootComponent
	 */
	public EveSimSyncService(EveComponent rootComponent) {
		this();
		bindRootComponent(rootComponent);
	}

	/**
	 * Starts the sync service by creating and starting a new thread
	 */
	public void start() {
		t = new Thread(this);
		running = true;
		t.start();
	}

	/**
	 * This method processes the individual messages return by a node. The
	 * method iterates through the messages in the bundle, checks the type and
	 * acts upon that.
	 * 
	 * @param bundle
	 * @see #runSync
	 */
	public void processEveMessageBundle(EveMessageBundle bundle) {
		if (bundle == null) {
			throw new RuntimeException("MessageBundle must not be null.");
		}

		EList<EveMessage> messages = bundle.getMessages();
		Iterator<EveMessage> iter = messages.iterator();
		while (iter.hasNext()) {
			EveMessage msg = iter.next();
			if (msg instanceof EveUpdateMessage) {
				EveUpdateMessage umsg = (EveUpdateMessage) msg;
				try {
					EveComponent recieverNode = EveComponentRegistry.getInstance().lookupNode(rootComponent, msg.getRecieverUUID());
					((EveComponentImpl) recieverNode).eSet(umsg.getFeatureID(), umsg.getNewValue());
				} catch (Exception e) {
					logger.log(Level.SEVERE, "Could not update node: " + msg.getRecieverUUID(), e);
				}
			} else if (msg instanceof EveLogMessage) {
				EveLogMessage umsg = (EveLogMessage) msg;
				logger.info("Remote Log: " + umsg.getMessage() + "\n" + umsg.getDetail());

			} else if (msg instanceof EveDataMessage) {
				EveDataMessage dmsg = (EveDataMessage) msg;
				processDataMessage(dmsg);
				logger.info("Data Message: "+dmsg);
			} else {
				logger.info("Anonymous Log: " + msg.toString());
			}
		}
	}

	private void processDataMessage(EveDataMessage dmsg) {
		for (EveComponent cmp : rootComponent.getChildren()) {
			if (cmp instanceof EveMessageSink) {
				((EveMessageSink)cmp).submitMessage(dmsg);
			}
		}
	}

	/**
	 * Returns the message bundle retrieved from a node. It is invoked
	 * {@link #runSync(URL)} and the result is further processed by
	 * {@link #processEveMessageBundle(EveMessageBundle)}.
	 * 
	 * @param connection
	 * @return
	 */
	protected EveMessageBundle getEveMessageBundleFromNode(URL connection) {
		EObject root = null;
		try {
			URLConnection conn = connection.openConnection();
			Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("/msg.evesim"));
			resource.load(conn.getInputStream(), Collections.EMPTY_MAP);
			root = resource.getContents().get(0);
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error while polling for messages: " + connection, e);
		}

		if (root == null) {
			throw new RuntimeException("MessageBundle must not be null.");
		}

		if (root instanceof EveMessageBundle) {
			return (EveMessageBundle) root;
		} else {
			throw new RuntimeException("Message type 'EveMessageBundle' expected. Recieved: " + root.getClass().getName());
		}
	}

	/**
	 * The synchronization run for one node is performed in this method. The
	 * node is contacted and the message bundle is received by
	 * getEveMessageBundleFromNode. The message bundle then is processed by
	 * processEveMessageBundle
	 * 
	 * @param connection
	 * @see #getEveMessageBundleFromNode(URL)
	 * @see #processEveMessageBundle(EveMessageBundle)
	 */
	public void runSync(URL connection) {
		EveMessageBundle root = getEveMessageBundleFromNode(connection);
		processEveMessageBundle((EveMessageBundle) root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (running) {

			Iterator<URL> iter = connections.iterator();
			while (iter.hasNext()) {
				runSync(iter.next());
			}

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Sets the root component for the sync service. The root component is
	 * needed for the receiver lookup. Nodes that are not part of the hierarchy
	 * cannot be located and errors may occur while delivering messages.
	 * 
	 * @param component
	 */
	public void bindRootComponent(EveComponent component) {
		this.rootComponent = component;
	}

	/**
	 * Adds a connection to the list of nodes to poll as URL. See
	 * {@link #addConnection(String)} for an example how the URL has to look
	 * like.
	 * 
	 * @param connection
	 * @see #addConnection(String)
	 */
	public void addConnection(URL connection) {
		connections.add(connection);
	}

	/**
	 * Adds a connection to the list of nodes to poll as String. <br>
	 * Example:<br>
	 * <code>sync.addConnection("http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg");</code>
	 * 
	 * @param connection
	 * @throws MalformedURLException
	 */
	public void addConnection(String connection) throws MalformedURLException {
		addConnection(new URL(connection));
	}

	public void stop() {
		running = false;
		t.interrupt();
	}

	/*
	 * public static void main(String[] args) { EveSimSyncService eve = new
	 * EveSimSyncService(); eve.start(); }
	 */

}
