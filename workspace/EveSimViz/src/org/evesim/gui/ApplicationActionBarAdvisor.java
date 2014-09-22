package org.evesim.gui;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.LabelRetargetAction;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of the
 * actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IWorkbenchAction newAction;
	private IWorkbenchAction saveAllAction;
	private IWorkbenchAction exitAction;
	private IWorkbenchAction aboutAction;
	private IWorkbenchAction saveAction;
	private IWorkbenchAction importAction;
	private RetargetAction openAction;
	// Actions - important to allocate these only in makeActions, and then use them
	// in the fill methods.  This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.


	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);

		ActionSetRegistry reg = WorkbenchPlugin.getDefault().getActionSetRegistry();
		IActionSetDescriptor[] actionSets = reg.getActionSets();
		// removing annoying gotoLastPosition Message.
		String actionSetId = "org.eclipse.ui.edit.text.actionSet.navigation"; //$NON-NLS-1$

		for (int i = 0; i <actionSets.length; i++){
			if (!actionSets[i].getId().equals(actionSetId))
				continue;
			IExtension ext = actionSets[i].getConfigurationElement()
			.getDeclaringExtension();
			reg.removeExtension(ext, new Object[] { actionSets[i] });
		}

		// Removing convert line delimiters menu.
		actionSetId = "org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo"; //$NON-NLS-1$
		for (int i = 0; i <actionSets.length; i++)
		{
			if (!actionSets[i].getId().equals(actionSetId))
				continue;
			IExtension ext = actionSets[i].getConfigurationElement()
			.getDeclaringExtension();
			reg.removeExtension(ext, new Object[] { actionSets[i] });
		}
		// Removing convert line delimiters menu.
		actionSetId = "org.eclipse.ui.edit.text.actionSet.annotationNavigation"; //$NON-NLS-1$
		for (int i = 0; i <actionSets.length; i++)
		{
			if (!actionSets[i].getId().equals(actionSetId))
				continue;
			IExtension ext = actionSets[i].getConfigurationElement()
			.getDeclaringExtension();
			reg.removeExtension(ext, new Object[] { actionSets[i] });
		}


	}

	@Override
	protected void makeActions(final IWorkbenchWindow window) {		
		
		newAction = ActionFactory.NEW.create(window);
		newAction.setText("New File");
		register(newAction);

		openAction = new LabelRetargetAction("OPEN", "Open File");
		openAction.setText("Open File");
		window.getPartService().addPartListener(openAction);
		register(openAction);

		saveAction = ActionFactory.SAVE.create(window);
		register(saveAction);

		saveAllAction = ActionFactory.SAVE_ALL.create(window);
		register(saveAllAction);

		importAction = ActionFactory.IMPORT.create(window);
		register(importAction);


		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

		aboutAction = ActionFactory.ABOUT.create(window);
		aboutAction.setText("About EvESim");
		register(aboutAction);

		


	}

	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
//		MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
//		MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP);
//
//		menuBar.add(fileMenu);
//		menuBar.add(helpMenu);
//
//
//		// File
//		fileMenu.add(newAction);
//		fileMenu.add(importAction);
//		fileMenu.add(new Separator());
//		fileMenu.add(saveAction);
//		fileMenu.add(saveAllAction);
//		fileMenu.add(new Separator());
//		fileMenu.add(exitAction);
//
//		// Help
//		helpMenu.add(aboutAction);
	}

	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {

	}

}
