/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getRefsTo <em>Refs To</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getIsFeaturedBy <em>Is Featured By</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link es.um.uschemap.USchemap.Reference#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see es.um.uschemap.USchemap.USchemapPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends LogicalFeature {
  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Reference)
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_Opposite()
   * @model
   * @generated
   */
  Reference getOpposite();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Reference#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Reference value);

  /**
   * Returns the value of the '<em><b>Refs To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs To</em>' reference.
   * @see #setRefsTo(EntityType)
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_RefsTo()
   * @model required="true"
   * @generated
   */
  EntityType getRefsTo();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Reference#getRefsTo <em>Refs To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refs To</em>' reference.
   * @see #getRefsTo()
   * @generated
   */
  void setRefsTo(EntityType value);

  /**
   * Returns the value of the '<em><b>Is Featured By</b></em>' reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.StructuralVariation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Featured By</em>' reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_IsFeaturedBy()
   * @model
   * @generated
   */
  EList<StructuralVariation> getIsFeaturedBy();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' reference list.
   * The list contents are of type {@link es.um.uschemap.USchemap.Attribute}.
   * It is bidirectional and its opposite is '{@link es.um.uschemap.USchemap.Attribute#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' reference list.
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_Attributes()
   * @see es.um.uschemap.USchemap.Attribute#getReferences
   * @model opposite="references"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_UpperBound()
   * @model
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Reference#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see es.um.uschemap.USchemap.USchemapPackage#getReference_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link es.um.uschemap.USchemap.Reference#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

} // Reference
