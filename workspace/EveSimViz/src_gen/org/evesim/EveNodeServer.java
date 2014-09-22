/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import java.lang.Runnable;
import org.eclipse.emf.ecore.EObject;
import org.mortbay.jetty.Server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Node Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveNodeServer#getNode <em>Node</em>}</li>
 *   <li>{@link org.evesim.EveNodeServer#getJettyServer <em>Jetty Server</em>}</li>
 *   <li>{@link org.evesim.EveNodeServer#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link org.evesim.EveNodeServer#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link org.evesim.EveNodeServer#getThread <em>Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveNodeServer()
 * @model superTypes="org.evesim.Runnable"
 * @generated
 */
public interface EveNodeServer extends EObject, Runnable {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveNode#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(EveNode)
	 * @see org.evesim.EvesimPackage#getEveNodeServer_Node()
	 * @see org.evesim.EveNode#getServer
	 * @model opposite="server"
	 * @generated
	 */
	EveNode getNode();

	/**
	 * Sets the value of the '{@link org.evesim.EveNodeServer#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(EveNode value);

	/**
	 * Returns the value of the '<em><b>Jetty Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetty Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetty Server</em>' attribute.
	 * @see #setJettyServer(Server)
	 * @see org.evesim.EvesimPackage#getEveNodeServer_JettyServer()
	 * @model dataType="org.evesim.JettyServer"
	 * @generated
	 */
	Server getJettyServer();

	/**
	 * Sets the value of the '{@link org.evesim.EveNodeServer#getJettyServer <em>Jetty Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jetty Server</em>' attribute.
	 * @see #getJettyServer()
	 * @generated
	 */
	void setJettyServer(Server value);

	/**
	 * Returns the value of the '<em><b>Server Host</b></em>' attribute.
	 * The default value is <code>"127.0.0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Host</em>' attribute.
	 * @see #setServerHost(String)
	 * @see org.evesim.EvesimPackage#getEveNodeServer_ServerHost()
	 * @model default="127.0.0.1"
	 * @generated
	 */
	String getServerHost();

	/**
	 * Sets the value of the '{@link org.evesim.EveNodeServer#getServerHost <em>Server Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Host</em>' attribute.
	 * @see #getServerHost()
	 * @generated
	 */
	void setServerHost(String value);

	/**
	 * Returns the value of the '<em><b>Server Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Port</em>' attribute.
	 * @see #setServerPort(int)
	 * @see org.evesim.EvesimPackage#getEveNodeServer_ServerPort()
	 * @model default="8080"
	 * @generated
	 */
	int getServerPort();

	/**
	 * Sets the value of the '{@link org.evesim.EveNodeServer#getServerPort <em>Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Port</em>' attribute.
	 * @see #getServerPort()
	 * @generated
	 */
	void setServerPort(int value);

	/**
	 * Returns the value of the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' attribute.
	 * @see #setThread(Thread)
	 * @see org.evesim.EvesimPackage#getEveNodeServer_Thread()
	 * @model dataType="org.evesim.Thread"
	 * @generated
	 */
	Thread getThread();

	/**
	 * Sets the value of the '{@link org.evesim.EveNodeServer#getThread <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' attribute.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(Thread value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getServerBase();

} // EveNodeServer
