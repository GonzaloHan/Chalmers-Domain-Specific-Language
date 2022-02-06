/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /assignment1/model/manufacturingSystem.ecore
 * using:
 *   /assignment1/model/manufacturingSystem.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package manufacturingSystem;

// import manufacturingSystem.ManufacturingSystemPackage;
// import manufacturingSystem.ManufacturingSystemTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * ManufacturingSystemTables provides the dispatch tables for the manufacturingSystem for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ManufacturingSystemTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ManufacturingSystemPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_com_chalmers_manufacturingSystem = IdManager.getNsURIPackageId("com.chalmers.manufacturingSystem", null, ManufacturingSystemPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_BinaryCondition = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("BinaryCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ManufacturingSystemTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CompositeManufacturingStep = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("CompositeManufacturingStep", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InputCondition = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("InputCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ManufacturingSystem = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("ManufacturingSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ManufacturingSystemElement = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("ManufacturingSystemElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Negation = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("Negation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OutputDecision = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("OutputDecision", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Responsible = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("Responsible", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Step = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("Step", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_StoragePoint = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("StoragePoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkPiece = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("WorkPiece", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkPieceCondition = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("WorkPieceCondition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WorkPieceType = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getClassId("WorkPieceType", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ManufacturingSystemTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_BinaryType = ManufacturingSystemTables.PACKid_com_chalmers_manufacturingSystem.getEnumerationId("BinaryType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_BinaryCondition = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_BinaryCondition);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ManufacturingSystem = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_ManufacturingSystem);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ManufacturingSystemElement = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_ManufacturingSystemElement);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Negation = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_Negation);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_OutputDecision = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_OutputDecision);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_StoragePoint = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_StoragePoint);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WorkPiece = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_WorkPiece);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_WorkPieceCondition = TypeId.BAG.getSpecializedId(ManufacturingSystemTables.CLSSid_WorkPieceCondition);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_InputCondition = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_InputCondition);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ManufacturingSystemElement = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_ManufacturingSystemElement);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OutputDecision = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_OutputDecision);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Responsible = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_Responsible);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StoragePoint = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_StoragePoint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkPiece = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_WorkPiece);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_WorkPieceType = TypeId.ORDERED_SET.getSpecializedId(ManufacturingSystemTables.CLSSid_WorkPieceType);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_ManufacturingSystemElement = TypeId.SEQUENCE.getSpecializedId(ManufacturingSystemTables.CLSSid_ManufacturingSystemElement);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Responsible = TypeId.SEQUENCE.getSpecializedId(ManufacturingSystemTables.CLSSid_Responsible);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Responsible = TypeId.SET.getSpecializedId(ManufacturingSystemTables.CLSSid_Responsible);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Step = TypeId.SET.getSpecializedId(ManufacturingSystemTables.CLSSid_Step);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ManufacturingSystemTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _BinaryCondition = new EcoreExecutorType(ManufacturingSystemPackage.Literals.BINARY_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _BinaryType = new EcoreExecutorEnumeration(ManufacturingSystemPackage.Literals.BINARY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _CompositeManufacturingStep = new EcoreExecutorType(ManufacturingSystemPackage.Literals.COMPOSITE_MANUFACTURING_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _InputCondition = new EcoreExecutorType(ManufacturingSystemPackage.Literals.INPUT_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _ManufacturingStep = new EcoreExecutorType(ManufacturingSystemPackage.Literals.MANUFACTURING_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _ManufacturingSystem = new EcoreExecutorType(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _ManufacturingSystemElement = new EcoreExecutorType(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Negation = new EcoreExecutorType(ManufacturingSystemPackage.Literals.NEGATION, PACKAGE, 0);
		public static final EcoreExecutorType _OutputDecision = new EcoreExecutorType(ManufacturingSystemPackage.Literals.OUTPUT_DECISION, PACKAGE, 0);
		public static final EcoreExecutorType _QualityAssuranceStep = new EcoreExecutorType(ManufacturingSystemPackage.Literals.QUALITY_ASSURANCE_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _Responsible = new EcoreExecutorType(ManufacturingSystemPackage.Literals.RESPONSIBLE, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(ManufacturingSystemPackage.Literals.STEP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _StoragePoint = new EcoreExecutorType(ManufacturingSystemPackage.Literals.STORAGE_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _TransportStep = new EcoreExecutorType(ManufacturingSystemPackage.Literals.TRANSPORT_STEP, PACKAGE, 0);
		public static final EcoreExecutorType _WorkPiece = new EcoreExecutorType(ManufacturingSystemPackage.Literals.WORK_PIECE, PACKAGE, 0);
		public static final EcoreExecutorType _WorkPieceCondition = new EcoreExecutorType(ManufacturingSystemPackage.Literals.WORK_PIECE_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorType _WorkPieceType = new EcoreExecutorType(ManufacturingSystemPackage.Literals.WORK_PIECE_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BinaryCondition,
			_BinaryType,
			_CompositeManufacturingStep,
			_InputCondition,
			_ManufacturingStep,
			_ManufacturingSystem,
			_ManufacturingSystemElement,
			_Negation,
			_OutputDecision,
			_QualityAssuranceStep,
			_Responsible,
			_Step,
			_StoragePoint,
			_TransportStep,
			_WorkPiece,
			_WorkPieceCondition,
			_WorkPieceType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _BinaryCondition__BinaryCondition = new ExecutorFragment(Types._BinaryCondition, ManufacturingSystemTables.Types._BinaryCondition);
		private static final ExecutorFragment _BinaryCondition__InputCondition = new ExecutorFragment(Types._BinaryCondition, ManufacturingSystemTables.Types._InputCondition);
		private static final ExecutorFragment _BinaryCondition__OclAny = new ExecutorFragment(Types._BinaryCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BinaryCondition__OclElement = new ExecutorFragment(Types._BinaryCondition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BinaryType__BinaryType = new ExecutorFragment(Types._BinaryType, ManufacturingSystemTables.Types._BinaryType);
		private static final ExecutorFragment _BinaryType__OclAny = new ExecutorFragment(Types._BinaryType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BinaryType__OclElement = new ExecutorFragment(Types._BinaryType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BinaryType__OclEnumeration = new ExecutorFragment(Types._BinaryType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _BinaryType__OclType = new ExecutorFragment(Types._BinaryType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CompositeManufacturingStep__CompositeManufacturingStep = new ExecutorFragment(Types._CompositeManufacturingStep, ManufacturingSystemTables.Types._CompositeManufacturingStep);
		private static final ExecutorFragment _CompositeManufacturingStep__ManufacturingSystemElement = new ExecutorFragment(Types._CompositeManufacturingStep, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _CompositeManufacturingStep__OclAny = new ExecutorFragment(Types._CompositeManufacturingStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CompositeManufacturingStep__OclElement = new ExecutorFragment(Types._CompositeManufacturingStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CompositeManufacturingStep__Step = new ExecutorFragment(Types._CompositeManufacturingStep, ManufacturingSystemTables.Types._Step);

		private static final ExecutorFragment _InputCondition__InputCondition = new ExecutorFragment(Types._InputCondition, ManufacturingSystemTables.Types._InputCondition);
		private static final ExecutorFragment _InputCondition__OclAny = new ExecutorFragment(Types._InputCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InputCondition__OclElement = new ExecutorFragment(Types._InputCondition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ManufacturingStep__ManufacturingStep = new ExecutorFragment(Types._ManufacturingStep, ManufacturingSystemTables.Types._ManufacturingStep);
		private static final ExecutorFragment _ManufacturingStep__ManufacturingSystemElement = new ExecutorFragment(Types._ManufacturingStep, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _ManufacturingStep__OclAny = new ExecutorFragment(Types._ManufacturingStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ManufacturingStep__OclElement = new ExecutorFragment(Types._ManufacturingStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ManufacturingStep__Step = new ExecutorFragment(Types._ManufacturingStep, ManufacturingSystemTables.Types._Step);

		private static final ExecutorFragment _ManufacturingSystem__ManufacturingSystem = new ExecutorFragment(Types._ManufacturingSystem, ManufacturingSystemTables.Types._ManufacturingSystem);
		private static final ExecutorFragment _ManufacturingSystem__OclAny = new ExecutorFragment(Types._ManufacturingSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ManufacturingSystem__OclElement = new ExecutorFragment(Types._ManufacturingSystem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ManufacturingSystemElement__ManufacturingSystemElement = new ExecutorFragment(Types._ManufacturingSystemElement, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _ManufacturingSystemElement__OclAny = new ExecutorFragment(Types._ManufacturingSystemElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ManufacturingSystemElement__OclElement = new ExecutorFragment(Types._ManufacturingSystemElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Negation__InputCondition = new ExecutorFragment(Types._Negation, ManufacturingSystemTables.Types._InputCondition);
		private static final ExecutorFragment _Negation__Negation = new ExecutorFragment(Types._Negation, ManufacturingSystemTables.Types._Negation);
		private static final ExecutorFragment _Negation__OclAny = new ExecutorFragment(Types._Negation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Negation__OclElement = new ExecutorFragment(Types._Negation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OutputDecision__OclAny = new ExecutorFragment(Types._OutputDecision, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OutputDecision__OclElement = new ExecutorFragment(Types._OutputDecision, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OutputDecision__OutputDecision = new ExecutorFragment(Types._OutputDecision, ManufacturingSystemTables.Types._OutputDecision);

		private static final ExecutorFragment _QualityAssuranceStep__ManufacturingSystemElement = new ExecutorFragment(Types._QualityAssuranceStep, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _QualityAssuranceStep__OclAny = new ExecutorFragment(Types._QualityAssuranceStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QualityAssuranceStep__OclElement = new ExecutorFragment(Types._QualityAssuranceStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QualityAssuranceStep__QualityAssuranceStep = new ExecutorFragment(Types._QualityAssuranceStep, ManufacturingSystemTables.Types._QualityAssuranceStep);
		private static final ExecutorFragment _QualityAssuranceStep__Step = new ExecutorFragment(Types._QualityAssuranceStep, ManufacturingSystemTables.Types._Step);

		private static final ExecutorFragment _Responsible__OclAny = new ExecutorFragment(Types._Responsible, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Responsible__OclElement = new ExecutorFragment(Types._Responsible, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Responsible__Responsible = new ExecutorFragment(Types._Responsible, ManufacturingSystemTables.Types._Responsible);

		private static final ExecutorFragment _Step__ManufacturingSystemElement = new ExecutorFragment(Types._Step, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, ManufacturingSystemTables.Types._Step);

		private static final ExecutorFragment _StoragePoint__ManufacturingSystemElement = new ExecutorFragment(Types._StoragePoint, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _StoragePoint__OclAny = new ExecutorFragment(Types._StoragePoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StoragePoint__OclElement = new ExecutorFragment(Types._StoragePoint, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StoragePoint__StoragePoint = new ExecutorFragment(Types._StoragePoint, ManufacturingSystemTables.Types._StoragePoint);

		private static final ExecutorFragment _TransportStep__ManufacturingSystemElement = new ExecutorFragment(Types._TransportStep, ManufacturingSystemTables.Types._ManufacturingSystemElement);
		private static final ExecutorFragment _TransportStep__OclAny = new ExecutorFragment(Types._TransportStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransportStep__OclElement = new ExecutorFragment(Types._TransportStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransportStep__Step = new ExecutorFragment(Types._TransportStep, ManufacturingSystemTables.Types._Step);
		private static final ExecutorFragment _TransportStep__TransportStep = new ExecutorFragment(Types._TransportStep, ManufacturingSystemTables.Types._TransportStep);

		private static final ExecutorFragment _WorkPiece__OclAny = new ExecutorFragment(Types._WorkPiece, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkPiece__OclElement = new ExecutorFragment(Types._WorkPiece, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkPiece__WorkPiece = new ExecutorFragment(Types._WorkPiece, ManufacturingSystemTables.Types._WorkPiece);

		private static final ExecutorFragment _WorkPieceCondition__InputCondition = new ExecutorFragment(Types._WorkPieceCondition, ManufacturingSystemTables.Types._InputCondition);
		private static final ExecutorFragment _WorkPieceCondition__OclAny = new ExecutorFragment(Types._WorkPieceCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkPieceCondition__OclElement = new ExecutorFragment(Types._WorkPieceCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkPieceCondition__WorkPieceCondition = new ExecutorFragment(Types._WorkPieceCondition, ManufacturingSystemTables.Types._WorkPieceCondition);

		private static final ExecutorFragment _WorkPieceType__OclAny = new ExecutorFragment(Types._WorkPieceType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WorkPieceType__OclElement = new ExecutorFragment(Types._WorkPieceType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WorkPieceType__WorkPieceType = new ExecutorFragment(Types._WorkPieceType, ManufacturingSystemTables.Types._WorkPieceType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _BinaryCondition__left = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.BINARY_CONDITION__LEFT, Types._BinaryCondition, 0);
		public static final ExecutorProperty _BinaryCondition__right = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.BINARY_CONDITION__RIGHT, Types._BinaryCondition, 1);
		public static final ExecutorProperty _BinaryCondition__type = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.BINARY_CONDITION__TYPE, Types._BinaryCondition, 2);

		public static final ExecutorProperty _CompositeManufacturingStep__contains = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.COMPOSITE_MANUFACTURING_STEP__CONTAINS, Types._CompositeManufacturingStep, 0);

		public static final ExecutorProperty _InputCondition__name = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.INPUT_CONDITION__NAME, Types._InputCondition, 0);
		public static final ExecutorProperty _InputCondition__BinaryCondition__left = new ExecutorPropertyWithImplementation("BinaryCondition", Types._InputCondition, 1, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.BINARY_CONDITION__LEFT));
		public static final ExecutorProperty _InputCondition__BinaryCondition__right = new ExecutorPropertyWithImplementation("BinaryCondition", Types._InputCondition, 2, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.BINARY_CONDITION__RIGHT));
		public static final ExecutorProperty _InputCondition__Negation__contains = new ExecutorPropertyWithImplementation("Negation", Types._InputCondition, 3, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.NEGATION__CONTAINS));
		public static final ExecutorProperty _InputCondition__OutputDecision__input = new ExecutorPropertyWithImplementation("OutputDecision", Types._InputCondition, 4, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.OUTPUT_DECISION__INPUT));
		public static final ExecutorProperty _InputCondition__Step__input = new ExecutorPropertyWithImplementation("Step", Types._InputCondition, 5, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.STEP__INPUT));

		public static final ExecutorProperty _ManufacturingSystem__consistsOf = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF, Types._ManufacturingSystem, 0);
		public static final ExecutorProperty _ManufacturingSystem__end = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__END, Types._ManufacturingSystem, 1);
		public static final ExecutorProperty _ManufacturingSystem__name = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__NAME, Types._ManufacturingSystem, 2);
		public static final ExecutorProperty _ManufacturingSystem__responsible = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__RESPONSIBLE, Types._ManufacturingSystem, 3);
		public static final ExecutorProperty _ManufacturingSystem__staff = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__STAFF, Types._ManufacturingSystem, 4);
		public static final ExecutorProperty _ManufacturingSystem__start = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__START, Types._ManufacturingSystem, 5);
		public static final ExecutorProperty _ManufacturingSystem__transforms = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__TRANSFORMS, Types._ManufacturingSystem, 6);
		public static final ExecutorProperty _ManufacturingSystem__uses = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__USES, Types._ManufacturingSystem, 7);
		public static final ExecutorProperty _ManufacturingSystem__CompositeManufacturingStep__contains = new ExecutorPropertyWithImplementation("CompositeManufacturingStep", Types._ManufacturingSystem, 8, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.COMPOSITE_MANUFACTURING_STEP__CONTAINS));

		public static final ExecutorProperty _ManufacturingSystemElement__name = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT__NAME, Types._ManufacturingSystemElement, 0);
		public static final ExecutorProperty _ManufacturingSystemElement__responsible = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE, Types._ManufacturingSystemElement, 1);
		public static final ExecutorProperty _ManufacturingSystemElement__transition = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION, Types._ManufacturingSystemElement, 2);
		public static final ExecutorProperty _ManufacturingSystemElement__ManufacturingSystem__consistsOf = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._ManufacturingSystemElement, 3, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF));
		public static final ExecutorProperty _ManufacturingSystemElement__ManufacturingSystemElement__transition = new ExecutorPropertyWithImplementation("ManufacturingSystemElement", Types._ManufacturingSystemElement, 4, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION));

		public static final ExecutorProperty _Negation__contains = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.NEGATION__CONTAINS, Types._Negation, 0);

		public static final ExecutorProperty _OutputDecision__input = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.OUTPUT_DECISION__INPUT, Types._OutputDecision, 0);
		public static final ExecutorProperty _OutputDecision__outputTypes = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.OUTPUT_DECISION__OUTPUT_TYPES, Types._OutputDecision, 1);
		public static final ExecutorProperty _OutputDecision__Step__output = new ExecutorPropertyWithImplementation("Step", Types._OutputDecision, 2, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.STEP__OUTPUT));

		public static final ExecutorProperty _Responsible__name = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.RESPONSIBLE__NAME, Types._Responsible, 0);
		public static final ExecutorProperty _Responsible__ManufacturingSystem__responsible = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._Responsible, 1, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__RESPONSIBLE));
		public static final ExecutorProperty _Responsible__ManufacturingSystem__staff = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._Responsible, 2, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__STAFF));
		public static final ExecutorProperty _Responsible__ManufacturingSystemElement__responsible = new ExecutorPropertyWithImplementation("ManufacturingSystemElement", Types._Responsible, 3, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE));

		public static final ExecutorProperty _Step__input = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.STEP__INPUT, Types._Step, 0);
		public static final ExecutorProperty _Step__output = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.STEP__OUTPUT, Types._Step, 1);
		public static final ExecutorProperty _Step__speed = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.STEP__SPEED, Types._Step, 2);

		public static final ExecutorProperty _StoragePoint__stores = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.STORAGE_POINT__STORES, Types._StoragePoint, 0);
		public static final ExecutorProperty _StoragePoint__ManufacturingSystem__end = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._StoragePoint, 1, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__END));
		public static final ExecutorProperty _StoragePoint__ManufacturingSystem__start = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._StoragePoint, 2, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__START));

		public static final ExecutorProperty _WorkPiece__hasType = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.WORK_PIECE__HAS_TYPE, Types._WorkPiece, 0);
		public static final ExecutorProperty _WorkPiece__ManufacturingSystem__transforms = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._WorkPiece, 1, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__TRANSFORMS));

		public static final ExecutorProperty _WorkPieceCondition__requiresType = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.WORK_PIECE_CONDITION__REQUIRES_TYPE, Types._WorkPieceCondition, 0);

		public static final ExecutorProperty _WorkPieceType__name = new EcoreExecutorProperty(ManufacturingSystemPackage.Literals.WORK_PIECE_TYPE__NAME, Types._WorkPieceType, 0);
		public static final ExecutorProperty _WorkPieceType__ManufacturingSystem__uses = new ExecutorPropertyWithImplementation("ManufacturingSystem", Types._WorkPieceType, 1, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__USES));
		public static final ExecutorProperty _WorkPieceType__OutputDecision__outputTypes = new ExecutorPropertyWithImplementation("OutputDecision", Types._WorkPieceType, 2, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.OUTPUT_DECISION__OUTPUT_TYPES));
		public static final ExecutorProperty _WorkPieceType__StoragePoint__stores = new ExecutorPropertyWithImplementation("StoragePoint", Types._WorkPieceType, 3, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.STORAGE_POINT__STORES));
		public static final ExecutorProperty _WorkPieceType__WorkPiece__hasType = new ExecutorPropertyWithImplementation("WorkPiece", Types._WorkPieceType, 4, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.WORK_PIECE__HAS_TYPE));
		public static final ExecutorProperty _WorkPieceType__WorkPieceCondition__requiresType = new ExecutorPropertyWithImplementation("WorkPieceCondition", Types._WorkPieceType, 5, new EcoreLibraryOppositeProperty(ManufacturingSystemPackage.Literals.WORK_PIECE_CONDITION__REQUIRES_TYPE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _BinaryCondition =
			{
				Fragments._BinaryCondition__OclAny /* 0 */,
				Fragments._BinaryCondition__OclElement /* 1 */,
				Fragments._BinaryCondition__InputCondition /* 2 */,
				Fragments._BinaryCondition__BinaryCondition /* 3 */
			};
		private static final int /*@NonNull*/ [] __BinaryCondition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BinaryType =
			{
				Fragments._BinaryType__OclAny /* 0 */,
				Fragments._BinaryType__OclElement /* 1 */,
				Fragments._BinaryType__OclType /* 2 */,
				Fragments._BinaryType__OclEnumeration /* 3 */,
				Fragments._BinaryType__BinaryType /* 4 */
			};
		private static final int /*@NonNull*/ [] __BinaryType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CompositeManufacturingStep =
			{
				Fragments._CompositeManufacturingStep__OclAny /* 0 */,
				Fragments._CompositeManufacturingStep__OclElement /* 1 */,
				Fragments._CompositeManufacturingStep__ManufacturingSystemElement /* 2 */,
				Fragments._CompositeManufacturingStep__Step /* 3 */,
				Fragments._CompositeManufacturingStep__CompositeManufacturingStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __CompositeManufacturingStep = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InputCondition =
			{
				Fragments._InputCondition__OclAny /* 0 */,
				Fragments._InputCondition__OclElement /* 1 */,
				Fragments._InputCondition__InputCondition /* 2 */
			};
		private static final int /*@NonNull*/ [] __InputCondition = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ManufacturingStep =
			{
				Fragments._ManufacturingStep__OclAny /* 0 */,
				Fragments._ManufacturingStep__OclElement /* 1 */,
				Fragments._ManufacturingStep__ManufacturingSystemElement /* 2 */,
				Fragments._ManufacturingStep__Step /* 3 */,
				Fragments._ManufacturingStep__ManufacturingStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __ManufacturingStep = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ManufacturingSystem =
			{
				Fragments._ManufacturingSystem__OclAny /* 0 */,
				Fragments._ManufacturingSystem__OclElement /* 1 */,
				Fragments._ManufacturingSystem__ManufacturingSystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __ManufacturingSystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ManufacturingSystemElement =
			{
				Fragments._ManufacturingSystemElement__OclAny /* 0 */,
				Fragments._ManufacturingSystemElement__OclElement /* 1 */,
				Fragments._ManufacturingSystemElement__ManufacturingSystemElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __ManufacturingSystemElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Negation =
			{
				Fragments._Negation__OclAny /* 0 */,
				Fragments._Negation__OclElement /* 1 */,
				Fragments._Negation__InputCondition /* 2 */,
				Fragments._Negation__Negation /* 3 */
			};
		private static final int /*@NonNull*/ [] __Negation = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OutputDecision =
			{
				Fragments._OutputDecision__OclAny /* 0 */,
				Fragments._OutputDecision__OclElement /* 1 */,
				Fragments._OutputDecision__OutputDecision /* 2 */
			};
		private static final int /*@NonNull*/ [] __OutputDecision = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QualityAssuranceStep =
			{
				Fragments._QualityAssuranceStep__OclAny /* 0 */,
				Fragments._QualityAssuranceStep__OclElement /* 1 */,
				Fragments._QualityAssuranceStep__ManufacturingSystemElement /* 2 */,
				Fragments._QualityAssuranceStep__Step /* 3 */,
				Fragments._QualityAssuranceStep__QualityAssuranceStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __QualityAssuranceStep = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Responsible =
			{
				Fragments._Responsible__OclAny /* 0 */,
				Fragments._Responsible__OclElement /* 1 */,
				Fragments._Responsible__Responsible /* 2 */
			};
		private static final int /*@NonNull*/ [] __Responsible = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__ManufacturingSystemElement /* 2 */,
				Fragments._Step__Step /* 3 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StoragePoint =
			{
				Fragments._StoragePoint__OclAny /* 0 */,
				Fragments._StoragePoint__OclElement /* 1 */,
				Fragments._StoragePoint__ManufacturingSystemElement /* 2 */,
				Fragments._StoragePoint__StoragePoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __StoragePoint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransportStep =
			{
				Fragments._TransportStep__OclAny /* 0 */,
				Fragments._TransportStep__OclElement /* 1 */,
				Fragments._TransportStep__ManufacturingSystemElement /* 2 */,
				Fragments._TransportStep__Step /* 3 */,
				Fragments._TransportStep__TransportStep /* 4 */
			};
		private static final int /*@NonNull*/ [] __TransportStep = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkPiece =
			{
				Fragments._WorkPiece__OclAny /* 0 */,
				Fragments._WorkPiece__OclElement /* 1 */,
				Fragments._WorkPiece__WorkPiece /* 2 */
			};
		private static final int /*@NonNull*/ [] __WorkPiece = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkPieceCondition =
			{
				Fragments._WorkPieceCondition__OclAny /* 0 */,
				Fragments._WorkPieceCondition__OclElement /* 1 */,
				Fragments._WorkPieceCondition__InputCondition /* 2 */,
				Fragments._WorkPieceCondition__WorkPieceCondition /* 3 */
			};
		private static final int /*@NonNull*/ [] __WorkPieceCondition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WorkPieceType =
			{
				Fragments._WorkPieceType__OclAny /* 0 */,
				Fragments._WorkPieceType__OclElement /* 1 */,
				Fragments._WorkPieceType__WorkPieceType /* 2 */
			};
		private static final int /*@NonNull*/ [] __WorkPieceType = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BinaryCondition.initFragments(_BinaryCondition, __BinaryCondition);
			Types._BinaryType.initFragments(_BinaryType, __BinaryType);
			Types._CompositeManufacturingStep.initFragments(_CompositeManufacturingStep, __CompositeManufacturingStep);
			Types._InputCondition.initFragments(_InputCondition, __InputCondition);
			Types._ManufacturingStep.initFragments(_ManufacturingStep, __ManufacturingStep);
			Types._ManufacturingSystem.initFragments(_ManufacturingSystem, __ManufacturingSystem);
			Types._ManufacturingSystemElement.initFragments(_ManufacturingSystemElement, __ManufacturingSystemElement);
			Types._Negation.initFragments(_Negation, __Negation);
			Types._OutputDecision.initFragments(_OutputDecision, __OutputDecision);
			Types._QualityAssuranceStep.initFragments(_QualityAssuranceStep, __QualityAssuranceStep);
			Types._Responsible.initFragments(_Responsible, __Responsible);
			Types._Step.initFragments(_Step, __Step);
			Types._StoragePoint.initFragments(_StoragePoint, __StoragePoint);
			Types._TransportStep.initFragments(_TransportStep, __TransportStep);
			Types._WorkPiece.initFragments(_WorkPiece, __WorkPiece);
			Types._WorkPieceCondition.initFragments(_WorkPieceCondition, __WorkPieceCondition);
			Types._WorkPieceType.initFragments(_WorkPieceType, __WorkPieceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _BinaryCondition__BinaryCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryCondition__InputCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BinaryType__BinaryType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BinaryType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CompositeManufacturingStep__CompositeManufacturingStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeManufacturingStep__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeManufacturingStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeManufacturingStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CompositeManufacturingStep__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _InputCondition__InputCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InputCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InputCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingStep__ManufacturingStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingStep__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingStep__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystem__ManufacturingSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystemElement__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystemElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ManufacturingSystemElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Negation__Negation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Negation__InputCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Negation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Negation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OutputDecision__OutputDecision = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputDecision__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputDecision__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssuranceStep__QualityAssuranceStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssuranceStep__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssuranceStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssuranceStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssuranceStep__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Responsible__Responsible = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsible__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsible__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _StoragePoint__StoragePoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoragePoint__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _StoragePoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StoragePoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransportStep__TransportStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportStep__ManufacturingSystemElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportStep__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkPiece__WorkPiece = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPiece__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPiece__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceCondition__WorkPieceCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceCondition__InputCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceCondition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceType__WorkPieceType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WorkPieceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BinaryCondition__BinaryCondition.initOperations(_BinaryCondition__BinaryCondition);
			Fragments._BinaryCondition__InputCondition.initOperations(_BinaryCondition__InputCondition);
			Fragments._BinaryCondition__OclAny.initOperations(_BinaryCondition__OclAny);
			Fragments._BinaryCondition__OclElement.initOperations(_BinaryCondition__OclElement);

			Fragments._BinaryType__BinaryType.initOperations(_BinaryType__BinaryType);
			Fragments._BinaryType__OclAny.initOperations(_BinaryType__OclAny);
			Fragments._BinaryType__OclElement.initOperations(_BinaryType__OclElement);
			Fragments._BinaryType__OclEnumeration.initOperations(_BinaryType__OclEnumeration);
			Fragments._BinaryType__OclType.initOperations(_BinaryType__OclType);

			Fragments._CompositeManufacturingStep__CompositeManufacturingStep.initOperations(_CompositeManufacturingStep__CompositeManufacturingStep);
			Fragments._CompositeManufacturingStep__ManufacturingSystemElement.initOperations(_CompositeManufacturingStep__ManufacturingSystemElement);
			Fragments._CompositeManufacturingStep__OclAny.initOperations(_CompositeManufacturingStep__OclAny);
			Fragments._CompositeManufacturingStep__OclElement.initOperations(_CompositeManufacturingStep__OclElement);
			Fragments._CompositeManufacturingStep__Step.initOperations(_CompositeManufacturingStep__Step);

			Fragments._InputCondition__InputCondition.initOperations(_InputCondition__InputCondition);
			Fragments._InputCondition__OclAny.initOperations(_InputCondition__OclAny);
			Fragments._InputCondition__OclElement.initOperations(_InputCondition__OclElement);

			Fragments._ManufacturingStep__ManufacturingStep.initOperations(_ManufacturingStep__ManufacturingStep);
			Fragments._ManufacturingStep__ManufacturingSystemElement.initOperations(_ManufacturingStep__ManufacturingSystemElement);
			Fragments._ManufacturingStep__OclAny.initOperations(_ManufacturingStep__OclAny);
			Fragments._ManufacturingStep__OclElement.initOperations(_ManufacturingStep__OclElement);
			Fragments._ManufacturingStep__Step.initOperations(_ManufacturingStep__Step);

			Fragments._ManufacturingSystem__ManufacturingSystem.initOperations(_ManufacturingSystem__ManufacturingSystem);
			Fragments._ManufacturingSystem__OclAny.initOperations(_ManufacturingSystem__OclAny);
			Fragments._ManufacturingSystem__OclElement.initOperations(_ManufacturingSystem__OclElement);

			Fragments._ManufacturingSystemElement__ManufacturingSystemElement.initOperations(_ManufacturingSystemElement__ManufacturingSystemElement);
			Fragments._ManufacturingSystemElement__OclAny.initOperations(_ManufacturingSystemElement__OclAny);
			Fragments._ManufacturingSystemElement__OclElement.initOperations(_ManufacturingSystemElement__OclElement);

			Fragments._Negation__InputCondition.initOperations(_Negation__InputCondition);
			Fragments._Negation__Negation.initOperations(_Negation__Negation);
			Fragments._Negation__OclAny.initOperations(_Negation__OclAny);
			Fragments._Negation__OclElement.initOperations(_Negation__OclElement);

			Fragments._OutputDecision__OclAny.initOperations(_OutputDecision__OclAny);
			Fragments._OutputDecision__OclElement.initOperations(_OutputDecision__OclElement);
			Fragments._OutputDecision__OutputDecision.initOperations(_OutputDecision__OutputDecision);

			Fragments._QualityAssuranceStep__ManufacturingSystemElement.initOperations(_QualityAssuranceStep__ManufacturingSystemElement);
			Fragments._QualityAssuranceStep__OclAny.initOperations(_QualityAssuranceStep__OclAny);
			Fragments._QualityAssuranceStep__OclElement.initOperations(_QualityAssuranceStep__OclElement);
			Fragments._QualityAssuranceStep__QualityAssuranceStep.initOperations(_QualityAssuranceStep__QualityAssuranceStep);
			Fragments._QualityAssuranceStep__Step.initOperations(_QualityAssuranceStep__Step);

			Fragments._Responsible__OclAny.initOperations(_Responsible__OclAny);
			Fragments._Responsible__OclElement.initOperations(_Responsible__OclElement);
			Fragments._Responsible__Responsible.initOperations(_Responsible__Responsible);

			Fragments._Step__ManufacturingSystemElement.initOperations(_Step__ManufacturingSystemElement);
			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._StoragePoint__ManufacturingSystemElement.initOperations(_StoragePoint__ManufacturingSystemElement);
			Fragments._StoragePoint__OclAny.initOperations(_StoragePoint__OclAny);
			Fragments._StoragePoint__OclElement.initOperations(_StoragePoint__OclElement);
			Fragments._StoragePoint__StoragePoint.initOperations(_StoragePoint__StoragePoint);

			Fragments._TransportStep__ManufacturingSystemElement.initOperations(_TransportStep__ManufacturingSystemElement);
			Fragments._TransportStep__OclAny.initOperations(_TransportStep__OclAny);
			Fragments._TransportStep__OclElement.initOperations(_TransportStep__OclElement);
			Fragments._TransportStep__Step.initOperations(_TransportStep__Step);
			Fragments._TransportStep__TransportStep.initOperations(_TransportStep__TransportStep);

			Fragments._WorkPiece__OclAny.initOperations(_WorkPiece__OclAny);
			Fragments._WorkPiece__OclElement.initOperations(_WorkPiece__OclElement);
			Fragments._WorkPiece__WorkPiece.initOperations(_WorkPiece__WorkPiece);

			Fragments._WorkPieceCondition__InputCondition.initOperations(_WorkPieceCondition__InputCondition);
			Fragments._WorkPieceCondition__OclAny.initOperations(_WorkPieceCondition__OclAny);
			Fragments._WorkPieceCondition__OclElement.initOperations(_WorkPieceCondition__OclElement);
			Fragments._WorkPieceCondition__WorkPieceCondition.initOperations(_WorkPieceCondition__WorkPieceCondition);

			Fragments._WorkPieceType__OclAny.initOperations(_WorkPieceType__OclAny);
			Fragments._WorkPieceType__OclElement.initOperations(_WorkPieceType__OclElement);
			Fragments._WorkPieceType__WorkPieceType.initOperations(_WorkPieceType__WorkPieceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _BinaryCondition = {
			ManufacturingSystemTables.Properties._BinaryCondition__left,
			ManufacturingSystemTables.Properties._InputCondition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._BinaryCondition__right,
			ManufacturingSystemTables.Properties._BinaryCondition__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BinaryType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CompositeManufacturingStep = {
			ManufacturingSystemTables.Properties._CompositeManufacturingStep__contains,
			ManufacturingSystemTables.Properties._Step__input,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._Step__output,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._Step__speed,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InputCondition = {
			ManufacturingSystemTables.Properties._InputCondition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ManufacturingStep = {
			ManufacturingSystemTables.Properties._Step__input,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._Step__output,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._Step__speed,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ManufacturingSystem = {
			ManufacturingSystemTables.Properties._ManufacturingSystem__consistsOf,
			ManufacturingSystemTables.Properties._ManufacturingSystem__end,
			ManufacturingSystemTables.Properties._ManufacturingSystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._ManufacturingSystem__responsible,
			ManufacturingSystemTables.Properties._ManufacturingSystem__staff,
			ManufacturingSystemTables.Properties._ManufacturingSystem__start,
			ManufacturingSystemTables.Properties._ManufacturingSystem__transforms,
			ManufacturingSystemTables.Properties._ManufacturingSystem__uses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ManufacturingSystemElement = {
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Negation = {
			ManufacturingSystemTables.Properties._Negation__contains,
			ManufacturingSystemTables.Properties._InputCondition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OutputDecision = {
			ManufacturingSystemTables.Properties._OutputDecision__input,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._OutputDecision__outputTypes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QualityAssuranceStep = {
			ManufacturingSystemTables.Properties._Step__input,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._Step__output,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._Step__speed,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Responsible = {
			ManufacturingSystemTables.Properties._Responsible__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			ManufacturingSystemTables.Properties._Step__input,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._Step__output,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._Step__speed,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StoragePoint = {
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._StoragePoint__stores,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransportStep = {
			ManufacturingSystemTables.Properties._Step__input,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._Step__output,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__responsible,
			ManufacturingSystemTables.Properties._Step__speed,
			ManufacturingSystemTables.Properties._ManufacturingSystemElement__transition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkPiece = {
			ManufacturingSystemTables.Properties._WorkPiece__hasType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkPieceCondition = {
			ManufacturingSystemTables.Properties._InputCondition__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ManufacturingSystemTables.Properties._WorkPieceCondition__requiresType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WorkPieceType = {
			ManufacturingSystemTables.Properties._WorkPieceType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BinaryCondition__BinaryCondition.initProperties(_BinaryCondition);
			Fragments._BinaryType__BinaryType.initProperties(_BinaryType);
			Fragments._CompositeManufacturingStep__CompositeManufacturingStep.initProperties(_CompositeManufacturingStep);
			Fragments._InputCondition__InputCondition.initProperties(_InputCondition);
			Fragments._ManufacturingStep__ManufacturingStep.initProperties(_ManufacturingStep);
			Fragments._ManufacturingSystem__ManufacturingSystem.initProperties(_ManufacturingSystem);
			Fragments._ManufacturingSystemElement__ManufacturingSystemElement.initProperties(_ManufacturingSystemElement);
			Fragments._Negation__Negation.initProperties(_Negation);
			Fragments._OutputDecision__OutputDecision.initProperties(_OutputDecision);
			Fragments._QualityAssuranceStep__QualityAssuranceStep.initProperties(_QualityAssuranceStep);
			Fragments._Responsible__Responsible.initProperties(_Responsible);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._StoragePoint__StoragePoint.initProperties(_StoragePoint);
			Fragments._TransportStep__TransportStep.initProperties(_TransportStep);
			Fragments._WorkPiece__WorkPiece.initProperties(_WorkPiece);
			Fragments._WorkPieceCondition__WorkPieceCondition.initProperties(_WorkPieceCondition);
			Fragments._WorkPieceType__WorkPieceType.initProperties(_WorkPieceType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _BinaryType__and = new EcoreExecutorEnumerationLiteral(ManufacturingSystemPackage.Literals.BINARY_TYPE.getEEnumLiteral("and"), Types._BinaryType, 0);
		public static final EcoreExecutorEnumerationLiteral _BinaryType__or = new EcoreExecutorEnumerationLiteral(ManufacturingSystemPackage.Literals.BINARY_TYPE.getEEnumLiteral("or"), Types._BinaryType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _BinaryType = {
			_BinaryType__and,
			_BinaryType__or
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._BinaryType.initLiterals(_BinaryType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ManufacturingSystemTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ManufacturingSystemTables();
	}

	private ManufacturingSystemTables() {
		super(ManufacturingSystemPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		ManufacturingSystemPackage.Literals.STEP
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
