/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.evesim.EveNode;
import org.evesim.EveNodeServer;
import org.evesim.EvesimPackage;
import org.evesim.http.EveMonitorServlet;
import org.evesim.http.EveSimServerServlet;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Node Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveNodeServerImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeServerImpl#getJettyServer <em>Jetty Server</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeServerImpl#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeServerImpl#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeServerImpl#getThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveNodeServerImpl extends EObjectImpl implements EveNodeServer {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EveNode node;

	/**
	 * The default value of the '{@link #getJettyServer() <em>Jetty Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJettyServer()
	 * @generated
	 * @ordered
	 */
	protected static final Server JETTY_SERVER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJettyServer() <em>Jetty Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJettyServer()
	 * @generated
	 * @ordered
	 */
	protected Server jettyServer = JETTY_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHost()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_HOST_EDEFAULT = "127.0.0.1";

	/**
	 * The cached value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHost()
	 * @generated
	 * @ordered
	 */
	protected String serverHost = SERVER_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerPort()
	 * @generated
	 * @ordered
	 */
	protected int serverPort = SERVER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected static final Thread THREAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected Thread thread = THREAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveNodeServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_NODE_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (EveNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvesimPackage.EVE_NODE_SERVER__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(EveNode newNode, NotificationChain msgs) {
		EveNode oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__NODE, oldNode, newNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(EveNode newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject)node).eInverseRemove(this, EvesimPackage.EVE_NODE__SERVER, EveNode.class, msgs);
			if (newNode != null)
				msgs = ((InternalEObject)newNode).eInverseAdd(this, EvesimPackage.EVE_NODE__SERVER, EveNode.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getJettyServer() {
		return jettyServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJettyServer(Server newJettyServer) {
		Server oldJettyServer = jettyServer;
		jettyServer = newJettyServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__JETTY_SERVER, oldJettyServer, jettyServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerHost() {
		return serverHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerHost(String newServerHost) {
		String oldServerHost = serverHost;
		serverHost = newServerHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__SERVER_HOST, oldServerHost, serverHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServerPort() {
		return serverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerPort(int newServerPort) {
		int oldServerPort = serverPort;
		serverPort = newServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__SERVER_PORT, oldServerPort, serverPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(Thread newThread) {
		Thread oldThread = thread;
		thread = newThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE_SERVER__THREAD, oldThread, thread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init() {
		setJettyServer(new Server(getServerPort()));
		Context root = new Context(getJettyServer(), "/", Context.SESSIONS);
		root.addServlet(new ServletHolder(new EveSimServerServlet()), "/eve/*");
		root.addServlet(new ServletHolder(new EveMonitorServlet()), "/monitor/*");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void start() {
		Thread t = new Thread(this);
		setThread(t);
		t.start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void stop() {
		try {
			getJettyServer().stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO: check if this is working
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getServerBase() {
		return "http://" + getServerHost() + ":" + getServerPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void run() {
		try {
			getJettyServer().start();
		} catch (Exception ex) {
			//logger.log(Level.SEVERE, "Embedded webserver could not be started. Visualisations may not work.", ex);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				if (node != null)
					msgs = ((InternalEObject)node).eInverseRemove(this, EvesimPackage.EVE_NODE__SERVER, EveNode.class, msgs);
				return basicSetNode((EveNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				return basicSetNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case EvesimPackage.EVE_NODE_SERVER__JETTY_SERVER:
				return getJettyServer();
			case EvesimPackage.EVE_NODE_SERVER__SERVER_HOST:
				return getServerHost();
			case EvesimPackage.EVE_NODE_SERVER__SERVER_PORT:
				return getServerPort();
			case EvesimPackage.EVE_NODE_SERVER__THREAD:
				return getThread();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				setNode((EveNode)newValue);
				return;
			case EvesimPackage.EVE_NODE_SERVER__JETTY_SERVER:
				setJettyServer((Server)newValue);
				return;
			case EvesimPackage.EVE_NODE_SERVER__SERVER_HOST:
				setServerHost((String)newValue);
				return;
			case EvesimPackage.EVE_NODE_SERVER__SERVER_PORT:
				setServerPort((Integer)newValue);
				return;
			case EvesimPackage.EVE_NODE_SERVER__THREAD:
				setThread((Thread)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				setNode((EveNode)null);
				return;
			case EvesimPackage.EVE_NODE_SERVER__JETTY_SERVER:
				setJettyServer(JETTY_SERVER_EDEFAULT);
				return;
			case EvesimPackage.EVE_NODE_SERVER__SERVER_HOST:
				setServerHost(SERVER_HOST_EDEFAULT);
				return;
			case EvesimPackage.EVE_NODE_SERVER__SERVER_PORT:
				setServerPort(SERVER_PORT_EDEFAULT);
				return;
			case EvesimPackage.EVE_NODE_SERVER__THREAD:
				setThread(THREAD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE_SERVER__NODE:
				return node != null;
			case EvesimPackage.EVE_NODE_SERVER__JETTY_SERVER:
				return JETTY_SERVER_EDEFAULT == null ? jettyServer != null : !JETTY_SERVER_EDEFAULT.equals(jettyServer);
			case EvesimPackage.EVE_NODE_SERVER__SERVER_HOST:
				return SERVER_HOST_EDEFAULT == null ? serverHost != null : !SERVER_HOST_EDEFAULT.equals(serverHost);
			case EvesimPackage.EVE_NODE_SERVER__SERVER_PORT:
				return serverPort != SERVER_PORT_EDEFAULT;
			case EvesimPackage.EVE_NODE_SERVER__THREAD:
				return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jettyServer: ");
		result.append(jettyServer);
		result.append(", serverHost: ");
		result.append(serverHost);
		result.append(", serverPort: ");
		result.append(serverPort);
		result.append(", thread: ");
		result.append(thread);
		result.append(')');
		return result.toString();
	}

} //EveNodeServerImpl
