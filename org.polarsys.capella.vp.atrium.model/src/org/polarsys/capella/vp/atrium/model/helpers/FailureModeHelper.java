package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;

/**
 * @generated
 */
public class FailureModeHelper {

	private static final FailureModeHelper instance = new FailureModeHelper();

	/**
	 * @generated
	 */
	public static FailureModeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(FailureMode object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}