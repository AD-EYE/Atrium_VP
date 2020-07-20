
// Generated on 13.07.2020 at 03:36:18 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.capella.vp.atrium.ui.fields;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

import org.polarsys.capella.core.ui.properties.fields.*;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;

import org.polarsys.capella.vp.atrium.Atrium.DA;

/**
 * <!-- begin-user-doc -->
* The '<em><b>[IsPartOfSelectionField_semanticCheckboxGroup]</b></em>' customized CheckboxGroup field. 
* <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class IsPartOfSelectionField_semanticCheckboxGroup extends AbstractSemanticCheckboxGroup {

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private Button _IsPartOfSelectionFieldButton;

	/**
	* Constructor.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent_p
	* @param widgetFactory_p
	* @generated
	*/
	public IsPartOfSelectionField_semanticCheckboxGroup(Composite parent_p,
			TabbedPropertySheetWidgetFactory widgetFactory_p) {
		super(parent_p, widgetFactory_p);
		_IsPartOfSelectionFieldButton = createButton(AtriumPackage.eINSTANCE.getDA_IsPartOfSelection(),
				"Is Part Of Selection", parent_p); //$NON-NLS-1$ 
		// Set the GridData of the checkBox
		Layout parentLayout = parent_p.getLayout();
		if (parentLayout != null && parentLayout instanceof GridLayout) {
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.horizontalSpan = ((GridLayout) parentLayout).numColumns;
			_IsPartOfSelectionFieldButton.setLayoutData(gd);
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
		fields.add(_IsPartOfSelectionFieldButton);
		return fields;
	}
}