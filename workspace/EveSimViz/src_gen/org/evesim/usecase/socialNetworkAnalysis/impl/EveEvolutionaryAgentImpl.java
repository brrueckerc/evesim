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
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.apache.axis2.deployment.util.TempFileManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.biotech.InportBiotechDataToXML;
import org.evesim.impl.EveAgentImpl;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;
import org.uncommons.maths.random.DefaultSeedGenerator;
import org.uncommons.maths.random.MersenneTwisterRNG;
import org.uncommons.maths.random.Probability;

import cern.jet.random.engine.MersenneTwister;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Evolutionary Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveEvolutionaryAgentImpl#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveEvolutionaryAgentImpl extends EveAgentImpl implements EveEvolutionaryAgent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3717130025171580220L;
	/**
	 * @generated NOT
	 * @param args
	 */
	private boolean init = false;
	private EveSimulation sim;
	private ArrayList<EveAgent> agent_list = new ArrayList<EveAgent>();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveEvolutionaryAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkAnalysisPackage.Literals.EVE_EVOLUTIONARY_AGENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT__IS_ROOT:
			return isIsRoot();
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
		case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT__IS_ROOT:
			setIsRoot((Boolean)newValue);
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
		case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT__IS_ROOT:
			setIsRoot(IS_ROOT_EDEFAULT);
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
		case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT__IS_ROOT:
			return isRoot != IS_ROOT_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void execute() {
		if(init == false && this.isRoot == true){
			try {

				File temp = TempFileManager.createTempFile("agropedia", ".evesim");
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				URL url = new URL("http://evesim.org/~cruecker/agropedia.evesim");
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
				System.out.println(temp.getAbsolutePath().substring(2));
				String urlStr = temp.getAbsolutePath().substring(2);
				Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(urlStr));
				resource.load(Collections.EMPTY_MAP);
				this.sim = (EveSimulation) resource.getContents().get(0);

				//traverse all the agents and give a location
				Iterator<EveComponent> iter = this.sim.getChildren().iterator();
				EveComponent type = (EveComponent) iter.next();
				Iterator<EveComponent> rator = type.getChildren().iterator();
				while(rator.hasNext()){
					EveComponent agent = (EveComponent) rator.next();
					if(agent instanceof EveAgent){
						if(agent.getLocLatitude() != 0.0 && agent.getLocLongitude() != 0.0) {
							this.agent_list.add((EveAgent)agent);								
						}
					}
				}


				this.init = true;
				//System.out.println(resource.getContents());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		try {


			if(init == true && this.isRoot == true){

				//generate seed
				DefaultSeedGenerator gen = DefaultSeedGenerator.getInstance();
				MersenneTwisterRNG rng = new MersenneTwisterRNG(gen);

				//get root
				EveComponent comp = this.getParent();
				//generate Agent
				EveEvolutionaryAgent age = SocialNetworkAnalysisFactory.eINSTANCE.createEveEvolutionaryAgent();
				EveAgent ag = this.agent_list.get(rng.nextInt(this.agent_list.size()));
				age.setLocLongitude(ag.getLocLongitude());
				age.setLocLatitude(ag.getLocLatitude());
				age.setName("EvolAgent " + rng.nextInt());

				//calculate Connections			
				int totalConnections = 0;
				int currentConnections = 0;

				//calculate the connections of all agents
				Iterator<EveComponent> it = comp.getChildren().iterator();
				while (it.hasNext()) {
					EveComponent agent = (EveComponent) it.next();
					if(agent instanceof EveAgent){
						EList<EveConnection> list = agent.getConnections();
						totalConnections += list.size();
					}

				}
				boolean flag = false;
				//Calculate the connections of a specific agent
				Iterator<EveComponent> ite = comp.getChildren().iterator();
				while (ite.hasNext()) {
					EveComponent agent = (EveComponent) ite.next();
					if(agent instanceof EveAgent){
						EList<EveConnection> list = agent.getConnections();
						currentConnections = list.size();
						//now calculate the prob for connection
						//System.out.println(currentConnections);
						//System.out.println(totalConnections);
						//System.out.println(Double.valueOf(currentConnections) / Double.valueOf(totalConnections));
						Double probability = new Double(Double.valueOf(currentConnections) / Double.valueOf(totalConnections));
						//System.out.println(probability);
						Probability proba = new Probability(probability);
						if(proba.nextEvent(rng)){
							EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();
							con.setStrength(new Float(5.0));
							con.setConnected(true);
							con.setParent(age);
							con.setConnectedComponent(agent);
							flag = true;
						}

					}

				}

				//finally add the new agent with connections

				if(flag){
					comp.addChild(age);
				}


			}
			else{

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

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

		EveEvolutionaryAgent age = SocialNetworkAnalysisFactory.eINSTANCE.createEveEvolutionaryAgent();
		EveEvolutionaryAgent age1 = SocialNetworkAnalysisFactory.eINSTANCE.createEveEvolutionaryAgent();

		age.setParent(node);
		age1.setParent(node);

		EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();
		con.setConnected(true);
		con.setConnectedComponent(age1);
		con.setParent(age);

		age.setIsRoot(true);

		for(int i = 0; i < 100; i++){
			age.execute();
		}
		//System.out.println(node.getChildren().size());

		// Register the XMI resource factory for the .evesim extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI
				.createURI("evesim/simulation.evesim"));
		resource.getContents().add(sim);



		InportBiotechDataToXML.saveResource("C:\\temp\\test.evesim", resource);

	}


} //EveEvolutionaryAgentImpl
