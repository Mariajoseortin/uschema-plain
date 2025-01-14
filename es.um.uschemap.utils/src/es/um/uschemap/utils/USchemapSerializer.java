package es.um.uschemap.utils;

import java.util.stream.Collectors;

import es.um.uschemap.USchemap.Aggregate;
import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.DataType;
import es.um.uschemap.USchemap.EntityType;
import es.um.uschemap.USchemap.Feature;
import es.um.uschemap.USchemap.Key;
import es.um.uschemap.USchemap.Null;
import es.um.uschemap.USchemap.PList;
import es.um.uschemap.USchemap.PMap;
import es.um.uschemap.USchemap.PSet;
import es.um.uschemap.USchemap.PTuple;
import es.um.uschemap.USchemap.PrimitiveType;
import es.um.uschemap.USchemap.Reference;
import es.um.uschemap.USchemap.RelationshipType;
import es.um.uschemap.USchemap.SchemaType;
import es.um.uschemap.USchemap.StructuralVariation;
import es.um.uschemap.USchemap.USchemap;

public class USchemapSerializer
{
  private static final String TAB = "  ";
  private static final String ENDL = System.lineSeparator();

  public String serialize(USchemap schema)
  {
    if (schema == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append("USchemap: " + schema.getName() + ENDL);

    for (RelationshipType rel : schema.getRelationships())
      result.append(serialize(rel) + ENDL);

    for (EntityType entity : schema.getEntities())
      result.append(serialize(entity) + ENDL);

    return result.toString();
  }

  private String serialize(RelationshipType rel)
  {
    if (rel == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(TAB + "RelationshipType: " + rel.getName() + ENDL);
    result.append(serialize((SchemaType)rel));

    return result.toString();
  }

  private String serialize(EntityType entity)
  {
    if (entity == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(TAB + "EntityType: " + entity.getName() + (entity.isRoot() ? " (root)" : "") + ENDL);
    result.append(serialize((SchemaType)entity));

    return result.toString();
  }

  private String serialize(SchemaType sType)
  {
    if (sType == null)
      return null;

    StringBuilder result = new StringBuilder();

    if (!sType.getParents().isEmpty())
      result.append(TAB + TAB + "parents: " + sType.getParents().stream().map(parent -> parent.getName()).collect(Collectors.joining(", ")) + ENDL);

    for (StructuralVariation stVariation : sType.getVariations())
      result.append(serialize(stVariation));

    return result.toString();
  }

  private String serialize(StructuralVariation var)
  {
    if (var == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append(TAB + TAB + "var " + var.getVariationId() + "(count: " + var.getCount() + ")(initTs: " + var.getFirstTimestamp() + ")(lastTs: " + var.getLastTimestamp() + ")" + ENDL);

    for (Feature prop : var.getFeatures())
      result.append(TAB + TAB + TAB + serialize(prop) + ENDL);

    return result.toString();
  }

  public String serialize(Feature feature)
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

  public String serialize(Attribute attribute)
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

  public String serialize(Aggregate aggr)
  {
    if (aggr == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append(aggr.getName()  + (aggr.isOptional() ? "?" : "") + "[" + aggr.getLowerBound() + ".." + aggr.getUpperBound() + "] : ");
    result.append(aggr.getAggregates().stream().map(v -> v.getContainer().getName() + "_" + v.getVariationId()).collect(Collectors.joining(", ")));

    return result.toString();
  }

  public String serialize(Reference ref)
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

  public String serialize(Key key)
  {
    if (key == null)
      return null;

    StringBuilder result = new StringBuilder();
    result.append("+" + key.getName() + " : " + key.getAttributes().stream().map(attr -> attr.getName()).collect(Collectors.joining(", ")));

    return result.toString();
  }

  public String serialize(DataType type)
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
