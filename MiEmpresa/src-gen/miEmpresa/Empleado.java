/**
 */
package miEmpresa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empleado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.Empleado#getId <em>Id</em>}</li>
 *   <li>{@link miEmpresa.Empleado#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see miEmpresa.MiEmpresaPackage#getEmpleado()
 * @model abstract="true"
 * @generated
 */
public interface Empleado extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see miEmpresa.MiEmpresaPackage#getEmpleado_Id()
	 * @model unique="false" changeable="false" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see miEmpresa.MiEmpresaPackage#getEmpleado_Nombre()
	 * @model unique="false" changeable="false" ordered="false"
	 * @generated
	 */
	String getNombre();

} // Empleado
