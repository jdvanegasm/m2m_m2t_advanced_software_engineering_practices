/**
 */
package miEmpresa.impl;

import miEmpresa.*;

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
public class MiEmpresaFactoryImpl extends EFactoryImpl implements MiEmpresaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiEmpresaFactory init() {
		try {
			MiEmpresaFactory theMiEmpresaFactory = (MiEmpresaFactory) EPackage.Registry.INSTANCE
					.getEFactory(MiEmpresaPackage.eNS_URI);
			if (theMiEmpresaFactory != null) {
				return theMiEmpresaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiEmpresaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiEmpresaFactoryImpl() {
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
		case MiEmpresaPackage.DESARROLLADOR:
			return createDesarrollador();
		case MiEmpresaPackage.GERENTE:
			return createGerente();
		case MiEmpresaPackage.EMPRESA:
			return createEmpresa();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Desarrollador createDesarrollador() {
		DesarrolladorImpl desarrollador = new DesarrolladorImpl();
		return desarrollador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gerente createGerente() {
		GerenteImpl gerente = new GerenteImpl();
		return gerente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Empresa createEmpresa() {
		EmpresaImpl empresa = new EmpresaImpl();
		return empresa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiEmpresaPackage getMiEmpresaPackage() {
		return (MiEmpresaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiEmpresaPackage getPackage() {
		return MiEmpresaPackage.eINSTANCE;
	}

} //MiEmpresaFactoryImpl
