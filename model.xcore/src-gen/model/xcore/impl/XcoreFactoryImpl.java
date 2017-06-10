/**
 */
package model.xcore.impl;

import model.xcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcoreFactoryImpl extends EFactoryImpl implements XcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcoreFactory init() {
		try {
			XcoreFactory theXcoreFactory = (XcoreFactory)EPackage.Registry.INSTANCE.getEFactory(XcorePackage.eNS_URI);
			if (theXcoreFactory != null) {
				return theXcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XcorePackage.VIEW1: return createView1();
			case XcorePackage.VIEW1_OBJECT: return createView1Object();
			case XcorePackage.VIEW2: return createView2();
			case XcorePackage.VIEW2_OBJECT: return createView2Object();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View1 createView1() {
		View1Impl view1 = new View1Impl();
		return view1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View1Object createView1Object() {
		View1ObjectImpl view1Object = new View1ObjectImpl();
		return view1Object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View2 createView2() {
		View2Impl view2 = new View2Impl();
		return view2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View2Object createView2Object() {
		View2ObjectImpl view2Object = new View2ObjectImpl();
		return view2Object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcorePackage getXcorePackage() {
		return (XcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcorePackage getPackage() {
		return XcorePackage.eINSTANCE;
	}

} //XcoreFactoryImpl
