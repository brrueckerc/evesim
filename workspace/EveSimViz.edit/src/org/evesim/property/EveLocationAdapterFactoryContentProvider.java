package org.evesim.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * This accesses a cached version of the property sheet.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */

public class EveLocationAdapterFactoryContentProvider extends AdapterFactoryContentProvider {

	public EveLocationAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		

		return new EveLocationPropertySource(object, itemPropertySource);
		
		// TODO Auto-generated method stub
		//return super.createPropertySource(object, itemPropertySource);
	}

}
