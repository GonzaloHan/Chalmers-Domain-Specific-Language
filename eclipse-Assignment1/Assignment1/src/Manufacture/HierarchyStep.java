/**
 */
package Manufacture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.HierarchyStep#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getHierarchyStep()
 * @model
 * @generated
 */
public interface HierarchyStep extends Step {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(ManuSystem)
	 * @see Manufacture.ManufacturePackage#getHierarchyStep_Contains()
	 * @model containment="true"
	 * @generated
	 */
	ManuSystem getContains();

	/**
	 * Sets the value of the '{@link Manufacture.HierarchyStep#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(ManuSystem value);

} // HierarchyStep
