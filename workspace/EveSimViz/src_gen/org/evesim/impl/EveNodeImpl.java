/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.evesim.EveNode;
import org.evesim.EveNodeServer;
import org.evesim.EveNodeType;
import org.evesim.EvesimPackage;
import org.evesim.msg.EveMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.impl.EveNodeImpl#getMessageQueue <em>Message Queue</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.evesim.impl.EveNodeImpl#getServerUrl <em>Server Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveNodeImpl extends EveComponentImpl implements EveNode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2405905209974943799L;
	/**
	 * The cached value of the '{@link #getMessageQueue() <em>Message Queue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageQueue()
	 * @generated
	 * @ordered
	 */
	protected EList<EveMessage> messageQueue;
	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected EveNodeServer server;
	/**
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final EveNodeType NODE_TYPE_EDEFAULT = EveNodeType.SERVER;
	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected EveNodeType nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServerUrl() <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUrl()
	 * @generated
	 * @ordered
	 */
	protected String serverUrl = SERVER_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvesimPackage.Literals.EVE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EveMessage> getMessageQueue() {
		if (messageQueue == null) {
			messageQueue = new EObjectResolvingEList<EveMessage>(EveMessage.class, this, EvesimPackage.EVE_NODE__MESSAGE_QUEUE);
		}
		return messageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNodeServer getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (EveNodeServer)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvesimPackage.EVE_NODE__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNodeServer basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(EveNodeServer newServer, NotificationChain msgs) {
		EveNodeServer oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(EveNodeServer newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EvesimPackage.EVE_NODE_SERVER__NODE, EveNodeServer.class, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EvesimPackage.EVE_NODE_SERVER__NODE, EveNodeServer.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveNodeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(EveNodeType newNodeType) {
		EveNodeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerUrl(String newServerUrl) {
		String oldServerUrl = serverUrl;
		serverUrl = newServerUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvesimPackage.EVE_NODE__SERVER_URL, oldServerUrl, serverUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void submitMessage(EveMessage message) {
		// standard node omits message
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE__SERVER:
				if (server != null)
					msgs = ((InternalEObject)server).eInverseRemove(this, EvesimPackage.EVE_NODE_SERVER__NODE, EveNodeServer.class, msgs);
				return basicSetServer((EveNodeServer)otherEnd, msgs);
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
			case EvesimPackage.EVE_NODE__SERVER:
				return basicSetServer(null, msgs);
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
			case EvesimPackage.EVE_NODE__MESSAGE_QUEUE:
				return getMessageQueue();
			case EvesimPackage.EVE_NODE__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case EvesimPackage.EVE_NODE__NODE_TYPE:
				return getNodeType();
			case EvesimPackage.EVE_NODE__SERVER_URL:
				return getServerUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvesimPackage.EVE_NODE__MESSAGE_QUEUE:
				getMessageQueue().clear();
				getMessageQueue().addAll((Collection<? extends EveMessage>)newValue);
				return;
			case EvesimPackage.EVE_NODE__SERVER:
				setServer((EveNodeServer)newValue);
				return;
			case EvesimPackage.EVE_NODE__NODE_TYPE:
				setNodeType((EveNodeType)newValue);
				return;
			case EvesimPackage.EVE_NODE__SERVER_URL:
				setServerUrl((String)newValue);
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
			case EvesimPackage.EVE_NODE__MESSAGE_QUEUE:
				getMessageQueue().clear();
				return;
			case EvesimPackage.EVE_NODE__SERVER:
				setServer((EveNodeServer)null);
				return;
			case EvesimPackage.EVE_NODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case EvesimPackage.EVE_NODE__SERVER_URL:
				setServerUrl(SERVER_URL_EDEFAULT);
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
			case EvesimPackage.EVE_NODE__MESSAGE_QUEUE:
				return messageQueue != null && !messageQueue.isEmpty();
			case EvesimPackage.EVE_NODE__SERVER:
				return server != null;
			case EvesimPackage.EVE_NODE__NODE_TYPE:
				return nodeType != NODE_TYPE_EDEFAULT;
			case EvesimPackage.EVE_NODE__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverUrl != null : !SERVER_URL_EDEFAULT.equals(serverUrl);
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
		result.append(" (nodeType: ");
		result.append(nodeType);
		result.append(", serverUrl: ");
		result.append(serverUrl);
		result.append(')');
		return result.toString();
	}

} //EveNodeImpl
