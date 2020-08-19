
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.FR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.FRImpl#getLinkedAssumption <em>Linked Assumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FRImpl extends AtriumBasicElementImpl implements FR {
	/**
	 * The cached value of the '{@link #getLinkedAssumption() <em>Linked Assumption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedAssumption()
	 * @generated
	 * @ordered
	 */
	protected Assumption linkedAssumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FRImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.FR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Assumption getLinkedAssumption() {

		if (linkedAssumption != null && linkedAssumption.eIsProxy()) {
			InternalEObject oldLinkedAssumption = (InternalEObject) linkedAssumption;
			linkedAssumption = (Assumption) eResolveProxy(oldLinkedAssumption);
			if (linkedAssumption != oldLinkedAssumption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtriumPackage.FR__LINKED_ASSUMPTION,
							oldLinkedAssumption, linkedAssumption));
			}
		}
		return linkedAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Assumption basicGetLinkedAssumption() {

		return linkedAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setLinkedAssumption(Assumption newLinkedAssumption) {

		Assumption oldLinkedAssumption = linkedAssumption;
		linkedAssumption = newLinkedAssumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.FR__LINKED_ASSUMPTION,
					oldLinkedAssumption, linkedAssumption));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.FR__LINKED_ASSUMPTION:
			if (resolve)
				return getLinkedAssumption();
			return basicGetLinkedAssumption();
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
		case AtriumPackage.FR__LINKED_ASSUMPTION:
			setLinkedAssumption((Assumption) newValue);
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
		case AtriumPackage.FR__LINKED_ASSUMPTION:
			setLinkedAssumption((Assumption) null);
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
		case AtriumPackage.FR__LINKED_ASSUMPTION:
			return linkedAssumption != null;
		}
		return super.eIsSet(featureID);
	}

} //FRImpl