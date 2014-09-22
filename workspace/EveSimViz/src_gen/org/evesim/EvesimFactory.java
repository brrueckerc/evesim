/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.EvesimPackage
 * @generated
 */
public interface EvesimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvesimFactory eINSTANCE = org.evesim.impl.EvesimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Agent</em>'.
	 * @generated
	 */
	EveAgent createEveAgent();

	/**
	 * Returns a new object of class '<em>Eve Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Component</em>'.
	 * @generated
	 */
	EveComponent createEveComponent();

	/**
	 * Returns a new object of class '<em>Eve Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Service</em>'.
	 * @generated
	 */
	EveService createEveService();

	/**
	 * Returns a new object of class '<em>Eve Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Connection</em>'.
	 * @generated
	 */
	EveConnection createEveConnection();

	/**
	 * Returns a new object of class '<em>Eve Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Location</em>'.
	 * @generated
	 */
	EveLocation createEveLocation();

	/**
	 * Returns a new object of class '<em>Eve Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Simulation</em>'.
	 * @generated
	 */
	EveSimulation createEveSimulation();

	/**
	 * Returns a new object of class '<em>Eve Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Monitor</em>'.
	 * @generated
	 */
	EveMonitor createEveMonitor();

	/**
	 * Returns a new object of class '<em>Eve Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Prototype</em>'.
	 * @generated
	 */
	EvePrototype createEvePrototype();

	/**
	 * Returns a new object of class '<em>Eve Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Node</em>'.
	 * @generated
	 */
	EveNode createEveNode();

	/**
	 * Returns a new object of class '<em>Eve Node Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Node Server</em>'.
	 * @generated
	 */
	EveNodeServer createEveNodeServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvesimPackage getEvesimPackage();

} //EvesimFactory
