/**
 */
package miEmpresa.impl;

import miEmpresa.Desarrollador;
import miEmpresa.MiEmpresaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desarrollador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.impl.DesarrolladorImpl#getLenguajePrincipal <em>Lenguaje Principal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesarrolladorImpl extends EmpleadoImpl implements Desarrollador {
	/**
	 * The default value of the '{@link #getLenguajePrincipal() <em>Lenguaje Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenguajePrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGUAJE_PRINCIPAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLenguajePrincipal() <em>Lenguaje Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenguajePrincipal()
	 * @generated
	 * @ordered
	 */
	protected String lenguajePrincipal = LENGUAJE_PRINCIPAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesarrolladorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiEmpresaPackage.Literals.DESARROLLADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLenguajePrincipal() {
		return lenguajePrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLenguajePrincipal(String newLenguajePrincipal) {
		String oldLenguajePrincipal = lenguajePrincipal;
		lenguajePrincipal = newLenguajePrincipal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiEmpresaPackage.DESARROLLADOR__LENGUAJE_PRINCIPAL,
					oldLenguajePrincipal, lenguajePrincipal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiEmpresaPackage.DESARROLLADOR__LENGUAJE_PRINCIPAL:
			return getLenguajePrincipal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiEmpresaPackage.DESARROLLADOR__LENGUAJE_PRINCIPAL:
			setLenguajePrincipal((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MiEmpresaPackage.DESARROLLADOR__LENGUAJE_PRINCIPAL:
			setLenguajePrincipal(LENGUAJE_PRINCIPAL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MiEmpresaPackage.DESARROLLADOR__LENGUAJE_PRINCIPAL:
			return LENGUAJE_PRINCIPAL_EDEFAULT == null ? lenguajePrincipal != null
					: !LENGUAJE_PRINCIPAL_EDEFAULT.equals(lenguajePrincipal);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lenguajePrincipal: ");
		result.append(lenguajePrincipal);
		result.append(')');
		return result.toString();
	}

} //DesarrolladorImpl
