/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.monitor.impl;

import org.eclipse.emf.ecore.EClass;
import org.evesim.EveComponent;
import org.evesim.impl.EveComponentImpl;
import org.evesim.monitor.EveMonitorPeerGroup;
import org.evesim.monitor.MonitorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Monitor Peer Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EveMonitorPeerGroupImpl extends EveComponentImpl implements EveMonitorPeerGroup {
	
	/**
	 * @generated NOT
	 * @ordered
	 */
	@Override
	public void execute() {
		for (EveComponent cmp : getChildren()) {
			cmp.execute();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveMonitorPeerGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitorPackage.Literals.EVE_MONITOR_PEER_GROUP;
	}

} //EveMonitorPeerGroupImpl
