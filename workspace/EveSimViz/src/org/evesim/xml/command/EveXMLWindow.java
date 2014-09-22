package org.evesim.xml.command;


import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class EveXMLWindow extends ApplicationWindow {
	public String choosenOne = new String();
	EveXMLWindow win = this;
	public EveXMLWindow(Shell parentShell) {
		super(parentShell);


	}
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);


		composite.setLayout(new GridLayout());
		Label lab = new Label(composite,SWT.LEFT);
		{
			lab.setText("Choose your base agent:");
		}

		
		final Combo com = new Combo(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			com.setLayoutData(data);
			com.add("EveAgent");
			com.add("EveHistoryAgent");
			com.add("EveSemanticAgent");
			com.add("EveEvolutionaryAgent");
			com.select(0);
		}

		final Button but = new Button(composite, SWT.LEFT);
		{
			but.setText("                    OK                    ");

		}

		Listener listener = new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.widget == but){
					win.choosenOne = com.getText();
					win.setReturnCode(SWT.OK);
					win.close();
				}

			}
		};
		but.addListener(SWT.Selection, listener);
		return super.createContents(parent);
	}

}
