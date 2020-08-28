
// Generated on 28.08.2020 at 01:16:53 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

import org.polarsys.capella.core.ui.properties.fields.*;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.CFA;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[NonApplicableField_semanticCheckboxGroup]</b></em>' customized CheckboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class NonApplicableField_semanticCheckboxGroup extends AbstractSemanticCheckboxGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _NonApplicableFieldButton;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public NonApplicableField_semanticCheckboxGroup(Composite parent_p,
			TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p);
		_NonApplicableFieldButton = createButton(AtriumPackage.eINSTANCE.getCFA_NonApplicable(), "Non Applicable", //$NON-NLS-1$
				parent_p);
		// Set the GridData of the checkBox
		Layout parentLayout = parent_p.getLayout();
		if (parentLayout != null && parentLayout instanceof GridLayout) {
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ((GridLayout) parentLayout).numColumns;
			_NonApplicableFieldButton.setLayoutData(gd);
		}
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
		fields.add(_NonApplicableFieldButton);
		return fields;
	}
}