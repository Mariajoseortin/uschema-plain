/**
 */
package es.um.uschemap.USchemap.impl;

import es.um.uschemap.USchemap.EntityType;
import es.um.uschemap.USchemap.RelationshipType;
import es.um.uschemap.USchemap.USchemap;
import es.um.uschemap.USchemap.USchemapPackage;

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
 * An implementation of the model object '<em><b>USchemap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.impl.USchemapImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.impl.USchemapImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.impl.USchemapImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class USchemapImpl extends MinimalEObjectImpl.Container implements USchemap {
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
  protected USchemapImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return USchemapPackage.Literals.USCHEMA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, USchemapPackage.USCHEMA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityType> getEntities() {
    if (entities == null) {
      entities = new EObjectContainmentEList<EntityType>(EntityType.class, this, USchemapPackage.USCHEMA__ENTITIES);
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
      relationships = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, USchemapPackage.USCHEMA__RELATIONSHIPS);
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
      case USchemapPackage.USCHEMA__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case USchemapPackage.USCHEMA__RELATIONSHIPS:
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
      case USchemapPackage.USCHEMA__NAME:
        return getName();
      case USchemapPackage.USCHEMA__ENTITIES:
        return getEntities();
      case USchemapPackage.USCHEMA__RELATIONSHIPS:
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
      case USchemapPackage.USCHEMA__NAME:
        setName((String)newValue);
        return;
      case USchemapPackage.USCHEMA__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends EntityType>)newValue);
        return;
      case USchemapPackage.USCHEMA__RELATIONSHIPS:
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
      case USchemapPackage.USCHEMA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case USchemapPackage.USCHEMA__ENTITIES:
        getEntities().clear();
        return;
      case USchemapPackage.USCHEMA__RELATIONSHIPS:
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
      case USchemapPackage.USCHEMA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case USchemapPackage.USCHEMA__ENTITIES:
        return entities != null && !entities.isEmpty();
      case USchemapPackage.USCHEMA__RELATIONSHIPS:
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

} //USchemapImpl
