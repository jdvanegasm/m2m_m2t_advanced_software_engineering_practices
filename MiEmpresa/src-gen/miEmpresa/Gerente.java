/**
 */
package miEmpresa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gerente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.Gerente#getEquipo <em>Equipo</em>}</li>
 * </ul>
 *
 * @see miEmpresa.MiEmpresaPackage#getGerente()
 * @model
 * @generated
 */
public interface Gerente extends Empleado {
	/**
	 * Returns the value of the '<em><b>Equipo</b></em>' containment reference list.
	 * The list contents are of type {@link miEmpresa.Desarrollador}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipo</em>' containment reference list.
	 * @see miEmpresa.MiEmpresaPackage#getGerente_Equipo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Desarrollador> getEquipo();

} // Gerente
