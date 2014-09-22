/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch;

import org.evesim.EveAgent;
import org.evesim.usecase.services.EveFitness;
import org.evesim.usecase.services.EveSearchAttributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eve Agent Semantic Search</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.evesim.usecase.semanticSearch.SemanticSearchPackage#getEveAgentSemanticSearch()
 * @model
 * @generated
 */
public interface EveAgentSemanticSearch extends EveAgent {

	EveFitness doSemanticSearch(EveSearchAttributes sAttributes);
} // EveAgentSemanticSearch
