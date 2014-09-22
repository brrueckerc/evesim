/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.swatinem.visualization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.swatinem.visualization.Connection;
import de.swatinem.visualization.Node;
import de.swatinem.visualization.VisualizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.swatinem.visualization.impl.ConnectionImpl#getPoint1 <em>Point1</em>}</li>
 *   <li>{@link de.swatinem.visualization.impl.ConnectionImpl#getPoint2 <em>Point2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends ComponentImpl implements Connection {
	/**
	 * The cached value of the '{@link #getPoint1() <em>Point1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint1()
	 * @generated
	 * @ordered
	 */
	protected Node point1;

	/**
	 * The cached value of the '{@link #getPoint2() <em>Point2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoint2()
	 * @generated
	 * @ordered
	 */
	protected Node point2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getPoint1() {
		if (point1 != null && point1.eIsProxy()) {
			InternalEObject oldPoint1 = (InternalEObject)point1;
			point1 = (Node)eResolveProxy(oldPoint1);
			if (point1 != oldPoint1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.CONNECTION__POINT1, oldPoint1, point1));
			}
		}
		return point1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetPoint1() {
		return point1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint1(Node newPoint1) {
		Node oldPoint1 = point1;
		point1 = newPoint1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.CONNECTION__POINT1, oldPoint1, point1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getPoint2() {
		if (point2 != null && point2.eIsProxy()) {
			InternalEObject oldPoint2 = (InternalEObject)point2;
			point2 = (Node)eResolveProxy(oldPoint2);
			if (point2 != oldPoint2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.CONNECTION__POINT2, oldPoint2, point2));
			}
		}
		return point2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetPoint2() {
		return point2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint2(Node newPoint2) {
		Node oldPoint2 = point2;
		point2 = newPoint2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.CONNECTION__POINT2, oldPoint2, point2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.CONNECTION__POINT1:
				if (resolve) return getPoint1();
				return basicGetPoint1();
			case VisualizationPackage.CONNECTION__POINT2:
				if (resolve) return getPoint2();
				return basicGetPoint2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizationPackage.CONNECTION__POINT1:
				setPoint1((Node)newValue);
				return;
			case VisualizationPackage.CONNECTION__POINT2:
				setPoint2((Node)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualizationPackage.CONNECTION__POINT1:
				setPoint1((Node)null);
				return;
			case VisualizationPackage.CONNECTION__POINT2:
				setPoint2((Node)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualizationPackage.CONNECTION__POINT1:
				return point1 != null;
			case VisualizationPackage.CONNECTION__POINT2:
				return point2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
