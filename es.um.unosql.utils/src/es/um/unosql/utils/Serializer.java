package es.um.unosql.utils;

import java.util.stream.Collectors;

import es.um.unosql.uNoSQLSchema.Aggregate;
import es.um.unosql.uNoSQLSchema.Attribute;
import es.um.unosql.uNoSQLSchema.DataType;
import es.um.unosql.uNoSQLSchema.Feature;
import es.um.unosql.uNoSQLSchema.Key;
import es.um.unosql.uNoSQLSchema.Null;
import es.um.unosql.uNoSQLSchema.PList;
import es.um.unosql.uNoSQLSchema.PMap;
import es.um.unosql.uNoSQLSchema.PSet;
import es.um.unosql.uNoSQLSchema.PTuple;
import es.um.unosql.uNoSQLSchema.PrimitiveType;
import es.um.unosql.uNoSQLSchema.Reference;
import es.um.unosql.uNoSQLSchema.StructuralVariation;

public class Serializer
{
  public static String serialize(StructuralVariation eVariation)
  {
    if (eVariation == null)
      return null;

    return eVariation.getContainer().getName() + "_" + eVariation.getVariationId();
  }

  public static String serialize(Feature feature)
  {
    if (feature == null)
      return null;

    StringBuilder result = new StringBuilder();

    if (feature instanceof Attribute)
      result.append(serialize((Attribute)feature));

    if (feature instanceof Reference)
      result.append(serialize((Reference)feature));

    if (feature instanceof Aggregate)
      result.append(serialize((Aggregate)feature));

    if (feature instanceof Key)
      result.append(serialize((Key)feature));

    return result.toString();
  }

  public static String serialize(Attribute attribute)
  {
    if (attribute == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append(attribute.getName() + (attribute.isOptional() ? "?" : ""));
    result.append(" : " + serialize(attribute.getType()));

    if (attribute.getKey() != null)
      result.append(" (key: " + attribute.getKey().getName() + ")");

    if (!attribute.getReferences().isEmpty())
      result.append(" (refs: " + attribute.getReferences().stream().map(ref -> ref.getRefsTo().getName()).collect(Collectors.joining(", ")) + ")");

    return result.toString();
  }

  public static String serialize(Aggregate aggr)
  {
    if (aggr == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append(aggr.getName()  + (aggr.isOptional() ? "?" : "") + "[" + aggr.getLowerBound() + ".." + aggr.getUpperBound() + "] : ");
    result.append(aggr.getAggregates().stream().map(v -> v.getContainer().getName() + "_" + v.getVariationId()).collect(Collectors.joining(", ")));

    return result.toString();
  }

  public static String serialize(Reference ref)
  {
    if (ref == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append(ref.getName() + "[" + ref.getLowerBound() + ".." + ref.getUpperBound() + "] : " + ref.getRefsTo().getName());

    if (ref.getOpposite() != null)
      result.append(" (opp: " + ref.getOpposite().getName() + ")");

    if (!ref.getIsFeaturedBy().isEmpty())
      result.append(" (feat: " + ref.getIsFeaturedBy().stream().map(v -> v.getContainer().getName() + "_" + v.getVariationId()).collect(Collectors.joining(", ")) + ")");

    if (!ref.getAttributes().isEmpty())
      result.append(" (attrs: " + ref.getAttributes().stream().map(attr -> attr.getName()).collect(Collectors.joining(", ")) + ")");

    return result.toString();
  }

  public static String serialize(Key key)
  {
    if (key == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append("+" + key.getName() + " : " + key.getAttributes().stream().map(attr -> attr.getName()).collect(Collectors.joining(", ")));

    return result.toString();
  }

  public static String serialize(DataType type)
  {
    if (type == null)
      return null;

    StringBuilder result = new StringBuilder();

    if (type instanceof PrimitiveType)
      result.append(((PrimitiveType)type).getName());
    if (type instanceof Null)
        result.append("null");
    else if (type instanceof PList)
      result.append("PList<" + serialize(((PList)type).getElementType()) + ">");
    else if (type instanceof PSet)
        result.append("PSet<" + serialize(((PSet)type).getElementType()) + ">");
    else if (type instanceof PTuple)
      result.append("PTuple<" + ((PTuple)type).getElements().stream().map(e -> serialize(e)).collect(Collectors.joining(", ")) + ">");
    else if (type instanceof PMap)
        result.append("PMap<" + serialize(((PMap)type).getKeyType()) 
          + "," + serialize(((PMap)type).getValueType()) + ">");
    
    return result.toString();
  }
}
