/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.swatinem.visualization;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.swatinem.visualization.Component#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.swatinem.visualization.VisualizationPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see de.swatinem.visualization.VisualizationPackage#getComponent_Uuid()
	 * @model dataType="de.swatinem.visualization.UUID" changeable="false"
	 * @generated
	 */
	UUID getUuid();

} // Component
