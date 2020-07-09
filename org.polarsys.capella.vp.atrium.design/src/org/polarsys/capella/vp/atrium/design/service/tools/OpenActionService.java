
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
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumFactory;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.capella.vp.atrium.design.service.tools.OpenActionService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class OpenActionService {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean add_CFA(EObject eObject, EObject newSemanticContainer) {

		System.out.print("Hello there, the variable eObject contains : ");
		System.out.println(eObject);
		CFA myCFA = null;

		myCFA = AtriumFactoryImpl.eINSTANCE.createCFA();

		myCFA.setContent("General Kenobi");
		myCFA.setState(true);

		((CapellaElement) myCFA).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) eObject).getOwnedExtensions().add((ElementExtension) myCFA);
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean add_assumption(EObject element, EObject newSemanticContainer) {

		if (element instanceof CFA) {

			CFA targetCFA = (CFA) element;

			Assumption myAssumption = null;
			myAssumption = AtriumFactoryImpl.eINSTANCE.createAssumption();

			myAssumption.setContent("I ASSUME SOMETHING");
			myAssumption.setRationale("blabla");
			myAssumption.setValidity("I am probably valid");

			((CapellaElement) myAssumption).setId(EcoreUtil.generateUUID());
			targetCFA.getAssumption().add(myAssumption);
		} else {
			System.out.println("This is not a CFA, cancelling creation");
			return false;
		}

		return true;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean add_DG(EObject element, EObject newSemanticContainer) {

		if (element instanceof CFA) {

			CFA targetCFA = (CFA) element;

			System.out.println("The selected element is from CFA so we can do the job");

			DG myDG = null;
			myDG = AtriumFactoryImpl.eINSTANCE.createDG();

			myDG.setContent("I ASSUME SOMETHING");

			((CapellaElement) myDG).setId(EcoreUtil.generateUUID());
			targetCFA.setGoal(myDG);
		} else {
			System.out.println("Come on, this is not a CFA");
			return false;
		}

		return true;

	}
}