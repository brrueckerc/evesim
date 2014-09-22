package org.evesim.worldwind;

import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.SurfacePolyline;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.evesim.EveComponent;
import org.evesim.EveConnection;

public class EveSimConnectionPolyline extends SurfacePolyline implements ISelectable {

	public final static BasicShapeAttributes ATTRIBUTES_DEFAULT;
	public final static BasicShapeAttributes ATTRIBUTES_SELECTED;

	static {
		ATTRIBUTES_DEFAULT = new BasicShapeAttributes();
		ATTRIBUTES_DEFAULT.setOutlineMaterial(Material.GRAY);
		ATTRIBUTES_DEFAULT.setOutlineWidth(2.0);
		ATTRIBUTES_DEFAULT.setOutlineOpacity(0.5);

		ATTRIBUTES_SELECTED = new BasicShapeAttributes();
		ATTRIBUTES_SELECTED.setOutlineMaterial(Material.RED);
		ATTRIBUTES_SELECTED.setOutlineWidth(3.0);
		ATTRIBUTES_SELECTED.setOutlineOpacity(0.9);
	}

	public final static Logger logger = Logger.getLogger(WorldWindProvider.class.toString());

	private EveConnection connection;

	private boolean selected = false;

	public EveSimConnectionPolyline(EveConnection cmp) {
		super(ATTRIBUTES_DEFAULT);
		this.connection = cmp;
		updateLocation();

		connection.eAdapters().add(createAdapter());
	}

	protected void updateLocation() {

		ArrayList<LatLon> locations = new ArrayList<LatLon>();
		if (connection.isValid()) {
			locations.add(WorldWindProvider.eveComponent2LatLon(connection.getParent()));
			locations.add(WorldWindProvider.eveComponent2LatLon(connection.getConnectedComponent()));
		}
		setLocations(locations);
	}

	protected void addChange(Notification notification) {
		if (notification.getFeature() instanceof EAttributeImpl || notification.getEventType() == notification.SET) {
			if(notification.getFeature() instanceof EReference){
				EReference attr = (EReference) notification.getFeature();
				//System.out.println("Changed: " + attr.getName());
				if ("connectedComponent".equals(attr.getName())) {
					if (connection.isValid())
						updateLocation();
				}
			}

		}
	}

	public EveConnection getConnection() {
		return connection;
	}

	@Override
	public EveComponent getComponent() {
		return getConnection();
	}

	@Override
	public boolean getSelected() {
		return selected;
	}

	@Override
	public void setSelected(boolean selected) {
		this.selected = selected;

		setAttributes(selected ? ATTRIBUTES_SELECTED : ATTRIBUTES_DEFAULT);
	}

	public Adapter createAdapter() {
		Adapter adapter = new Adapter() {
			public void notifyChanged(Notification notification) {
				addChange(notification);
			}

			@Override
			public Notifier getTarget() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isAdapterForType(Object type) {
				if (type instanceof EveSimConnectionPolyline)
					return true;

				return false;
			}

			@Override
			public void setTarget(Notifier newTarget) {
				// TODO Auto-generated method stub

			}
		};
		return adapter;
	}

}
