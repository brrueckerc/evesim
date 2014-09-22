package org.evesim.gui.handler;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.handlers.HandlerUtil;
import org.evesim.EveComponent;
import org.evesim.EveSimClientNode;
import org.evesim.EveSimClientSession;
import org.evesim.EveSimException;
import org.evesim.EveSimulation;

public class EveSimPlayHandler extends AbstractHandler implements IActionDelegate {

	private static final String EVE_SIM_VIZ_STOP_SIMULATION = "EveSimViz.stopSimulation";
	private static final String EVE_SIM_VIZ_START_SIMULATION = "EveSimViz.startSimulation";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		EvaluationContext evalCtx = (EvaluationContext) event.getApplicationContext();
		Collection list = (Collection) evalCtx.getDefaultVariable();
		if (list.size() != 0) {

			Object selectedObject = list.iterator().next();
			
			if (selectedObject instanceof EveComponent) {
				selectedObject = ((EveComponent) selectedObject).getRootComponent();
				if (selectedObject instanceof EveSimulation) {
					try {

						if (event.getCommand().getId().equals(EVE_SIM_VIZ_START_SIMULATION)) {
							startNode((EveSimulation) selectedObject);
							return null;
						} else if (event.getCommand().getId().equals(EVE_SIM_VIZ_STOP_SIMULATION)) {
							stopNode((EveSimulation) selectedObject);
							return null;
						}
					} catch (EveSimException e) {
						Status status = new Status(IStatus.ERROR, "EvESim", 0, "Eve Simulation Error", null);
						ErrorDialog.openError(HandlerUtil.getActiveShell(event), "Eve Simulation Error", e.getMessage(), status);
						return null;
					}

				}
			}
		}
		Status status = new Status(IStatus.ERROR, "EvESim", 0, "Eve Simulation Error", null);
		ErrorDialog.openError(HandlerUtil.getActiveShell(event), "Eve Simulation Error", "No Simulation is selected", status);
		return null;
	}

	private void startNode(EveSimulation sim) throws EveSimException {
		EveSimClientNode ni = EveSimClientNode.getInstance(); 
		if (ni.getSesstions().containsKey(sim.getSessionID())) 
			throw new EveSimException("Session already active.");
		
		EveSimClientSession dep = ni.createAndAddSession(sim);
		dep.start();
	}

	private void stopNode(EveSimulation sim) throws EveSimException {
		EveSimClientNode ni = EveSimClientNode.getInstance(); 
		EveSimClientSession dep = ni.getSesstions().get(sim.getSessionID());
		if (dep == null)
			throw new EveSimException("No active session to stop.");
		dep.stop();

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object o = ((IStructuredSelection) selection).getFirstElement();
			if (o instanceof EveSimulation) {
				action.setEnabled(true);
			}
		}
		action.setEnabled(false);
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		boolean n = true;
	}
}
