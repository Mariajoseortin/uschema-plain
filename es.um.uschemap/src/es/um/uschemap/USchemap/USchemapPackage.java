/**
 */
package es.um.uschemap.USchemap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.um.uschemap.USchemap.USchemapFactory
 * @model kind="package"
 * @generated
 */
public interface USchemapPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "USchemap";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.modelum.es/USchemap";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "USchemap";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  USchemapPackage eINSTANCE = es.um.uschemap.USchemap.impl.USchemapPackageImpl.init();

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.USchemapImpl <em>USchemap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.USchemapImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getUSchemap()
   * @generated
   */
  int USCHEMA = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USCHEMA__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USCHEMA__ENTITIES = 1;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USCHEMA__RELATIONSHIPS = 2;

  /**
   * The number of structural features of the '<em>USchemap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USCHEMA_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>USchemap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USCHEMA_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.SchemaTypeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getSchemaType()
   * @generated
   */
  int SCHEMA_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__PARENTS = 1;

  /**
   * The feature id for the '<em><b>Variations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__VARIATIONS = 2;

  /**
   * The number of structural features of the '<em>Schema Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Schema Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.EntityTypeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__NAME = SCHEMA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__PARENTS = SCHEMA_TYPE__PARENTS;

  /**
   * The feature id for the '<em><b>Variations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__VARIATIONS = SCHEMA_TYPE__VARIATIONS;

  /**
   * The feature id for the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__ROOT = SCHEMA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = SCHEMA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_OPERATION_COUNT = SCHEMA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.StructuralVariationImpl <em>Structural Variation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.StructuralVariationImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getStructuralVariation()
   * @generated
   */
  int STRUCTURAL_VARIATION = 2;

  /**
   * The feature id for the '<em><b>Variation Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__VARIATION_ID = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__FEATURES = 1;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__COUNT = 2;

  /**
   * The feature id for the '<em><b>First Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__FIRST_TIMESTAMP = 3;

  /**
   * The feature id for the '<em><b>Last Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__LAST_TIMESTAMP = 4;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__CONTAINER = 5;

  /**
   * The feature id for the '<em><b>Logical Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__LOGICAL_FEATURES = 6;

  /**
   * The feature id for the '<em><b>Structural Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION__STRUCTURAL_FEATURES = 7;

  /**
   * The number of structural features of the '<em>Structural Variation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Structural Variation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_VARIATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.FeatureImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.StructuralFeatureImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getStructuralFeature()
   * @generated
   */
  int STRUCTURAL_FEATURE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__OPTIONAL = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Structural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Structural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.AttributeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = STRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OPTIONAL = STRUCTURAL_FEATURE__OPTIONAL;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__KEY = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__REFERENCES = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.DataTypeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.PListImpl <em>PList</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.PListImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPList()
   * @generated
   */
  int PLIST = 6;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLIST__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PList</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLIST_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>PList</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLIST_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.LogicalFeatureImpl <em>Logical Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.LogicalFeatureImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getLogicalFeature()
   * @generated
   */
  int LOGICAL_FEATURE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Logical Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Logical Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.ReferenceImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = LOGICAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = LOGICAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refs To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REFS_TO = LOGICAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Featured By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__IS_FEATURED_BY = LOGICAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ATTRIBUTES = LOGICAL_FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UPPER_BOUND = LOGICAL_FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LOWER_BOUND = LOGICAL_FEATURE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = LOGICAL_FEATURE_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OPERATION_COUNT = LOGICAL_FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.AggregateImpl <em>Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.AggregateImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getAggregate()
   * @generated
   */
  int AGGREGATE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__NAME = STRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__OPTIONAL = STRUCTURAL_FEATURE__OPTIONAL;

  /**
   * The feature id for the '<em><b>Aggregates</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__AGGREGATES = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__UPPER_BOUND = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE__LOWER_BOUND = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.PrimitiveTypeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.NullImpl <em>Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.NullImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getNull()
   * @generated
   */
  int NULL = 10;

  /**
   * The number of structural features of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.RelationshipTypeImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getRelationshipType()
   * @generated
   */
  int RELATIONSHIP_TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_TYPE__NAME = SCHEMA_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_TYPE__PARENTS = SCHEMA_TYPE__PARENTS;

  /**
   * The feature id for the '<em><b>Variations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_TYPE__VARIATIONS = SCHEMA_TYPE__VARIATIONS;

  /**
   * The number of structural features of the '<em>Relationship Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_TYPE_FEATURE_COUNT = SCHEMA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Relationship Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_TYPE_OPERATION_COUNT = SCHEMA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.PMapImpl <em>PMap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.PMapImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPMap()
   * @generated
   */
  int PMAP = 13;

  /**
   * The feature id for the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMAP__KEY_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMAP__VALUE_TYPE = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PMap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMAP_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>PMap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMAP_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.PSetImpl <em>PSet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.PSetImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPSet()
   * @generated
   */
  int PSET = 14;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSET__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PSet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSET_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>PSet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSET_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.PTupleImpl <em>PTuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.PTupleImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPTuple()
   * @generated
   */
  int PTUPLE = 15;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTUPLE__ELEMENTS = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PTuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTUPLE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>PTuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PTUPLE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link es.um.uschemap.USchemap.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.um.uschemap.USchemap.impl.KeyImpl
   * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getKey()
   * @generated
   */
  int KEY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__NAME = LOGICAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__ATTRIBUTES = LOGICAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = LOGICAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_OPERATION_COUNT = LOGICAL_FEATURE_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.USchemap <em>USchemap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>USchemap</em>'.
   * @see es.um.uschemap.USchemap.USchemap
   * @generated
   */
  EClass getUSchemap();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.USchemap#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.um.uschemap.USchemap.USchemap#getName()
   * @see #getUSchemap()
   * @generated
   */
  EAttribute getUSchemap_Name();

  /**
   * Returns the meta object for the containment reference list '{@link es.um.uschemap.USchemap.USchemap#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see es.um.uschemap.USchemap.USchemap#getEntities()
   * @see #getUSchemap()
   * @generated
   */
  EReference getUSchemap_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link es.um.uschemap.USchemap.USchemap#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see es.um.uschemap.USchemap.USchemap#getRelationships()
   * @see #getUSchemap()
   * @generated
   */
  EReference getUSchemap_Relationships();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see es.um.uschemap.USchemap.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.EntityType#isRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Root</em>'.
   * @see es.um.uschemap.USchemap.EntityType#isRoot()
   * @see #getEntityType()
   * @generated
   */
  EAttribute getEntityType_Root();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.StructuralVariation <em>Structural Variation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Variation</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation
   * @generated
   */
  EClass getStructuralVariation();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.StructuralVariation#getVariationId <em>Variation Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variation Id</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getVariationId()
   * @see #getStructuralVariation()
   * @generated
   */
  EAttribute getStructuralVariation_VariationId();

  /**
   * Returns the meta object for the containment reference list '{@link es.um.uschemap.USchemap.StructuralVariation#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getFeatures()
   * @see #getStructuralVariation()
   * @generated
   */
  EReference getStructuralVariation_Features();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.StructuralVariation#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getCount()
   * @see #getStructuralVariation()
   * @generated
   */
  EAttribute getStructuralVariation_Count();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.StructuralVariation#getFirstTimestamp <em>First Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Timestamp</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getFirstTimestamp()
   * @see #getStructuralVariation()
   * @generated
   */
  EAttribute getStructuralVariation_FirstTimestamp();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.StructuralVariation#getLastTimestamp <em>Last Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Timestamp</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getLastTimestamp()
   * @see #getStructuralVariation()
   * @generated
   */
  EAttribute getStructuralVariation_LastTimestamp();

  /**
   * Returns the meta object for the container reference '{@link es.um.uschemap.USchemap.StructuralVariation#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getContainer()
   * @see #getStructuralVariation()
   * @generated
   */
  EReference getStructuralVariation_Container();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.StructuralVariation#getLogicalFeatures <em>Logical Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Logical Features</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getLogicalFeatures()
   * @see #getStructuralVariation()
   * @generated
   */
  EReference getStructuralVariation_LogicalFeatures();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.StructuralVariation#getStructuralFeatures <em>Structural Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Structural Features</em>'.
   * @see es.um.uschemap.USchemap.StructuralVariation#getStructuralFeatures()
   * @see #getStructuralVariation()
   * @generated
   */
  EReference getStructuralVariation_StructuralFeatures();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see es.um.uschemap.USchemap.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.um.uschemap.USchemap.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see es.um.uschemap.USchemap.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link es.um.uschemap.USchemap.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see es.um.uschemap.USchemap.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the reference '{@link es.um.uschemap.USchemap.Attribute#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see es.um.uschemap.USchemap.Attribute#getKey()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Key();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.Attribute#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>References</em>'.
   * @see es.um.uschemap.USchemap.Attribute#getReferences()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_References();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see es.um.uschemap.USchemap.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.PList <em>PList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PList</em>'.
   * @see es.um.uschemap.USchemap.PList
   * @generated
   */
  EClass getPList();

  /**
   * Returns the meta object for the containment reference '{@link es.um.uschemap.USchemap.PList#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see es.um.uschemap.USchemap.PList#getElementType()
   * @see #getPList()
   * @generated
   */
  EReference getPList_ElementType();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see es.um.uschemap.USchemap.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link es.um.uschemap.USchemap.Reference#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see es.um.uschemap.USchemap.Reference#getOpposite()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Opposite();

  /**
   * Returns the meta object for the reference '{@link es.um.uschemap.USchemap.Reference#getRefsTo <em>Refs To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Refs To</em>'.
   * @see es.um.uschemap.USchemap.Reference#getRefsTo()
   * @see #getReference()
   * @generated
   */
  EReference getReference_RefsTo();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.Reference#getIsFeaturedBy <em>Is Featured By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Is Featured By</em>'.
   * @see es.um.uschemap.USchemap.Reference#getIsFeaturedBy()
   * @see #getReference()
   * @generated
   */
  EReference getReference_IsFeaturedBy();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.Reference#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attributes</em>'.
   * @see es.um.uschemap.USchemap.Reference#getAttributes()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Attributes();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.Reference#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see es.um.uschemap.USchemap.Reference#getUpperBound()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.Reference#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see es.um.uschemap.USchemap.Reference#getLowerBound()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_LowerBound();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate</em>'.
   * @see es.um.uschemap.USchemap.Aggregate
   * @generated
   */
  EClass getAggregate();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.Aggregate#getAggregates <em>Aggregates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Aggregates</em>'.
   * @see es.um.uschemap.USchemap.Aggregate#getAggregates()
   * @see #getAggregate()
   * @generated
   */
  EReference getAggregate_Aggregates();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.Aggregate#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see es.um.uschemap.USchemap.Aggregate#getUpperBound()
   * @see #getAggregate()
   * @generated
   */
  EAttribute getAggregate_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.Aggregate#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see es.um.uschemap.USchemap.Aggregate#getLowerBound()
   * @see #getAggregate()
   * @generated
   */
  EAttribute getAggregate_LowerBound();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see es.um.uschemap.USchemap.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.PrimitiveType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.um.uschemap.USchemap.PrimitiveType#getName()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_Name();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null</em>'.
   * @see es.um.uschemap.USchemap.Null
   * @generated
   */
  EClass getNull();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.RelationshipType <em>Relationship Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Type</em>'.
   * @see es.um.uschemap.USchemap.RelationshipType
   * @generated
   */
  EClass getRelationshipType();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.SchemaType <em>Schema Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Type</em>'.
   * @see es.um.uschemap.USchemap.SchemaType
   * @generated
   */
  EClass getSchemaType();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.SchemaType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.um.uschemap.USchemap.SchemaType#getName()
   * @see #getSchemaType()
   * @generated
   */
  EAttribute getSchemaType_Name();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.SchemaType#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parents</em>'.
   * @see es.um.uschemap.USchemap.SchemaType#getParents()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_Parents();

  /**
   * Returns the meta object for the containment reference list '{@link es.um.uschemap.USchemap.SchemaType#getVariations <em>Variations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variations</em>'.
   * @see es.um.uschemap.USchemap.SchemaType#getVariations()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_Variations();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.PMap <em>PMap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PMap</em>'.
   * @see es.um.uschemap.USchemap.PMap
   * @generated
   */
  EClass getPMap();

  /**
   * Returns the meta object for the containment reference '{@link es.um.uschemap.USchemap.PMap#getKeyType <em>Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Type</em>'.
   * @see es.um.uschemap.USchemap.PMap#getKeyType()
   * @see #getPMap()
   * @generated
   */
  EReference getPMap_KeyType();

  /**
   * Returns the meta object for the containment reference '{@link es.um.uschemap.USchemap.PMap#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Type</em>'.
   * @see es.um.uschemap.USchemap.PMap#getValueType()
   * @see #getPMap()
   * @generated
   */
  EReference getPMap_ValueType();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.PSet <em>PSet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PSet</em>'.
   * @see es.um.uschemap.USchemap.PSet
   * @generated
   */
  EClass getPSet();

  /**
   * Returns the meta object for the containment reference '{@link es.um.uschemap.USchemap.PSet#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see es.um.uschemap.USchemap.PSet#getElementType()
   * @see #getPSet()
   * @generated
   */
  EReference getPSet_ElementType();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.PTuple <em>PTuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PTuple</em>'.
   * @see es.um.uschemap.USchemap.PTuple
   * @generated
   */
  EClass getPTuple();

  /**
   * Returns the meta object for the containment reference list '{@link es.um.uschemap.USchemap.PTuple#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see es.um.uschemap.USchemap.PTuple#getElements()
   * @see #getPTuple()
   * @generated
   */
  EReference getPTuple_Elements();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.LogicalFeature <em>Logical Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Feature</em>'.
   * @see es.um.uschemap.USchemap.LogicalFeature
   * @generated
   */
  EClass getLogicalFeature();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see es.um.uschemap.USchemap.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the reference list '{@link es.um.uschemap.USchemap.Key#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attributes</em>'.
   * @see es.um.uschemap.USchemap.Key#getAttributes()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Attributes();

  /**
   * Returns the meta object for class '{@link es.um.uschemap.USchemap.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Feature</em>'.
   * @see es.um.uschemap.USchemap.StructuralFeature
   * @generated
   */
  EClass getStructuralFeature();

  /**
   * Returns the meta object for the attribute '{@link es.um.uschemap.USchemap.StructuralFeature#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see es.um.uschemap.USchemap.StructuralFeature#isOptional()
   * @see #getStructuralFeature()
   * @generated
   */
  EAttribute getStructuralFeature_Optional();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  USchemapFactory getUSchemapFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.USchemapImpl <em>USchemap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.USchemapImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getUSchemap()
     * @generated
     */
    EClass USCHEMA = eINSTANCE.getUSchemap();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USCHEMA__NAME = eINSTANCE.getUSchemap_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USCHEMA__ENTITIES = eINSTANCE.getUSchemap_Entities();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USCHEMA__RELATIONSHIPS = eINSTANCE.getUSchemap_Relationships();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.EntityTypeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_TYPE__ROOT = eINSTANCE.getEntityType_Root();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.StructuralVariationImpl <em>Structural Variation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.StructuralVariationImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getStructuralVariation()
     * @generated
     */
    EClass STRUCTURAL_VARIATION = eINSTANCE.getStructuralVariation();

    /**
     * The meta object literal for the '<em><b>Variation Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_VARIATION__VARIATION_ID = eINSTANCE.getStructuralVariation_VariationId();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_VARIATION__FEATURES = eINSTANCE.getStructuralVariation_Features();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_VARIATION__COUNT = eINSTANCE.getStructuralVariation_Count();

    /**
     * The meta object literal for the '<em><b>First Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_VARIATION__FIRST_TIMESTAMP = eINSTANCE.getStructuralVariation_FirstTimestamp();

    /**
     * The meta object literal for the '<em><b>Last Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_VARIATION__LAST_TIMESTAMP = eINSTANCE.getStructuralVariation_LastTimestamp();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_VARIATION__CONTAINER = eINSTANCE.getStructuralVariation_Container();

    /**
     * The meta object literal for the '<em><b>Logical Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_VARIATION__LOGICAL_FEATURES = eINSTANCE.getStructuralVariation_LogicalFeatures();

    /**
     * The meta object literal for the '<em><b>Structural Features</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_VARIATION__STRUCTURAL_FEATURES = eINSTANCE.getStructuralVariation_StructuralFeatures();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.FeatureImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.AttributeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__KEY = eINSTANCE.getAttribute_Key();

    /**
     * The meta object literal for the '<em><b>References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__REFERENCES = eINSTANCE.getAttribute_References();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.DataTypeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.PListImpl <em>PList</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.PListImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPList()
     * @generated
     */
    EClass PLIST = eINSTANCE.getPList();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLIST__ELEMENT_TYPE = eINSTANCE.getPList_ElementType();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.ReferenceImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '<em><b>Refs To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REFS_TO = eINSTANCE.getReference_RefsTo();

    /**
     * The meta object literal for the '<em><b>Is Featured By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__IS_FEATURED_BY = eINSTANCE.getReference_IsFeaturedBy();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ATTRIBUTES = eINSTANCE.getReference_Attributes();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__UPPER_BOUND = eINSTANCE.getReference_UpperBound();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__LOWER_BOUND = eINSTANCE.getReference_LowerBound();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.AggregateImpl <em>Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.AggregateImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getAggregate()
     * @generated
     */
    EClass AGGREGATE = eINSTANCE.getAggregate();

    /**
     * The meta object literal for the '<em><b>Aggregates</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGGREGATE__AGGREGATES = eINSTANCE.getAggregate_Aggregates();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATE__UPPER_BOUND = eINSTANCE.getAggregate_UpperBound();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGGREGATE__LOWER_BOUND = eINSTANCE.getAggregate_LowerBound();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.PrimitiveTypeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.NullImpl <em>Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.NullImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getNull()
     * @generated
     */
    EClass NULL = eINSTANCE.getNull();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.RelationshipTypeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getRelationshipType()
     * @generated
     */
    EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.SchemaTypeImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getSchemaType()
     * @generated
     */
    EClass SCHEMA_TYPE = eINSTANCE.getSchemaType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA_TYPE__NAME = eINSTANCE.getSchemaType_Name();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_TYPE__PARENTS = eINSTANCE.getSchemaType_Parents();

    /**
     * The meta object literal for the '<em><b>Variations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_TYPE__VARIATIONS = eINSTANCE.getSchemaType_Variations();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.PMapImpl <em>PMap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.PMapImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPMap()
     * @generated
     */
    EClass PMAP = eINSTANCE.getPMap();

    /**
     * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PMAP__KEY_TYPE = eINSTANCE.getPMap_KeyType();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PMAP__VALUE_TYPE = eINSTANCE.getPMap_ValueType();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.PSetImpl <em>PSet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.PSetImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPSet()
     * @generated
     */
    EClass PSET = eINSTANCE.getPSet();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSET__ELEMENT_TYPE = eINSTANCE.getPSet_ElementType();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.PTupleImpl <em>PTuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.PTupleImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getPTuple()
     * @generated
     */
    EClass PTUPLE = eINSTANCE.getPTuple();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PTUPLE__ELEMENTS = eINSTANCE.getPTuple_Elements();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.LogicalFeatureImpl <em>Logical Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.LogicalFeatureImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getLogicalFeature()
     * @generated
     */
    EClass LOGICAL_FEATURE = eINSTANCE.getLogicalFeature();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.KeyImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__ATTRIBUTES = eINSTANCE.getKey_Attributes();

    /**
     * The meta object literal for the '{@link es.um.uschemap.USchemap.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.um.uschemap.USchemap.impl.StructuralFeatureImpl
     * @see es.um.uschemap.USchemap.impl.USchemapPackageImpl#getStructuralFeature()
     * @generated
     */
    EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_FEATURE__OPTIONAL = eINSTANCE.getStructuralFeature_Optional();

  }

} //USchemapPackage
