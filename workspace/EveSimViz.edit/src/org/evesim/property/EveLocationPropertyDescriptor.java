package org.evesim.property;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * This accesses a cached version of the property sheet.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class EveLocationPropertyDescriptor extends PropertyDescriptor {

	private String id;
	
	public EveLocationPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
		id = itemPropertyDescriptor.getId(object);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		if (id.equals("location")) {
			
			return new EveLocationDialogCellEditor(composite, null );
		}

		return super.createPropertyEditor(composite);
	}

}
