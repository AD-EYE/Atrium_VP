
// Generated on 13.07.2020 at 03:17:40 CEST by Viewpoint DSL Generator V 0.1

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

import org.polarsys.capella.vp.atrium.ui.fields.IsPartOfSelectionField_semanticCheckboxGroup;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;
import org.polarsys.capella.vp.atrium.Atrium.DA;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Atrium_DA_Atrium_DA_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Atrium_DA_Atrium_DA_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private IsPartOfSelectionField_semanticCheckboxGroup IsPartOfSelectionField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_DA_AttributeGroup;

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
		} else if (eObjectToTest instanceof DA) {
			return true;
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
		if (newEObject != null) {
			loadData(newEObject);
		} else {
			return;
		}
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

		Atrium_DA_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite, "D A Attributes");
		Atrium_DA_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdAtrium_DA_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_DA_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		Atrium_DA_AttributeGroup.setLayoutData(gdAtrium_DA_AttributeGroup);

		IsPartOfSelectionField = new IsPartOfSelectionField_semanticCheckboxGroup(Atrium_DA_AttributeGroup,
				getWidgetFactory());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		IsPartOfSelectionField.loadData(object);

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(IsPartOfSelectionField);

		return abstractSemanticFields;
	}
}
