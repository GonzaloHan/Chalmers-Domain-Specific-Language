/**
 */
package Manufacture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Put Work Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.OutPutWorkPiece#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link Manufacture.OutPutWorkPiece#getName <em>Name</em>}</li>
 *   <li>{@link Manufacture.OutPutWorkPiece#getInputSelect <em>Input Select</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getOutPutWorkPiece()
 * @model
 * @generated
 */
public interface OutPutWorkPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' reference.
	 * @see #setOutputType(WorkPieceType)
	 * @see Manufacture.ManufacturePackage#getOutPutWorkPiece_OutputType()
	 * @model
	 * @generated
	 */
	WorkPieceType getOutputType();

	/**
	 * Sets the value of the '{@link Manufacture.OutPutWorkPiece#getOutputType <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(WorkPieceType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Manufacture.ManufacturePackage#getOutPutWorkPiece_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Manufacture.OutPutWorkPiece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Select</em>' reference.
	 * @see #setInputSelect(InputWorkPiece)
	 * @see Manufacture.ManufacturePackage#getOutPutWorkPiece_InputSelect()
	 * @model
	 * @generated
	 */
	InputWorkPiece getInputSelect();

	/**
	 * Sets the value of the '{@link Manufacture.OutPutWorkPiece#getInputSelect <em>Input Select</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Select</em>' reference.
	 * @see #getInputSelect()
	 * @generated
	 */
	void setInputSelect(InputWorkPiece value);

} // OutPutWorkPiece
