/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.apache.axis2.deployment.util.TempFileManager;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.UIPlugin;
import org.eclipse.ui.internal.progress.ProgressManagerUtil;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.impl.EveAgentImpl;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve History Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl#getHistData <em>Hist Data</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveHistoryAgentImpl#getSimInterval <em>Sim Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveHistoryAgentImpl extends EveAgentImpl implements EveHistoryAgent {
	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;
	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getHistData() <em>Hist Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistData()
	 * @generated
	 * @ordered
	 */
	protected static final String HIST_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHistData() <em>Hist Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistData()
	 * @generated
	 * @ordered
	 */
	protected String histData = HIST_DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getSimInterval() <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int SIM_INTERVAL_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSimInterval() <em>Sim Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimInterval()
	 * @generated
	 * @ordered
	 */
	protected int simInterval = SIM_INTERVAL_EDEFAULT;
	/**
	 * @generated NOT
	 */
	private static final long serialVersionUID = -1569431903261206544L;
	private EveSimulation sim;
	private boolean init = false;
	private ArrayList<EveHistoryAgent> agent_list = new ArrayList<EveHistoryAgent>();
	private Long initialTime = new Long(0);
	private String filepath = new String();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveHistoryAgentImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void execute(Long time){
		if(isRoot && !init){
			try{
				if(this.getHistData().startsWith("http")){
					File temp = TempFileManager.createTempFile("agropedia", ".evesim");
					BufferedInputStream bis = null;
					BufferedOutputStream bos = null;
					URL url = new URL(this.getHistData());
					URLConnection urlc = url.openConnection();

					bis = new BufferedInputStream( urlc.getInputStream() );
					bos = new BufferedOutputStream( new FileOutputStream(temp) );

					int i;
					while ((i = bis.read()) != -1)
					{
						bos.write( i );
					}
					bis.close();
					bos.close();

					filepath = temp.getAbsolutePath().substring(2);
					// Initialize the model
					EvesimPackage.eINSTANCE.eClass();
					// Retrieve the default factory singleton

					// Register the XMI resource factory for the .website extension
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("evesim", new XMIResourceFactoryImpl());

					// Obtain a new resource set
					ResourceSet resSet = new ResourceSetImpl();

					// Create a resource
					//System.out.println(temp.getAbsolutePath().substring(2));
					Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(filepath));
					resource.load(Collections.EMPTY_MAP);
					this.sim = (EveSimulation) resource.getContents().get(0);
				}
				else{
					filepath = this.getHistData().substring(2);
					// Initialize the model
					EvesimPackage.eINSTANCE.eClass();
					// Retrieve the default factory singleton

					// Register the XMI resource factory for the .website extension
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("evesim", new XMIResourceFactoryImpl());

					// Obtain a new resource set
					ResourceSet resSet = new ResourceSetImpl();

					// Create a resource
					//System.out.println(temp.getAbsolutePath().substring(2));
					Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(filepath));
					resource.load(Collections.EMPTY_MAP);
					this.sim = (EveSimulation) resource.getContents().get(0);
				}



				//traverse all the agents and give a location
				Iterator<EveComponent> iter = this.sim.getChildren().iterator();
				EveComponent type = (EveComponent) iter.next();
				Iterator<EveComponent> rator = type.getChildren().iterator();
				while(rator.hasNext()){
					EveComponent agent = (EveComponent) rator.next();
					if(agent instanceof EveHistoryAgent){
						if(agent.getLocLatitude() != 0.0 && agent.getLocLongitude() != 0.0) {
							this.agent_list.add((EveHistoryAgent)agent);								
						}
					}
				}
				try{
					for(int j = 0; j < this.agent_list.size(); j++){
						if(j == 0){
							this.initialTime = this.agent_list.get(j).getTimeStamp();
							System.err.println(this.initialTime);
							this.agent_list.get(j).setBirthdate(new Date(this.agent_list.get(j).getTimeStamp()*1000L));
							this.agent_list.get(j).setTimeStamp(this.agent_list.get(j).getTimeStamp() - this.initialTime);
							Iterator<EveComponent> rat = this.agent_list.get(j).getChildren().iterator();
							while(rat.hasNext()){
								EveComponent comp = rat.next();
								if(comp instanceof EveConnection){
									((EveConnection) comp).setTimeStamp(((EveConnection) comp).getTimeStamp() - this.initialTime);
									((EveConnection) comp).setConnected(false);
								}
							}
						}
						else{
							this.agent_list.get(j).setBirthdate(new Date(this.agent_list.get(j).getTimeStamp()*1000L));
							this.agent_list.get(j).setTimeStamp(this.agent_list.get(j).getTimeStamp() - this.initialTime);
							Iterator<EveComponent> rat = this.agent_list.get(j).getChildren().iterator();
							while(rat.hasNext()){
								EveComponent comp = rat.next();
								if(comp instanceof EveConnection){
									((EveConnection) comp).setTimeStamp(((EveConnection) comp).getTimeStamp() - this.initialTime);
									((EveConnection) comp).setConnected(false);
								}
							}
						}
					}
				}catch(NullPointerException ex){
					ex.printStackTrace();
				}

				this.init = true;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}


		else if(isRoot && init){
//			IWorkbench wb = PlatformUI.getWorkbench();
//			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//			IWorkbenchPage page = win.getActivePage().getActiveEditor()
//			IEditorPart part = page.getActiveEditor();
//			part.doSave(null);
			
			Long date = this.initialTime + time;
			LogToStatusLine(new Date(date*1000L).toString());
			for(int x = 0; x < this.agent_list.size(); x++){
				if(this.agent_list.get(x).getTimeStamp() <= time + getSimInterval()){
					this.agent_list.get(x).setParent(this.getParent());

					for(int k = 0; k < this.agent_list.get(x).getChildren().size(); k++){
						EveComponent com = this.agent_list.get(x).getChildren().get(k);
						if(com instanceof EveConnection){
							EveConnection connection = (EveConnection) com;
							if(connection.getTimeStamp() <= time + getSimInterval() && connection.isConnected() != true){
								if(connection.getConnectedComponent().getLocLongitude() == 0.0 && connection.getConnectedComponent().getLocLatitude() == 0.0){
									this.agent_list.get(x).removeChild(connection);
								}
								else{
									EveComponent parent = this.agent_list.get(x);
									EveComponent connectedCom = connection.getConnectedComponent();

									EveConnection newCon = EvesimFactory.eINSTANCE.createEveConnection();
									newCon.setConnectedComponent(connectedCom);

									newCon.setConnected(true);
									newCon.setDirectional(false);
									newCon.setParent(parent);
									newCon.setTimeStamp(0L);

									connection.setConnected(true);
									connection.setDirectional(false);
								}
							}
						}	
					}
				}

			}
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkAnalysisPackage.Literals.EVE_HISTORY_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE, oldBirthdate, birthdate));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHistData() {
		return histData;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistData(String newHistData) {
		String oldHistData = histData;
		histData = newHistData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA, oldHistData, histData));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimInterval() {
		return simInterval;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimInterval(int newSimInterval) {
		int oldSimInterval = simInterval;
		simInterval = newSimInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL, oldSimInterval, simInterval));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT:
			return isIsRoot();
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE:
			return getBirthdate();
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA:
			return getHistData();
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL:
			return getSimInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT:
			setIsRoot((Boolean)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE:
			setBirthdate((Date)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA:
			setHistData((String)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL:
			setSimInterval((Integer)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT:
			setIsRoot(IS_ROOT_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE:
			setBirthdate(BIRTHDATE_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA:
			setHistData(HIST_DATA_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL:
			setSimInterval(SIM_INTERVAL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__IS_ROOT:
			return isRoot != IS_ROOT_EDEFAULT;
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__BIRTHDATE:
			return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__HIST_DATA:
			return HIST_DATA_EDEFAULT == null ? histData != null : !HIST_DATA_EDEFAULT.equals(histData);
		case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT__SIM_INTERVAL:
			return simInterval != SIM_INTERVAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRoot: ");
		result.append(isRoot);
		result.append(", Birthdate: ");
		result.append(birthdate);
		result.append(", histData: ");
		result.append(histData);
		result.append(", simInterval: ");
		result.append(simInterval);
		result.append(')');
		return result.toString();
	}
	/**
	 * @generated NOT
	 * @param args
	 */
	public static void main(String[] args){
		// Create a simulation
		EveSimulation sim = EvesimFactory.eINSTANCE.createEveSimulation();


		EveNode node = EvesimFactory.eINSTANCE.createEveNode();
		sim.addChild(node);

		EveHistoryAgent age = SocialNetworkAnalysisFactory.eINSTANCE.createEveHistoryAgent();
		EveHistoryTimer tim = TimerFactory.eINSTANCE.createEveHistoryTimer();
		tim.setParent(age);
		age.setParent(node);
		age.setIsRoot(true);

		for(int i = 0; i < 5; i++){
			tim.run();
		}

	}
	static public void LogToStatusLine(final String msg){

		Display display = Display.getDefault();

		display.asyncExec(new Runnable(){		public void run() {			

			IWorkbenchWindow win =  PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();
			IWorkbenchPart part = page.getActivePart();			
			IWorkbenchPartSite site = part.getSite();

			if (site instanceof IViewSite ){				

				IViewSite vSite = ( IViewSite ) site;

				IActionBars actionBars =  vSite.getActionBars();
				if( actionBars == null ){					
					return ;
				}
				IStatusLineManager statusLineManager =	actionBars.getStatusLineManager();

				if( statusLineManager == null ){					
					return ;
				}
				statusLineManager.setMessage( msg);			
			}
			else if (site instanceof IEditorSite ){
				try{
					IEditorSite esite = (IEditorSite) site;
					esite.getActionBars().getStatusLineManager().setMessage(msg);
				}
				catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

		});}
} //EveHistoryAgentImpl
