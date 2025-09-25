/**
 */
package miEmpresa.impl;

import miEmpresa.Desarrollador;
import miEmpresa.Empleado;
import miEmpresa.Empresa;
import miEmpresa.Gerente;
import miEmpresa.MiEmpresaFactory;
import miEmpresa.MiEmpresaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiEmpresaPackageImpl extends EPackageImpl implements MiEmpresaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desarrolladorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gerenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empleadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empresaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see miEmpresa.MiEmpresaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiEmpresaPackageImpl() {
		super(eNS_URI, MiEmpresaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MiEmpresaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiEmpresaPackage init() {
		if (isInited)
			return (MiEmpresaPackage) EPackage.Registry.INSTANCE.getEPackage(MiEmpresaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMiEmpresaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MiEmpresaPackageImpl theMiEmpresaPackage = registeredMiEmpresaPackage instanceof MiEmpresaPackageImpl
				? (MiEmpresaPackageImpl) registeredMiEmpresaPackage
				: new MiEmpresaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMiEmpresaPackage.createPackageContents();

		// Initialize created meta-data
		theMiEmpresaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiEmpresaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiEmpresaPackage.eNS_URI, theMiEmpresaPackage);
		return theMiEmpresaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesarrollador() {
		return desarrolladorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesarrollador_LenguajePrincipal() {
		return (EAttribute) desarrolladorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGerente() {
		return gerenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGerente_Equipo() {
		return (EReference) gerenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmpleado() {
		return empleadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_Id() {
		return (EAttribute) empleadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpleado_Nombre() {
		return (EAttribute) empleadoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmpresa() {
		return empresaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmpresa_ListaEmpleados() {
		return (EReference) empresaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MiEmpresaFactory getMiEmpresaFactory() {
		return (MiEmpresaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		desarrolladorEClass = createEClass(DESARROLLADOR);
		createEAttribute(desarrolladorEClass, DESARROLLADOR__LENGUAJE_PRINCIPAL);

		gerenteEClass = createEClass(GERENTE);
		createEReference(gerenteEClass, GERENTE__EQUIPO);

		empleadoEClass = createEClass(EMPLEADO);
		createEAttribute(empleadoEClass, EMPLEADO__ID);
		createEAttribute(empleadoEClass, EMPLEADO__NOMBRE);

		empresaEClass = createEClass(EMPRESA);
		createEReference(empresaEClass, EMPRESA__LISTA_EMPLEADOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		desarrolladorEClass.getESuperTypes().add(this.getEmpleado());
		gerenteEClass.getESuperTypes().add(this.getEmpleado());

		// Initialize classes, features, and operations; add parameters
		initEClass(desarrolladorEClass, Desarrollador.class, "Desarrollador", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesarrollador_LenguajePrincipal(), ecorePackage.getEString(), "lenguajePrincipal", null, 0, 1,
				Desarrollador.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(gerenteEClass, Gerente.class, "Gerente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGerente_Equipo(), this.getDesarrollador(), null, "equipo", null, 0, -1, Gerente.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empleadoEClass, Empleado.class, "Empleado", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpleado_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Empleado.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmpleado_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Empleado.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(empresaEClass, Empresa.class, "Empresa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmpresa_ListaEmpleados(), this.getEmpleado(), null, "listaEmpleados", null, 0, -1,
				Empresa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MiEmpresaPackageImpl
