package org.evesim.popup.actions;

import java.util.logging.Logger;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.PropertySheet;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthUtil;

public class LookupCoordinatesAction implements IObjectActionDelegate {

	private Shell shell;
	private EveComponent component;
	ISelection selection;
	public final static Logger logger = Logger.getLogger(LookupCoordinatesAction.class.getName());
	/**
	 * Constructor for Action1.
	 */
	public LookupCoordinatesAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

	public static IViewPart getView(String id) {
		IViewReference viewReferences[] = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < viewReferences.length; i++) {
			if (id.equals(viewReferences[i].getId())) {
				return viewReferences[i].getView(false);
			}
		}
		return null;
	}

	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		PropertySheet vp = (PropertySheet)getView("org.eclipse.ui.views.PropertySheet");
		
		ResourcesPlugin.getWorkspace().getRoot().getWorkspace();
		GEarthUtil.geocodeLookup(component);
		//((EveComponent)element).
		logger.info("Geocoder: "+component);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.component = null;
		this.selection = selection;
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1){
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if(o instanceof EveComponent){
				component = (EveComponent) o;

			}
		}	
		action.setEnabled(component != null);
	}

}
