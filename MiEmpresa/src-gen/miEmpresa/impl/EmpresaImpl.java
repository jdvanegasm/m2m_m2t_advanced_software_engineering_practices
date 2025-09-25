/**
 */
package miEmpresa.impl;

import java.util.Collection;

import miEmpresa.Empleado;
import miEmpresa.Empresa;
import miEmpresa.MiEmpresaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empresa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link miEmpresa.impl.EmpresaImpl#getListaEmpleados <em>Lista Empleados</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmpresaImpl extends MinimalEObjectImpl.Container implements Empresa {
	/**
	 * The cached value of the '{@link #getListaEmpleados() <em>Lista Empleados</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaEmpleados()
	 * @generated
	 * @ordered
	 */
	protected EList<Empleado> listaEmpleados;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmpresaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiEmpresaPackage.Literals.EMPRESA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Empleado> getListaEmpleados() {
		if (listaEmpleados == null) {
			listaEmpleados = new EObjectContainmentEList<Empleado>(Empleado.class, this,
					MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS);
		}
		return listaEmpleados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS:
			return ((InternalEList<?>) getListaEmpleados()).basicRemove(otherEnd, msgs);
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
		case MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS:
			return getListaEmpleados();
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
		case MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS:
			getListaEmpleados().clear();
			getListaEmpleados().addAll((Collection<? extends Empleado>) newValue);
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
		case MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS:
			getListaEmpleados().clear();
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
		case MiEmpresaPackage.EMPRESA__LISTA_EMPLEADOS:
			return listaEmpleados != null && !listaEmpleados.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmpresaImpl
