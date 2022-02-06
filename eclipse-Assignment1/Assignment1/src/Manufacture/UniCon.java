/**
 */
package Manufacture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uni Con</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.UniCon#isUniStatus <em>Uni Status</em>}</li>
 *   <li>{@link Manufacture.UniCon#getSelectOne <em>Select One</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getUniCon()
 * @model
 * @generated
 */
public interface UniCon extends InputConditioner {
	/**
	 * Returns the value of the '<em><b>Uni Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Status</em>' attribute.
	 * @see #setUniStatus(boolean)
	 * @see Manufacture.ManufacturePackage#getUniCon_UniStatus()
	 * @model required="true"
	 * @generated
	 */
	boolean isUniStatus();

	/**
	 * Sets the value of the '{@link Manufacture.UniCon#isUniStatus <em>Uni Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Status</em>' attribute.
	 * @see #isUniStatus()
	 * @generated
	 */
	void setUniStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Select One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select One</em>' reference.
	 * @see #setSelectOne(WorkPieceType)
	 * @see Manufacture.ManufacturePackage#getUniCon_SelectOne()
	 * @model required="true"
	 * @generated
	 */
	WorkPieceType getSelectOne();

	/**
	 * Sets the value of the '{@link Manufacture.UniCon#getSelectOne <em>Select One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select One</em>' reference.
	 * @see #getSelectOne()
	 * @generated
	 */
	void setSelectOne(WorkPieceType value);

} // UniCon
