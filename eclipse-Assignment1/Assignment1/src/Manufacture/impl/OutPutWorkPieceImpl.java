/**
 */
package Manufacture.impl;

import Manufacture.InputWorkPiece;
import Manufacture.ManufacturePackage;
import Manufacture.OutPutWorkPiece;
import Manufacture.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Put Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Manufacture.impl.OutPutWorkPieceImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link Manufacture.impl.OutPutWorkPieceImpl#getName <em>Name</em>}</li>
 *   <li>{@link Manufacture.impl.OutPutWorkPieceImpl#getInputSelect <em>Input Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutPutWorkPieceImpl extends MinimalEObjectImpl.Container implements OutPutWorkPiece {
	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected WorkPieceType outputType;

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
	 * The cached value of the '{@link #getInputSelect() <em>Input Select</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSelect()
	 * @generated
	 * @ordered
	 */
	protected InputWorkPiece inputSelect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPutWorkPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturePackage.Literals.OUT_PUT_WORK_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType getOutputType() {
		if (outputType != null && outputType.eIsProxy()) {
			InternalEObject oldOutputType = (InternalEObject)outputType;
			outputType = (WorkPieceType)eResolveProxy(oldOutputType);
			if (outputType != oldOutputType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE, oldOutputType, outputType));
			}
		}
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType basicGetOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(WorkPieceType newOutputType) {
		WorkPieceType oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE, oldOutputType, outputType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.OUT_PUT_WORK_PIECE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWorkPiece getInputSelect() {
		if (inputSelect != null && inputSelect.eIsProxy()) {
			InternalEObject oldInputSelect = (InternalEObject)inputSelect;
			inputSelect = (InputWorkPiece)eResolveProxy(oldInputSelect);
			if (inputSelect != oldInputSelect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT, oldInputSelect, inputSelect));
			}
		}
		return inputSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWorkPiece basicGetInputSelect() {
		return inputSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSelect(InputWorkPiece newInputSelect) {
		InputWorkPiece oldInputSelect = inputSelect;
		inputSelect = newInputSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT, oldInputSelect, inputSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE:
				if (resolve) return getOutputType();
				return basicGetOutputType();
			case ManufacturePackage.OUT_PUT_WORK_PIECE__NAME:
				return getName();
			case ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT:
				if (resolve) return getInputSelect();
				return basicGetInputSelect();
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
			case ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE:
				setOutputType((WorkPieceType)newValue);
				return;
			case ManufacturePackage.OUT_PUT_WORK_PIECE__NAME:
				setName((String)newValue);
				return;
			case ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT:
				setInputSelect((InputWorkPiece)newValue);
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
			case ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE:
				setOutputType((WorkPieceType)null);
				return;
			case ManufacturePackage.OUT_PUT_WORK_PIECE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT:
				setInputSelect((InputWorkPiece)null);
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
			case ManufacturePackage.OUT_PUT_WORK_PIECE__OUTPUT_TYPE:
				return outputType != null;
			case ManufacturePackage.OUT_PUT_WORK_PIECE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturePackage.OUT_PUT_WORK_PIECE__INPUT_SELECT:
				return inputSelect != null;
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

} //OutPutWorkPieceImpl
