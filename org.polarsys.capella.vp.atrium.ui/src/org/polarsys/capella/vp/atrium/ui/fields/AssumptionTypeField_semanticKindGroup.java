
// Generated on 09.07.2020 at 02:29:26 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticKindGroup;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[AssumptionTypeField_semanticKindGroup]</b></em>' customized RadioboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class AssumptionTypeField_semanticKindGroup extends AbstractSemanticKindGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _assumptionType_TypeBtnCLARIFICATION;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _assumptionType_TypeBtnTASK;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _assumptionType_TypeBtnRISK;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public AssumptionTypeField_semanticKindGroup(Composite parent_p, TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p, "Assumption Type", 6); //$NON-NLS-1$

		_assumptionType_TypeBtnCLARIFICATION = createButton(assumptionType_Type.CLARIFICATION);
		_assumptionType_TypeBtnTASK = createButton(assumptionType_Type.TASK);
		_assumptionType_TypeBtnRISK = createButton(assumptionType_Type.RISK);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* {@inheritDoc}
	* @generated   
	*/
	@Override
	public List<Button> getSemanticFields() {
		List<Button> fields = new ArrayList<Button>();
		fields.add(_assumptionType_TypeBtnCLARIFICATION);
		fields.add(_assumptionType_TypeBtnTASK);
		fields.add(_assumptionType_TypeBtnRISK);
		return fields;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* {@inheritDoc}
	* @generated   
	*/
	@Override
	public Button getDefaultSemanticField() {
		return _assumptionType_TypeBtnCLARIFICATION;
	}
}
