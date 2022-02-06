/**
 */
package manufacturingSystem.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.ManufacturingSystemTables;
import manufacturingSystem.Responsible;

import manufacturingSystem.Step;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ResponsibleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsibleImpl extends MinimalEObjectImpl.Container implements Responsible {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.RESPONSIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.RESPONSIBLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LessThanThreeStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Responsible::LessThanThreeStep";
		try {
			/**
			 *
			 * inv LessThanThreeStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Step.allInstances()
			 *         ->select((responsible = self))
			 *         ->size() <= 3
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ManufacturingSystemPackage.Literals.RESPONSIBLE___LESS_THAN_THREE_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ManufacturingSystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_manufacturingSystem_c_c_Step_0 = idResolver.getClass(ManufacturingSystemTables.CLSSid_Step, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ManufacturingSystemTables.SET_CLSSid_Step, TYP_manufacturingSystem_c_c_Step_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(ManufacturingSystemTables.SET_CLSSid_Step);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Step _1 = (Step)ITERATOR__1.next();
					/**
					 * responsible = self
					 */
					final /*@NonInvalid*/ Responsible responsible = _1.getResponsible();
					final /*@NonInvalid*/ boolean eq = this.equals(responsible);
					//
					if (eq) {
						accumulator.add(_1);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, ManufacturingSystemTables.INT_3).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ManufacturingSystemTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MoreThanOneStep(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Responsible::MoreThanOneStep";
		try {
			/**
			 *
			 * inv MoreThanOneStep:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = Step.allInstances()
			 *         ->select((responsible = self))
			 *         ->size() >= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ManufacturingSystemPackage.Literals.RESPONSIBLE___MORE_THAN_ONE_STEP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ManufacturingSystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_manufacturingSystem_c_c_Step = idResolver.getClass(ManufacturingSystemTables.CLSSid_Step, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ManufacturingSystemTables.SET_CLSSid_Step, TYP_manufacturingSystem_c_c_Step);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(ManufacturingSystemTables.SET_CLSSid_Step);
				Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@NonInvalid*/ SetValue select;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Step _1 = (Step)ITERATOR__1.next();
					/**
					 * responsible = self
					 */
					final /*@NonInvalid*/ Responsible responsible = _1.getResponsible();
					final /*@NonInvalid*/ boolean eq = this.equals(responsible);
					//
					if (eq) {
						accumulator.add(_1);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, ManufacturingSystemTables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ManufacturingSystemTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.RESPONSIBLE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingSystemPackage.RESPONSIBLE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManufacturingSystemPackage.RESPONSIBLE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManufacturingSystemPackage.RESPONSIBLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ManufacturingSystemPackage.RESPONSIBLE___LESS_THAN_THREE_STEP__DIAGNOSTICCHAIN_MAP:
				return LessThanThreeStep((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ManufacturingSystemPackage.RESPONSIBLE___MORE_THAN_ONE_STEP__DIAGNOSTICCHAIN_MAP:
				return MoreThanOneStep((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResponsibleImpl
