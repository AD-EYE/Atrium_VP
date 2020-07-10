
// Generated on 10.07.2020 at 04:31:07 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.controllers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.CFA_list;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[CFAsAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class CFAsAssociationFieldController extends AbstractMultipleSemanticFieldController {
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
				AtriumPackage.eINSTANCE.getCFA_list_CFAs());
	}
}