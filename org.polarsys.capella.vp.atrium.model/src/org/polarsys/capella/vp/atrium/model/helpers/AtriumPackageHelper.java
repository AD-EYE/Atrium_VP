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

import org.polarsys.capella.vp.atrium.Atrium.AtriumBasicElement;
import org.polarsys.capella.vp.atrium.Atrium.CFA_list;
import org.polarsys.capella.vp.atrium.Atrium.sDG_list;
import org.polarsys.capella.vp.atrium.Atrium.Assumption_list;
import org.polarsys.capella.vp.atrium.Atrium.DG_list;
import org.polarsys.capella.vp.atrium.Atrium.DA_list;
import org.polarsys.capella.vp.atrium.Atrium.Failure_list;
import org.polarsys.capella.vp.atrium.Atrium.ODD_list;
import org.polarsys.capella.vp.atrium.Atrium.FR_list;
import org.polarsys.capella.vp.atrium.Atrium.Goal_list;
import org.polarsys.capella.vp.atrium.Atrium.CFAlist;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.sDG;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.ODD;
import org.polarsys.capella.vp.atrium.Atrium.FR;

/**
 * @generated 
 */
public class AtriumPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof AtriumBasicElement) {
			ret = AtriumBasicElementHelper.getInstance().doSwitch((AtriumBasicElement) object, feature);
		}
		if (ret == null && object instanceof CFA_list) {
			ret = CFA_listHelper.getInstance().doSwitch((CFA_list) object, feature);
		}
		if (ret == null && object instanceof sDG_list) {
			ret = SDG_listHelper.getInstance().doSwitch((sDG_list) object, feature);
		}
		if (ret == null && object instanceof Assumption_list) {
			ret = Assumption_listHelper.getInstance().doSwitch((Assumption_list) object, feature);
		}
		if (ret == null && object instanceof DG_list) {
			ret = DG_listHelper.getInstance().doSwitch((DG_list) object, feature);
		}
		if (ret == null && object instanceof DA_list) {
			ret = DA_listHelper.getInstance().doSwitch((DA_list) object, feature);
		}
		if (ret == null && object instanceof Failure_list) {
			ret = Failure_listHelper.getInstance().doSwitch((Failure_list) object, feature);
		}
		if (ret == null && object instanceof ODD_list) {
			ret = ODD_listHelper.getInstance().doSwitch((ODD_list) object, feature);
		}
		if (ret == null && object instanceof FR_list) {
			ret = FR_listHelper.getInstance().doSwitch((FR_list) object, feature);
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
		if (ret == null && object instanceof sDG) {
			ret = SDGHelper.getInstance().doSwitch((sDG) object, feature);
		}
		if (ret == null && object instanceof DA) {
			ret = DAHelper.getInstance().doSwitch((DA) object, feature);
		}
		if (ret == null && object instanceof ElementStateAtrium) {
			ret = ElementStateAtriumHelper.getInstance().doSwitch((ElementStateAtrium) object, feature);
		}
		if (ret == null && object instanceof FailureMode) {
			ret = FailureModeHelper.getInstance().doSwitch((FailureMode) object, feature);
		}
		if (ret == null && object instanceof ODD) {
			ret = ODDHelper.getInstance().doSwitch((ODD) object, feature);
		}
		if (ret == null && object instanceof FR) {
			ret = FRHelper.getInstance().doSwitch((FR) object, feature);
		}
		return ret;
	}

}
