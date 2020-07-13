
package org.polarsys.capella.vp.atrium.Atrium.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.vp.atrium.Atrium.AtriumPackage;
import org.polarsys.capella.vp.atrium.Atrium.DA;
import org.polarsys.capella.vp.atrium.Atrium.DG;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.DGImpl#getDesignAlternative <em>Design Alternative</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.impl.DGImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DGImpl extends NamedElementImpl implements DG {

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
			eNotify(new ENotificationImpl(this, Notification.SET, AtriumPackage.DG__CONTENT, oldContent, content));

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
		case AtriumPackage.DG__CONTENT:
			return getContent();
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
		case AtriumPackage.DG__CONTENT:
			setContent((String) newValue);
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
		case AtriumPackage.DG__CONTENT:
			setContent(CONTENT_EDEFAULT);
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
		case AtriumPackage.DG__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
		result.append(')');
		return result.toString();
	}

} //DGImpl