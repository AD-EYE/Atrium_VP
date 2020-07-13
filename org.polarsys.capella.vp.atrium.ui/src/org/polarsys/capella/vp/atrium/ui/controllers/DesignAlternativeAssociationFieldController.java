
// Generated on 13.07.2020 at 03:17:40 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.controllers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.DG;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[DesignAlternativeAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class DesignAlternativeAssociationFieldController extends AbstractMultipleSemanticFieldController {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery(org.polarsys.capella.core.data.capellacore.CapellaElement)
	* @param semanticElement_p
	* @generated
	*/
	@Override
	protected IBusinessQuery getReadOpenValuesQuery(EObject semanticElement_p) {
		return BusinessQueriesProvider.getInstance().getContribution(semanticElement_p.eClass(),
				AtriumPackage.eINSTANCE.getDG_DesignAlternative());
	}
}