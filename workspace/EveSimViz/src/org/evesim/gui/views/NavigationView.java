package org.evesim.gui.views;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISaveablePart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.part.ViewPart;
import org.evesim.gui.properties.EveSimPropertyChangeListener;
import org.evesim.gui.treeviewer.EveSimContentProvider;
import org.evesim.gui.treeviewer.EveSimInitialInput;
import org.evesim.gui.treeviewer.EveSimLabelProvider;
import org.evesim.gui.treeviewer.EveSimViewerSorter;

public class NavigationView extends ViewPart implements ISaveablePart{
	private TreeViewer viewer;
	public TreeViewer getViewer() {
		return viewer;
	}

	public void setViewer(TreeViewer viewer) {
		this.viewer = viewer;
	}
	private EveSimPropertyChangeListener listen;
	private boolean isDirty;
		
	
	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		this.listen = new EveSimPropertyChangeListener(viewer);
		
		viewer.setContentProvider(new EveSimContentProvider());
		viewer.setLabelProvider(new EveSimLabelProvider());
		
		viewer.setInput(new EveSimInitialInput().getInitialInput(listen));
		viewer.setSorter(new EveSimViewerSorter());
		viewer.expandToLevel(3);
		getSite().setSelectionProvider(viewer);
		initContextMenu();

	}
	
	public EveSimPropertyChangeListener getListen() {
		return listen;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	private void initContextMenu(){
		MenuManager manager = new MenuManager();
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		Menu menu = manager.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(manager,viewer);
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		FileDialog dialog = new FileDialog(null, SWT.SAVE);
	    dialog
	        .setFilterNames(new String[] { "Batch Files", "All Files (*.*)" });
	    dialog.setFilterExtensions(new String[] { "*.bat", "*.*" }); // Windows
	                                    // wild
	                                    // cards
	    dialog.setFilterPath("c:\\"); // Windows path
	    dialog.setFileName("fred.bat");
		
	}

	@Override
	public void doSaveAs() {
		FileDialog dialog = new FileDialog(null, SWT.SAVE);
	    dialog
	        .setFilterNames(new String[] { "Batch Files", "All Files (*.*)" });
	    dialog.setFilterExtensions(new String[] { "*.bat", "*.*" }); // Windows
	                                    // wild
	                                    // cards
	    dialog.setFilterPath("c:\\"); // Windows path
	    dialog.setFileName("fred.bat");
		
	}

	@Override
	public boolean isDirty() {
		return isDirty;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	private void initFileOpen(){
		IAction openAction = new Action() {
			public void run(){
				if(isDirty){
					
				}
//				try{
//					
					NavigationView.this.viewer.setInput(null);
					isDirty = false;
					NavigationView.this.firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
//				}
//				catch(IOException e){
//					
//				}
			}
		};

	}

}