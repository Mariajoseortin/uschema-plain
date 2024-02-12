package es.um.uschemap.design.services;

import java.util.List;

import es.um.uschemap.design.services.util.FeatureCollector;
import es.um.uschemap.USchemap.Aggregate;
import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.Key;
import es.um.uschemap.USchemap.Reference;

public class SchemaType
{
  private FeatureCollector featCollector;

  public SchemaType()
  {
    featCollector = new FeatureCollector();
  }

  public boolean hasCommonFeatures(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return schemaT.getVariations().stream() .anyMatch(var ->
      var.getLogicalFeatures().stream().anyMatch(
          lFeat -> (lFeat instanceof Key && ((Key)lFeat).getAttributes().isEmpty())
          || (lFeat instanceof Reference && ((Reference)lFeat).getAttributes().isEmpty()))
      || var.getStructuralFeatures().stream().anyMatch(sFeat -> !sFeat.isOptional()));
  }

  public boolean hasOptionalFeatures(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return schemaT.getVariations().stream().anyMatch(var ->
      var.getStructuralFeatures().stream().anyMatch(sFeat -> sFeat.isOptional()));
  }

  public List<Attribute> getCommonAttributes(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Attribute.class);
  }

  public List<Aggregate> getCommonAggregates(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Aggregate.class);
  }

  public List<Reference> getCommonReferences(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Reference.class);
  }

  public List<Key> getCommonKeys(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getCommonFeatures(schemaT, Key.class);
  }

  public List<Attribute> getOptionalAttributes(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Attribute.class);
  }

  public List<Aggregate> getOptionalAggregates(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Aggregate.class);
  }

  public List<Reference> getOptionalReferences(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Reference.class);
  }

  public List<Key> getOptionalKeys(es.um.uschemap.USchemap.SchemaType schemaT)
  {
    return featCollector.getOptionalFeatures(schemaT, Key.class);
  }
}
