/**
 */
package Manufacture.impl;

import Manufacture.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufactureFactoryImpl extends EFactoryImpl implements ManufactureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManufactureFactory init() {
		try {
			ManufactureFactory theManufactureFactory = (ManufactureFactory)EPackage.Registry.INSTANCE.getEFactory(ManufacturePackage.eNS_URI);
			if (theManufactureFactory != null) {
				return theManufactureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManufactureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufactureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ManufacturePackage.MANU_SYSTEM: return createManuSystem();
			case ManufacturePackage.STEP: return createStep();
			case ManufacturePackage.WORK_PIECE: return createWorkPiece();
			case ManufacturePackage.STORAGE: return createStorage();
			case ManufacturePackage.HIERARCHY_STEP: return createHierarchyStep();
			case ManufacturePackage.MANU_STEP: return createManuStep();
			case ManufacturePackage.TRANS_STEP: return createTransStep();
			case ManufacturePackage.QA_STEP: return createQAStep();
			case ManufacturePackage.INPUT_CONDITIONER: return createInputConditioner();
			case ManufacturePackage.BI_CON: return createBiCon();
			case ManufacturePackage.UNI_CON: return createUniCon();
			case ManufacturePackage.ELEMENT: return createElement();
			case ManufacturePackage.RESPONSIBLE: return createResponsible();
			case ManufacturePackage.WORK_PIECE_TYPE: return createWorkPieceType();
			case ManufacturePackage.OUT_PUT_WORK_PIECE: return createOutPutWorkPiece();
			case ManufacturePackage.INPUT_WORK_PIECE: return createInputWorkPiece();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturePackage.BI_TYPE:
				return createBiTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturePackage.BI_TYPE:
				return convertBiTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManuSystem createManuSystem() {
		ManuSystemImpl manuSystem = new ManuSystemImpl();
		return manuSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPiece createWorkPiece() {
		WorkPieceImpl workPiece = new WorkPieceImpl();
		return workPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyStep createHierarchyStep() {
		HierarchyStepImpl hierarchyStep = new HierarchyStepImpl();
		return hierarchyStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManuStep createManuStep() {
		ManuStepImpl manuStep = new ManuStepImpl();
		return manuStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransStep createTransStep() {
		TransStepImpl transStep = new TransStepImpl();
		return transStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAStep createQAStep() {
		QAStepImpl qaStep = new QAStepImpl();
		return qaStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditioner createInputConditioner() {
		InputConditionerImpl inputConditioner = new InputConditionerImpl();
		return inputConditioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiCon createBiCon() {
		BiConImpl biCon = new BiConImpl();
		return biCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniCon createUniCon() {
		UniConImpl uniCon = new UniConImpl();
		return uniCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible createResponsible() {
		ResponsibleImpl responsible = new ResponsibleImpl();
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType createWorkPieceType() {
		WorkPieceTypeImpl workPieceType = new WorkPieceTypeImpl();
		return workPieceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPutWorkPiece createOutPutWorkPiece() {
		OutPutWorkPieceImpl outPutWorkPiece = new OutPutWorkPieceImpl();
		return outPutWorkPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWorkPiece createInputWorkPiece() {
		InputWorkPieceImpl inputWorkPiece = new InputWorkPieceImpl();
		return inputWorkPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiType createBiTypeFromString(EDataType eDataType, String initialValue) {
		BiType result = BiType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturePackage getManufacturePackage() {
		return (ManufacturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManufacturePackage getPackage() {
		return ManufacturePackage.eINSTANCE;
	}

} //ManufactureFactoryImpl
