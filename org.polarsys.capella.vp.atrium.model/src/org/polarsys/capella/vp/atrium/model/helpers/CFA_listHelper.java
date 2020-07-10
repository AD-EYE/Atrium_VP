package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;

/**
 * @generated
 */
public class CFA_listHelper {

	private static final CFA_listHelper instance = new CFA_listHelper();

	/**
	 * @generated
	 */
	public static CFA_listHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(CFA_list object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}