
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DG#getDesignAlternative <em>Design Alternative</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.DG#getSubDGs <em>Sub DGs</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG()
 * @model
 * @generated
 */

public interface DG extends AtriumBasicElement {

	/**
	 * Returns the value of the '<em><b>Design Alternative</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.DA}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Alternative</em>' reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_DesignAlternative()
	 * @model required="true"
	 * @generated
	 */

	EList<DA> getDesignAlternative();

	/**
	 * Returns the value of the '<em><b>Sub DGs</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.vp.atrium.Atrium.sDG}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub DGs</em>' reference list.
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getDG_SubDGs()
	 * @model
	 * @generated
	 */

	EList<sDG> getSubDGs();

} // DG
