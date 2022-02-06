/**
 */
package Manufacture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Manufacture.ManufacturePackage
 * @generated
 */
public interface ManufactureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufactureFactory eINSTANCE = Manufacture.impl.ManufactureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manu System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manu System</em>'.
	 * @generated
	 */
	ManuSystem createManuSystem();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece</em>'.
	 * @generated
	 */
	WorkPiece createWorkPiece();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns a new object of class '<em>Hierarchy Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hierarchy Step</em>'.
	 * @generated
	 */
	HierarchyStep createHierarchyStep();

	/**
	 * Returns a new object of class '<em>Manu Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manu Step</em>'.
	 * @generated
	 */
	ManuStep createManuStep();

	/**
	 * Returns a new object of class '<em>Trans Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trans Step</em>'.
	 * @generated
	 */
	TransStep createTransStep();

	/**
	 * Returns a new object of class '<em>QA Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QA Step</em>'.
	 * @generated
	 */
	QAStep createQAStep();

	/**
	 * Returns a new object of class '<em>Input Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Conditioner</em>'.
	 * @generated
	 */
	InputConditioner createInputConditioner();

	/**
	 * Returns a new object of class '<em>Bi Con</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bi Con</em>'.
	 * @generated
	 */
	BiCon createBiCon();

	/**
	 * Returns a new object of class '<em>Uni Con</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Con</em>'.
	 * @generated
	 */
	UniCon createUniCon();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible</em>'.
	 * @generated
	 */
	Responsible createResponsible();

	/**
	 * Returns a new object of class '<em>Work Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece Type</em>'.
	 * @generated
	 */
	WorkPieceType createWorkPieceType();

	/**
	 * Returns a new object of class '<em>Out Put Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Put Work Piece</em>'.
	 * @generated
	 */
	OutPutWorkPiece createOutPutWorkPiece();

	/**
	 * Returns a new object of class '<em>Input Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Work Piece</em>'.
	 * @generated
	 */
	InputWorkPiece createInputWorkPiece();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManufacturePackage getManufacturePackage();

} //ManufactureFactory
