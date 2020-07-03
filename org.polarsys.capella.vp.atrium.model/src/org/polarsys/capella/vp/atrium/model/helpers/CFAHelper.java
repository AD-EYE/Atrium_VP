package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.CFA;

/**
 * @generated
 */
public class CFAHelper {

	private static final CFAHelper instance = new CFAHelper();

	/**
	 * @generated
	 */
	public static CFAHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(CFA object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}