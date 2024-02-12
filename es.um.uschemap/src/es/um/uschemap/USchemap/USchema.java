/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USchemap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.USchemap#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.USchemap#getEntities <em>Entities</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.USchemap#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getUSchemap()
 * @model
 * @generated
 */
public interface USchemap extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.um.uschemap.USchemap.USchemapPackage#getUSchemap_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.USchemap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.EntityType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getUSchemap_Entities()
   * @model containment="true"
   * @generated
   */
  EList<EntityType> getEntities();

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.RelationshipType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getUSchemap_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<RelationshipType> getRelationships();

} // USchemap
