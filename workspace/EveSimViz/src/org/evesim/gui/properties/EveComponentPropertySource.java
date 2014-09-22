package org.evesim.gui.properties;

import java.net.URI;
import java.util.ArrayList;
import java.util.UUID;

import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.evesim.EveComponent;
import org.evesim.EveSimulation;

public class EveComponentPropertySource implements IPropertySource {

	public static String PROP_UUID = "uuid";
	public static String PROP_URI = "uri";
	public static String PROP_NAME = "name";
	public static String PROP_DESCRIPTION = "description";
	public static String PROP_LOCATION = "location";

	public static String PROP_EVESIMULATION_STEP_COUNT = "stepCount";

	private IPropertyDescriptor[] propertyDescriptors;
	private EveComponent prop_item;
	private URI def_uri;
	private UUID def_uuid;
	private String def_name;
	private String def_desc;


	public EveComponentPropertySource(EveComponent item) {
		this.prop_item = item;
		this.def_uri = item.getUri();
		this.def_uuid = item.getUuid();
		this.def_name = item.getName();
		this.def_desc = item.getDescription();

	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (propertyDescriptors == null) {

			PropertyDescriptor uuidDesc = new TextPropertyDescriptor(PROP_UUID,
					"UUID");
			uuidDesc.setCategory("Component Properties");
			PropertyDescriptor uriDesc = new TextPropertyDescriptor(PROP_URI,
					"URI");
			uriDesc.setCategory("Component Properties");
			PropertyDescriptor nameDesc = new TextPropertyDescriptor(PROP_NAME,
					"Name");
			nameDesc.setCategory("Component Properties");
			PropertyDescriptor propDesc = new TextPropertyDescriptor(
					PROP_DESCRIPTION, "Description");
			propDesc.setCategory("Component Properties");
			PropertyDescriptor locDesc = new TextPropertyDescriptor(
					PROP_LOCATION, "Location");
			locDesc.setCategory("Component Properties");

			ArrayList<IPropertyDescriptor> tmp = new ArrayList<IPropertyDescriptor>();
			tmp.add(uuidDesc);
			tmp.add(uriDesc);
			tmp.add(nameDesc);
			tmp.add(propDesc);
			tmp.add(locDesc);

			if (this.prop_item instanceof EveSimulation) {
				PropertyDescriptor prop = new TextPropertyDescriptor(
						PROP_EVESIMULATION_STEP_COUNT, "Step count");
				prop.setCategory("Simulation Properties");
				prop.setValidator(new ICellEditorValidator() {

					@Override
					public String isValid(Object value) {
						if ((Long) value > 0 && (Long) value < 10000)
							return null;
						else
							return "Value must be between 0 and 10000";
					}

				});
				tmp.add(prop);
			}

			propertyDescriptors = tmp.toArray(new IPropertyDescriptor[tmp
					.size()]);

		}
		return propertyDescriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals(PROP_UUID)) {
			return prop_item.getUuid();
		} else if (id.equals(PROP_URI)) {
			return prop_item.getUri();
		} else if (id.equals(PROP_NAME)) {
			return prop_item.getName();
		} else if (id.equals(PROP_DESCRIPTION)) {
			return prop_item.getDescription();
		} else if (id.equals(PROP_EVESIMULATION_STEP_COUNT)) {
			return String.valueOf(((EveSimulation) prop_item).getStepCount());
		}
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		if (id.equals(PROP_UUID)) {
			UUID curUUID = (UUID) getPropertyValue(id);
			return !curUUID.equals(def_uuid);
		} else if (id.equals(PROP_URI)) {
			URI curURI = (URI) getPropertyValue(id);
			return !curURI.equals(def_uri);
		} else if (id.equals(PROP_NAME)) {
			String curName = (String) getPropertyValue(id);
			return !curName.equals(def_name);
		} else if (id.equals(PROP_DESCRIPTION)) {
			String curDesc = (String) getPropertyValue(id);
			return !curDesc.equals(def_desc);
		} else if (id.equals(PROP_EVESIMULATION_STEP_COUNT)) {
			return (((EveSimulation) prop_item).getStepCount() >= 0);
		}
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		if (id.equals(PROP_UUID)) {
			setPropertyValue(id, def_uuid);
		} else if (id.equals(PROP_URI)) {
			setPropertyValue(id, def_uri);
		} else if (id.equals(PROP_NAME)) {
			setPropertyValue(id, def_name);
		} else if (id.equals(PROP_DESCRIPTION)) {
			setPropertyValue(id, def_desc);
		} 
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		if (id.equals(PROP_UUID)) {
			prop_item.setUuid((UUID) value);
		} else if (id.equals(PROP_URI)) {
			prop_item.setUri((URI) value);
		} else if (id.equals(PROP_NAME)) {
			prop_item.setName((String) value);
		} else if (id.equals(PROP_DESCRIPTION)) {
			prop_item.setDescription((String) value);
		}  else if (id.equals(PROP_EVESIMULATION_STEP_COUNT)) {

			((EveSimulation) prop_item).setStepCount(Long
					.valueOf((String) value));
		}

	}

}
