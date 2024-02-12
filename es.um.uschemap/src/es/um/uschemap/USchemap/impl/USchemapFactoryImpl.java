/**
 */
package es.um.uschemap.USchemap.impl;

import es.um.uschemap.USchemap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class USchemapFactoryImpl extends EFactoryImpl implements USchemapFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static USchemapFactory init() {
    try {
      USchemapFactory theUSchemapFactory = (USchemapFactory)EPackage.Registry.INSTANCE.getEFactory(USchemapPackage.eNS_URI);
      if (theUSchemapFactory != null) {
        return theUSchemapFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new USchemapFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USchemapFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case USchemapPackage.USCHEMA: return createUSchemap();
      case USchemapPackage.ENTITY_TYPE: return createEntityType();
      case USchemapPackage.STRUCTURAL_VARIATION: return createStructuralVariation();
      case USchemapPackage.ATTRIBUTE: return createAttribute();
      case USchemapPackage.PLIST: return createPList();
      case USchemapPackage.REFERENCE: return createReference();
      case USchemapPackage.AGGREGATE: return createAggregate();
      case USchemapPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case USchemapPackage.NULL: return createNull();
      case USchemapPackage.RELATIONSHIP_TYPE: return createRelationshipType();
      case USchemapPackage.PMAP: return createPMap();
      case USchemapPackage.PSET: return createPSet();
      case USchemapPackage.PTUPLE: return createPTuple();
      case USchemapPackage.KEY: return createKey();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public USchemap createUSchemap() {
    USchemapImpl uSchema = new USchemapImpl();
    return uSchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityType createEntityType() {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StructuralVariation createStructuralVariation() {
    StructuralVariationImpl structuralVariation = new StructuralVariationImpl();
    return structuralVariation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute() {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PList createPList() {
    PListImpl pList = new PListImpl();
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Reference createReference() {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Aggregate createAggregate() {
    AggregateImpl aggregate = new AggregateImpl();
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveType createPrimitiveType() {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Null createNull() {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationshipType createRelationshipType() {
    RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
    return relationshipType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PMap createPMap() {
    PMapImpl pMap = new PMapImpl();
    return pMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PSet createPSet() {
    PSetImpl pSet = new PSetImpl();
    return pSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PTuple createPTuple() {
    PTupleImpl pTuple = new PTupleImpl();
    return pTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Key createKey() {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public USchemapPackage getUSchemapPackage() {
    return (USchemapPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static USchemapPackage getPackage() {
    return USchemapPackage.eINSTANCE;
  }

} //USchemapFactoryImpl
