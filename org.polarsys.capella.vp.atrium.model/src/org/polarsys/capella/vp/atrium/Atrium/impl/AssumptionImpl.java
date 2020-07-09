
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getAssumptionType <em>Assumption Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumptionImpl extends NamedElementImpl implements Assumption {

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
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected String validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssumptionType() <em>Assumption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionType()
	 * @generated
	 * @ordered
	 */
	protected static final assumptionType_Type ASSUMPTION_TYPE_EDEFAULT = assumptionType_Type.CLARIFICATION;

	/**
	 * The cached value of the '{@link #getAssumptionType() <em>Assumption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptionType()
	 * @generated
	 * @ordered
	 */
	protected assumptionType_Type assumptionType = ASSUMPTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtriumPackage.Literals.ASSUMPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__CONTENT, oldContent,
					content));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getRationale() {

		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setRationale(String newRationale) {

		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__RATIONALE, oldRationale,
					rationale));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getValidity() {

		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setValidity(String newValidity) {

		String oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__VALIDITY, oldValidity,
					validity));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public assumptionType_Type getAssumptionType() {

		return assumptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setAssumptionType(assumptionType_Type newAssumptionType) {

		assumptionType_Type oldAssumptionType = assumptionType;
		assumptionType = newAssumptionType == null ? ASSUMPTION_TYPE_EDEFAULT : newAssumptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE,
					oldAssumptionType, assumptionType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.ASSUMPTION__CONTENT:
			return getContent();
		case AtriumPackage.ASSUMPTION__RATIONALE:
			return getRationale();
		case AtriumPackage.ASSUMPTION__VALIDITY:
			return getValidity();
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			return getAssumptionType();
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
		case AtriumPackage.ASSUMPTION__CONTENT:
			setContent((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__RATIONALE:
			setRationale((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__VALIDITY:
			setValidity((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			setAssumptionType((assumptionType_Type) newValue);
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
		case AtriumPackage.ASSUMPTION__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__VALIDITY:
			setValidity(VALIDITY_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			setAssumptionType(ASSUMPTION_TYPE_EDEFAULT);
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
		case AtriumPackage.ASSUMPTION__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case AtriumPackage.ASSUMPTION__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case AtriumPackage.ASSUMPTION__VALIDITY:
			return VALIDITY_EDEFAULT == null ? validity != null : !VALIDITY_EDEFAULT.equals(validity);
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			return assumptionType != ASSUMPTION_TYPE_EDEFAULT;
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
		result.append(", rationale: "); //$NON-NLS-1$
		result.append(rationale);
		result.append(", validity: "); //$NON-NLS-1$
		result.append(validity);
		result.append(", assumptionType: "); //$NON-NLS-1$
		result.append(assumptionType);
		result.append(')');
		return result.toString();
	}

} //AssumptionImpl