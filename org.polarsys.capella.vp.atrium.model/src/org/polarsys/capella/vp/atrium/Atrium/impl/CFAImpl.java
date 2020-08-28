
package org.polarsys.capella.vp.atrium.Atrium.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.CapellaElement;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.FailureMode;
import org.polarsys.capella.vp.atrium.Atrium.state_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getLinkedtoElement <em>Linkedto Element</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getLinkedtoFailure <em>Linkedto Failure</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getState <em>State</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#isNonApplicable <em>Non Applicable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFAImpl extends AtriumBasicElementImpl implements CFA {

	/**
	 * The cached value of the '{@link #getLinkedtoElement() <em>Linkedto Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedtoElement()
	 * @generated
	 * @ordered
	 */
	protected CapellaElement linkedtoElement;

	/**
	 * The cached value of the '{@link #getLinkedtoFailure() <em>Linkedto Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedtoFailure()
	 * @generated
	 * @ordered
	 */
	protected FailureMode linkedtoFailure;

	/**
	 * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumption;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected DG goal;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final state_Type STATE_EDEFAULT = state_Type.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected state_Type state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNonApplicable() <em>Non Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonApplicable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NON_APPLICABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonApplicable() <em>Non Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonApplicable()
	 * @generated
	 * @ordered
	 */
	protected boolean nonApplicable = NON_APPLICABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFAImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.CFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public CapellaElement getLinkedtoElement() {

		if (linkedtoElement != null && linkedtoElement.eIsProxy()) {
			InternalEObject oldLinkedtoElement = (InternalEObject) linkedtoElement;
			linkedtoElement = (CapellaElement) eResolveProxy(oldLinkedtoElement);
			if (linkedtoElement != oldLinkedtoElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtriumPackage.CFA__LINKEDTO_ELEMENT,
							oldLinkedtoElement, linkedtoElement));
			}
		}
		return linkedtoElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public CapellaElement basicGetLinkedtoElement() {

		return linkedtoElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setLinkedtoElement(CapellaElement newLinkedtoElement) {

		CapellaElement oldLinkedtoElement = linkedtoElement;
		linkedtoElement = newLinkedtoElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__LINKEDTO_ELEMENT,
					oldLinkedtoElement, linkedtoElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public FailureMode getLinkedtoFailure() {

		if (linkedtoFailure != null && linkedtoFailure.eIsProxy()) {
			InternalEObject oldLinkedtoFailure = (InternalEObject) linkedtoFailure;
			linkedtoFailure = (FailureMode) eResolveProxy(oldLinkedtoFailure);
			if (linkedtoFailure != oldLinkedtoFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtriumPackage.CFA__LINKEDTO_FAILURE,
							oldLinkedtoFailure, linkedtoFailure));
			}
		}
		return linkedtoFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public FailureMode basicGetLinkedtoFailure() {

		return linkedtoFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setLinkedtoFailure(FailureMode newLinkedtoFailure) {

		FailureMode oldLinkedtoFailure = linkedtoFailure;
		linkedtoFailure = newLinkedtoFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__LINKEDTO_FAILURE,
					oldLinkedtoFailure, linkedtoFailure));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<Assumption> getAssumption() {

		if (assumption == null) {
			assumption = new EObjectResolvingEList<Assumption>(Assumption.class, this, AtriumPackage.CFA__ASSUMPTION);
		}
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public DG getGoal() {

		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject) goal;
			goal = (DG) eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtriumPackage.CFA__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DG basicGetGoal() {

		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setGoal(DG newGoal) {

		DG oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__GOAL, oldGoal, goal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public state_Type getState() {

		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setState(state_Type newState) {

		state_Type oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__STATE, oldState, state));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isNonApplicable() {

		return nonApplicable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setNonApplicable(boolean newNonApplicable) {

		boolean oldNonApplicable = nonApplicable;
		nonApplicable = newNonApplicable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__NON_APPLICABLE, oldNonApplicable,
					nonApplicable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.CFA__LINKEDTO_ELEMENT:
			if (resolve)
				return getLinkedtoElement();
			return basicGetLinkedtoElement();
		case AtriumPackage.CFA__LINKEDTO_FAILURE:
			if (resolve)
				return getLinkedtoFailure();
			return basicGetLinkedtoFailure();
		case AtriumPackage.CFA__ASSUMPTION:
			return getAssumption();
		case AtriumPackage.CFA__GOAL:
			if (resolve)
				return getGoal();
			return basicGetGoal();
		case AtriumPackage.CFA__STATE:
			return getState();
		case AtriumPackage.CFA__NON_APPLICABLE:
			return isNonApplicable();
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
		case AtriumPackage.CFA__LINKEDTO_ELEMENT:
			setLinkedtoElement((CapellaElement) newValue);
			return;
		case AtriumPackage.CFA__LINKEDTO_FAILURE:
			setLinkedtoFailure((FailureMode) newValue);
			return;
		case AtriumPackage.CFA__ASSUMPTION:
			getAssumption().clear();
			getAssumption().addAll((Collection<? extends Assumption>) newValue);
			return;
		case AtriumPackage.CFA__GOAL:
			setGoal((DG) newValue);
			return;
		case AtriumPackage.CFA__STATE:
			setState((state_Type) newValue);
			return;
		case AtriumPackage.CFA__NON_APPLICABLE:
			setNonApplicable((Boolean) newValue);
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
		case AtriumPackage.CFA__LINKEDTO_ELEMENT:
			setLinkedtoElement((CapellaElement) null);
			return;
		case AtriumPackage.CFA__LINKEDTO_FAILURE:
			setLinkedtoFailure((FailureMode) null);
			return;
		case AtriumPackage.CFA__ASSUMPTION:
			getAssumption().clear();
			return;
		case AtriumPackage.CFA__GOAL:
			setGoal((DG) null);
			return;
		case AtriumPackage.CFA__STATE:
			setState(STATE_EDEFAULT);
			return;
		case AtriumPackage.CFA__NON_APPLICABLE:
			setNonApplicable(NON_APPLICABLE_EDEFAULT);
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
		case AtriumPackage.CFA__LINKEDTO_ELEMENT:
			return linkedtoElement != null;
		case AtriumPackage.CFA__LINKEDTO_FAILURE:
			return linkedtoFailure != null;
		case AtriumPackage.CFA__ASSUMPTION:
			return assumption != null && !assumption.isEmpty();
		case AtriumPackage.CFA__GOAL:
			return goal != null;
		case AtriumPackage.CFA__STATE:
			return state != STATE_EDEFAULT;
		case AtriumPackage.CFA__NON_APPLICABLE:
			return nonApplicable != NON_APPLICABLE_EDEFAULT;
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
		result.append(" (state: "); //$NON-NLS-1$
		result.append(state);
		result.append(", NonApplicable: "); //$NON-NLS-1$
		result.append(nonApplicable);
		result.append(')');
		return result.toString();
	}

} //CFAImpl