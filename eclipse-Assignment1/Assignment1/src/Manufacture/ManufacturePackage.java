/**
 */
package Manufacture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Manufacture.ManufactureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ManufacturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Manufacture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.manufacture.org/DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Manufacture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturePackage eINSTANCE = Manufacture.impl.ManufacturePackageImpl.init();

	/**
	 * The meta object id for the '{@link Manufacture.impl.ManuSystemImpl <em>Manu System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.ManuSystemImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getManuSystem()
	 * @generated
	 */
	int MANU_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__TRANSFORMS = 0;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__CONSISTS_OF = 1;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__MANAGES = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__RESPONSIBLE = 3;

	/**
	 * The feature id for the '<em><b>Starts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__STARTS = 4;

	/**
	 * The feature id for the '<em><b>Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__ENDS = 5;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__OWNS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM__NAME = 7;

	/**
	 * The number of structural features of the '<em>Manu System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Manu System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.ElementImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RESPONSIBLE = 1;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MOVE = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.StepImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESPONSIBLE = ELEMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MOVE = ELEMENT__MOVE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SPEED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.WorkPieceImpl <em>Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.WorkPieceImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getWorkPiece()
	 * @generated
	 */
	int WORK_PIECE = 2;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__HAS_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.StorageImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__RESPONSIBLE = ELEMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__MOVE = ELEMENT__MOVE;

	/**
	 * The feature id for the '<em><b>Stores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__STORES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.HierarchyStepImpl <em>Hierarchy Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.HierarchyStepImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getHierarchyStep()
	 * @generated
	 */
	int HIERARCHY_STEP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__MOVE = STEP__MOVE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP__CONTAINS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hierarchy Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hierarchy Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.ManuStepImpl <em>Manu Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.ManuStepImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getManuStep()
	 * @generated
	 */
	int MANU_STEP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__MOVE = STEP__MOVE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>Manu Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manu Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANU_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.TransStepImpl <em>Trans Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.TransStepImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getTransStep()
	 * @generated
	 */
	int TRANS_STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__MOVE = STEP__MOVE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>Trans Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trans Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANS_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.QAStepImpl <em>QA Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.QAStepImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getQAStep()
	 * @generated
	 */
	int QA_STEP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__MOVE = STEP__MOVE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>QA Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>QA Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.InputConditionerImpl <em>Input Conditioner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.InputConditionerImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getInputConditioner()
	 * @generated
	 */
	int INPUT_CONDITIONER = 8;

	/**
	 * The number of structural features of the '<em>Input Conditioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITIONER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Conditioner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITIONER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.BiConImpl <em>Bi Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.BiConImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getBiCon()
	 * @generated
	 */
	int BI_CON = 9;

	/**
	 * The feature id for the '<em><b>Bi Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_CON__BI_STATUS = INPUT_CONDITIONER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Two</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_CON__SELECT_TWO = INPUT_CONDITIONER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bi Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_CON_FEATURE_COUNT = INPUT_CONDITIONER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bi Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_CON_OPERATION_COUNT = INPUT_CONDITIONER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.UniConImpl <em>Uni Con</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.UniConImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getUniCon()
	 * @generated
	 */
	int UNI_CON = 10;

	/**
	 * The feature id for the '<em><b>Uni Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_CON__UNI_STATUS = INPUT_CONDITIONER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_CON__SELECT_ONE = INPUT_CONDITIONER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uni Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_CON_FEATURE_COUNT = INPUT_CONDITIONER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uni Con</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_CON_OPERATION_COUNT = INPUT_CONDITIONER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.ResponsibleImpl <em>Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.ResponsibleImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getResponsible()
	 * @generated
	 */
	int RESPONSIBLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.WorkPieceTypeImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getWorkPieceType()
	 * @generated
	 */
	int WORK_PIECE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.OutPutWorkPieceImpl <em>Out Put Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.OutPutWorkPieceImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getOutPutWorkPiece()
	 * @generated
	 */
	int OUT_PUT_WORK_PIECE = 14;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PUT_WORK_PIECE__OUTPUT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PUT_WORK_PIECE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Input Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PUT_WORK_PIECE__INPUT_SELECT = 2;

	/**
	 * The number of structural features of the '<em>Out Put Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PUT_WORK_PIECE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Out Put Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PUT_WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.impl.InputWorkPieceImpl <em>Input Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.impl.InputWorkPieceImpl
	 * @see Manufacture.impl.ManufacturePackageImpl#getInputWorkPiece()
	 * @generated
	 */
	int INPUT_WORK_PIECE = 15;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORK_PIECE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORK_PIECE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Input Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORK_PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Manufacture.BiType <em>Bi Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Manufacture.BiType
	 * @see Manufacture.impl.ManufacturePackageImpl#getBiType()
	 * @generated
	 */
	int BI_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link Manufacture.ManuSystem <em>Manu System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manu System</em>'.
	 * @see Manufacture.ManuSystem
	 * @generated
	 */
	EClass getManuSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.ManuSystem#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transforms</em>'.
	 * @see Manufacture.ManuSystem#getTransforms()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Transforms();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.ManuSystem#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see Manufacture.ManuSystem#getConsistsOf()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_ConsistsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.ManuSystem#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manages</em>'.
	 * @see Manufacture.ManuSystem#getManages()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Manages();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.ManuSystem#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see Manufacture.ManuSystem#getResponsible()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Responsible();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.ManuSystem#getStarts <em>Starts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starts</em>'.
	 * @see Manufacture.ManuSystem#getStarts()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Starts();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.ManuSystem#getEnds <em>Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ends</em>'.
	 * @see Manufacture.ManuSystem#getEnds()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Ends();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.ManuSystem#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see Manufacture.ManuSystem#getOwns()
	 * @see #getManuSystem()
	 * @generated
	 */
	EReference getManuSystem_Owns();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.ManuSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.ManuSystem#getName()
	 * @see #getManuSystem()
	 * @generated
	 */
	EAttribute getManuSystem_Name();

	/**
	 * Returns the meta object for class '{@link Manufacture.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see Manufacture.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.Step#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see Manufacture.Step#getSpeed()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Speed();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.Step#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see Manufacture.Step#getInput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link Manufacture.Step#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see Manufacture.Step#getOutput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Output();

	/**
	 * Returns the meta object for class '{@link Manufacture.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece</em>'.
	 * @see Manufacture.WorkPiece
	 * @generated
	 */
	EClass getWorkPiece();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.WorkPiece#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Type</em>'.
	 * @see Manufacture.WorkPiece#getHasType()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_HasType();

	/**
	 * Returns the meta object for class '{@link Manufacture.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see Manufacture.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the reference list '{@link Manufacture.Storage#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stores</em>'.
	 * @see Manufacture.Storage#getStores()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Stores();

	/**
	 * Returns the meta object for class '{@link Manufacture.HierarchyStep <em>Hierarchy Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Step</em>'.
	 * @see Manufacture.HierarchyStep
	 * @generated
	 */
	EClass getHierarchyStep();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacture.HierarchyStep#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see Manufacture.HierarchyStep#getContains()
	 * @see #getHierarchyStep()
	 * @generated
	 */
	EReference getHierarchyStep_Contains();

	/**
	 * Returns the meta object for class '{@link Manufacture.ManuStep <em>Manu Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manu Step</em>'.
	 * @see Manufacture.ManuStep
	 * @generated
	 */
	EClass getManuStep();

	/**
	 * Returns the meta object for class '{@link Manufacture.TransStep <em>Trans Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trans Step</em>'.
	 * @see Manufacture.TransStep
	 * @generated
	 */
	EClass getTransStep();

	/**
	 * Returns the meta object for class '{@link Manufacture.QAStep <em>QA Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Step</em>'.
	 * @see Manufacture.QAStep
	 * @generated
	 */
	EClass getQAStep();

	/**
	 * Returns the meta object for class '{@link Manufacture.InputConditioner <em>Input Conditioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Conditioner</em>'.
	 * @see Manufacture.InputConditioner
	 * @generated
	 */
	EClass getInputConditioner();

	/**
	 * Returns the meta object for class '{@link Manufacture.BiCon <em>Bi Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Con</em>'.
	 * @see Manufacture.BiCon
	 * @generated
	 */
	EClass getBiCon();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.BiCon#getBiStatus <em>Bi Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bi Status</em>'.
	 * @see Manufacture.BiCon#getBiStatus()
	 * @see #getBiCon()
	 * @generated
	 */
	EAttribute getBiCon_BiStatus();

	/**
	 * Returns the meta object for the reference list '{@link Manufacture.BiCon#getSelectTwo <em>Select Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Select Two</em>'.
	 * @see Manufacture.BiCon#getSelectTwo()
	 * @see #getBiCon()
	 * @generated
	 */
	EReference getBiCon_SelectTwo();

	/**
	 * Returns the meta object for class '{@link Manufacture.UniCon <em>Uni Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uni Con</em>'.
	 * @see Manufacture.UniCon
	 * @generated
	 */
	EClass getUniCon();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.UniCon#isUniStatus <em>Uni Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Status</em>'.
	 * @see Manufacture.UniCon#isUniStatus()
	 * @see #getUniCon()
	 * @generated
	 */
	EAttribute getUniCon_UniStatus();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.UniCon#getSelectOne <em>Select One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select One</em>'.
	 * @see Manufacture.UniCon#getSelectOne()
	 * @see #getUniCon()
	 * @generated
	 */
	EReference getUniCon_SelectOne();

	/**
	 * Returns the meta object for class '{@link Manufacture.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see Manufacture.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.Element#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see Manufacture.Element#getResponsible()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Responsible();

	/**
	 * Returns the meta object for the reference list '{@link Manufacture.Element#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Move</em>'.
	 * @see Manufacture.Element#getMove()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Move();

	/**
	 * Returns the meta object for class '{@link Manufacture.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible</em>'.
	 * @see Manufacture.Responsible
	 * @generated
	 */
	EClass getResponsible();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.Responsible#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.Responsible#getName()
	 * @see #getResponsible()
	 * @generated
	 */
	EAttribute getResponsible_Name();

	/**
	 * Returns the meta object for class '{@link Manufacture.WorkPieceType <em>Work Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece Type</em>'.
	 * @see Manufacture.WorkPieceType
	 * @generated
	 */
	EClass getWorkPieceType();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.WorkPieceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.WorkPieceType#getName()
	 * @see #getWorkPieceType()
	 * @generated
	 */
	EAttribute getWorkPieceType_Name();

	/**
	 * Returns the meta object for class '{@link Manufacture.OutPutWorkPiece <em>Out Put Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Put Work Piece</em>'.
	 * @see Manufacture.OutPutWorkPiece
	 * @generated
	 */
	EClass getOutPutWorkPiece();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.OutPutWorkPiece#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Type</em>'.
	 * @see Manufacture.OutPutWorkPiece#getOutputType()
	 * @see #getOutPutWorkPiece()
	 * @generated
	 */
	EReference getOutPutWorkPiece_OutputType();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.OutPutWorkPiece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.OutPutWorkPiece#getName()
	 * @see #getOutPutWorkPiece()
	 * @generated
	 */
	EAttribute getOutPutWorkPiece_Name();

	/**
	 * Returns the meta object for the reference '{@link Manufacture.OutPutWorkPiece#getInputSelect <em>Input Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Select</em>'.
	 * @see Manufacture.OutPutWorkPiece#getInputSelect()
	 * @see #getOutPutWorkPiece()
	 * @generated
	 */
	EReference getOutPutWorkPiece_InputSelect();

	/**
	 * Returns the meta object for class '{@link Manufacture.InputWorkPiece <em>Input Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Work Piece</em>'.
	 * @see Manufacture.InputWorkPiece
	 * @generated
	 */
	EClass getInputWorkPiece();

	/**
	 * Returns the meta object for the containment reference '{@link Manufacture.InputWorkPiece#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see Manufacture.InputWorkPiece#getCondition()
	 * @see #getInputWorkPiece()
	 * @generated
	 */
	EReference getInputWorkPiece_Condition();

	/**
	 * Returns the meta object for the attribute '{@link Manufacture.InputWorkPiece#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Manufacture.InputWorkPiece#getName()
	 * @see #getInputWorkPiece()
	 * @generated
	 */
	EAttribute getInputWorkPiece_Name();

	/**
	 * Returns the meta object for enum '{@link Manufacture.BiType <em>Bi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bi Type</em>'.
	 * @see Manufacture.BiType
	 * @generated
	 */
	EEnum getBiType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManufactureFactory getManufactureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Manufacture.impl.ManuSystemImpl <em>Manu System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.ManuSystemImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getManuSystem()
		 * @generated
		 */
		EClass MANU_SYSTEM = eINSTANCE.getManuSystem();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__TRANSFORMS = eINSTANCE.getManuSystem_Transforms();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__CONSISTS_OF = eINSTANCE.getManuSystem_ConsistsOf();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__MANAGES = eINSTANCE.getManuSystem_Manages();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__RESPONSIBLE = eINSTANCE.getManuSystem_Responsible();

		/**
		 * The meta object literal for the '<em><b>Starts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__STARTS = eINSTANCE.getManuSystem_Starts();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__ENDS = eINSTANCE.getManuSystem_Ends();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANU_SYSTEM__OWNS = eINSTANCE.getManuSystem_Owns();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANU_SYSTEM__NAME = eINSTANCE.getManuSystem_Name();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.StepImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SPEED = eINSTANCE.getStep_Speed();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT = eINSTANCE.getStep_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUT = eINSTANCE.getStep_Output();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.WorkPieceImpl <em>Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.WorkPieceImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getWorkPiece()
		 * @generated
		 */
		EClass WORK_PIECE = eINSTANCE.getWorkPiece();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__HAS_TYPE = eINSTANCE.getWorkPiece_HasType();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.StorageImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Stores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__STORES = eINSTANCE.getStorage_Stores();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.HierarchyStepImpl <em>Hierarchy Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.HierarchyStepImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getHierarchyStep()
		 * @generated
		 */
		EClass HIERARCHY_STEP = eINSTANCE.getHierarchyStep();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIERARCHY_STEP__CONTAINS = eINSTANCE.getHierarchyStep_Contains();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.ManuStepImpl <em>Manu Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.ManuStepImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getManuStep()
		 * @generated
		 */
		EClass MANU_STEP = eINSTANCE.getManuStep();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.TransStepImpl <em>Trans Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.TransStepImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getTransStep()
		 * @generated
		 */
		EClass TRANS_STEP = eINSTANCE.getTransStep();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.QAStepImpl <em>QA Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.QAStepImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getQAStep()
		 * @generated
		 */
		EClass QA_STEP = eINSTANCE.getQAStep();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.InputConditionerImpl <em>Input Conditioner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.InputConditionerImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getInputConditioner()
		 * @generated
		 */
		EClass INPUT_CONDITIONER = eINSTANCE.getInputConditioner();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.BiConImpl <em>Bi Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.BiConImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getBiCon()
		 * @generated
		 */
		EClass BI_CON = eINSTANCE.getBiCon();

		/**
		 * The meta object literal for the '<em><b>Bi Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BI_CON__BI_STATUS = eINSTANCE.getBiCon_BiStatus();

		/**
		 * The meta object literal for the '<em><b>Select Two</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_CON__SELECT_TWO = eINSTANCE.getBiCon_SelectTwo();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.UniConImpl <em>Uni Con</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.UniConImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getUniCon()
		 * @generated
		 */
		EClass UNI_CON = eINSTANCE.getUniCon();

		/**
		 * The meta object literal for the '<em><b>Uni Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNI_CON__UNI_STATUS = eINSTANCE.getUniCon_UniStatus();

		/**
		 * The meta object literal for the '<em><b>Select One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNI_CON__SELECT_ONE = eINSTANCE.getUniCon_SelectOne();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.ElementImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RESPONSIBLE = eINSTANCE.getElement_Responsible();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MOVE = eINSTANCE.getElement_Move();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.ResponsibleImpl <em>Responsible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.ResponsibleImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getResponsible()
		 * @generated
		 */
		EClass RESPONSIBLE = eINSTANCE.getResponsible();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE__NAME = eINSTANCE.getResponsible_Name();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.WorkPieceTypeImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getWorkPieceType()
		 * @generated
		 */
		EClass WORK_PIECE_TYPE = eINSTANCE.getWorkPieceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE_TYPE__NAME = eINSTANCE.getWorkPieceType_Name();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.OutPutWorkPieceImpl <em>Out Put Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.OutPutWorkPieceImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getOutPutWorkPiece()
		 * @generated
		 */
		EClass OUT_PUT_WORK_PIECE = eINSTANCE.getOutPutWorkPiece();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PUT_WORK_PIECE__OUTPUT_TYPE = eINSTANCE.getOutPutWorkPiece_OutputType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PUT_WORK_PIECE__NAME = eINSTANCE.getOutPutWorkPiece_Name();

		/**
		 * The meta object literal for the '<em><b>Input Select</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PUT_WORK_PIECE__INPUT_SELECT = eINSTANCE.getOutPutWorkPiece_InputSelect();

		/**
		 * The meta object literal for the '{@link Manufacture.impl.InputWorkPieceImpl <em>Input Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.impl.InputWorkPieceImpl
		 * @see Manufacture.impl.ManufacturePackageImpl#getInputWorkPiece()
		 * @generated
		 */
		EClass INPUT_WORK_PIECE = eINSTANCE.getInputWorkPiece();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_WORK_PIECE__CONDITION = eINSTANCE.getInputWorkPiece_Condition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_WORK_PIECE__NAME = eINSTANCE.getInputWorkPiece_Name();

		/**
		 * The meta object literal for the '{@link Manufacture.BiType <em>Bi Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Manufacture.BiType
		 * @see Manufacture.impl.ManufacturePackageImpl#getBiType()
		 * @generated
		 */
		EEnum BI_TYPE = eINSTANCE.getBiType();

	}

} //ManufacturePackage
