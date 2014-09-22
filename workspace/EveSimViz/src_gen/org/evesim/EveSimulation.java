/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveSimulation#getStepDuration <em>Step Duration</em>}</li>
 *   <li>{@link org.evesim.EveSimulation#getStepCount <em>Step Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveSimulation()
 * @model
 * @generated
 */
public interface EveSimulation extends EveComponent {
	/**
	 * Returns the value of the '<em><b>Step Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Duration</em>' attribute.
	 * @see #setStepDuration(long)
	 * @see org.evesim.EvesimPackage#getEveSimulation_StepDuration()
	 * @model
	 * @generated
	 */
	long getStepDuration();

	/**
	 * Sets the value of the '{@link org.evesim.EveSimulation#getStepDuration <em>Step Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Duration</em>' attribute.
	 * @see #getStepDuration()
	 * @generated
	 */
	void setStepDuration(long value);

	/**
	 * Returns the value of the '<em><b>Step Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Count</em>' attribute.
	 * @see #setStepCount(long)
	 * @see org.evesim.EvesimPackage#getEveSimulation_StepCount()
	 * @model
	 * @generated
	 */
	long getStepCount();

	/**
	 * Sets the value of the '{@link org.evesim.EveSimulation#getStepCount <em>Step Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Count</em>' attribute.
	 * @see #getStepCount()
	 * @generated
	 */
	void setStepCount(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void simStart();

} // EveSimulation
