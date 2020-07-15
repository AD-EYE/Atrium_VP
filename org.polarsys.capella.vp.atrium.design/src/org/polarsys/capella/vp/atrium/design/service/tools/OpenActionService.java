
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
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
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
	public boolean create_CFA_list(EObject element, EObject newSemanticContainer) {
		CFA_list myCFA_list = null;

		myCFA_list = AtriumFactoryImpl.eINSTANCE.createCFA_list();

		((CapellaElement) myCFA_list).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myCFA_list);
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean create_Assumption_list(EObject element, EObject newSemanticContainer) {
		Assumption_list myAssumption_list = null;

		myAssumption_list = AtriumFactoryImpl.eINSTANCE.createAssumption_list();

		((CapellaElement) myAssumption_list).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myAssumption_list);
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean create_DG_list(EObject element, EObject newSemanticContainer) {
		DG_list myDG_list = null;

		myDG_list = AtriumFactoryImpl.eINSTANCE.createDG_list();

		((CapellaElement) myDG_list).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myDG_list);
		return true;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean create_DA_list(EObject element, EObject newSemanticContainer) {
		DA_list myDA_list = null;

		myDA_list = AtriumFactoryImpl.eINSTANCE.createDA_list();

		((CapellaElement) myDA_list).setId(EcoreUtil.generateUUID());
		((ExtensibleElement) element).getOwnedExtensions().add((ElementExtension) myDA_list);
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean add_CFA(EObject eObject, EObject newSemanticContainer) {

		if (!(eObject instanceof CFA_list)) {
			System.out.println("Action cancelled, please add CFA inside a CFA list");
			return false;
		} else {
			CFA myCFA = null;
			CFA_list my_list = (CFA_list) eObject;

			myCFA = AtriumFactoryImpl.eINSTANCE.createCFA();

			myCFA.setContent("Some content");
			myCFA.setState(true);

			((CapellaElement) myCFA).setId(EcoreUtil.generateUUID());
			((ExtensibleElement) my_list).getOwnedExtensions().add((ElementExtension) myCFA);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean add_assumption(EObject element, EObject newSemanticContainer) {

		new Simple();

		if (!(element instanceof Assumption_list)) {
			System.out.println("Action cancelled, please add an Assumption inside an Assumption list");
			return false;
		} else {
			Assumption myAssumption = null;
			Assumption_list my_Assumption_list = (Assumption_list) element;

			myAssumption = AtriumFactoryImpl.eINSTANCE.createAssumption();

			myAssumption.setContent("Some content");
			myAssumption.setRationale("yes");
			myAssumption.setValidity("no");

			((CapellaElement) myAssumption).setId(EcoreUtil.generateUUID());
			((ExtensibleElement) my_Assumption_list).getOwnedExtensions().add((ElementExtension) myAssumption);
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element              : the element
	 * @param newSemanticContainer : the element view
	 * @generated NOT
	 */
	public boolean add_DG(EObject element, EObject newSemanticContainer) {

		if (!(element instanceof DG_list)) {
			System.out.println("Action cancelled, please add a DG inside a DG list");
			return false;
		} else {
			DG myDG = null;
			DG_list my_DG_list = (DG_list) element;

			myDG = AtriumFactoryImpl.eINSTANCE.createDG();

			myDG.setContent("Some content");

			((CapellaElement) myDG).setId(EcoreUtil.generateUUID());
			((ExtensibleElement) my_DG_list).getOwnedExtensions().add((ElementExtension) myDG);
			return true;
		}
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param element : the element
	* @param newSemanticContainer : the element view
	* @generated NOT
	*/
	public boolean add_DA(EObject element, EObject newSemanticContainer) {

		if (!(element instanceof DA_list)) {
			System.out.println("Action cancelled, please add a DA inside a DA list");
			return false;
		} else {
			DA myDA = null;
			DA_list my_DA_list = (DA_list) element;

			myDA = AtriumFactoryImpl.eINSTANCE.createDA();

			myDA.setContent("Some content");

			((CapellaElement) myDA).setId(EcoreUtil.generateUUID());
			((ExtensibleElement) my_DA_list).getOwnedExtensions().add((ElementExtension) myDA);
			return true;
		}
	}

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
}