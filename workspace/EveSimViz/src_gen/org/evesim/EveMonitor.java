/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.evesim.EveMonitor#getSleepTime <em>Sleep Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.evesim.EvesimPackage#getEveMonitor()
 * @model
 * @generated
 */
public interface EveMonitor extends EveComponent {

	/**
	 * Returns the value of the '<em><b>Sleep Time</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sleep Time</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleep Time</em>' attribute.
	 * @see #setSleepTime(Integer)
	 * @see org.evesim.EvesimPackage#getEveMonitor_SleepTime()
	 * @model default="5" required="true"
	 * @generated
	 */
	Integer getSleepTime();

	/**
	 * Sets the value of the '{@link org.evesim.EveMonitor#getSleepTime <em>Sleep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleep Time</em>' attribute.
	 * @see #getSleepTime()
	 * @generated
	 */
	void setSleepTime(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void startMonitoring();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stopMonitoring();
} // EveMonitor
