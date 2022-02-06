/**
 */
package Manufacture.tests;

import Manufacture.ManufactureFactory;
import Manufacture.UniCon;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uni Con</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniConTest extends InputConditionerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniConTest.class);
	}

	/**
	 * Constructs a new Uni Con test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniConTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uni Con test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UniCon getFixture() {
		return (UniCon)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufactureFactory.eINSTANCE.createUniCon());
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

} //UniConTest
