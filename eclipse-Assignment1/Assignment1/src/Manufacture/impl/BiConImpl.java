/**
 */
package Manufacture.impl;

import Manufacture.BiCon;
import Manufacture.BiType;
import Manufacture.ManufacturePackage;
import Manufacture.WorkPieceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bi Con</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.BiConImpl#getBiStatus <em>Bi Status</em>}</li>
 *   <li>{@link Manufacture.impl.BiConImpl#getSelectTwo <em>Select Two</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiConImpl extends InputConditionerImpl implements BiCon {
	/**
	 * The default value of the '{@link #getBiStatus() <em>Bi Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiStatus()
	 * @generated
	 * @ordered
	 */
	protected static final BiType BI_STATUS_EDEFAULT = BiType.AND;

	/**
	 * The cached value of the '{@link #getBiStatus() <em>Bi Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiStatus()
	 * @generated
	 * @ordered
	 */
	protected BiType biStatus = BI_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectTwo() <em>Select Two</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectTwo()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> selectTwo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiConImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.BI_CON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiType getBiStatus() {
		return biStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiStatus(BiType newBiStatus) {
		BiType oldBiStatus = biStatus;
		biStatus = newBiStatus == null ? BI_STATUS_EDEFAULT : newBiStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.BI_CON__BI_STATUS, oldBiStatus, biStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPieceType> getSelectTwo() {
		if (selectTwo == null) {
			selectTwo = new EObjectResolvingEList<WorkPieceType>(WorkPieceType.class, this, ManufacturePackage.BI_CON__SELECT_TWO);
		}
		return selectTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.BI_CON__BI_STATUS:
				return getBiStatus();
			case ManufacturePackage.BI_CON__SELECT_TWO:
				return getSelectTwo();
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
			case ManufacturePackage.BI_CON__BI_STATUS:
				setBiStatus((BiType)newValue);
				return;
			case ManufacturePackage.BI_CON__SELECT_TWO:
				getSelectTwo().clear();
				getSelectTwo().addAll((Collection<? extends WorkPieceType>)newValue);
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
			case ManufacturePackage.BI_CON__BI_STATUS:
				setBiStatus(BI_STATUS_EDEFAULT);
				return;
			case ManufacturePackage.BI_CON__SELECT_TWO:
				getSelectTwo().clear();
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
			case ManufacturePackage.BI_CON__BI_STATUS:
				return biStatus != BI_STATUS_EDEFAULT;
			case ManufacturePackage.BI_CON__SELECT_TWO:
				return selectTwo != null && !selectTwo.isEmpty();
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
		result.append(" (BiStatus: ");
		result.append(biStatus);
		result.append(')');
		return result.toString();
	}

} //BiConImpl
