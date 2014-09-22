package org.evesim.gui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EvePrototype;
import org.evesim.EvesimFactory;
import org.evesim.gui.properties.EveSimPropertyChangeListener;
import org.evesim.gui.views.NavigationView;


public class AddAgentAction implements IObjectActionDelegate, IWorkbenchWindowActionDelegate {
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
		EvesimFactory factory = EvesimFactory.eINSTANCE;
		EveAgent pro = factory.createEveAgent();
		pro.setParent(comp);
		pro.setName("New Agent");		
		comp.addChild(pro);
		pro.eAdapters().add(listen);
		pro.eNotify(null);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.comp = null;
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1){
			Object o = ((IStructuredSelection)selection).getFirstElement();
			if(o instanceof EvePrototype){
				comp = (EvePrototype) o;
				
			}
		}	
		action.setEnabled(comp != null);
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
