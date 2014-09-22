package org.evesim.earth.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthUtil;
import org.evesim.gui.properties.EveSimPropertyChangeListener;
import org.evesim.gui.views.NavigationView;

public class GeoCodeAction implements IObjectActionDelegate, IWorkbenchWindowActionDelegate{

	private EveComponent comp;
	private EveSimPropertyChangeListener listen;
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if(targetPart instanceof NavigationView){
			listen = ((NavigationView)targetPart).getListen();
		}
	}

	@Override
	public void run(IAction action) {
		if (comp != null) {
			GEarthUtil.geocodeLookup(comp);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof EveComponent) {
			comp = (EveComponent)selection;
		} else {
			comp = null;
		}		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		
	}

}
//http://maps.google.com/maps/geo?q=1600+Amphitheatre+Parkway,+Mountain+View,+CA&output=csv&sensor=false&key=abcdefg