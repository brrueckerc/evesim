package org.evesim.earth.command;

import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import java.util.logging.Logger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthUtil;

public class EarthOpenKMLHandler extends AbstractHandler {
	
	public final static Logger logger = Logger.getLogger(EarthOpenKMLHandler.class.getName()); 
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object obj = HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);

		UUID sessionid = null;
		if (obj instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection) obj;
			Iterator iter = ts.iterator();
			while (iter.hasNext()) {
				Object element = iter.next();
				if (element instanceof EveComponent) {
					sessionid = ((EveComponent) element).getSessionID();
					break;
				}
			}
		}

		if (sessionid != null) {
			URI uri = GEarthUtil.getKMLUriForSession(sessionid);
			logger.info("Open URI: "+uri);
			openURL(uri.toString());
/*
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(uri);
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				throw new ExecutionException("Error opening KML: "+e,e);
			}
			*/
		}
		else{
			Status status = new Status(IStatus.ERROR, "EvESim", 0, "Export to KML Error", null);
			ErrorDialog.openError(HandlerUtil.getActiveShell(event), "Export to KML Error", "No simulation for export was selected", status);
		}
		return null;
	}
	
	static final String[] browsers = { "google-chrome", "firefox", "opera",
	      "konqueror", "epiphany", "seamonkey", "galeon", "kazehakase", "mozilla" };
	   static final String errMsg = "Error attempting to launch web browser";

	   /**
	    * Opens the specified web page in the user's default browser
	    * @param url A web address (URL) of a web page (ex: "http://www.google.com/")
	    */
	   public static void openURL(String url) {
	      try {  //attempt to use Desktop library from JDK 1.6+ (even if on 1.5)
	         Class<?> d = Class.forName("java.awt.Desktop");
	         d.getDeclaredMethod("browse", new Class[] {java.net.URI.class}).invoke(
	            d.getDeclaredMethod("getDesktop").invoke(null),
	            new Object[] {java.net.URI.create(url)});
	         //above code mimics:
	         //   java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
	         }
	      catch (Exception ignore) {  //library not available or failed
	         String osName = System.getProperty("os.name");
	         try {
	            if (osName.startsWith("Mac OS")) {
	               Class.forName("com.apple.eio.FileManager").getDeclaredMethod(
	                  "openURL", new Class[] {String.class}).invoke(null,
	                  new Object[] {url});
	               }
	            else if (osName.startsWith("Windows"))
	               Runtime.getRuntime().exec(
	                  "rundll32 url.dll,FileProtocolHandler " + url);
	            else { //assume Unix or Linux
	               boolean found = false;
	               for (String browser : browsers)
	                  if (!found) {
	                     found = Runtime.getRuntime().exec(
	                        new String[] {"which", browser}).waitFor() == 0;
	                     if (found)
	                        Runtime.getRuntime().exec(new String[] {browser, url});
	                     }
	               if (!found)
	                  throw new Exception(Arrays.toString(browsers));
	               }
	            }
	         catch (Exception e) {
	            //JOptionPane.showMessageDialog(null, errMsg + "\n" + e.toString());
	        	 e.printStackTrace();
	            }
	         }
	      }
	

}
