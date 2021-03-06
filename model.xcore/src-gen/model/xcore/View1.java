/**
 */
package model.xcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.xcore.View1#getName <em>Name</em>}</li>
 *   <li>{@link model.xcore.View1#getView1Objects <em>View1 Objects</em>}</li>
 * </ul>
 *
 * @see model.xcore.XcorePackage#getView1()
 * @model
 * @generated
 */
public interface View1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"view 1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.xcore.XcorePackage#getView1_Name()
	 * @model default="view 1" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.xcore.View1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>View1 Objects</b></em>' containment reference list.
	 * The list contents are of type {@link model.xcore.View1Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View1 Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View1 Objects</em>' containment reference list.
	 * @see model.xcore.XcorePackage#getView1_View1Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<View1Object> getView1Objects();

} // View1
