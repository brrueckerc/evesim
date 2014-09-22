/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim;

import org.eclipse.emf.ecore.EObject;

import de.micromata.opengis.kml.v_2_2_0.Document;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IKml Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.evesim.EvesimPackage#getIKmlProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IKmlProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Implement / Overload this method to attach a custom style for this component.
	 * The style has to be added to the KML stylesheet file.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String kmlGetStyle();

	/**
	 * <!-- begin-user-doc -->
	 * Implement / Overload this method to create a placemark for the component and add it
	 * to the provided kmlContainer object. The returned kmlContainer equals the parameter.
	 * 
	 * <!-- end-user-doc -->
	 * @model dataType="org.evesim.KmlContainer" kmlContainerDataType="org.evesim.KmlContainer"
	 * @generated
	 */
	Document kmlGetVisualisation(Document kmlContainer);

} // IKmlProvider
