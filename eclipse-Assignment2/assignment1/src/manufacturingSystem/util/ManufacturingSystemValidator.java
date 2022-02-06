/**
 */
package manufacturingSystem.util;

import java.util.Map;

import manufacturingSystem.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemPackage
 * @generated
 */
public class ManufacturingSystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ManufacturingSystemValidator INSTANCE = new ManufacturingSystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "manufacturingSystem";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No In Transition' of 'Manufacturing System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURING_SYSTEM__NO_IN_TRANSITION = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not The Same' of 'Manufacturing System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURING_SYSTEM__NOT_THE_SAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Out Transition' of 'Manufacturing System'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURING_SYSTEM__NO_OUT_TRANSITION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must One Responsible' of 'Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STEP__MUST_ONE_RESPONSIBLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Less Than Three Step' of 'Responsible'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSIBLE__LESS_THAN_THREE_STEP = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'More Than One Step' of 'Responsible'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSIBLE__MORE_THAN_ONE_STEP = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ManufacturingSystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ManufacturingSystemPackage.WORK_PIECE:
				return validateWorkPiece((WorkPiece)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_STEP:
				return validateManufacturingStep((ManufacturingStep)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM:
				return validateManufacturingSystem((ManufacturingSystem)value, diagnostics, context);
			case ManufacturingSystemPackage.TRANSPORT_STEP:
				return validateTransportStep((TransportStep)value, diagnostics, context);
			case ManufacturingSystemPackage.QUALITY_ASSURANCE_STEP:
				return validateQualityAssuranceStep((QualityAssuranceStep)value, diagnostics, context);
			case ManufacturingSystemPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case ManufacturingSystemPackage.RESPONSIBLE:
				return validateResponsible((Responsible)value, diagnostics, context);
			case ManufacturingSystemPackage.INPUT_CONDITION:
				return validateInputCondition((InputCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.STORAGE_POINT:
				return validateStoragePoint((StoragePoint)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT:
				return validateManufacturingSystemElement((ManufacturingSystemElement)value, diagnostics, context);
			case ManufacturingSystemPackage.COMPOSITE_MANUFACTURING_STEP:
				return validateCompositeManufacturingStep((CompositeManufacturingStep)value, diagnostics, context);
			case ManufacturingSystemPackage.WORK_PIECE_TYPE:
				return validateWorkPieceType((WorkPieceType)value, diagnostics, context);
			case ManufacturingSystemPackage.OUTPUT_DECISION:
				return validateOutputDecision((OutputDecision)value, diagnostics, context);
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION:
				return validateWorkPieceCondition((WorkPieceCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.BINARY_CONDITION:
				return validateBinaryCondition((BinaryCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.NEGATION:
				return validateNegation((Negation)value, diagnostics, context);
			case ManufacturingSystemPackage.BINARY_TYPE:
				return validateBinaryType((BinaryType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPiece(WorkPiece workPiece, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPiece, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingStep(ManufacturingStep manufacturingStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturingStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_MustOneResponsible(manufacturingStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturingSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystem_NoOutTransition(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystem_NoInTransition(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystem_NotTheSame(manufacturingSystem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoOutTransition constraint of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem_NoOutTransition(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturingSystem.NoOutTransition(diagnostics, context);
	}

	/**
	 * Validates the NoInTransition constraint of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem_NoInTransition(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturingSystem.NoInTransition(diagnostics, context);
	}

	/**
	 * Validates the NotTheSame constraint of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem_NotTheSame(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturingSystem.NotTheSame(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportStep(TransportStep transportStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transportStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_MustOneResponsible(transportStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityAssuranceStep(QualityAssuranceStep qualityAssuranceStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityAssuranceStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_MustOneResponsible(qualityAssuranceStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_MustOneResponsible(step, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustOneResponsible constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_MustOneResponsible(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return step.MustOneResponsible(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsible(Responsible responsible, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsible, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsible_MoreThanOneStep(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsible_LessThanThreeStep(responsible, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MoreThanOneStep constraint of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsible_MoreThanOneStep(Responsible responsible, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsible.MoreThanOneStep(diagnostics, context);
	}

	/**
	 * Validates the LessThanThreeStep constraint of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsible_LessThanThreeStep(Responsible responsible, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsible.LessThanThreeStep(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputCondition(InputCondition inputCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragePoint(StoragePoint storagePoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storagePoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystemElement(ManufacturingSystemElement manufacturingSystemElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manufacturingSystemElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeManufacturingStep(CompositeManufacturingStep compositeManufacturingStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeManufacturingStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeManufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_MustOneResponsible(compositeManufacturingStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPieceType(WorkPieceType workPieceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPieceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDecision(OutputDecision outputDecision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPieceCondition(WorkPieceCondition workPieceCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPieceCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryCondition(BinaryCondition binaryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegation(Negation negation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryType(BinaryType binaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ManufacturingSystemValidator
