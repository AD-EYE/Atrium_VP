
// Generated on 08.07.2020 at 02:20:59 CEST by Viewpoint DSL Generator V 0.1

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

import org.polarsys.capella.vp.atrium.ui.fields.AssumptionTypeField_semanticKindGroup;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Atrium_Assumption_Atrium_Assumption_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Atrium_Assumption_Atrium_Assumption_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup ContentField1;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup RationaleField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup ValidityField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private AssumptionTypeField_semanticKindGroup AssumptionTypeField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_Assumption_AttributeGroup;

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
		} else if (eObjectToTest instanceof Assumption) {
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

		Atrium_Assumption_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite, "Assumption Attributes");
		Atrium_Assumption_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdAtrium_Assumption_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_Assumption_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		Atrium_Assumption_AttributeGroup.setLayoutData(gdAtrium_Assumption_AttributeGroup);

		ContentField1 = new TextValueGroup(Atrium_Assumption_AttributeGroup, "Content :", getWidgetFactory(), true);

		RationaleField = new TextValueGroup(Atrium_Assumption_AttributeGroup, "Rationale :", getWidgetFactory(), true);

		ValidityField = new TextValueGroup(Atrium_Assumption_AttributeGroup, "Validity :", getWidgetFactory(), true);

		AssumptionTypeField = new AssumptionTypeField_semanticKindGroup(Atrium_Assumption_AttributeGroup,
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

		ContentField1.loadData(object, AtriumPackage.eINSTANCE.getAssumption_Content());

		RationaleField.loadData(object, AtriumPackage.eINSTANCE.getAssumption_Rationale());

		ValidityField.loadData(object, AtriumPackage.eINSTANCE.getAssumption_Validity());

		AssumptionTypeField.loadData(object, AtriumPackage.eINSTANCE.getAssumption_AssumptionType());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ContentField1);

		abstractSemanticFields.add(RationaleField);

		abstractSemanticFields.add(ValidityField);

		abstractSemanticFields.add(AssumptionTypeField);

		return abstractSemanticFields;
	}
}
