/**
 */
package manufacturingSystem.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>manufacturingSystem</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingSystemTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ManufacturingSystemTests("manufacturingSystem Tests");
		suite.addTestSuite(ManufacturingStepTest.class);
		suite.addTestSuite(ManufacturingSystemTest.class);
		suite.addTestSuite(TransportStepTest.class);
		suite.addTestSuite(QualityAssuranceStepTest.class);
		suite.addTestSuite(ResponsibleTest.class);
		suite.addTestSuite(CompositeManufacturingStepTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemTests(String name) {
		super(name);
	}

} //ManufacturingSystemTests
