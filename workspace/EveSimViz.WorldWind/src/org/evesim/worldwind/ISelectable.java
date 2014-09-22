package org.evesim.worldwind;

import org.evesim.EveComponent;

public interface ISelectable {
	
	public EveComponent getComponent();
	
	public void setSelected(boolean selected);
	
	public boolean getSelected();

}
