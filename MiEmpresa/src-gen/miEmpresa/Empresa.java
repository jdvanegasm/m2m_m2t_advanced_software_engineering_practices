/**
 */
package miEmpresa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empresa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.Empresa#getListaEmpleados <em>Lista Empleados</em>}</li>
 * </ul>
 *
 * @see miEmpresa.MiEmpresaPackage#getEmpresa()
 * @model
 * @generated
 */
public interface Empresa extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Empleados</b></em>' containment reference list.
	 * The list contents are of type {@link miEmpresa.Empleado}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Empleados</em>' containment reference list.
	 * @see miEmpresa.MiEmpresaPackage#getEmpresa_ListaEmpleados()
	 * @model containment="true"
	 * @generated
	 */
	EList<Empleado> getListaEmpleados();

} // Empresa
