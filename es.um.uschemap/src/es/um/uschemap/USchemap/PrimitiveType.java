/**
 */
package es.um.uschemap.USchemap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends DataType {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.um.uschemap.USchemap.USchemapPackage#getPrimitiveType_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.PrimitiveType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PrimitiveType
