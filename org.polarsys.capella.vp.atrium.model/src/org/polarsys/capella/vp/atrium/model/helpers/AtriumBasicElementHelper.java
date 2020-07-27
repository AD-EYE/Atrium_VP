package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;

/**
 * @generated
 */
public class AtriumBasicElementHelper {

	private static final AtriumBasicElementHelper instance = new AtriumBasicElementHelper();

	/**
	 * @generated
	 */
	public static AtriumBasicElementHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(AtriumBasicElement object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}