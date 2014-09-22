package org.evesim.jung.views;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;




public class FacebookView extends Composite {

	public final static String STARTUP_URL = "http://apps.facebook.com/evesimexporter/";
	public Browser browser;
	public FacebookView(Composite parent, int style, ResourceSet res){
		super(parent, style);

		GridLayout gridLayout = new GridLayout();
		setLayout(gridLayout);
		try {
			this.browser = new Browser(this, SWT.NONE);
		} catch (SWTError e) {
			System.out.println("Could not instantiate Browser: " + e.getMessage());
			return;
		}

		browser.setUrl(STARTUP_URL);

		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		browser.setLayoutData(data);
	}

}
