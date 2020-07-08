
package org.polarsys.capella.vp.atrium.Atrium.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.CFA;
import org.polarsys.capella.vp.atrium.Atrium.DG;
import org.polarsys.capella.vp.atrium.Atrium.stateLinkedElement_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getLinkedtoElement <em>Linkedto Element</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#isState <em>State</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.CFAImpl#getStateLinkedElement <em>State Linked Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFAImpl extends NamedElementImpl implements CFA {

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
	 * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumption;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected DG goal;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected boolean state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateLinkedElement() <em>State Linked Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateLinkedElement()
	 * @generated
	 * @ordered
	 */
	protected static final stateLinkedElement_Type STATE_LINKED_ELEMENT_EDEFAULT = stateLinkedElement_Type.LEGACY;

	/**
	 * The cached value of the '{@link #getStateLinkedElement() <em>State Linked Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateLinkedElement()
	 * @generated
	 * @ordered
	 */
	protected stateLinkedElement_Type stateLinkedElement = STATE_LINKED_ELEMENT_EDEFAULT;

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
	public EList<Assumption> getAssumption() {

		if (assumption == null) {
			assumption = new EObjectContainmentEList<Assumption>(Assumption.class, this, AtriumPackage.CFA__ASSUMPTION);
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

		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetGoal(DG newGoal, NotificationChain msgs) {

		DG oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__GOAL,
					oldGoal, newGoal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setGoal(DG newGoal) {

		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject) goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtriumPackage.CFA__GOAL,
						null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject) newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtriumPackage.CFA__GOAL,
						null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__GOAL, newGoal, newGoal));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getContent() {

		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setContent(String newContent) {

		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__CONTENT, oldContent, content));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isState() {

		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setState(boolean newState) {

		boolean oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__STATE, oldState, state));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public stateLinkedElement_Type getStateLinkedElement() {

		return stateLinkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setStateLinkedElement(stateLinkedElement_Type newStateLinkedElement) {

		stateLinkedElement_Type oldStateLinkedElement = stateLinkedElement;
		stateLinkedElement = newStateLinkedElement == null ? STATE_LINKED_ELEMENT_EDEFAULT : newStateLinkedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.CFA__STATE_LINKED_ELEMENT,
					oldStateLinkedElement, stateLinkedElement));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtriumPackage.CFA__ASSUMPTION:
			return ((InternalEList<?>) getAssumption()).basicRemove(otherEnd, msgs);
		case AtriumPackage.CFA__GOAL:
			return basicSetGoal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case AtriumPackage.CFA__ASSUMPTION:
			return getAssumption();
		case AtriumPackage.CFA__GOAL:
			return getGoal();
		case AtriumPackage.CFA__CONTENT:
			return getContent();
		case AtriumPackage.CFA__STATE:
			return isState();
		case AtriumPackage.CFA__STATE_LINKED_ELEMENT:
			return getStateLinkedElement();
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
		case AtriumPackage.CFA__ASSUMPTION:
			getAssumption().clear();
			getAssumption().addAll((Collection<? extends Assumption>) newValue);
			return;
		case AtriumPackage.CFA__GOAL:
			setGoal((DG) newValue);
			return;
		case AtriumPackage.CFA__CONTENT:
			setContent((String) newValue);
			return;
		case AtriumPackage.CFA__STATE:
			setState((Boolean) newValue);
			return;
		case AtriumPackage.CFA__STATE_LINKED_ELEMENT:
			setStateLinkedElement((stateLinkedElement_Type) newValue);
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
		case AtriumPackage.CFA__ASSUMPTION:
			getAssumption().clear();
			return;
		case AtriumPackage.CFA__GOAL:
			setGoal((DG) null);
			return;
		case AtriumPackage.CFA__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case AtriumPackage.CFA__STATE:
			setState(STATE_EDEFAULT);
			return;
		case AtriumPackage.CFA__STATE_LINKED_ELEMENT:
			setStateLinkedElement(STATE_LINKED_ELEMENT_EDEFAULT);
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
		case AtriumPackage.CFA__ASSUMPTION:
			return assumption != null && !assumption.isEmpty();
		case AtriumPackage.CFA__GOAL:
			return goal != null;
		case AtriumPackage.CFA__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case AtriumPackage.CFA__STATE:
			return state != STATE_EDEFAULT;
		case AtriumPackage.CFA__STATE_LINKED_ELEMENT:
			return stateLinkedElement != STATE_LINKED_ELEMENT_EDEFAULT;
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
		result.append(" (content: "); //$NON-NLS-1$
		result.append(content);
		result.append(", state: "); //$NON-NLS-1$
		result.append(state);
		result.append(", stateLinkedElement: "); //$NON-NLS-1$
		result.append(stateLinkedElement);
		result.append(')');
		return result.toString();
	}

} //CFAImpl