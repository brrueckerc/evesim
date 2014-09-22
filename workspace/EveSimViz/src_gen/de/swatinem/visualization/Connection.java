/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.swatinem.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.swatinem.visualization.Connection#getPoint1 <em>Point1</em>}</li>
 *   <li>{@link de.swatinem.visualization.Connection#getPoint2 <em>Point2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.swatinem.visualization.VisualizationPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Component {
	/**
	 * Returns the value of the '<em><b>Point1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point1</em>' reference.
	 * @see #setPoint1(Node)
	 * @see de.swatinem.visualization.VisualizationPackage#getConnection_Point1()
	 * @model
	 * @generated
	 */
	Node getPoint1();

	/**
	 * Sets the value of the '{@link de.swatinem.visualization.Connection#getPoint1 <em>Point1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point1</em>' reference.
	 * @see #getPoint1()
	 * @generated
	 */
	void setPoint1(Node value);

	/**
	 * Returns the value of the '<em><b>Point2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point2</em>' reference.
	 * @see #setPoint2(Node)
	 * @see de.swatinem.visualization.VisualizationPackage#getConnection_Point2()
	 * @model
	 * @generated
	 */
	Node getPoint2();

	/**
	 * Sets the value of the '{@link de.swatinem.visualization.Connection#getPoint2 <em>Point2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point2</em>' reference.
	 * @see #getPoint2()
	 * @generated
	 */
	void setPoint2(Node value);

} // Connection
