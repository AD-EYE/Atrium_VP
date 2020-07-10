
// Generated on 07.07.2020 at 01:57:45 CEST by Viewpoint DSL Generator V 0.1

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

import org.polarsys.capella.vp.atrium.ui.fields.StateField_semanticCheckboxGroup;

import org.polarsys.capella.vp.atrium.ui.fields.StateLinkedElementField_semanticKindGroup;
import org.polarsys.capella.vp.atrium.ui.controllers.AssumptionAssociationFieldController;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.CFA;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Atrium_CFA_Atrium_CFA_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Atrium_CFA_Atrium_CFA_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup ContentField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private StateField_semanticCheckboxGroup StateField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private StateLinkedElementField_semanticKindGroup StateLinkedElementField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField LinkedtoElementAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField AssumptionAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField GoalAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_CFA_AttributeGroup;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
		* <!-- end-user-doc -->
		* @generated
		*/
	private Group Atrium_CFA_AssociationGroup;

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
		} else if (eObjectToTest instanceof CFA) {
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

		Atrium_CFA_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite, "C F A Attributes");
		Atrium_CFA_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdAtrium_CFA_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_CFA_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		Atrium_CFA_AttributeGroup.setLayoutData(gdAtrium_CFA_AttributeGroup);

		ContentField = new TextValueGroup(Atrium_CFA_AttributeGroup, "Content :", getWidgetFactory(), true);

		StateField = new StateField_semanticCheckboxGroup(Atrium_CFA_AttributeGroup, getWidgetFactory());

		StateLinkedElementField = new StateLinkedElementField_semanticKindGroup(Atrium_CFA_AttributeGroup,
				getWidgetFactory());

		Atrium_CFA_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite, "C F A Associations");
		Atrium_CFA_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdAtrium_CFA_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdAtrium_CFA_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		Atrium_CFA_AssociationGroup.setLayoutData(gdAtrium_CFA_AssociationGroup);

		LinkedtoElementAssociation = new SimpleSemanticField(Atrium_CFA_AssociationGroup, "Linkedto Element :",
				getWidgetFactory(), new SimpleSemanticFieldController());

		AssumptionAssociation = new MultipleSemanticField(Atrium_CFA_AssociationGroup, "Assumption :",
				getWidgetFactory(), new AssumptionAssociationFieldController());

		GoalAssociation = new SimpleSemanticField(Atrium_CFA_AssociationGroup, "Goal :", getWidgetFactory(),
				new SimpleSemanticFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		ContentField.loadData(object, AtriumPackage.eINSTANCE.getCFA_Content());

		StateField.loadData(object);

		StateLinkedElementField.loadData(object, AtriumPackage.eINSTANCE.getCFA_StateLinkedElement());

		LinkedtoElementAssociation.loadData(object, AtriumPackage.eINSTANCE.getCFA_LinkedtoElement());

		AssumptionAssociation.loadData(object, AtriumPackage.eINSTANCE.getCFA_Assumption());

		GoalAssociation.loadData(object, AtriumPackage.eINSTANCE.getCFA_Goal());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ContentField);

		abstractSemanticFields.add(StateField);

		abstractSemanticFields.add(StateLinkedElementField);

		abstractSemanticFields.add(LinkedtoElementAssociation);

		abstractSemanticFields.add(AssumptionAssociation);

		abstractSemanticFields.add(GoalAssociation);

		return abstractSemanticFields;
	}
}
