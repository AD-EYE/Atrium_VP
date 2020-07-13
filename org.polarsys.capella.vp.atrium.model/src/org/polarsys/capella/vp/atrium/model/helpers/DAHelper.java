package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.DA;

/**
 * @generated
 */
public class DAHelper {

	private static final DAHelper instance = new DAHelper();

	/**
	 * @generated
	 */
	public static DAHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(DA object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}