
package org.polarsys.capella.vp.atrium.Atrium;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.FR#getLinkedAssumption <em>Linked Assumption</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getFR()
 * @model
 * @generated
 */

public interface FR extends AtriumBasicElement {

	/**
	 * Returns the value of the '<em><b>Linked Assumption</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Assumption</em>' reference.
	 * @see #setLinkedAssumption(Assumption)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getFR_LinkedAssumption()
	 * @model required="true"
	 * @generated
	 */

	Assumption getLinkedAssumption();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.FR#getLinkedAssumption <em>Linked Assumption</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Assumption</em>' reference.
	 * @see #getLinkedAssumption()
	 * @generated
	 */

	void setLinkedAssumption(Assumption value);

} // FR
