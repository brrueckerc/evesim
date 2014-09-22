package org.evesim.earth;

import java.io.PrintWriter;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.evesim.EveComponent;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;

class GEarthSession {

	public final static byte STATUS_RESET = 0;
	public final static byte STATUS_UPDATE = 1;

	private EveComponent rootComponent;

	public EveComponent getRootComponent() {
		return rootComponent;
	}

	public void setRootComponent(EveComponent rootComponent) {
		this.rootComponent = rootComponent;
	}

	private int status = STATUS_RESET;

	public GEarthSession(EveComponent rootComponent) {
		this.rootComponent = rootComponent;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getKml(PrintWriter out) {
		Kml kml = KmlFactory.createKml();
		//Container container = kml.createAndSetFolder().withId(rootComponent.getUuid().toString());
		Document doc = kml.createAndSetDocument().withId(rootComponent.getUuid().toString());
				
		StringBuffer buf = new StringBuffer();
		if (status == STATUS_RESET) {

			getKmlFull(rootComponent,doc);

			kml.marshal(out);
			
		} else if (status == STATUS_UPDATE) {

		}
		return "";
	}

	private void getKmlFull(EveComponent base, Document container) {
		EList<EveComponent> children = base.getChildren();
		Iterator<EveComponent> iter = children.iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			cmp.kmlGetVisualisation(container);
			getKmlFull(cmp, container);
		}
	}

}