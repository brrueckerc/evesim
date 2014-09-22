/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.evesim.usecase.semanticSearch.*;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.EveServiceSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticSearchFactoryImpl extends EFactoryImpl implements SemanticSearchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticSearchFactory init() {
		try {
			SemanticSearchFactory theSemanticSearchFactory = (SemanticSearchFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.evesim.org/evesim/usecase/semanticSearch"); 
			if (theSemanticSearchFactory != null) {
				return theSemanticSearchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticSearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticSearchFactoryImpl() {
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
			case SemanticSearchPackage.EVE_AGENT_SEMANTIC_SEARCH: return createEveAgentSemanticSearch();
			case SemanticSearchPackage.EVE_SERVICE_SEMANTIC_SEARCH: return createEveServiceSemanticSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveAgentSemanticSearch createEveAgentSemanticSearch() {
		EveAgentSemanticSearchImpl eveAgentSemanticSearch = new EveAgentSemanticSearchImpl();
		return eveAgentSemanticSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EveServiceSemanticSearch createEveServiceSemanticSearch() {
		EveServiceSemanticSearchImpl eveServiceSemanticSearch = new EveServiceSemanticSearchImpl();
		return eveServiceSemanticSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticSearchPackage getSemanticSearchPackage() {
		return (SemanticSearchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticSearchPackage getPackage() {
		return SemanticSearchPackage.eINSTANCE;
	}

} //SemanticSearchFactoryImpl
