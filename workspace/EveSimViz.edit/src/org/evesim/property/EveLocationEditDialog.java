package org.evesim.property;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * This accesses a cached version of the property sheet.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */

public class EveLocationEditDialog extends Dialog {

	private static final int RESET_ID = IDialogConstants.NO_TO_ALL_ID + 1;

	public EveLocationEditDialog(Shell parentShell) {
		super(parentShell);
	}

	protected Control createDialogArea(Composite parent) {
		Composite dialogArea = (Composite) super.createDialogArea(parent);
		dialogArea.setLayout(new GridLayout(2, true));

		Label label = new Label(parent, SWT.NONE);
		label.setText("Latitude");
		GridData data = new GridData();
		//data.horizontalSpan = 2;
		label.setLayoutData(data);

		Text text = new Text(parent, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		//data.horizontalSpan = 2;
		text.setLayoutData(data);

		label = new Label(parent, SWT.NONE);
		label.setText("Longitude");
		data = new GridData();
		data.horizontalSpan = 2;
		label.setLayoutData(data);

		text = new Text(parent, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 2;
		text.setLayoutData(data);
		
		Button b = new Button(parent, SWT.NONE);
		b.setText("Lookup Coordinates");
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 2;
		b.setLayoutData(data);

		return dialogArea;
	}

	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		createButton(parent, RESET_ID, "Reset All", false);
	}

	protected void reset() {

	}

	protected void buttonPressed(int buttonId) {
		if (buttonId == RESET_ID) {
			reset();
		} else if (buttonId == OK) {

		} else {
			super.buttonPressed(buttonId);
		}
	}
}
