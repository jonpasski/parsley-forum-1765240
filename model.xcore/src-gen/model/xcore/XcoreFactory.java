/**
 */
package model.xcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.xcore.XcorePackage
 * @generated
 */
public interface XcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcoreFactory eINSTANCE = model.xcore.impl.XcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View1</em>'.
	 * @generated
	 */
	View1 createView1();

	/**
	 * Returns a new object of class '<em>View1 Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View1 Object</em>'.
	 * @generated
	 */
	View1Object createView1Object();

	/**
	 * Returns a new object of class '<em>View2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View2</em>'.
	 * @generated
	 */
	View2 createView2();

	/**
	 * Returns a new object of class '<em>View2 Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View2 Object</em>'.
	 * @generated
	 */
	View2Object createView2Object();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XcorePackage getXcorePackage();

} //XcoreFactory
