package org.evesim.gui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.ui.handlers.HandlerUtil;

public class EveSimBrowserHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		PrintDialog printDialog = new PrintDialog(HandlerUtil.getActiveShell(event));
		printDialog.setText("PrintDialog");
		PrinterData printerData = printDialog.open();
		if (printerData != null) {
		    System.out.println(printerData);
		}
		return null;
	}

}
