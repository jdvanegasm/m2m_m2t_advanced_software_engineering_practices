/**
 */
package miEmpresa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desarrollador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.Desarrollador#getLenguajePrincipal <em>Lenguaje Principal</em>}</li>
 * </ul>
 *
 * @see miEmpresa.MiEmpresaPackage#getDesarrollador()
 * @model
 * @generated
 */
public interface Desarrollador extends Empleado {
	/**
	 * Returns the value of the '<em><b>Lenguaje Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenguaje Principal</em>' attribute.
	 * @see #setLenguajePrincipal(String)
	 * @see miEmpresa.MiEmpresaPackage#getDesarrollador_LenguajePrincipal()
	 * @model
	 * @generated
	 */
	String getLenguajePrincipal();

	/**
	 * Sets the value of the '{@link miEmpresa.Desarrollador#getLenguajePrincipal <em>Lenguaje Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenguaje Principal</em>' attribute.
	 * @see #getLenguajePrincipal()
	 * @generated
	 */
	void setLenguajePrincipal(String value);

} // Desarrollador
