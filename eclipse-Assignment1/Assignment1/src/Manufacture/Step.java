/**
 */
package Manufacture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.Step#getSpeed <em>Speed</em>}</li>
 *   <li>{@link Manufacture.Step#getInput <em>Input</em>}</li>
 *   <li>{@link Manufacture.Step#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see Manufacture.ManufacturePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Element {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see Manufacture.ManufacturePackage#getStep_Speed()
	 * @model required="true"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link Manufacture.Step#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.InputWorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getStep_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputWorkPiece> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link Manufacture.OutPutWorkPiece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see Manufacture.ManufacturePackage#getStep_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutPutWorkPiece> getOutput();

} // Step
