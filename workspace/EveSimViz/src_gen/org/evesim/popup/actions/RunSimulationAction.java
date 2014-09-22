package org.evesim.popup.actions;

import java.util.logging.Logger;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.evesim.EveSimClientNode;
import org.evesim.EveSimClientSession;
import org.evesim.EveSimulation;

public class RunSimulationAction implements IObjectActionDelegate {

	private Shell shell;
	private EveSimulation simulation;
	public final static Logger logger = Logger.getLogger(LookupCoordinatesAction.class.getName());
	
	public RunSimulationAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(IAction action) {
		if (simulation instanceof EveSimulation) {
			EveSimClientSession session = EveSimClientNode.getInstance().createAndAddSession((EveSimulation) simulation);
			session.start();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.simulation = null;
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1){
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if(o instanceof EveSimulation){
				simulation = (EveSimulation) o;

			}
		}	
		action.setEnabled(simulation != null);

	}

}
