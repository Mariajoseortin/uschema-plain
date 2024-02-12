/**
 */
package es.um.uschemap.USchemap.util;

import es.um.uschemap.USchemap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.um.uschemap.USchemap.USchemapPackage
 * @generated
 */
public class USchemapAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static USchemapPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public USchemapAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = USchemapPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected USchemapSwitch<Adapter> modelSwitch =
    new USchemapSwitch<Adapter>() {
      @Override
      public Adapter caseUSchemap(USchemap object) {
        return createUSchemapAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object) {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter caseStructuralVariation(StructuralVariation object) {
        return createStructuralVariationAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object) {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object) {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object) {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter casePList(PList object) {
        return createPListAdapter();
      }
      @Override
      public Adapter caseReference(Reference object) {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseAggregate(Aggregate object) {
        return createAggregateAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object) {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseNull(Null object) {
        return createNullAdapter();
      }
      @Override
      public Adapter caseRelationshipType(RelationshipType object) {
        return createRelationshipTypeAdapter();
      }
      @Override
      public Adapter caseSchemaType(SchemaType object) {
        return createSchemaTypeAdapter();
      }
      @Override
      public Adapter casePMap(PMap object) {
        return createPMapAdapter();
      }
      @Override
      public Adapter casePSet(PSet object) {
        return createPSetAdapter();
      }
      @Override
      public Adapter casePTuple(PTuple object) {
        return createPTupleAdapter();
      }
      @Override
      public Adapter caseLogicalFeature(LogicalFeature object) {
        return createLogicalFeatureAdapter();
      }
      @Override
      public Adapter caseKey(Key object) {
        return createKeyAdapter();
      }
      @Override
      public Adapter caseStructuralFeature(StructuralFeature object) {
        return createStructuralFeatureAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.USchemap <em>USchemap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.USchemap
   * @generated
   */
  public Adapter createUSchemapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.StructuralVariation <em>Structural Variation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.StructuralVariation
   * @generated
   */
  public Adapter createStructuralVariationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Feature
   * @generated
   */
  public Adapter createFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.PList <em>PList</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.PList
   * @generated
   */
  public Adapter createPListAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Reference
   * @generated
   */
  public Adapter createReferenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Aggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Aggregate
   * @generated
   */
  public Adapter createAggregateAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Null <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Null
   * @generated
   */
  public Adapter createNullAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.RelationshipType <em>Relationship Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.RelationshipType
   * @generated
   */
  public Adapter createRelationshipTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.SchemaType <em>Schema Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.SchemaType
   * @generated
   */
  public Adapter createSchemaTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.PMap <em>PMap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.PMap
   * @generated
   */
  public Adapter createPMapAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.PSet <em>PSet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.PSet
   * @generated
   */
  public Adapter createPSetAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.PTuple <em>PTuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.PTuple
   * @generated
   */
  public Adapter createPTupleAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.LogicalFeature <em>Logical Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.LogicalFeature
   * @generated
   */
  public Adapter createLogicalFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.Key
   * @generated
   */
  public Adapter createKeyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.um.uschemap.USchemap.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.um.uschemap.USchemap.StructuralFeature
   * @generated
   */
  public Adapter createStructuralFeatureAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //USchemapAdapterFactory
