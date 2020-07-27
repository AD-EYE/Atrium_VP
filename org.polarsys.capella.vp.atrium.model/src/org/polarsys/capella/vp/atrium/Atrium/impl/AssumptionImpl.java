
package org.polarsys.capella.vp.atrium.Atrium.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.vp.atrium.Atrium.Assumption;
import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type;
import org.polarsys.capella.vp.atrium.Atrium.validity_Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getAssumptionType <em>Assumption Type</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getValidity <em>Validity</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getResponsibleArchitect <em>Responsible Architect</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getResponsibleExpert <em>Responsible Expert</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.AssumptionImpl#getDateOfCompletion <em>Date Of Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumptionImpl extends AtriumBasicElementImpl implements Assumption {

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
	protected static final validity_Type VALIDITY_EDEFAULT = validity_Type.VALID;

	/**
	 * The cached value of the '{@link #getValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidity()
	 * @generated
	 * @ordered
	 */
	protected validity_Type validity = VALIDITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsibleArchitect() <em>Responsible Architect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleArchitect()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_ARCHITECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibleArchitect() <em>Responsible Architect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleArchitect()
	 * @generated
	 * @ordered
	 */
	protected String responsibleArchitect = RESPONSIBLE_ARCHITECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsibleExpert() <em>Responsible Expert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleExpert()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_EXPERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibleExpert() <em>Responsible Expert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleExpert()
	 * @generated
	 * @ordered
	 */
	protected String responsibleExpert = RESPONSIBLE_EXPERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCompletion() <em>Date Of Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCompletion() <em>Date Of Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCompletion()
	 * @generated
	 * @ordered
	 */
	protected String dateOfCompletion = DATE_OF_COMPLETION_EDEFAULT;

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
	public validity_Type getValidity() {

		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setValidity(validity_Type newValidity) {

		validity_Type oldValidity = validity;
		validity = newValidity == null ? VALIDITY_EDEFAULT : newValidity;
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
	public String getResponsibleArchitect() {

		return responsibleArchitect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setResponsibleArchitect(String newResponsibleArchitect) {

		String oldResponsibleArchitect = responsibleArchitect;
		responsibleArchitect = newResponsibleArchitect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT,
					oldResponsibleArchitect, responsibleArchitect));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getResponsibleExpert() {

		return responsibleExpert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setResponsibleExpert(String newResponsibleExpert) {

		String oldResponsibleExpert = responsibleExpert;
		responsibleExpert = newResponsibleExpert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT,
					oldResponsibleExpert, responsibleExpert));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getDateOfCompletion() {

		return dateOfCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setDateOfCompletion(String newDateOfCompletion) {

		String oldDateOfCompletion = dateOfCompletion;
		dateOfCompletion = newDateOfCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION,
					oldDateOfCompletion, dateOfCompletion));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			return getAssumptionType();
		case AtriumPackage.ASSUMPTION__RATIONALE:
			return getRationale();
		case AtriumPackage.ASSUMPTION__VALIDITY:
			return getValidity();
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT:
			return getResponsibleArchitect();
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT:
			return getResponsibleExpert();
		case AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION:
			return getDateOfCompletion();
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
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			setAssumptionType((assumptionType_Type) newValue);
			return;
		case AtriumPackage.ASSUMPTION__RATIONALE:
			setRationale((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__VALIDITY:
			setValidity((validity_Type) newValue);
			return;
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT:
			setResponsibleArchitect((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT:
			setResponsibleExpert((String) newValue);
			return;
		case AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION:
			setDateOfCompletion((String) newValue);
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
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			setAssumptionType(ASSUMPTION_TYPE_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__VALIDITY:
			setValidity(VALIDITY_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT:
			setResponsibleArchitect(RESPONSIBLE_ARCHITECT_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT:
			setResponsibleExpert(RESPONSIBLE_EXPERT_EDEFAULT);
			return;
		case AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION:
			setDateOfCompletion(DATE_OF_COMPLETION_EDEFAULT);
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
		case AtriumPackage.ASSUMPTION__ASSUMPTION_TYPE:
			return assumptionType != ASSUMPTION_TYPE_EDEFAULT;
		case AtriumPackage.ASSUMPTION__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case AtriumPackage.ASSUMPTION__VALIDITY:
			return validity != VALIDITY_EDEFAULT;
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_ARCHITECT:
			return RESPONSIBLE_ARCHITECT_EDEFAULT == null ? responsibleArchitect != null
					: !RESPONSIBLE_ARCHITECT_EDEFAULT.equals(responsibleArchitect);
		case AtriumPackage.ASSUMPTION__RESPONSIBLE_EXPERT:
			return RESPONSIBLE_EXPERT_EDEFAULT == null ? responsibleExpert != null
					: !RESPONSIBLE_EXPERT_EDEFAULT.equals(responsibleExpert);
		case AtriumPackage.ASSUMPTION__DATE_OF_COMPLETION:
			return DATE_OF_COMPLETION_EDEFAULT == null ? dateOfCompletion != null
					: !DATE_OF_COMPLETION_EDEFAULT.equals(dateOfCompletion);
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
		result.append(" (assumptionType: "); //$NON-NLS-1$
		result.append(assumptionType);
		result.append(", rationale: "); //$NON-NLS-1$
		result.append(rationale);
		result.append(", validity: "); //$NON-NLS-1$
		result.append(validity);
		result.append(", responsibleArchitect: "); //$NON-NLS-1$
		result.append(responsibleArchitect);
		result.append(", responsibleExpert: "); //$NON-NLS-1$
		result.append(responsibleExpert);
		result.append(", dateOfCompletion: "); //$NON-NLS-1$
		result.append(dateOfCompletion);
		result.append(')');
		return result.toString();
	}

} //AssumptionImpl