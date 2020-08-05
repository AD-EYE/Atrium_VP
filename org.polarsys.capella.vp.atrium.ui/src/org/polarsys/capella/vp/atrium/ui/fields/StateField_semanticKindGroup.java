
// Generated on 05.08.2020 at 11:14:52 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticKindGroup;
import org.polarsys.capella.vp.atrium.Atrium.state_Type;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[StateField_semanticKindGroup]</b></em>' customized RadioboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class StateField_semanticKindGroup extends AbstractSemanticKindGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _state_TypeBtnPROCESSED;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _state_TypeBtnUNPROCESSED;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public StateField_semanticKindGroup(Composite parent_p, TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p, "State", 6); //$NON-NLS-1$

		_state_TypeBtnPROCESSED = createButton(state_Type.PROCESSED);
		_state_TypeBtnUNPROCESSED = createButton(state_Type.UNPROCESSED);
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
		fields.add(_state_TypeBtnPROCESSED);
		fields.add(_state_TypeBtnUNPROCESSED);
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
		return _state_TypeBtnPROCESSED;
	}
}
