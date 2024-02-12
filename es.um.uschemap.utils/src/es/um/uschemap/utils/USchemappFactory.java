package es.um.uschemap.utils;

import java.util.Arrays;

import es.um.uschemap.USchemap.Aggregate;
import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.DataType;
import es.um.uschemap.USchemap.EntityType;
import es.um.uschemap.USchemap.Key;
import es.um.uschemap.USchemap.Null;
import es.um.uschemap.USchemap.PList;
import es.um.uschemap.USchemap.PMap;
import es.um.uschemap.USchemap.PSet;
import es.um.uschemap.USchemap.PTuple;
import es.um.uschemap.USchemap.PrimitiveType;
import es.um.uschemap.USchemap.Reference;
import es.um.uschemap.USchemap.RelationshipType;
import es.um.uschemap.USchemap.StructuralVariation;
import es.um.uschemap.USchemap.USchemap;

public class USchemapFactory 
{
  private es.um.uschemap.USchemap.USchemapFactory factory;

  public USchemapFactory() 
  {
    this.factory = es.um.uschemap.USchemap.USchemapFactory.eINSTANCE;
  }

  public USchemap createUSchemap(String schemaName)
  {
    if (schemaName == null)
      throw new IllegalArgumentException("USchemapFactory:createUSchemap - Name can't be null");

    USchemap schema = factory.createUSchemap();
    schema.setName(schemaName);

    return schema;
  }

  public USchemap createLinkedUSchemap(String schemaName)
  {
    USchemap schema = createUSchemap(schemaName);

    return schema;
  }

  public EntityType createEntityType(String entityName)
  {
    if (entityName == null)
      throw new IllegalArgumentException("USchemapFactory:createEntityType - Name can't be null");

    EntityType entityType = factory.createEntityType();
    entityType.setName(entityName);

    return entityType;
  }

  public EntityType createEntityType(String entityName, boolean isRoot)
  {
    EntityType result = createEntityType(entityName);
    result.setRoot(isRoot);

    return result;
  }

  public RelationshipType createRelationshipType(String relName)
  {
    if (relName == null)
      throw new IllegalArgumentException("USchemapFactory:createRelationshipType - Name can't be null");

    RelationshipType result = factory.createRelationshipType();
    result.setName(relName);

    return result;
  }

  public StructuralVariation createStructuralVariation(int id)
  {
    if (id < 1)
      throw new IllegalArgumentException("USchemapFactory:createStructuralVariation - Id must be greater than 0");

    StructuralVariation structuralVariation = factory.createStructuralVariation();
    structuralVariation.setVariationId(id);

    return structuralVariation;
  }

  public Key createKey(String keyName)
  {
    Key key = factory.createKey();
    key.setName(keyName);

    return key;
  }

  public Reference createReference(String refName)
  {
    Reference ref = factory.createReference();
    ref.setName(refName);

    return ref;
  }

  public Reference createReference(String refName, int lBound, int uBound, EntityType entity)
  {
    if (entity == null)
      throw new IllegalArgumentException("USchemapFactory:createReference - EntityType can't be null");

    Reference ref = createReference(refName);
    ref.setLowerBound(lBound);
    ref.setUpperBound(uBound);
    ref.setRefsTo(entity);

    return ref;
  }

  public Aggregate createAggregate(String aggrName)
  {
    if (aggrName == null)
      throw new IllegalArgumentException("USchemapFactory:createAggregate - Name can't be null");

    Aggregate aggr = factory.createAggregate();
    aggr.setName(aggrName);

    return aggr;
  }

  public Aggregate createAggregate(String aggrName, int lBound, int uBound, StructuralVariation... vars)
  {
    if (vars == null || vars.length < 1)
      throw new IllegalArgumentException("USchemapFactory:createAggregate - Variations should contain at least one element");

    Aggregate aggr = createAggregate(aggrName);
    aggr.setLowerBound(lBound);
    aggr.setUpperBound(uBound);
    aggr.getAggregates().addAll(Arrays.asList(vars));

    return aggr;
  }

  public Attribute createAttribute(String name, DataType type)
  {
    if (name == null)
      throw new IllegalArgumentException("USchemapFactory:createAttribute - Name can't be null");

    if (type == null)
      throw new IllegalArgumentException("USchemapFactory:createAttribute - DataType can't be null");

    Attribute attribute = factory.createAttribute();
    attribute.setName(name);
    attribute.setType(type);

    return attribute;
  }

  public Attribute createAttribute(String name, DataType type, boolean isOptional)
  {
    Attribute attribute = createAttribute(name, type);
    attribute.setOptional(isOptional);

    return attribute;
  }

  public PrimitiveType createPrimitiveType(String type)
  {
    PrimitiveType primitiveType = factory.createPrimitiveType();
    primitiveType.setName(type);

    return primitiveType;
  }

  public PList createPList(DataType elementType)
  {
    if (elementType == null)
      throw new IllegalArgumentException("USchemapFactory:createPList - ElementType can't be null");

    PList pList = factory.createPList();
    pList.setElementType(elementType);

    return pList;
  }

  public PSet createPSet(DataType elementType)
  {
    if (elementType == null)
      throw new IllegalArgumentException("USchemapFactory:createPSet - ElementType can't be null");

    PSet pSet = factory.createPSet();
    pSet.setElementType(elementType);

    return pSet;
  }

  public PMap createPMap(PrimitiveType keyType, DataType valueType)
  {
    if (keyType == null)
      throw new IllegalArgumentException("USchemapFactory:createPMap - KeyType can't be null");

    if (valueType == null)
      throw new IllegalArgumentException("USchemapFactory:createPMap - ValueType can't be null");

    PMap pMap = factory.createPMap();
    pMap.setKeyType(keyType);
    pMap.setValueType(valueType);

    return pMap;
  }

  public PTuple createPTuple(DataType...dataTypes)
  {
    if (dataTypes == null || dataTypes.length < 1)
      throw new IllegalArgumentException("USchemapFactory:createPTuple - DataTypes should contain at least one element");

    PTuple pTuple = factory.createPTuple();
    pTuple.getElements().addAll(Arrays.asList(dataTypes));

    return pTuple;
  }

  public Null createNull()
  {
    return factory.createNull();
  }
}
