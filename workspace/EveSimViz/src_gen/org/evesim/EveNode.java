/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.common.util.EList;
import org.evesim.msg.EveMessage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveNode#getMessageQueue <em>Message Queue</em>}</li>
 *   <li>{@link org.evesim.EveNode#getServer <em>Server</em>}</li>
 *   <li>{@link org.evesim.EveNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.evesim.EveNode#getServerUrl <em>Server Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveNode()
 * @model
 * @generated
 */
public interface EveNode extends EveComponent, EveMessageSink {
	/**
	 * Returns the value of the '<em><b>Message Queue</b></em>' reference list.
	 * The list contents are of type {@link org.evesim.msg.EveMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Queue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Queue</em>' reference list.
	 * @see org.evesim.EvesimPackage#getEveNode_MessageQueue()
	 * @model
	 * @generated
	 */
	EList<EveMessage> getMessageQueue();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveNodeServer#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(EveNodeServer)
	 * @see org.evesim.EvesimPackage#getEveNode_Server()
	 * @see org.evesim.EveNodeServer#getNode
	 * @model opposite="node"
	 * @generated
	 */
	EveNodeServer getServer();

	/**
	 * Sets the value of the '{@link org.evesim.EveNode#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(EveNodeServer value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.evesim.EveNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see org.evesim.EveNodeType
	 * @see #setNodeType(EveNodeType)
	 * @see org.evesim.EvesimPackage#getEveNode_NodeType()
	 * @model
	 * @generated
	 */
	EveNodeType getNodeType();

	/**
	 * Sets the value of the '{@link org.evesim.EveNode#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see org.evesim.EveNodeType
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(EveNodeType value);

	/**
	 * Returns the value of the '<em><b>Server Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Url</em>' attribute.
	 * @see #setServerUrl(String)
	 * @see org.evesim.EvesimPackage#getEveNode_ServerUrl()
	 * @model
	 * @generated
	 */
	String getServerUrl();

	/**
	 * Sets the value of the '{@link org.evesim.EveNode#getServerUrl <em>Server Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Url</em>' attribute.
	 * @see #getServerUrl()
	 * @generated
	 */
	void setServerUrl(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void submitMessage(EveMessage message);

} // EveNode
