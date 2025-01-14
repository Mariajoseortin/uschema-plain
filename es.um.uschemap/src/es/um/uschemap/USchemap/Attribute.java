/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Attribute#getKey <em>Key</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Attribute#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralFeature {
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DataType)
   * @see es.um.uschemap.USchemap.USchemapPackage#getAttribute_Type()
   * @model containment="true" required="true"
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' reference.
   * It is bidirectional and its opposite is '{@link es.um.uschemap.USchemap.Key#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' reference.
   * @see #setKey(Key)
   * @see es.um.uschemap.USchemap.USchemapPackage#getAttribute_Key()
   * @see es.um.uschemap.USchemap.Key#getAttributes
   * @model opposite="attributes"
   * @generated
   */
  Key getKey();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Attribute#getKey <em>Key</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Key value);

  /**
   * Returns the value of the '<em><b>References</b></em>' reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.Reference}.
   * It is bidirectional and its opposite is '{@link es.um.uschemap.USchemap.Reference#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getAttribute_References()
   * @see es.um.uschemap.USchemap.Reference#getAttributes
   * @model opposite="attributes"
   * @generated
   */
  EList<Reference> getReferences();

} // Attribute
