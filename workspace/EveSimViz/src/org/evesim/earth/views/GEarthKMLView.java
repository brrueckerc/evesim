package org.evesim.earth.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthViewController;

public class GEarthKMLView extends Composite {

	public final static String STARTUP_URL = "http://localhost:@@port@@/kml/earth.kml?sid=";

	// public Browser browser;
	private ResourceSet res;
	private StyledText text;

	public GEarthKMLView(Composite parent, int style, ResourceSet res) {
		super(parent, style);
		this.res = res;

		EveComponent rootComponent = null;
		if (res.getResources().get(0).getContents().get(0) instanceof EveComponent) {
			rootComponent = (EveComponent) res.getResources().get(0).getContents().get(0);
			GEarthViewController.getInstance().registerTree(rootComponent);
		} else {
			throw new RuntimeException("Resource is not instance of EveComponent. Google Earth View not accessible.");
		}

		text = new StyledText(this, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		GridData spec = new GridData();
		spec.horizontalAlignment = GridData.FILL;
		spec.grabExcessHorizontalSpace = true;
		spec.verticalAlignment = GridData.FILL;
		spec.grabExcessVerticalSpace = true;
		text.setLayoutData(spec);

		GridLayout gridLayout = new GridLayout();
		setLayout(gridLayout);

		String port = String.valueOf(GEarthViewController.getInstance().getWebServerPort());

		// browser.setUrl(STARTUP_URL.replaceAll("@@port@@", port) +
		// rootComponent.getSessionID());

		GridData data = new GridData();
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		text.setLayoutData(data);
		
		try {
			URL url = new URL(STARTUP_URL.replaceAll("@@port@@", port) + rootComponent.getSessionID());
			URLConnection con = url.openConnection();
			BufferedReader brin = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer buf = new StringBuffer();
			while (brin.ready()) {
				buf = buf.append(brin.readLine()).append('\n');
			}
			text.setText(buf.toString());
		} catch (IOException e) {
			throw new RuntimeException("Could not load KML.",e);
		}
	}

}
