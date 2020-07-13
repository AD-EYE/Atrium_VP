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

import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.Goal_list;
import org.polarsys.capella.vp.atrium.Atrium.CFAlist;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;

/**
 * @generated 
 */
public class AtriumPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof CFA_list) {
			ret = CFA_listHelper.getInstance().doSwitch((CFA_list) object, feature);
		}
		if (ret == null && object instanceof Assumption_list) {
			ret = Assumption_listHelper.getInstance().doSwitch((Assumption_list) object, feature);
		}
		if (ret == null && object instanceof DG_list) {
			ret = DG_listHelper.getInstance().doSwitch((DG_list) object, feature);
		}
		if (ret == null && object instanceof CFA) {
			ret = CFAHelper.getInstance().doSwitch((CFA) object, feature);
		}
		if (ret == null && object instanceof Assumption) {
			ret = AssumptionHelper.getInstance().doSwitch((Assumption) object, feature);
		}
		if (ret == null && object instanceof DG) {
			ret = DGHelper.getInstance().doSwitch((DG) object, feature);
		}
		if (ret == null && object instanceof ElementStateAtrium) {
			ret = ElementStateAtriumHelper.getInstance().doSwitch((ElementStateAtrium) object, feature);
		}
		return ret;
	}

}
