/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.Key#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends LogicalFeature {
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.Attribute}.
   * It is bidirectional and its opposite is '{@link es.um.uschemap.USchemap.Attribute#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getKey_Attributes()
   * @see es.um.uschemap.USchemap.Attribute#getKey
   * @model opposite="key"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Key
