package org.evesim.gui.commands;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

    public static final String CMD_OPEN = "EvESim.open";
    public static final String CMD_OPEN_BROWSER = "EvESim.openBrowser";
    public static final String CMD_PLAY = "EvESim.play";
    public static final String CMD_STOP = "EvESim.stop";
    public static final String CMD_STEP = "EvESim.step";
    public static final String CMD_REFRESH = "EvESim.refresh";
    public static final String CMD_SETURL = "EvESim.seturl";
    
    
}
