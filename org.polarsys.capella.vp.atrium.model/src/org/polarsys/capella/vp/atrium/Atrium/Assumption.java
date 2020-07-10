
package org.polarsys.capella.vp.atrium.Atrium;

import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getContent <em>Content</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getValidity <em>Validity</em>}</li>
 *   <li>{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getAssumptionType <em>Assumption Type</em>}</li>
 * </ul>
 *
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction'"
 * @generated
 */

public interface Assumption extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_Content()
	 * @model
	 * @generated
	 */

	String getContent();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getContent <em>Content</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */

	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_Rationale()
	 * @model
	 * @generated
	 */

	String getRationale();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getRationale <em>Rationale</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */

	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(String)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_Validity()
	 * @model
	 * @generated
	 */

	String getValidity();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getValidity <em>Validity</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */

	void setValidity(String value);

	/**
	 * Returns the value of the '<em><b>Assumption Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption Type</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type
	 * @see #setAssumptionType(assumptionType_Type)
	 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getAssumption_AssumptionType()
	 * @model
	 * @generated
	 */

	assumptionType_Type getAssumptionType();

	/**
	 * Sets the value of the '{@link org.polarsys.capella.vp.atrium.Atrium.Assumption#getAssumptionType <em>Assumption Type</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumption Type</em>' attribute.
	 * @see org.polarsys.capella.vp.atrium.Atrium.assumptionType_Type
	 * @see #getAssumptionType()
	 * @generated
	 */

	void setAssumptionType(assumptionType_Type value);

} // Assumption
