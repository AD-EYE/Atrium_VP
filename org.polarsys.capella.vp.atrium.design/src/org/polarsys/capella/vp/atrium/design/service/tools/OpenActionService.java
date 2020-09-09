
// Generated on 03.07.2020 at 03:27:13 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.design.service.tools;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.Failure_list;
import org.polarsys.capella.vp.atrium.Atrium.state_Type;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

public class OpenActionService {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean ElementNewDevelopment(EObject element, EObject newSemanticContainer) {
		for (EObject eO : element.eContents()) {
			if (eO instanceof ElementStateAtrium) {
				// update ElementStateAtrium to newDevelopment
				ElementStateAtrium myElementState = (ElementStateAtrium) eO;
				myElementState.setIsNewDevelopment(true);
				return true;
			}
		}
		// or if not found
		// create ElementStateAtrium and initialize it to newDevelopment
		ElementStateAtrium myElementState = null;

		myElementState = AtriumFactoryImpl.eINSTANCE.createElementStateAtrium();

		myElementState.setIsNewDevelopment(true);

		((CapellaElement) myElementState).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myElementState);

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean ElementLegacy(EObject element, EObject newSemanticContainer) {
		for (EObject eO : element.eContents()) {
			if (eO instanceof ElementStateAtrium) {
				// update ElementStateAtrium to Legacy
				ElementStateAtrium myElementState = (ElementStateAtrium) eO;
				myElementState.setIsNewDevelopment(false);
				return true;
			}
		}
		// or if not found
		// create ElementStateAtrium and initialize it to newDevelopment
		ElementStateAtrium myElementState = null;

		myElementState = AtriumFactoryImpl.eINSTANCE.createElementStateAtrium();

		myElementState.setIsNewDevelopment(false);

		((CapellaElement) myElementState).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myElementState);

		return true;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean openSwing(EObject element, EObject newSemanticContainer) {

		new AtriumProcess(element, null);
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean openSelectedSwing(EObject element, EObject newSemanticContainer) {
		new DiagramSelection(element);
		return true;
	}
}