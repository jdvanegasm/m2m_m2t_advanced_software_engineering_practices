/**
 */
package miEmpresa;

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
 * @see miEmpresa.MiEmpresaFactory
 * @model kind="package"
 * @generated
 */
public interface MiEmpresaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "miEmpresa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/miEmpresa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "miEmpresa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiEmpresaPackage eINSTANCE = miEmpresa.impl.MiEmpresaPackageImpl.init();

	/**
	 * The meta object id for the '{@link miEmpresa.impl.EmpleadoImpl <em>Empleado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miEmpresa.impl.EmpleadoImpl
	 * @see miEmpresa.impl.MiEmpresaPackageImpl#getEmpleado()
	 * @generated
	 */
	int EMPLEADO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Empleado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLEADO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link miEmpresa.impl.DesarrolladorImpl <em>Desarrollador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miEmpresa.impl.DesarrolladorImpl
	 * @see miEmpresa.impl.MiEmpresaPackageImpl#getDesarrollador()
	 * @generated
	 */
	int DESARROLLADOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESARROLLADOR__ID = EMPLEADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESARROLLADOR__NOMBRE = EMPLEADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Lenguaje Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESARROLLADOR__LENGUAJE_PRINCIPAL = EMPLEADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Desarrollador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESARROLLADOR_FEATURE_COUNT = EMPLEADO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Desarrollador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESARROLLADOR_OPERATION_COUNT = EMPLEADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miEmpresa.impl.GerenteImpl <em>Gerente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miEmpresa.impl.GerenteImpl
	 * @see miEmpresa.impl.MiEmpresaPackageImpl#getGerente()
	 * @generated
	 */
	int GERENTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERENTE__ID = EMPLEADO__ID;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERENTE__NOMBRE = EMPLEADO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Equipo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERENTE__EQUIPO = EMPLEADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gerente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERENTE_FEATURE_COUNT = EMPLEADO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gerente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERENTE_OPERATION_COUNT = EMPLEADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link miEmpresa.impl.EmpresaImpl <em>Empresa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see miEmpresa.impl.EmpresaImpl
	 * @see miEmpresa.impl.MiEmpresaPackageImpl#getEmpresa()
	 * @generated
	 */
	int EMPRESA = 3;

	/**
	 * The feature id for the '<em><b>Lista Empleados</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA__LISTA_EMPLEADOS = 0;

	/**
	 * The number of structural features of the '<em>Empresa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Empresa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESA_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link miEmpresa.Desarrollador <em>Desarrollador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desarrollador</em>'.
	 * @see miEmpresa.Desarrollador
	 * @generated
	 */
	EClass getDesarrollador();

	/**
	 * Returns the meta object for the attribute '{@link miEmpresa.Desarrollador#getLenguajePrincipal <em>Lenguaje Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lenguaje Principal</em>'.
	 * @see miEmpresa.Desarrollador#getLenguajePrincipal()
	 * @see #getDesarrollador()
	 * @generated
	 */
	EAttribute getDesarrollador_LenguajePrincipal();

	/**
	 * Returns the meta object for class '{@link miEmpresa.Gerente <em>Gerente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gerente</em>'.
	 * @see miEmpresa.Gerente
	 * @generated
	 */
	EClass getGerente();

	/**
	 * Returns the meta object for the containment reference list '{@link miEmpresa.Gerente#getEquipo <em>Equipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equipo</em>'.
	 * @see miEmpresa.Gerente#getEquipo()
	 * @see #getGerente()
	 * @generated
	 */
	EReference getGerente_Equipo();

	/**
	 * Returns the meta object for class '{@link miEmpresa.Empleado <em>Empleado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empleado</em>'.
	 * @see miEmpresa.Empleado
	 * @generated
	 */
	EClass getEmpleado();

	/**
	 * Returns the meta object for the attribute '{@link miEmpresa.Empleado#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see miEmpresa.Empleado#getId()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Id();

	/**
	 * Returns the meta object for the attribute '{@link miEmpresa.Empleado#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see miEmpresa.Empleado#getNombre()
	 * @see #getEmpleado()
	 * @generated
	 */
	EAttribute getEmpleado_Nombre();

	/**
	 * Returns the meta object for class '{@link miEmpresa.Empresa <em>Empresa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empresa</em>'.
	 * @see miEmpresa.Empresa
	 * @generated
	 */
	EClass getEmpresa();

	/**
	 * Returns the meta object for the containment reference list '{@link miEmpresa.Empresa#getListaEmpleados <em>Lista Empleados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Empleados</em>'.
	 * @see miEmpresa.Empresa#getListaEmpleados()
	 * @see #getEmpresa()
	 * @generated
	 */
	EReference getEmpresa_ListaEmpleados();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiEmpresaFactory getMiEmpresaFactory();

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
		 * The meta object literal for the '{@link miEmpresa.impl.DesarrolladorImpl <em>Desarrollador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miEmpresa.impl.DesarrolladorImpl
		 * @see miEmpresa.impl.MiEmpresaPackageImpl#getDesarrollador()
		 * @generated
		 */
		EClass DESARROLLADOR = eINSTANCE.getDesarrollador();

		/**
		 * The meta object literal for the '<em><b>Lenguaje Principal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESARROLLADOR__LENGUAJE_PRINCIPAL = eINSTANCE.getDesarrollador_LenguajePrincipal();

		/**
		 * The meta object literal for the '{@link miEmpresa.impl.GerenteImpl <em>Gerente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miEmpresa.impl.GerenteImpl
		 * @see miEmpresa.impl.MiEmpresaPackageImpl#getGerente()
		 * @generated
		 */
		EClass GERENTE = eINSTANCE.getGerente();

		/**
		 * The meta object literal for the '<em><b>Equipo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERENTE__EQUIPO = eINSTANCE.getGerente_Equipo();

		/**
		 * The meta object literal for the '{@link miEmpresa.impl.EmpleadoImpl <em>Empleado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miEmpresa.impl.EmpleadoImpl
		 * @see miEmpresa.impl.MiEmpresaPackageImpl#getEmpleado()
		 * @generated
		 */
		EClass EMPLEADO = eINSTANCE.getEmpleado();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__ID = eINSTANCE.getEmpleado_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLEADO__NOMBRE = eINSTANCE.getEmpleado_Nombre();

		/**
		 * The meta object literal for the '{@link miEmpresa.impl.EmpresaImpl <em>Empresa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see miEmpresa.impl.EmpresaImpl
		 * @see miEmpresa.impl.MiEmpresaPackageImpl#getEmpresa()
		 * @generated
		 */
		EClass EMPRESA = eINSTANCE.getEmpresa();

		/**
		 * The meta object literal for the '<em><b>Lista Empleados</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESA__LISTA_EMPLEADOS = eINSTANCE.getEmpresa_ListaEmpleados();

	}

} //MiEmpresaPackage
