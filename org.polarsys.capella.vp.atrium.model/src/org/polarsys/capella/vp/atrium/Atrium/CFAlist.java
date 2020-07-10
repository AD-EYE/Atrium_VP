
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CF Alist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.CFAlist#getCFAs <em>CF As</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFAlist()
 * @model
 * @generated
 */

public interface CFAlist extends NamedElement {

	/**
	 * Returns the value of the '<em><b>CF As</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.CFA}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CF As</em>' containment reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getCFAlist_CFAs()
	 * @model containment="true"
	 * @generated
	 */

	EList<CFA> getCFAs();

} // CFAlist
