/**
 */
package Manufacture.impl;

import Manufacture.ManufacturePackage;
import Manufacture.UniCon;
import Manufacture.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Con</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.UniConImpl#isUniStatus <em>Uni Status</em>}</li>
 *   <li>{@link Manufacture.impl.UniConImpl#getSelectOne <em>Select One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniConImpl extends InputConditionerImpl implements UniCon {
	/**
	 * The default value of the '{@link #isUniStatus() <em>Uni Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNI_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniStatus() <em>Uni Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean uniStatus = UNI_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectOne() <em>Select One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectOne()
	 * @generated
	 * @ordered
	 */
	protected WorkPieceType selectOne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniConImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.UNI_CON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniStatus() {
		return uniStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniStatus(boolean newUniStatus) {
		boolean oldUniStatus = uniStatus;
		uniStatus = newUniStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.UNI_CON__UNI_STATUS, oldUniStatus, uniStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType getSelectOne() {
		if (selectOne != null && selectOne.eIsProxy()) {
			InternalEObject oldSelectOne = (InternalEObject)selectOne;
			selectOne = (WorkPieceType)eResolveProxy(oldSelectOne);
			if (selectOne != oldSelectOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.UNI_CON__SELECT_ONE, oldSelectOne, selectOne));
			}
		}
		return selectOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType basicGetSelectOne() {
		return selectOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectOne(WorkPieceType newSelectOne) {
		WorkPieceType oldSelectOne = selectOne;
		selectOne = newSelectOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.UNI_CON__SELECT_ONE, oldSelectOne, selectOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.UNI_CON__UNI_STATUS:
				return isUniStatus();
			case ManufacturePackage.UNI_CON__SELECT_ONE:
				if (resolve) return getSelectOne();
				return basicGetSelectOne();
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
			case ManufacturePackage.UNI_CON__UNI_STATUS:
				setUniStatus((Boolean)newValue);
				return;
			case ManufacturePackage.UNI_CON__SELECT_ONE:
				setSelectOne((WorkPieceType)newValue);
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
			case ManufacturePackage.UNI_CON__UNI_STATUS:
				setUniStatus(UNI_STATUS_EDEFAULT);
				return;
			case ManufacturePackage.UNI_CON__SELECT_ONE:
				setSelectOne((WorkPieceType)null);
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
			case ManufacturePackage.UNI_CON__UNI_STATUS:
				return uniStatus != UNI_STATUS_EDEFAULT;
			case ManufacturePackage.UNI_CON__SELECT_ONE:
				return selectOne != null;
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
		result.append(" (UniStatus: ");
		result.append(uniStatus);
		result.append(')');
		return result.toString();
	}

} //UniConImpl
