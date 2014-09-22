package org.evesim.gui;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.evesim.EveNode;
import org.evesim.EveNodeType;
import org.evesim.EvesimFactory;
import org.evesim.http.EveSimServerServlet;

public class EveLocalServer {

	public class EveLocalServerLogger extends Handler {

		public EveLocalServerLogger() {
			setLevel(Level.INFO);
		}

		@Override
		public void close() throws SecurityException {
			// TODO Auto-generated method stub

		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub

		}

		@Override
		public void publish(LogRecord record) {
			getOutput().println(record.getMessage());
		}
	}

	private static EveLocalServer instance;

	private Boolean running = false;

	private EveNode node = null;

	private EveLocalServer() {
		registerLogger(Logger.getLogger(EveSimServerServlet.class.getName()));
	}

	public static EveLocalServer getInstance() {
		if (null == instance) {
			instance = new EveLocalServer();
		}
		return instance;
	}

	MessageConsoleStream output = null;

	public MessageConsoleStream getOutput() {
		return output;
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found -> create new one
		MessageConsole newConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { newConsole });
		return newConsole;
	}

	public void showConsole() {
		MessageConsole console = findConsole("Eve Local Console");
		// display the tecomp Console
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		try {
			IConsoleView view = (IConsoleView) page.showView(id);
			view.display(console);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		output = console.newMessageStream();

	}

	public void start() {
		synchronized (running) {
			if (running)
				return;
			else
				running = true;
		}

		// Create and setup server node
		node = EvesimFactory.eINSTANCE.createEveNode();
		node.setNodeType(EveNodeType.SERVER);
		node.setServer(EvesimFactory.eINSTANCE.createEveNodeServer());

		// setPort(node.getServer(), args);
		node.getServer().init();
		
		// registerLogger(Logger.getLogger(EveMonitorServlet.class.getName()));
		// registerLogger(Logger.getLogger(EveSimServerSession.class.getName()));

		if (output == null) {
			showConsole();
		}

		// Start the server node
		node.getServer().start();

		output.println("Started local Eve Server: " + node.getServer().getServerHost() + ":" + node.getServer().getServerPort());

	}

	public void registerLogger(Logger logger) {
		EveLocalServerLogger h = new EveLocalServerLogger();
		logger.getParent().addHandler(h);
	}

	public void stop() {
		synchronized (running) {
			if (!running)
				return;
			else
				running = false;
		}

		node.getServer().stop();

		output.println("Stopped local Eve Server.");

	}
}
