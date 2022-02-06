/**
 */
package Manufacture.impl;

import Manufacture.Element;
import Manufacture.ManuSystem;
import Manufacture.ManufacturePackage;
import Manufacture.Responsible;
import Manufacture.Storage;
import Manufacture.WorkPiece;
import Manufacture.WorkPieceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manu System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getManages <em>Manages</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getStarts <em>Starts</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link Manufacture.impl.ManuSystemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManuSystemImpl extends MinimalEObjectImpl.Container implements ManuSystem {
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
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> consistsOf;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsible> manages;

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
	 * The cached value of the '{@link #getStarts() <em>Starts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarts()
	 * @generated
	 * @ordered
	 */
	protected Storage starts;

	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected Storage ends;

	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> owns;

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
	protected ManuSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.MANU_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getTransforms() {
		if (transforms == null) {
			transforms = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturePackage.MANU_SYSTEM__TRANSFORMS);
		}
		return transforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<Element>(Element.class, this, ManufacturePackage.MANU_SYSTEM__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsible> getManages() {
		if (manages == null) {
			manages = new EObjectContainmentEList<Responsible>(Responsible.class, this, ManufacturePackage.MANU_SYSTEM__MANAGES);
		}
		return manages;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.MANU_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.MANU_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getStarts() {
		if (starts != null && starts.eIsProxy()) {
			InternalEObject oldStarts = (InternalEObject)starts;
			starts = (Storage)eResolveProxy(oldStarts);
			if (starts != oldStarts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.MANU_SYSTEM__STARTS, oldStarts, starts));
			}
		}
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetStarts() {
		return starts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarts(Storage newStarts) {
		Storage oldStarts = starts;
		starts = newStarts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.MANU_SYSTEM__STARTS, oldStarts, starts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getEnds() {
		if (ends != null && ends.eIsProxy()) {
			InternalEObject oldEnds = (InternalEObject)ends;
			ends = (Storage)eResolveProxy(oldEnds);
			if (ends != oldEnds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.MANU_SYSTEM__ENDS, oldEnds, ends));
			}
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetEnds() {
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnds(Storage newEnds) {
		Storage oldEnds = ends;
		ends = newEnds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.MANU_SYSTEM__ENDS, oldEnds, ends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPieceType> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentEList<WorkPieceType>(WorkPieceType.class, this, ManufacturePackage.MANU_SYSTEM__OWNS);
		}
		return owns;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.MANU_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
				return ((InternalEList<?>)getTransforms()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
				return ((InternalEList<?>)getConsistsOf()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
				return ((InternalEList<?>)getManages()).basicRemove(otherEnd, msgs);
			case ManufacturePackage.MANU_SYSTEM__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
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
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
				return getTransforms();
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
				return getConsistsOf();
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
				return getManages();
			case ManufacturePackage.MANU_SYSTEM__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case ManufacturePackage.MANU_SYSTEM__STARTS:
				if (resolve) return getStarts();
				return basicGetStarts();
			case ManufacturePackage.MANU_SYSTEM__ENDS:
				if (resolve) return getEnds();
				return basicGetEnds();
			case ManufacturePackage.MANU_SYSTEM__OWNS:
				return getOwns();
			case ManufacturePackage.MANU_SYSTEM__NAME:
				return getName();
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
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				getTransforms().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends Element>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
				getManages().clear();
				getManages().addAll((Collection<? extends Responsible>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__STARTS:
				setStarts((Storage)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__ENDS:
				setEnds((Storage)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends WorkPieceType>)newValue);
				return;
			case ManufacturePackage.MANU_SYSTEM__NAME:
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
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
				getManages().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)null);
				return;
			case ManufacturePackage.MANU_SYSTEM__STARTS:
				setStarts((Storage)null);
				return;
			case ManufacturePackage.MANU_SYSTEM__ENDS:
				setEnds((Storage)null);
				return;
			case ManufacturePackage.MANU_SYSTEM__OWNS:
				getOwns().clear();
				return;
			case ManufacturePackage.MANU_SYSTEM__NAME:
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
			case ManufacturePackage.MANU_SYSTEM__TRANSFORMS:
				return transforms != null && !transforms.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__MANAGES:
				return manages != null && !manages.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__RESPONSIBLE:
				return responsible != null;
			case ManufacturePackage.MANU_SYSTEM__STARTS:
				return starts != null;
			case ManufacturePackage.MANU_SYSTEM__ENDS:
				return ends != null;
			case ManufacturePackage.MANU_SYSTEM__OWNS:
				return owns != null && !owns.isEmpty();
			case ManufacturePackage.MANU_SYSTEM__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ManuSystemImpl
