
// Generated on 10.07.2020 at 04:31:07 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.sections;

import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import org.polarsys.capella.core.ui.properties.controllers.*;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;

import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

import org.polarsys.capella.core.ui.properties.fields.*;

import org.polarsys.capella.vp.atrium.ui.controllers.CFAsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Atrium_CFA_list_Atrium_CFA_list_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Atrium_CFA_list_Atrium_CFA_list_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField CFAsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_CFA_list_AssociationGroup;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject: current object
	* @generated
	*/
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest == null) {
			return false;
		} else if (eObjectToTest instanceof CFA_list) {
			return true;
		} else {
			EObject children = getCFA_listObject(eObjectToTest);
			if (children != null) {
				return true;
			}
		}

		return false;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param part
	* @param selection
	* @generated
	*/
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EObject newEObject = super.setInputSelection(part, selection);

		if (newEObject != null && !(newEObject instanceof CFA_list))
			newEObject = getCFA_listObject(newEObject);

		if (newEObject != null) {
			loadData(newEObject);
		} else {
			return;
		}
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent: An EObject. It is considered as the Parent of an EMDE extension (a Viewpoint element)
	* @return 
	* @generated
	*/
	private EObject getCFA_listObject(EObject parent) {
		if (parent == null)
			return null;

		if (!isViewpointActive(parent))
			return null;

		if (parent.eContents() == null)
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof CFA_list) {
				result = (result == null ? (CFA_list) iEObject : null);
				// This case is true when there is more then one extension of the same type. 
				if (result == null)
					break;
			}
		}
		return result;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @return True is the AF viewpoint is active. False else. 
	* @generated
	*/
	private boolean isViewpointActive(EObject modelElement) {
		return ViewpointManager.getInstance(modelElement).isUsed("org.polarsys.capella.vp.atrium")
				&& !ViewpointManager.getInstance(modelElement).isFiltered("org.polarsys.capella.vp.atrium");
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param parent:
	* @param aTabbedPropertySheetPage:
	* @generated
	*/
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		Atrium_CFA_list_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"C F A_list Associations");
		Atrium_CFA_list_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdAtrium_CFA_list_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_CFA_list_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		Atrium_CFA_list_AssociationGroup.setLayoutData(gdAtrium_CFA_list_AssociationGroup);

		CFAsAssociation = new MultipleSemanticField(Atrium_CFA_list_AssociationGroup, "C F As :", getWidgetFactory(),
				new CFAsAssociationFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		CFAsAssociation.loadData(object, AtriumPackage.eINSTANCE.getCFA_list_CFAs());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(CFAsAssociation);

		return abstractSemanticFields;
	}
}
