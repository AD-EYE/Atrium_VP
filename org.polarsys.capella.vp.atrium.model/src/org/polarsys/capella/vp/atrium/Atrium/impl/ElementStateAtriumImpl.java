
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.ElementStateAtrium;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element State Atrium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.ElementStateAtriumImpl#isIsNewDevelopment <em>Is New Development</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementStateAtriumImpl extends NamedElementImpl implements ElementStateAtrium {

	/**
	 * The default value of the '{@link #isIsNewDevelopment() <em>Is New Development</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNewDevelopment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEW_DEVELOPMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNewDevelopment() <em>Is New Development</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNewDevelopment()
	 * @generated
	 * @ordered
	 */
	protected boolean isNewDevelopment = IS_NEW_DEVELOPMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementStateAtriumImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.ELEMENT_STATE_ATRIUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsNewDevelopment() {

		return isNewDevelopment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsNewDevelopment(boolean newIsNewDevelopment) {

		boolean oldIsNewDevelopment = isNewDevelopment;
		isNewDevelopment = newIsNewDevelopment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AtriumPackage.ELEMENT_STATE_ATRIUM__IS_NEW_DEVELOPMENT, oldIsNewDevelopment, isNewDevelopment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.ELEMENT_STATE_ATRIUM__IS_NEW_DEVELOPMENT:
			return isIsNewDevelopment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtriumPackage.ELEMENT_STATE_ATRIUM__IS_NEW_DEVELOPMENT:
			setIsNewDevelopment((Boolean) newValue);
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
		case AtriumPackage.ELEMENT_STATE_ATRIUM__IS_NEW_DEVELOPMENT:
			setIsNewDevelopment(IS_NEW_DEVELOPMENT_EDEFAULT);
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
		case AtriumPackage.ELEMENT_STATE_ATRIUM__IS_NEW_DEVELOPMENT:
			return isNewDevelopment != IS_NEW_DEVELOPMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isNewDevelopment: "); //$NON-NLS-1$
		result.append(isNewDevelopment);
		result.append(')');
		return result.toString();
	}

} //ElementStateAtriumImpl