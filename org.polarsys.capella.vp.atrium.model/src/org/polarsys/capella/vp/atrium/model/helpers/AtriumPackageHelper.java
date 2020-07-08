/**
 * <copyright>
 *
 * </copyright>
 */

package org.polarsys.capella.vp.atrium.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.DG;

/**
 * @generated 
 */
public class AtriumPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof CFA) {
			ret = CFAHelper.getInstance().doSwitch((CFA) object, feature);
		}
		if (ret == null && object instanceof Assumption) {
			ret = AssumptionHelper.getInstance().doSwitch((Assumption) object, feature);
		}
		if (ret == null && object instanceof DG) {
			ret = DGHelper.getInstance().doSwitch((DG) object, feature);
		}
		return ret;
	}

}
