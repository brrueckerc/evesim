/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveAgent#getPrototypeUUID <em>Prototype UUID</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getAgentPoolUUID <em>Agent Pool UUID</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getAgentPool <em>Agent Pool</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getDemandedServices <em>Demanded Services</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getOfferedServices <em>Offered Services</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getLocalServicePool <em>Local Service Pool</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getBetweeness <em>Betweeness</em>}</li>
 *   <li>{@link org.evesim.EveAgent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveAgent()
 * @model
 * @generated
 */
public interface EveAgent extends EveComponent, IControllable {
	/**
	 * Returns the value of the '<em><b>Prototype UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype UUID</em>' attribute.
	 * @see #setPrototypeUUID(UUID)
	 * @see org.evesim.EvesimPackage#getEveAgent_PrototypeUUID()
	 * @model dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getPrototypeUUID();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getPrototypeUUID <em>Prototype UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype UUID</em>' attribute.
	 * @see #getPrototypeUUID()
	 * @generated
	 */
	void setPrototypeUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(EvePrototype)
	 * @see org.evesim.EvesimPackage#getEveAgent_Prototype()
	 * @model
	 * @generated
	 */
	EvePrototype getPrototype();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(EvePrototype value);

	/**
	 * Returns the value of the '<em><b>Agent Pool UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Pool UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Pool UUID</em>' attribute.
	 * @see #setAgentPoolUUID(UUID)
	 * @see org.evesim.EvesimPackage#getEveAgent_AgentPoolUUID()
	 * @model dataType="org.evesim.UUID"
	 * @generated
	 */
	UUID getAgentPoolUUID();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getAgentPoolUUID <em>Agent Pool UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Pool UUID</em>' attribute.
	 * @see #getAgentPoolUUID()
	 * @generated
	 */
	void setAgentPoolUUID(UUID value);

	/**
	 * Returns the value of the '<em><b>Agent Pool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Pool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Pool</em>' reference.
	 * @see #setAgentPool(EvePrototype)
	 * @see org.evesim.EvesimPackage#getEveAgent_AgentPool()
	 * @model
	 * @generated
	 */
	EvePrototype getAgentPool();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getAgentPool <em>Agent Pool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Pool</em>' reference.
	 * @see #getAgentPool()
	 * @generated
	 */
	void setAgentPool(EvePrototype value);

	/**
	 * Returns the value of the '<em><b>Demanded Services</b></em>' reference list.
	 * The list contents are of type {@link org.evesim.EveService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demanded Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demanded Services</em>' reference list.
	 * @see org.evesim.EvesimPackage#getEveAgent_DemandedServices()
	 * @model
	 * @generated
	 */
	EList<EveService> getDemandedServices();

	/**
	 * Returns the value of the '<em><b>Offered Services</b></em>' reference list.
	 * The list contents are of type {@link org.evesim.EveService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Services</em>' reference list.
	 * @see org.evesim.EvesimPackage#getEveAgent_OfferedServices()
	 * @model
	 * @generated
	 */
	EList<EveService> getOfferedServices();

	/**
	 * Returns the value of the '<em><b>Local Service Pool</b></em>' reference list.
	 * The list contents are of type {@link org.evesim.EveService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Service Pool</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Service Pool</em>' reference list.
	 * @see org.evesim.EvesimPackage#getEveAgent_LocalServicePool()
	 * @model
	 * @generated
	 */
	EList<EveService> getLocalServicePool();

	/**
	 * Returns the value of the '<em><b>Betweeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Betweeness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Betweeness</em>' attribute.
	 * @see #setBetweeness(float)
	 * @see org.evesim.EvesimPackage#getEveAgent_Betweeness()
	 * @model
	 * @generated
	 */
	float getBetweeness();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getBetweeness <em>Betweeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betweeness</em>' attribute.
	 * @see #getBetweeness()
	 * @generated
	 */
	void setBetweeness(float value);

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
	 * @see org.evesim.EvesimPackage#getEveAgent_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.evesim.EveAgent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // EveAgent
