/**
 */
package model.xcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.xcore.XcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='example' basePackage='model'"
 * @generated
 */
public interface XcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "model.xcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcorePackage eINSTANCE = model.xcore.impl.XcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link model.xcore.impl.View1Impl <em>View1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.xcore.impl.View1Impl
	 * @see model.xcore.impl.XcorePackageImpl#getView1()
	 * @generated
	 */
	int VIEW1 = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__NAME = 0;

	/**
	 * The feature id for the '<em><b>View1 Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__VIEW1_OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.xcore.impl.View1ObjectImpl <em>View1 Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.xcore.impl.View1ObjectImpl
	 * @see model.xcore.impl.XcorePackageImpl#getView1Object()
	 * @generated
	 */
	int VIEW1_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>View1 Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View1 Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.xcore.impl.View2Impl <em>View2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.xcore.impl.View2Impl
	 * @see model.xcore.impl.XcorePackageImpl#getView2()
	 * @generated
	 */
	int VIEW2 = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__NAME = 0;

	/**
	 * The feature id for the '<em><b>View2 Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__VIEW2_OBJECTS = 1;

	/**
	 * The number of structural features of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.xcore.impl.View2ObjectImpl <em>View2 Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.xcore.impl.View2ObjectImpl
	 * @see model.xcore.impl.XcorePackageImpl#getView2Object()
	 * @generated
	 */
	int VIEW2_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>View2 Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View2 Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.xcore.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View1</em>'.
	 * @see model.xcore.View1
	 * @generated
	 */
	EClass getView1();

	/**
	 * Returns the meta object for the attribute '{@link model.xcore.View1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.xcore.View1#getName()
	 * @see #getView1()
	 * @generated
	 */
	EAttribute getView1_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.xcore.View1#getView1Objects <em>View1 Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View1 Objects</em>'.
	 * @see model.xcore.View1#getView1Objects()
	 * @see #getView1()
	 * @generated
	 */
	EReference getView1_View1Objects();

	/**
	 * Returns the meta object for class '{@link model.xcore.View1Object <em>View1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View1 Object</em>'.
	 * @see model.xcore.View1Object
	 * @generated
	 */
	EClass getView1Object();

	/**
	 * Returns the meta object for the attribute '{@link model.xcore.View1Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.xcore.View1Object#getName()
	 * @see #getView1Object()
	 * @generated
	 */
	EAttribute getView1Object_Name();

	/**
	 * Returns the meta object for class '{@link model.xcore.View2 <em>View2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View2</em>'.
	 * @see model.xcore.View2
	 * @generated
	 */
	EClass getView2();

	/**
	 * Returns the meta object for the attribute '{@link model.xcore.View2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.xcore.View2#getName()
	 * @see #getView2()
	 * @generated
	 */
	EAttribute getView2_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link model.xcore.View2#getView2Objects <em>View2 Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View2 Objects</em>'.
	 * @see model.xcore.View2#getView2Objects()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_View2Objects();

	/**
	 * Returns the meta object for class '{@link model.xcore.View2Object <em>View2 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View2 Object</em>'.
	 * @see model.xcore.View2Object
	 * @generated
	 */
	EClass getView2Object();

	/**
	 * Returns the meta object for the attribute '{@link model.xcore.View2Object#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.xcore.View2Object#getName()
	 * @see #getView2Object()
	 * @generated
	 */
	EAttribute getView2Object_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcoreFactory getXcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.xcore.impl.View1Impl <em>View1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.xcore.impl.View1Impl
		 * @see model.xcore.impl.XcorePackageImpl#getView1()
		 * @generated
		 */
		EClass VIEW1 = eINSTANCE.getView1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW1__NAME = eINSTANCE.getView1_Name();

		/**
		 * The meta object literal for the '<em><b>View1 Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW1__VIEW1_OBJECTS = eINSTANCE.getView1_View1Objects();

		/**
		 * The meta object literal for the '{@link model.xcore.impl.View1ObjectImpl <em>View1 Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.xcore.impl.View1ObjectImpl
		 * @see model.xcore.impl.XcorePackageImpl#getView1Object()
		 * @generated
		 */
		EClass VIEW1_OBJECT = eINSTANCE.getView1Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW1_OBJECT__NAME = eINSTANCE.getView1Object_Name();

		/**
		 * The meta object literal for the '{@link model.xcore.impl.View2Impl <em>View2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.xcore.impl.View2Impl
		 * @see model.xcore.impl.XcorePackageImpl#getView2()
		 * @generated
		 */
		EClass VIEW2 = eINSTANCE.getView2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW2__NAME = eINSTANCE.getView2_Name();

		/**
		 * The meta object literal for the '<em><b>View2 Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__VIEW2_OBJECTS = eINSTANCE.getView2_View2Objects();

		/**
		 * The meta object literal for the '{@link model.xcore.impl.View2ObjectImpl <em>View2 Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.xcore.impl.View2ObjectImpl
		 * @see model.xcore.impl.XcorePackageImpl#getView2Object()
		 * @generated
		 */
		EClass VIEW2_OBJECT = eINSTANCE.getView2Object();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW2_OBJECT__NAME = eINSTANCE.getView2Object_Name();

	}

} //XcorePackage
