
// Generated on 08.07.2020 at 05:08:49 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.design.service.edges;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.atrium.design.service.edges.LinkCFA_LC_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class LinkCFA_LC_Service {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param view : the current view
	* @param container : the semantic container of the current object
	* @generated NOT
	*/
	public boolean isElementNewEdge(EObject eObject, EObject view, EObject container) {
		System.out.println("Let me check if that edge should be red");
		CFA targetCFA = (CFA) eObject;

		return (targetCFA.getStateLinkedElement() == stateLinkedElement_Type.NEW_DEVELOPMENT);
	}
}