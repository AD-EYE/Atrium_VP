package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.CFAlist;

/**
 * @generated
 */
public class CFAlistHelper {

	private static final CFAlistHelper instance = new CFAlistHelper();

	/**
	 * @generated
	 */
	public static CFAlistHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(CFAlist object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}