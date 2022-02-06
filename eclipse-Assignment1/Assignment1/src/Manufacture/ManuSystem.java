/**
 */
package Manufacture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manu System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.ManuSystem#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getManages <em>Manages</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getStarts <em>Starts</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getEnds <em>Ends</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getOwns <em>Owns</em>}</li>
 *   <li>{@link Manufacture.ManuSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getManuSystem()
 * @model
 * @generated
 */
public interface ManuSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Transforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPiece> getTransforms();

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_ConsistsOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getConsistsOf();

	/**
	 * Returns the value of the '<em><b>Manages</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.Responsible}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Manages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Responsible> getManages();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Responsible)
	 * @see Manufacture.ManufacturePackage#getManuSystem_Responsible()
	 * @model
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link Manufacture.ManuSystem#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Responsible value);

	/**
	 * Returns the value of the '<em><b>Starts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starts</em>' reference.
	 * @see #setStarts(Storage)
	 * @see Manufacture.ManufacturePackage#getManuSystem_Starts()
	 * @model
	 * @generated
	 */
	Storage getStarts();

	/**
	 * Sets the value of the '{@link Manufacture.ManuSystem#getStarts <em>Starts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starts</em>' reference.
	 * @see #getStarts()
	 * @generated
	 */
	void setStarts(Storage value);

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' reference.
	 * @see #setEnds(Storage)
	 * @see Manufacture.ManufacturePackage#getManuSystem_Ends()
	 * @model
	 * @generated
	 */
	Storage getEnds();

	/**
	 * Sets the value of the '{@link Manufacture.ManuSystem#getEnds <em>Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends</em>' reference.
	 * @see #getEnds()
	 * @generated
	 */
	void setEnds(Storage value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.WorkPieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getManuSystem_Owns()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPieceType> getOwns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Manufacture.ManufacturePackage#getManuSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Manufacture.ManuSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ManuSystem
