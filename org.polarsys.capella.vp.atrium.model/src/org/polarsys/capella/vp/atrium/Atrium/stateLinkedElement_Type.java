
package org.polarsys.capella.vp.atrium.Atrium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>state Linked Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.vp.atrium.Atrium.AtriumPackage#getstateLinkedElement_Type()
 * @model
 * @generated
 */
public enum stateLinkedElement_Type implements Enumerator {
	/**
	 * The '<em><b>Legacy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGACY_VALUE
	 * @generated
	 * @ordered
	 */
	LEGACY(0, "Legacy", "Legacy"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>New Development</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_DEVELOPMENT_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_DEVELOPMENT(1, "New_Development", "New Development"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Legacy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGACY
	 * @model name="Legacy"
	 * @generated
	 * @ordered
	 */
	public static final int LEGACY_VALUE = 0;

	/**
	 * The '<em><b>New Development</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_DEVELOPMENT
	 * @model name="New_Development" literal="New Development"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_DEVELOPMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>state Linked Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final stateLinkedElement_Type[] VALUES_ARRAY = new stateLinkedElement_Type[] { LEGACY,
			NEW_DEVELOPMENT, };

	/**
	 * A public read-only list of all the '<em><b>state Linked Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<stateLinkedElement_Type> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>state Linked Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static stateLinkedElement_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			stateLinkedElement_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>state Linked Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static stateLinkedElement_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			stateLinkedElement_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>state Linked Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static stateLinkedElement_Type get(int value) {
		switch (value) {
		case LEGACY_VALUE:
			return LEGACY;
		case NEW_DEVELOPMENT_VALUE:
			return NEW_DEVELOPMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private stateLinkedElement_Type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //stateLinkedElement_Type
