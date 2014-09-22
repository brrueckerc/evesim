/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.monitor.MonitorPackage
 * @generated
 */
public interface MonitorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitorFactory eINSTANCE = org.evesim.monitor.impl.MonitorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Monitor Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Monitor Node</em>'.
	 * @generated
	 */
	EveMonitorNode createEveMonitorNode();

	/**
	 * Returns a new object of class '<em>Eve Monitor Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Monitor Peer Group</em>'.
	 * @generated
	 */
	EveMonitorPeerGroup createEveMonitorPeerGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MonitorPackage getMonitorPackage();

} //MonitorFactory
