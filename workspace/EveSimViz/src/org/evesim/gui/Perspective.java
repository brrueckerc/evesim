package org.evesim.gui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;


public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "EvESim.perspective";

	public void createInitialLayout(IPageLayout layout) {
		
				
		layout.addStandaloneView(IPageLayout.ID_PROJECT_EXPLORER, true, IPageLayout.LEFT, 0.20f, layout.getEditorArea());
		layout.addStandaloneView(IPageLayout.ID_PROP_SHEET, true, IPageLayout.BOTTOM, 0.20f, layout.getEditorArea());
		layout.setEditorAreaVisible(true);
		
		
		//PlatformUI.getWorkbench().getViewRegistry().find(IPageLayout.ID_PROJECT_EXPLORER).;
		
		
		//layout.getViewLayout(IPageLayout.ID_PROJECT_EXPLORER).setMoveable(false);
		//layout.getViewLayout(IPageLayout.ID_PROJECT_EXPLORER).setMoveable(false);
		//layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setMoveable(false);
		//layout.getViewLayout(IPageLayout.ID_PROP_SHEET).setCloseable(false);
		
		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate();
		
	}
	
	static public boolean isCurrent()
	  {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective().getId().equals(
	    		Perspective.ID);
	  }
	
}
