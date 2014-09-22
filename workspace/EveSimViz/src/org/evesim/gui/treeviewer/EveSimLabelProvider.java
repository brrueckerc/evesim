package org.evesim.gui.treeviewer;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EvePrototype;
import org.evesim.EveService;
import org.evesim.EveSimulation;


public class EveSimLabelProvider extends LabelProvider {

	public Image getImage(Object element) {
		String imageKey = ISharedImages.IMG_OBJ_FILE;
		if (element instanceof EveSimulation){
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		else if (element instanceof EveNode){
			imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		}
		else if (element instanceof EvePrototype){
			imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		}
		else if (element instanceof EveAgent){
			imageKey = ISharedImages.IMG_OBJ_ADD;
		}
		else if (element instanceof EveService){
			imageKey = ISharedImages.IMG_ELCL_REMOVE;
		}
		else if (element instanceof EveConnection){
			imageKey = ISharedImages.IMG_ELCL_STOP;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}

	public String getText(Object element) {
		return ((EveComponent) element).getName();
	}

}
