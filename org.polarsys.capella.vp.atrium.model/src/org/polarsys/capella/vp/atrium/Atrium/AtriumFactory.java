
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
	 * Returns a new object of class '<em>CFA list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA list</em>'.
	 * @generated
	 */
	CFA_list createCFA_list();

	/**
	 * Returns a new object of class '<em>Assumption list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption list</em>'.
	 * @generated
	 */
	Assumption_list createAssumption_list();

	/**
	 * Returns a new object of class '<em>DG list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DG list</em>'.
	 * @generated
	 */
	DG_list createDG_list();

	/**
	 * Returns a new object of class '<em>DA list</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DA list</em>'.
	 * @generated
	 */
	DA_list createDA_list();

	/**
	 * Returns a new object of class '<em>CFA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CFA</em>'.
	 * @generated
	 */
	CFA createCFA();

	/**
	 * Returns a new object of class '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption</em>'.
	 * @generated
	 */
	Assumption createAssumption();

	/**
	 * Returns a new object of class '<em>DG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DG</em>'.
	 * @generated
	 */
	DG createDG();

	/**
	 * Returns a new object of class '<em>DA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DA</em>'.
	 * @generated
	 */
	DA createDA();

	/**
	 * Returns a new object of class '<em>Element State Atrium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element State Atrium</em>'.
	 * @generated
	 */
	ElementStateAtrium createElementStateAtrium();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtriumPackage getAtriumPackage();

} //AtriumFactory
