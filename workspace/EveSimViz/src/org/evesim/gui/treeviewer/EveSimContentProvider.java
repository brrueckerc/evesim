package org.evesim.gui.treeviewer;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.evesim.EveAgent;
import org.evesim.EveConnection;
import org.evesim.EvePrototype;
import org.evesim.EveSimulation;

public class EveSimContentProvider implements ITreeContentProvider,IStructuredContentProvider{

	@Override
	public Object[] getChildren(Object parentElement) {
		return getElements(parentElement);
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EveSimulation) {
			return null;
		}
		else if(element instanceof EveAgent){
			return ((EveAgent)element).getParent();
		}
		else if(element instanceof EvePrototype){
			return ((EvePrototype)element).getParent();
		}
		else if(element instanceof EveConnection){
			return ((EveConnection)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EveSimulation) {
			return ((EveSimulation)element).getChildren().size()>0;
		}
		else if(element instanceof EveAgent){
			return ((EveAgent)element).getChildren().size()>0;
		}
		else if(element instanceof EvePrototype){
			return ((EvePrototype)element).getChildren().size()>0;
		}
		else if(element instanceof EveConnection){
			return ((EveConnection)element).getChildren().size()>0;
		}
		return false;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EveSimulation) {
			return ((EveSimulation) inputElement).getChildren().toArray();
		}
		else if(inputElement instanceof EveAgent){
			return ((EveAgent) inputElement).getChildren().toArray();
		}
		else if(inputElement instanceof EvePrototype){
			return ((EvePrototype) inputElement).getChildren().toArray();
		}
		else if(inputElement instanceof EveConnection){
			return ((EveConnection) inputElement).getChildren().toArray();
		}
		return new Object[0];
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		
	}

}
