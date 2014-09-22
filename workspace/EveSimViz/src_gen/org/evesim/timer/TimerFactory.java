/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.timer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.timer.TimerPackage
 * @generated
 */
public interface TimerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimerFactory eINSTANCE = org.evesim.timer.impl.TimerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Timer</em>'.
	 * @generated
	 */
	EveTimer createEveTimer();

	/**
	 * Returns a new object of class '<em>Eve Repeating Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Repeating Timer</em>'.
	 * @generated
	 */
	EveRepeatingTimer createEveRepeatingTimer();

	/**
	 * Returns a new object of class '<em>Eve Starting Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Starting Timer</em>'.
	 * @generated
	 */
	EveStartingTimer createEveStartingTimer();

	/**
	 * Returns a new object of class '<em>Eve Function Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Function Timer</em>'.
	 * @generated
	 */
	EveFunctionTimer createEveFunctionTimer();

	/**
	 * Returns a new object of class '<em>Eve History Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve History Timer</em>'.
	 * @generated
	 */
	EveHistoryTimer createEveHistoryTimer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimerPackage getTimerPackage();

} //TimerFactory
