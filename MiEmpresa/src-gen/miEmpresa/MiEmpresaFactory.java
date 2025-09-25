/**
 */
package miEmpresa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see miEmpresa.MiEmpresaPackage
 * @generated
 */
public interface MiEmpresaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiEmpresaFactory eINSTANCE = miEmpresa.impl.MiEmpresaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Desarrollador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desarrollador</em>'.
	 * @generated
	 */
	Desarrollador createDesarrollador();

	/**
	 * Returns a new object of class '<em>Gerente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gerente</em>'.
	 * @generated
	 */
	Gerente createGerente();

	/**
	 * Returns a new object of class '<em>Empresa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empresa</em>'.
	 * @generated
	 */
	Empresa createEmpresa();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MiEmpresaPackage getMiEmpresaPackage();

} //MiEmpresaFactory
