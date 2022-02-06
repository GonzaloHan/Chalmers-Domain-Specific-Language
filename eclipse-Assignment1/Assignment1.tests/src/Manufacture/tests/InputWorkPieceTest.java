/**
 */
package Manufacture.tests;

import Manufacture.InputWorkPiece;
import Manufacture.ManufactureFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputWorkPieceTest extends TestCase {

	/**
	 * The fixture for this Input Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputWorkPiece fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputWorkPieceTest.class);
	}

	/**
	 * Constructs a new Input Work Piece test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputWorkPieceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InputWorkPiece fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input Work Piece test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputWorkPiece getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufactureFactory.eINSTANCE.createInputWorkPiece());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InputWorkPieceTest
