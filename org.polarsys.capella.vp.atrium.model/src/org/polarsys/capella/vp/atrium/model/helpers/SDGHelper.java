package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.sDG;

/**
 * @generated
 */
public class SDGHelper {

	private static final SDGHelper instance = new SDGHelper();

	/**
	 * @generated
	 */
	public static SDGHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(sDG object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}