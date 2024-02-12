package es.um.uschemap.design.services;

import java.util.List;

import es.um.uschemap.design.services.util.FeatureCollector;
import es.um.uschemap.USchemap.Aggregate;
import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.Key;
import es.um.uschemap.USchemap.Reference;

public class StructuralVariation
{
  private FeatureCollector featCollector;

  public StructuralVariation()
  {
    featCollector = new FeatureCollector();
  }

  public List<Attribute> getParticularAttributes(es.um.uschemap.USchemap.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Attribute.class);
  }

  public List<Key> getParticularKeys(es.um.uschemap.USchemap.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Key.class);
  }

  public List<Reference> getParticularReferences(es.um.uschemap.USchemap.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Reference.class);
  }

  public List<Aggregate> getParticularAggregates(es.um.uschemap.USchemap.StructuralVariation var)
  {
    return featCollector.getParticularFeatures(var, Aggregate.class);
  }
}
