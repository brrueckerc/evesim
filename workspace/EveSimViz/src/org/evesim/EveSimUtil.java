package org.evesim;

import java.util.logging.Logger;

import org.evesim.impl.EveComponentImpl;

public class EveSimUtil {
	
	public final static Logger logger = Logger.getLogger(EveSimUtil.class.getName()); 
	
	
	/**
	 * Extracts the project name of the resource from the EveComponent.
	 * 
	 * @param cmp
	 * @return
	 */
	public static String getProjectNameFromResource(EveComponent cmp) {
		EveComponentImpl imp = (EveComponentImpl) cmp.getRootComponent();
		String t = imp.eResource().getURI().toString();
		String tmpProjectName = t.substring(t.indexOf("resource/") + "resource/".length());
		String projectName = tmpProjectName.substring(0, tmpProjectName.indexOf('/'));
		return projectName;
	}
	
	
}
