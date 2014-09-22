/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.usecase.socialNetworkAnalysis.*;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialNetworkAnalysisFactoryImpl extends EFactoryImpl implements SocialNetworkAnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SocialNetworkAnalysisFactory init() {
		try {
			SocialNetworkAnalysisFactory theSocialNetworkAnalysisFactory = (SocialNetworkAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim/usecase/socialNetworkAnalysis"); 
			if (theSocialNetworkAnalysisFactory != null) {
				return theSocialNetworkAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SocialNetworkAnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkAnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SocialNetworkAnalysisPackage.EVE_AGENT_SNA: return createEveAgentSNA();
			case SocialNetworkAnalysisPackage.EVE_GATEWAY_SNA: return createEveGatewaySNA();
			case SocialNetworkAnalysisPackage.EVE_EVOLUTIONARY_AGENT: return createEveEvolutionaryAgent();
			case SocialNetworkAnalysisPackage.EVE_HISTORY_AGENT: return createEveHistoryAgent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveAgentSNA createEveAgentSNA() {
		EveAgentSNAImpl eveAgentSNA = new EveAgentSNAImpl();
		return eveAgentSNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveGatewaySNA createEveGatewaySNA() {
		EveGatewaySNAImpl eveGatewaySNA = new EveGatewaySNAImpl();
		return eveGatewaySNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveEvolutionaryAgent createEveEvolutionaryAgent() {
		EveEvolutionaryAgentImpl eveEvolutionaryAgent = new EveEvolutionaryAgentImpl();
		return eveEvolutionaryAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveHistoryAgent createEveHistoryAgent() {
		EveHistoryAgentImpl eveHistoryAgent = new EveHistoryAgentImpl();
		return eveHistoryAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialNetworkAnalysisPackage getSocialNetworkAnalysisPackage() {
		return (SocialNetworkAnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SocialNetworkAnalysisPackage getPackage() {
		return SocialNetworkAnalysisPackage.eINSTANCE;
	}

} //SocialNetworkAnalysisFactoryImpl
