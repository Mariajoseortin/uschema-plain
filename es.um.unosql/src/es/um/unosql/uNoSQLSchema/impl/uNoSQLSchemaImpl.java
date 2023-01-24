/**
 */
package es.um.unosql.uNoSQLSchema.impl;

import es.um.unosql.uNoSQLSchema.EntityType;
import es.um.unosql.uNoSQLSchema.RelationshipType;
import es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage;
import es.um.unosql.uNoSQLSchema.uNoSQLSchema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uNo SQL Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.unosql.uNoSQLSchema.impl.uNoSQLSchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.unosql.uNoSQLSchema.impl.uNoSQLSchemaImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link es.um.unosql.uNoSQLSchema.impl.uNoSQLSchemaImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class uNoSQLSchemaImpl extends MinimalEObjectImpl.Container implements uNoSQLSchema {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> entities;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected uNoSQLSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UNoSQLSchemaPackage.Literals.UNO_SQL_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UNoSQLSchemaPackage.UNO_SQL_SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityType> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<EntityType>(EntityType.class, this, UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationshipType> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__NAME:
				return getName();
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES:
				return getEntities();
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS:
				return getRelationships();
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
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__NAME:
				setName((String)newValue);
				return;
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends EntityType>)newValue);
				return;
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends RelationshipType>)newValue);
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
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES:
				getEntities().clear();
				return;
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS:
				getRelationships().clear();
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
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__ENTITIES:
				return entities != null && !entities.isEmpty();
			case UNoSQLSchemaPackage.UNO_SQL_SCHEMA__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //uNoSQLSchemaImpl
