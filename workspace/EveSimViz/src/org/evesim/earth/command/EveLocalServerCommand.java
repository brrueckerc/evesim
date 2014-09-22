package org.evesim.earth.command;

import java.beans.EventHandler;

import org.apache.velocity.app.event.EventHandlerUtil;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.evesim.gui.EveLocalServer;

public class EveLocalServerCommand extends AbstractHandler {

	public final static String COMMAND_START = "EveSimViz.startEveLocalServer";
	public final static String COMMAND_STOP = "EveSimViz.stopEveLocalServer";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (event.getCommand().getId().equals(COMMAND_START)) {
			EveLocalServer.getInstance().start();
		} else if (event.getCommand().getId().equals(COMMAND_STOP)) {
			EveLocalServer.getInstance().stop();
		}

		return null;

	}

}
