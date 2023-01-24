package es.um.unosql.design.services;

import java.util.List;

import es.um.unosql.design.services.util.FeatureCollector;
import es.um.unosql.uNoSQLSchema.Aggregate;
import es.um.unosql.uNoSQLSchema.Attribute;
import es.um.unosql.uNoSQLSchema.Key;
import es.um.unosql.uNoSQLSchema.Reference;

public class StructuralVariation
{
  private FeatureCollector featCollector;

  public StructuralVariation()
  {
    featCollector = new FeatureCollector();
  }

  public List<Attribute> getParticularAttributes(es.um.unosql.uNoSQLSchema.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Attribute.class);
  }

  public List<Key> getParticularKeys(es.um.unosql.uNoSQLSchema.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Key.class);
  }

  public List<Reference> getParticularReferences(es.um.unosql.uNoSQLSchema.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Reference.class);
  }

  public List<Aggregate> getParticularAggregates(es.um.unosql.uNoSQLSchema.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Aggregate.class);
  }
}
