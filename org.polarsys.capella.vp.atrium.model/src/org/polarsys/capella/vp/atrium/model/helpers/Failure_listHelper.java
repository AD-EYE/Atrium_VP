package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.Failure_list;

/**
 * @generated
 */
public class Failure_listHelper {

	private static final Failure_listHelper instance = new Failure_listHelper();

	/**
	 * @generated
	 */
	public static Failure_listHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Failure_list object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}