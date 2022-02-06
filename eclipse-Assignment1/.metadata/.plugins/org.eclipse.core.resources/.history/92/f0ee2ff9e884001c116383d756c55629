/**
 */
package Manufacture.impl;

import Manufacture.IntermediateProduct;
import Manufacture.ManufacturePackage;
import Manufacture.MaterialConditioner;
import Manufacture.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.StepImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link Manufacture.impl.StepImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link Manufacture.impl.StepImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link Manufacture.impl.StepImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected IntermediateProduct produces;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected float speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected String person = PERSON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialConditioner> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateProduct getProduces() {
		if (produces != null && produces.eIsProxy()) {
			InternalEObject oldProduces = (InternalEObject)produces;
			produces = (IntermediateProduct)eResolveProxy(oldProduces);
			if (produces != oldProduces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.STEP__PRODUCES, oldProduces, produces));
			}
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateProduct basicGetProduces() {
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduces(IntermediateProduct newProduces) {
		IntermediateProduct oldProduces = produces;
		produces = newProduces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.STEP__PRODUCES, oldProduces, produces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		float oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.STEP__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(String newPerson) {
		String oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.STEP__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialConditioner> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<MaterialConditioner>(MaterialConditioner.class, this, ManufacturePackage.STEP__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.STEP__PRODUCES:
				if (resolve) return getProduces();
				return basicGetProduces();
			case ManufacturePackage.STEP__SPEED:
				return getSpeed();
			case ManufacturePackage.STEP__PERSON:
				return getPerson();
			case ManufacturePackage.STEP__USES:
				return getUses();
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
			case ManufacturePackage.STEP__PRODUCES:
				setProduces((IntermediateProduct)newValue);
				return;
			case ManufacturePackage.STEP__SPEED:
				setSpeed((Float)newValue);
				return;
			case ManufacturePackage.STEP__PERSON:
				setPerson((String)newValue);
				return;
			case ManufacturePackage.STEP__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends MaterialConditioner>)newValue);
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
			case ManufacturePackage.STEP__PRODUCES:
				setProduces((IntermediateProduct)null);
				return;
			case ManufacturePackage.STEP__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case ManufacturePackage.STEP__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case ManufacturePackage.STEP__USES:
				getUses().clear();
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
			case ManufacturePackage.STEP__PRODUCES:
				return produces != null;
			case ManufacturePackage.STEP__SPEED:
				return speed != SPEED_EDEFAULT;
			case ManufacturePackage.STEP__PERSON:
				return PERSON_EDEFAULT == null ? person != null : !PERSON_EDEFAULT.equals(person);
			case ManufacturePackage.STEP__USES:
				return uses != null && !uses.isEmpty();
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", person: ");
		result.append(person);
		result.append(')');
		return result.toString();
	}

} //StepImpl
