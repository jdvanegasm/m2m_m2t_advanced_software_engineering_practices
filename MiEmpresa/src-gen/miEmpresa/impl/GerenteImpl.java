/**
 */
package miEmpresa.impl;

import java.util.Collection;

import miEmpresa.Desarrollador;
import miEmpresa.Gerente;
import miEmpresa.MiEmpresaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gerente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.impl.GerenteImpl#getEquipo <em>Equipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GerenteImpl extends EmpleadoImpl implements Gerente {
	/**
	 * The cached value of the '{@link #getEquipo() <em>Equipo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipo()
	 * @generated
	 * @ordered
	 */
	protected EList<Desarrollador> equipo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GerenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiEmpresaPackage.Literals.GERENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Desarrollador> getEquipo() {
		if (equipo == null) {
			equipo = new EObjectContainmentEList<Desarrollador>(Desarrollador.class, this,
					MiEmpresaPackage.GERENTE__EQUIPO);
		}
		return equipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiEmpresaPackage.GERENTE__EQUIPO:
			return ((InternalEList<?>) getEquipo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiEmpresaPackage.GERENTE__EQUIPO:
			return getEquipo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiEmpresaPackage.GERENTE__EQUIPO:
			getEquipo().clear();
			getEquipo().addAll((Collection<? extends Desarrollador>) newValue);
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
		case MiEmpresaPackage.GERENTE__EQUIPO:
			getEquipo().clear();
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
		case MiEmpresaPackage.GERENTE__EQUIPO:
			return equipo != null && !equipo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GerenteImpl
