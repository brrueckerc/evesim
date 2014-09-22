package org.evesim.gui.properties;

import java.util.ArrayList;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.evesim.EveSimClientSession;

public class EveSimClientSessionPropertySource implements IPropertySource {

	private static final String PROP_STATUS = "Status";

	private EveSimClientSession eveSimClientSession;

	private IPropertyDescriptor[] propertyDescriptors;

	public EveSimClientSessionPropertySource(EveSimClientSession eveSimClientSession) {
		this.eveSimClientSession = eveSimClientSession;
	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (propertyDescriptors == null) {
			PropertyDescriptor desc = null;
			ArrayList<IPropertyDescriptor> tmp = new ArrayList<IPropertyDescriptor>();

			desc = new TextPropertyDescriptor(PROP_STATUS, "Status");
			desc.setCategory("Component Properties");
			tmp.add(desc);

			propertyDescriptors = tmp.toArray(new IPropertyDescriptor[tmp.size()]);
		}
		return propertyDescriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(PROP_STATUS)) {
			return "OK";
		}
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub

	}

}
