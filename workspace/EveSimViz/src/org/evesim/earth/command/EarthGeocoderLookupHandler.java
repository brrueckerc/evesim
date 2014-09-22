package org.evesim.earth.command;

import java.util.Iterator;
import java.util.logging.Logger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISources;
import org.eclipse.ui.handlers.HandlerUtil;
import org.evesim.EveComponent;
import org.evesim.earth.GEarthUtil;

public class EarthGeocoderLookupHandler extends AbstractHandler {
	
	public final static Logger logger = Logger.getLogger(EarthGeocoderLookupHandler.class.getName());

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Object obj = HandlerUtil.getVariable(event, ISources.ACTIVE_CURRENT_SELECTION_NAME);
	
		if (obj instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection)obj;
			
			Iterator iter = ts.iterator();
			while (iter.hasNext()) {
				Object element = iter.next();
				if (element instanceof EveComponent) {					
					GEarthUtil.geocodeLookup((EveComponent)element);					
					logger.info("Geocoder: "+element);
				}
			}			
		}
		return null;
	}	
}
