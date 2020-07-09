
// Generated on 08.07.2020 at 03:35:51 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.design.service.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.impl.LogicalComponentImpl;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.atrium.design.service.nodes.ContainerLC_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class ContainerLC_Service {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param view : the current view
	* @param container : the semantic container of the current object
	* @generated NOT
	*/
	public boolean isElementNew(EObject eObject, EObject view, EObject container) {

		System.out.println("Let me check if that container should be red");

		//go at root level then access the CFAs
		//look for the owned CFAs

		EObject predecessor = eObject.eContainer();

		while (!(predecessor instanceof LogicalComponentPkg)) {
			predecessor = predecessor.eContainer();
		}

		for (EObject eO : predecessor.eContents()) {
			if (eO instanceof CFA) {
				CFA targetCFA = (CFA) eO;
				if (targetCFA.getLinkedtoElement() == eObject) {
					if (targetCFA.getStateLinkedElement() == stateLinkedElement_Type.NEW_DEVELOPMENT) {
						return true;
					}
				}
			}
		}
		return false;
	}
}