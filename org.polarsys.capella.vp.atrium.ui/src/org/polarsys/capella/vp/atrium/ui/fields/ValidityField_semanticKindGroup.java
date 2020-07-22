
// Generated on 22.07.2020 at 03:47:27 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.core.ui.properties.fields.AbstractSemanticKindGroup;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[ValidityField_semanticKindGroup]</b></em>' customized RadioboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class ValidityField_semanticKindGroup extends AbstractSemanticKindGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _validity_TypeBtnVALID;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _validity_TypeBtnINVALID;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public ValidityField_semanticKindGroup(Composite parent_p, TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p, "Validity", 6); //$NON-NLS-1$

		_validity_TypeBtnVALID = createButton(validity_Type.VALID);
		_validity_TypeBtnINVALID = createButton(validity_Type.INVALID);
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
		fields.add(_validity_TypeBtnVALID);
		fields.add(_validity_TypeBtnINVALID);
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
		return _validity_TypeBtnVALID;
	}
}
