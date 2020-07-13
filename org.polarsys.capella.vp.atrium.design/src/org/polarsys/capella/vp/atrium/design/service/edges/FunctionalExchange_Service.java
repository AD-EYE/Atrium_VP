
// Generated on 09.07.2020 at 10:56:11 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.design.service.edges;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.atrium.design.service.edges.FunctionalExchange_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class FunctionalExchange_Service {

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param view : the current view
	* @param container : the semantic container of the current object
	* @generated NOT
	*/
	public boolean isElementNewFE(EObject eObject, EObject view, EObject container) {

		for (EObject eO : eObject.eContents()) {
			if (eO instanceof ElementStateAtrium) {
				if (((ElementStateAtrium) eO).isIsNewDevelopment()) {
					return true;
				}
			}
		}
		return false;
	}
}