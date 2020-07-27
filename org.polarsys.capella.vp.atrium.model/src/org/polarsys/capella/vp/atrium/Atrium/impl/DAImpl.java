
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.DA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.DAImpl#isIsPartOfSelection <em>Is Part Of Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAImpl extends AtriumBasicElementImpl implements DA {

	/**
	 * The default value of the '{@link #isIsPartOfSelection() <em>Is Part Of Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_OF_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartOfSelection() <em>Is Part Of Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartOfSelection = IS_PART_OF_SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.DA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsPartOfSelection() {

		return isPartOfSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsPartOfSelection(boolean newIsPartOfSelection) {

		boolean oldIsPartOfSelection = isPartOfSelection;
		isPartOfSelection = newIsPartOfSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.DA__IS_PART_OF_SELECTION,
					oldIsPartOfSelection, isPartOfSelection));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.DA__IS_PART_OF_SELECTION:
			return isIsPartOfSelection();
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
		case AtriumPackage.DA__IS_PART_OF_SELECTION:
			setIsPartOfSelection((Boolean) newValue);
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
		case AtriumPackage.DA__IS_PART_OF_SELECTION:
			setIsPartOfSelection(IS_PART_OF_SELECTION_EDEFAULT);
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
		case AtriumPackage.DA__IS_PART_OF_SELECTION:
			return isPartOfSelection != IS_PART_OF_SELECTION_EDEFAULT;
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
		result.append(" (isPartOfSelection: "); //$NON-NLS-1$
		result.append(isPartOfSelection);
		result.append(')');
		return result.toString();
	}

} //DAImpl