/**
 */
package manufacturingSystem.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemElement;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.ManufacturingSystemTables;
import manufacturingSystem.Responsible;
import manufacturingSystem.StoragePoint;
import manufacturingSystem.WorkPiece;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacturing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStart <em>Start</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getEnd <em>End</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingSystemImpl extends MinimalEObjectImpl.Container implements ManufacturingSystem {
	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturingSystemElement> consistsOf;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<StoragePoint> start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<StoragePoint> end;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> uses;

	/**
	 * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> transforms;

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
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Responsible responsible;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsible> staff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManufacturingSystemElement> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<ManufacturingSystemElement>(ManufacturingSystemElement.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoragePoint> getStart() {
		if (start == null) {
			start = new EObjectResolvingEList<StoragePoint>(StoragePoint.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoragePoint> getEnd() {
		if (end == null) {
			end = new EObjectResolvingEList<StoragePoint>(StoragePoint.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPieceType> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<WorkPieceType>(WorkPieceType.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getTransforms() {
		if (transforms == null) {
			transforms = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS);
		}
		return transforms;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Responsible)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(Responsible newResponsible) {
		Responsible oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsible> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Responsible>(Responsible.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoInTransition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ManufacturingSystem::NoInTransition";
		try {
			/**
			 *
			 * inv NoInTransition:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.consistsOf.transition->includes(self.start)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM___NO_IN_TRANSITION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ManufacturingSystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<ManufacturingSystemElement> consistsOf = this.getConsistsOf();
				final /*@NonInvalid*/ OrderedSetValue BOXED_consistsOf = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_ManufacturingSystemElement, consistsOf);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(ManufacturingSystemTables.SEQ_CLSSid_ManufacturingSystemElement);
				Iterator<Object> ITERATOR__1 = BOXED_consistsOf.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ ManufacturingSystemElement _1 = (ManufacturingSystemElement)ITERATOR__1.next();
					/**
					 * transition
					 */
					final /*@NonInvalid*/ List<ManufacturingSystemElement> transition = _1.getTransition();
					final /*@NonInvalid*/ OrderedSetValue BOXED_transition = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_ManufacturingSystemElement, transition);
					//
					for (Object value : BOXED_transition.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@NonInvalid*/ List<StoragePoint> start = this.getStart();
				final /*@NonInvalid*/ OrderedSetValue BOXED_start = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_StoragePoint, start);
				final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, BOXED_start).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!includes) {
					result = ValueUtil.TRUE_VALUE;
				}
				else {
					if (includes) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = null;
					}
				}
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
	public boolean NotTheSame(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ManufacturingSystem::NotTheSame";
		try {
			/**
			 *
			 * inv NotTheSame:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.consistsOf.responsible->includes(self.responsible)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM___NOT_THE_SAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ManufacturingSystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_includes;
					try {
						final /*@NonInvalid*/ List<ManufacturingSystemElement> consistsOf = this.getConsistsOf();
						final /*@NonInvalid*/ OrderedSetValue BOXED_consistsOf = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_ManufacturingSystemElement, consistsOf);
						/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(ManufacturingSystemTables.SEQ_CLSSid_Responsible);
						Iterator<Object> ITERATOR__1 = BOXED_consistsOf.iterator();
						/*@Thrown*/ SequenceValue collect;
						while (true) {
							if (!ITERATOR__1.hasNext()) {
								collect = accumulator;
								break;
							}
							/*@NonInvalid*/ ManufacturingSystemElement _1 = (ManufacturingSystemElement)ITERATOR__1.next();
							/**
							 * responsible
							 */
							final /*@NonInvalid*/ Responsible responsible = _1.getResponsible();
							//
							accumulator.add(responsible);
						}
						final /*@NonInvalid*/ Responsible responsible_0 = this.getResponsible();
						final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, responsible_0).booleanValue();
						CAUGHT_includes = includes;
					}
					catch (Exception e) {
						CAUGHT_includes = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_includes instanceof InvalidValueException) {
						throw (InvalidValueException)CAUGHT_includes;
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_includes == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						if (CAUGHT_includes == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							result = null;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ManufacturingSystemTables.INT_0).booleanValue();
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
	public boolean NoOutTransition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ManufacturingSystem::NoOutTransition";
		try {
			/**
			 *
			 * inv NoOutTransition:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.end.transition->size() = 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM___NO_OUT_TRANSITION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ManufacturingSystemTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<StoragePoint> end = this.getEnd();
				final /*@NonInvalid*/ OrderedSetValue BOXED_end = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_StoragePoint, end);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(ManufacturingSystemTables.SEQ_CLSSid_ManufacturingSystemElement);
				Iterator<Object> ITERATOR__1 = BOXED_end.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ StoragePoint _1 = (StoragePoint)ITERATOR__1.next();
					/**
					 * transition
					 */
					final /*@NonInvalid*/ List<ManufacturingSystemElement> transition = _1.getTransition();
					final /*@NonInvalid*/ OrderedSetValue BOXED_transition = idResolver.createOrderedSetOfAll(ManufacturingSystemTables.ORD_CLSSid_ManufacturingSystemElement, transition);
					//
					for (Object value : BOXED_transition.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(collect);
				final /*@NonInvalid*/ boolean result = size.equals(ManufacturingSystemTables.INT_0);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return ((InternalEList<?>)getConsistsOf()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return ((InternalEList<?>)getTransforms()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return getConsistsOf();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				return getStart();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				return getEnd();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return getUses();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return getTransforms();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				return getName();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return getStaff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends ManufacturingSystemElement>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				getStart().clear();
				getStart().addAll((Collection<? extends StoragePoint>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends StoragePoint>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends WorkPieceType>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				getTransforms().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Responsible>)newValue);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				getStart().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				getEnd().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				getUses().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)null);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				getStaff().clear();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				return start != null && !start.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				return end != null && !end.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return uses != null && !uses.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return transforms != null && !transforms.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				return responsible != null;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return staff != null && !staff.isEmpty();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM___NO_IN_TRANSITION__DIAGNOSTICCHAIN_MAP:
				return NoInTransition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM___NOT_THE_SAME__DIAGNOSTICCHAIN_MAP:
				return NotTheSame((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM___NO_OUT_TRANSITION__DIAGNOSTICCHAIN_MAP:
				return NoOutTransition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //ManufacturingSystemImpl
