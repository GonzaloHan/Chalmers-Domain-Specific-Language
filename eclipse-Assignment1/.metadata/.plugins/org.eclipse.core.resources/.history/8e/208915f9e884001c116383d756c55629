/**
 */
package Manufacture.util;

import Manufacture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Manufacture.ManufacturePackage
 * @generated
 */
public class ManufactureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufactureSwitch() {
		if (modelPackage == null) {
			modelPackage = ManufacturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ManufacturePackage.MANU_SYSTEM: {
				ManuSystem manuSystem = (ManuSystem)theEObject;
				T result = caseManuSystem(manuSystem);
				if (result == null) result = caseNamedElement(manuSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.WORK_PIECE: {
				WorkPiece workPiece = (WorkPiece)theEObject;
				T result = caseWorkPiece(workPiece);
				if (result == null) result = caseUsable(workPiece);
				if (result == null) result = caseNamedElement(workPiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.INTERMEDIATE_PRODUCT: {
				IntermediateProduct intermediateProduct = (IntermediateProduct)theEObject;
				T result = caseIntermediateProduct(intermediateProduct);
				if (result == null) result = caseUsable(intermediateProduct);
				if (result == null) result = caseNamedElement(intermediateProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.USABLE: {
				Usable usable = (Usable)theEObject;
				T result = caseUsable(usable);
				if (result == null) result = caseNamedElement(usable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.HIERARCHY_STEP: {
				HierarchyStep hierarchyStep = (HierarchyStep)theEObject;
				T result = caseHierarchyStep(hierarchyStep);
				if (result == null) result = caseStep(hierarchyStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.MANU_STEP: {
				ManuStep manuStep = (ManuStep)theEObject;
				T result = caseManuStep(manuStep);
				if (result == null) result = caseStep(manuStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.TRANS_STEP: {
				TransStep transStep = (TransStep)theEObject;
				T result = caseTransStep(transStep);
				if (result == null) result = caseStep(transStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.QA_STEP: {
				QAStep qaStep = (QAStep)theEObject;
				T result = caseQAStep(qaStep);
				if (result == null) result = caseStep(qaStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.MATERIAL_CONDITIONER: {
				MaterialConditioner materialConditioner = (MaterialConditioner)theEObject;
				T result = caseMaterialConditioner(materialConditioner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.BI_CON: {
				BiCon biCon = (BiCon)theEObject;
				T result = caseBiCon(biCon);
				if (result == null) result = caseMaterialConditioner(biCon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturePackage.UNI_CON: {
				UniCon uniCon = (UniCon)theEObject;
				T result = caseUniCon(uniCon);
				if (result == null) result = caseMaterialConditioner(uniCon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manu System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manu System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManuSystem(ManuSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPiece(WorkPiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateProduct(IntermediateProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsable(Usable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchyStep(HierarchyStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manu Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manu Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManuStep(ManuStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransStep(TransStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QA Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QA Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAStep(QAStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Conditioner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Conditioner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialConditioner(MaterialConditioner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Con</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Con</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiCon(BiCon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Con</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Con</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniCon(UniCon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ManufactureSwitch
