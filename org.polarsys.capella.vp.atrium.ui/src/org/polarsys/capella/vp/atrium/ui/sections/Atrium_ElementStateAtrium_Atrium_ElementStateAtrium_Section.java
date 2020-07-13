
// Generated on 13.07.2020 at 02:00:40 CEST by Viewpoint DSL Generator V 0.1

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

import org.polarsys.capella.vp.atrium.ui.fields.IsNewDevelopmentField_semanticCheckboxGroup;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Atrium_ElementStateAtrium_Atrium_ElementStateAtrium_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Atrium_ElementStateAtrium_Atrium_ElementStateAtrium_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private IsNewDevelopmentField_semanticCheckboxGroup IsNewDevelopmentField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_ElementStateAtrium_AttributeGroup;

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
		} else if (eObjectToTest instanceof ElementStateAtrium) {
			return true;
		} else {
			EObject children = getElementStateAtriumObject(eObjectToTest);
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

		if (newEObject != null && !(newEObject instanceof ElementStateAtrium))
			newEObject = getElementStateAtriumObject(newEObject);

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
	private EObject getElementStateAtriumObject(EObject parent) {
		if (parent == null)
			return null;

		if (!isViewpointActive(parent))
			return null;

		if (parent.eContents() == null)
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof ElementStateAtrium) {
				result = (result == null ? (ElementStateAtrium) iEObject : null);
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

		Atrium_ElementStateAtrium_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Element State Atrium Attributes");
		Atrium_ElementStateAtrium_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdAtrium_ElementStateAtrium_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_ElementStateAtrium_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite
				.getLayout()).numColumns;
		Atrium_ElementStateAtrium_AttributeGroup.setLayoutData(gdAtrium_ElementStateAtrium_AttributeGroup);

		IsNewDevelopmentField = new IsNewDevelopmentField_semanticCheckboxGroup(
				Atrium_ElementStateAtrium_AttributeGroup, getWidgetFactory());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		IsNewDevelopmentField.loadData(object);

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(IsNewDevelopmentField);

		return abstractSemanticFields;
	}
}
