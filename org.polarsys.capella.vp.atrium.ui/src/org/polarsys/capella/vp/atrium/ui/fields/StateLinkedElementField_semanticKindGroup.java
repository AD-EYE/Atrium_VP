
// Generated on 08.07.2020 at 03:29:07 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticKindGroup;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[StateLinkedElementField_semanticKindGroup]</b></em>' customized RadioboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class StateLinkedElementField_semanticKindGroup extends AbstractSemanticKindGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _stateLinkedElement_TypeBtnLEGACY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _stateLinkedElement_TypeBtnNEW_DEVELOPMENT;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public StateLinkedElementField_semanticKindGroup(Composite parent_p,
			TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p, "State Linked Element", 6); //$NON-NLS-1$

		_stateLinkedElement_TypeBtnLEGACY = createButton(stateLinkedElement_Type.LEGACY);
		_stateLinkedElement_TypeBtnNEW_DEVELOPMENT = createButton(stateLinkedElement_Type.NEW_DEVELOPMENT);
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
		fields.add(_stateLinkedElement_TypeBtnLEGACY);
		fields.add(_stateLinkedElement_TypeBtnNEW_DEVELOPMENT);
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
		return _stateLinkedElement_TypeBtnLEGACY;
	}
}
