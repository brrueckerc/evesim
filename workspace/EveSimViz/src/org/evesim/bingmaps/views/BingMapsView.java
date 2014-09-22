package org.evesim.bingmaps.views;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthViewController;

public class BingMapsView extends Composite {
	
	public final static String STARTUP_URL = "http://localhost:@@port@@/vml/bingmaps/index.html?sid=";

	public Browser browser;

	private ResourceSet res;
	private String resName;
	private String resNameUrlEncoded;

	public BingMapsView(Composite parent, int style, ResourceSet res) {
		super(parent, style);

		this.res = res;

		EveComponent rootComponent = null;
		if (res.getResources().get(0).getContents().get(0) instanceof EveComponent) {
			rootComponent = (EveComponent) res.getResources().get(0).getContents().get(0);
			GEarthViewController.getInstance().registerTree(rootComponent);
		} else {
			throw new RuntimeException("Resource is not instance of EveComponent. Google Earth View not accessible.");
		}

		GridLayout gridLayout = new GridLayout();
		setLayout(gridLayout);
		try {
			this.browser = new Browser(this, SWT.NONE);
		} catch (SWTError e) {
			System.out.println("Could not instantiate Browser: " + e.getMessage());
			return;
		}

		String port = String.valueOf(GEarthViewController.getInstance().getWebServerPort());
		browser.setUrl(STARTUP_URL.replaceAll("@@port@@", port) + rootComponent.getSessionID());

		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		browser.setLayoutData(data);
	}

}
