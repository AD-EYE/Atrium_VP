package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;

/**
 * @generated
 */
public class DA_listHelper {

	private static final DA_listHelper instance = new DA_listHelper();

	/**
	 * @generated
	 */
	public static DA_listHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(DA_list object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}