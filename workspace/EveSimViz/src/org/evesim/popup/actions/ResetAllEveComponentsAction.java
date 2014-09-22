package org.evesim.popup.actions;

import java.util.logging.Logger;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.evesim.EveComponent;

public class ResetAllEveComponentsAction implements IObjectActionDelegate  {
	
	private Shell shell;
	private EveComponent component;
	public final static Logger logger = Logger.getLogger(ResetAllEveComponentsAction.class.getName());
	
	
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(IAction action) {
		component.getRootComponent().reset();
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.component = null;
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1){
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if(o instanceof EveComponent){
				component = (EveComponent) o;

			}
		}	
		action.setEnabled(component != null);
	}

}
