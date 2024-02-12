/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.SchemaType#getName <em>Name</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.SchemaType#getParents <em>Parents</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.SchemaType#getVariations <em>Variations</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getSchemaType()
 * @model abstract="true"
 * @generated
 */
public interface SchemaType extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.um.uschemap.USchemap.USchemapPackage#getSchemaType_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.SchemaType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parents</b></em>' reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.SchemaType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parents</em>' reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getSchemaType_Parents()
   * @model
   * @generated
   */
  EList<SchemaType> getParents();

  /**
   * Returns the value of the '<em><b>Variations</b></em>' containment reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.StructuralVariation}.
   * It is bidirectional and its opposite is '{@link es.um.uschemap.USchemap.StructuralVariation#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variations</em>' containment reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getSchemaType_Variations()
   * @see es.um.uschemap.USchemap.StructuralVariation#getContainer
   * @model opposite="container" containment="true"
   * @generated
   */
  EList<StructuralVariation> getVariations();

} // SchemaType
