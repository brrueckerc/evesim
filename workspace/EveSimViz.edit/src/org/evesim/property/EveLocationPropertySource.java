package org.evesim.property;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * This accesses a cached version of the property sheet.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */

public class EveLocationPropertySource extends PropertySource {

	public EveLocationPropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		
		return new EveLocationPropertyDescriptor(getEditableValue(),itemPropertyDescriptor);
		
	}

}
