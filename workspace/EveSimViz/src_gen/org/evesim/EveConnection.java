/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveConnection#getConnectedComponent <em>Connected Component</em>}</li>
 *   <li>{@link org.evesim.EveConnection#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.evesim.EveConnection#isConnected <em>Connected</em>}</li>
 *   <li>{@link org.evesim.EveConnection#getType <em>Type</em>}</li>
 *   <li>{@link org.evesim.EveConnection#isDirectional <em>Directional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveConnection()
 * @model
 * @generated
 */
public interface EveConnection extends EveComponent {
	/**
	 * Returns the value of the '<em><b>Connected Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.evesim.EveComponent#getAttachedConnections <em>Attached Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Component</em>' reference.
	 * @see #setConnectedComponent(EveComponent)
	 * @see org.evesim.EvesimPackage#getEveConnection_ConnectedComponent()
	 * @see org.evesim.EveComponent#getAttachedConnections
	 * @model opposite="attachedConnections" keys="uuid"
	 * @generated
	 */
	EveComponent getConnectedComponent();

	/**
	 * Sets the value of the '{@link org.evesim.EveConnection#getConnectedComponent <em>Connected Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected Component</em>' reference.
	 * @see #getConnectedComponent()
	 * @generated
	 */
	void setConnectedComponent(EveComponent value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see #setStrength(float)
	 * @see org.evesim.EvesimPackage#getEveConnection_Strength()
	 * @model
	 * @generated
	 */
	float getStrength();

	/**
	 * Sets the value of the '{@link org.evesim.EveConnection#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(float value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see org.evesim.EvesimPackage#getEveConnection_Connected()
	 * @model default="true"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link org.evesim.EveConnection#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.evesim.EvesimPackage#getEveConnection_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.evesim.EveConnection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directional</em>' attribute.
	 * @see #setDirectional(boolean)
	 * @see org.evesim.EvesimPackage#getEveConnection_Directional()
	 * @model
	 * @generated
	 */
	boolean isDirectional();

	/**
	 * Sets the value of the '{@link org.evesim.EveConnection#isDirectional <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directional</em>' attribute.
	 * @see #isDirectional()
	 * @generated
	 */
	void setDirectional(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EveComponent getOpposite(EveComponent component);

} // EveConnection
