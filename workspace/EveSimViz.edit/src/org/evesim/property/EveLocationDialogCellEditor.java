package org.evesim.property;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This accesses a cached version of the property sheet.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */

public class EveLocationDialogCellEditor extends ExtendedDialogCellEditor {

	public EveLocationDialogCellEditor(Composite composite, ILabelProvider labelProvider) {
		super(composite, labelProvider);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		System.out.println("Open Dialof");
		EveLocationEditDialog dialog = new EveLocationEditDialog(cellEditorWindow.getShell());

		dialog.setBlockOnOpen(true);
		dialog.open();

		return "whatever";
	}

}
