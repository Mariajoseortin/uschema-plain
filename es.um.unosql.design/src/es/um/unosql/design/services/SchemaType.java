package es.um.unosql.design.services;

import java.util.List;

import es.um.unosql.design.services.util.FeatureCollector;
import es.um.unosql.uNoSQLSchema.Aggregate;
import es.um.unosql.uNoSQLSchema.Attribute;
import es.um.unosql.uNoSQLSchema.Key;
import es.um.unosql.uNoSQLSchema.Reference;

public class SchemaType
{
  private FeatureCollector featCollector;

  public SchemaType()
  {
    featCollector = new FeatureCollector();
  }

  public boolean hasCommonFeatures(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return schemaT.getVariations().stream() .anyMatch(var ->
      var.getLogicalFeatures().stream().anyMatch(
          lFeat -> (lFeat instanceof Key && ((Key)lFeat).getAttributes().isEmpty())
          || (lFeat instanceof Reference && ((Reference)lFeat).getAttributes().isEmpty()))
      || var.getStructuralFeatures().stream().anyMatch(sFeat -> !sFeat.isOptional()));
  }

  public boolean hasOptionalFeatures(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return schemaT.getVariations().stream().anyMatch(var ->
      var.getStructuralFeatures().stream().anyMatch(sFeat -> sFeat.isOptional()));
  }

  public List<Attribute> getCommonAttributes(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Attribute.class);
  }

  public List<Aggregate> getCommonAggregates(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Aggregate.class);
  }

  public List<Reference> getCommonReferences(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Reference.class);
  }

  public List<Key> getCommonKeys(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Key.class);
  }

  public List<Attribute> getOptionalAttributes(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Attribute.class);
  }

  public List<Aggregate> getOptionalAggregates(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Aggregate.class);
  }

  public List<Reference> getOptionalReferences(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Reference.class);
  }

  public List<Key> getOptionalKeys(es.um.unosql.uNoSQLSchema.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Key.class);
  }
}
