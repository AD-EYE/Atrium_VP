package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;

/**
 * @generated
 */
public class ElementStateAtriumHelper {

	private static final ElementStateAtriumHelper instance = new ElementStateAtriumHelper();

	/**
	 * @generated
	 */
	public static ElementStateAtriumHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ElementStateAtrium object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}