
package org.polarsys.capella.vp.atrium.Atrium;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage
 * @generated
 */
public interface AtriumFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtriumFactory eINSTANCE = org.polarsys.capella.vp.atrium.Atrium.impl.AtriumFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA</em>'.
	 * @generated
	 */
	CFA createCFA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtriumPackage getAtriumPackage();

} //AtriumFactory
