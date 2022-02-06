/**
 */
package manufacturingSystem;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.Responsible#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getResponsible()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MoreThanOneStep'"
 * @generated
 */
public interface Responsible extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getResponsible_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link manufacturingSystem.Responsible#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Step.allInstances()-&gt;select(responsible=self) -&gt; size() &lt;= 3'"
	 * @generated
	 */
	boolean LessThanThreeStep(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Step.allInstances()-&gt;select(responsible=self) -&gt; size() &gt;= 1'"
	 * @generated
	 */
	boolean MoreThanOneStep(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Responsible
