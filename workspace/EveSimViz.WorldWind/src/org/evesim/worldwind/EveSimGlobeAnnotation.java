package org.evesim.worldwind;

import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.geom.Vec4;
import gov.nasa.worldwind.render.AnnotationAttributes;
import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.render.GlobeAnnotation;

import java.awt.Font;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.evesim.EveComponent;

public class EveSimGlobeAnnotation extends GlobeAnnotation implements ISelectable {

	private boolean selected = false;
	private EveComponent cmp;

	public EveSimGlobeAnnotation(EveComponent cmp) {
		super(toString(cmp), WorldWindProvider.ec2Pos(cmp), Font.decode("Arial-BOLD-12"));
		this.setPickEnabled(true);
		this.cmp = cmp;
		setAttributes(getComponentStyle());
		
		if (!cmp.isLocationValid())
			setPosition(null);

		cmp.eAdapters().add(createAdapter());
	}
	
	protected AnnotationAttributes getComponentStyle() {
		if (selected)
			return WorldWindConstants.ATTRIBUTES_SELECTED;
		else
			return WorldWindConstants.ATTRIBUTES_DEFAULT;
	}

	private Adapter createAdapter() {
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
				if (type instanceof EveSimGlobeAnnotation)
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

	protected void addChange(Notification notification) {
		if (notification.getFeature() instanceof EAttribute) {

			EAttribute attr = (EAttribute) notification.getFeature();
			if ("name".equals(attr.getName())) {
				updateName();
			} else if ("locLatitude".equals(attr.getName()) || "locLongitude".equals(attr.getName())) {
				updatePosition();
			}
		}
	}

	public void update() {
		Position p = WorldWindProvider.ec2Pos(cmp);
		setPosition(p);
		setText(toString(cmp));

	}

	public static String toString(EveComponent cmp) {
		StringBuffer an = new StringBuffer();
		an = an.append(cmp.getName());
		return an.toString();
	}

	public Vec4 getAnnotationDrawPoint(DrawContext dc) {
		return dc.getGlobe().computePointFromPosition(this.getPosition().getLatitude(), this.getPosition().getLongitude(),
				this.getPosition().getElevation() * dc.getVerticalExaggeration());
	}

	public void updateName() {
		setText(toString(cmp));
	}

	public void updatePosition() {
		if (!cmp.isLocationValid())
			setPosition(null);
		else
			setPosition(WorldWindProvider.ec2Pos(cmp));
	}

	@Override
	public String toString() {
		return cmp.getName() + " [" + cmp.getLocLatitude() + "," + cmp.getLocLongitude() + "]";
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
		setAttributes(getComponentStyle());
	}

	public EveComponent getComponent() {
		return this.cmp;
	}

	@Override
	public boolean getSelected() {
		return selected;
	}

}