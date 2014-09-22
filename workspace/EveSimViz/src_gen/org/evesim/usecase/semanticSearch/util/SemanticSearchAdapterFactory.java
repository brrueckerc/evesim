/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch.util;

import java.io.Serializable;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.evesim.EveAgent;
import org.evesim.EveComponent;
import org.evesim.EveService;
import org.evesim.IControllable;
import org.evesim.IKmlProvider;
import org.evesim.usecase.semanticSearch.*;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.EveServiceSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.usecase.semanticSearch.SemanticSearchPackage
 * @generated
 */
public class SemanticSearchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticSearchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticSearchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SemanticSearchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticSearchSwitch<Adapter> modelSwitch =
		new SemanticSearchSwitch<Adapter>() {
			@Override
			public Adapter caseEveAgentSemanticSearch(EveAgentSemanticSearch object) {
				return createEveAgentSemanticSearchAdapter();
			}
			@Override
			public Adapter caseEveServiceSemanticSearch(EveServiceSemanticSearch object) {
				return createEveServiceSemanticSearchAdapter();
			}
			@Override
			public Adapter caseSerializable(Serializable object) {
				return createSerializableAdapter();
			}
			@Override
			public Adapter caseIAdaptable(IAdaptable object) {
				return createIAdaptableAdapter();
			}
			@Override
			public Adapter caseIKmlProvider(IKmlProvider object) {
				return createIKmlProviderAdapter();
			}
			@Override
			public Adapter caseEveComponent(EveComponent object) {
				return createEveComponentAdapter();
			}
			@Override
			public Adapter caseIControllable(IControllable object) {
				return createIControllableAdapter();
			}
			@Override
			public Adapter caseEveAgent(EveAgent object) {
				return createEveAgentAdapter();
			}
			@Override
			public Adapter caseEveService(EveService object) {
				return createEveServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.usecase.semanticSearch.EveAgentSemanticSearch <em>Eve Agent Semantic Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.usecase.semanticSearch.EveAgentSemanticSearch
	 * @generated
	 */
	public Adapter createEveAgentSemanticSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.usecase.semanticSearch.EveServiceSemanticSearch <em>Eve Service Semantic Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.usecase.semanticSearch.EveServiceSemanticSearch
	 * @generated
	 */
	public Adapter createEveServiceSemanticSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.io.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.io.Serializable
	 * @generated
	 */
	public Adapter createSerializableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.core.runtime.IAdaptable <em>IAdaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.core.runtime.IAdaptable
	 * @generated
	 */
	public Adapter createIAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.IKmlProvider <em>IKml Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.IKmlProvider
	 * @generated
	 */
	public Adapter createIKmlProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveComponent <em>Eve Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveComponent
	 * @generated
	 */
	public Adapter createEveComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.IControllable <em>IControllable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.IControllable
	 * @generated
	 */
	public Adapter createIControllableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveAgent <em>Eve Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveAgent
	 * @generated
	 */
	public Adapter createEveAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.evesim.EveService <em>Eve Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.evesim.EveService
	 * @generated
	 */
	public Adapter createEveServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SemanticSearchAdapterFactory
