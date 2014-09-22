package org.evesim.gui.properties;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.viewers.TreeViewer;

public class EveSimPropertyChangeListener implements Adapter {
	private TreeViewer view;
	
	public EveSimPropertyChangeListener(TreeViewer viewer){
		this.view = viewer;
	}

	@Override
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyChanged(Notification notification) {
		this.view.refresh();
		
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}
	
}
