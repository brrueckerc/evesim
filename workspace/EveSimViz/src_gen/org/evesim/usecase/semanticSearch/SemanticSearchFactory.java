/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.evesim.usecase.semanticSearch.SemanticSearchPackage
 * @generated
 */
public interface SemanticSearchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticSearchFactory eINSTANCE = org.evesim.usecase.semanticSearch.impl.SemanticSearchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eve Agent Semantic Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Agent Semantic Search</em>'.
	 * @generated
	 */
	EveAgentSemanticSearch createEveAgentSemanticSearch();

	/**
	 * Returns a new object of class '<em>Eve Service Semantic Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eve Service Semantic Search</em>'.
	 * @generated
	 */
	EveServiceSemanticSearch createEveServiceSemanticSearch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemanticSearchPackage getSemanticSearchPackage();

} //SemanticSearchFactory
