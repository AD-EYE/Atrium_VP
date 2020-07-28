
package org.polarsys.capella.vp.atrium.Atrium.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.sDG;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.DGImpl#getDesignAlternative <em>Design Alternative</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.DGImpl#getSubDGs <em>Sub DGs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DGImpl extends AtriumBasicElementImpl implements DG {

	/**
	 * The cached value of the '{@link #getDesignAlternative() <em>Design Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<DA> designAlternative;

	/**
	 * The cached value of the '{@link #getSubDGs() <em>Sub DGs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDGs()
	 * @generated
	 * @ordered
	 */
	protected EList<sDG> subDGs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DGImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.DG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<DA> getDesignAlternative() {

		if (designAlternative == null) {
			designAlternative = new EObjectResolvingEList<DA>(DA.class, this, AtriumPackage.DG__DESIGN_ALTERNATIVE);
		}
		return designAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<sDG> getSubDGs() {

		if (subDGs == null) {
			subDGs = new EObjectResolvingEList<sDG>(sDG.class, this, AtriumPackage.DG__SUB_DGS);
		}
		return subDGs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.DG__DESIGN_ALTERNATIVE:
			return getDesignAlternative();
		case AtriumPackage.DG__SUB_DGS:
			return getSubDGs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtriumPackage.DG__DESIGN_ALTERNATIVE:
			getDesignAlternative().clear();
			getDesignAlternative().addAll((Collection<? extends DA>) newValue);
			return;
		case AtriumPackage.DG__SUB_DGS:
			getSubDGs().clear();
			getSubDGs().addAll((Collection<? extends sDG>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AtriumPackage.DG__DESIGN_ALTERNATIVE:
			getDesignAlternative().clear();
			return;
		case AtriumPackage.DG__SUB_DGS:
			getSubDGs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AtriumPackage.DG__DESIGN_ALTERNATIVE:
			return designAlternative != null && !designAlternative.isEmpty();
		case AtriumPackage.DG__SUB_DGS:
			return subDGs != null && !subDGs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DGImpl