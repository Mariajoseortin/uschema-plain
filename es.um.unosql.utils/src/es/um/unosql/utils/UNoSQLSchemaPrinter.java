package es.um.unosql.utils;

import java.io.File;
import java.util.stream.Collectors;

import es.um.unosql.uNoSQLSchema.EntityType;
import es.um.unosql.uNoSQLSchema.Feature;
import es.um.unosql.uNoSQLSchema.RelationshipType;
import es.um.unosql.uNoSQLSchema.StructuralVariation;
import es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage;
import es.um.unosql.uNoSQLSchema.uNoSQLSchema;


public class UNoSQLSchemaPrinter
{
  private static final String TAB = "  ";
  private static final String ENDL = System.lineSeparator();

  public static void main(String[] args)
  {
    UNoSQLSchemaPrinter printer = new UNoSQLSchemaPrinter();
    String INPUT_FOLDER = "../es.um.nosql.models/";
    String[] input_models = new String[] {/*"everypolitician_sweden", "facebook", "harvard", "links","mongomovies", "opensanctions",
        "proteins", "publications", "stackoverflow", "urban", "webclicks",*/ "mongosongs"};

    for (String input_model : input_models)
    {
      String inputFile = INPUT_FOLDER + input_model + "/" + input_model + ".xmi";
      System.out.println(printer.prettyPrint(inputFile));
    }
  }

  public String prettyPrint(String inputFile)
  {
    ModelLoader loader = new ModelLoader(UNoSQLSchemaPackage.eINSTANCE);
    uNoSQLSchema nosqlschema = loader.load(new File(inputFile), uNoSQLSchema.class);

    return prettyPrint(nosqlschema);
  }

  public String prettyPrint(uNoSQLSchema schema)
  {
    if (schema == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append("NoSQLSchema name: " + schema.getName() + ENDL);

    for (RelationshipType rel : schema.getRelationships())
      result.append(prettyPrint(rel, TAB));

    for (EntityType entity : schema.getEntities())
      result.append(prettyPrint(entity, TAB));

    return result.toString();
  }

  public String prettyPrint(RelationshipType rel)
  {
    return prettyPrint(rel, "");
  }

  private String prettyPrint(RelationshipType rel, String defTabs)
  {
    if (rel == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(defTabs + "RelationshipType name: " + rel.getName() + ENDL);

    if (!rel.getParents().isEmpty())
      result.append(defTabs + TAB + "parents: " + rel.getParents().stream().map(parent -> parent.getName()).collect(Collectors.joining(", ")) + ENDL);

    for (StructuralVariation stVariation : rel.getVariations())
      result.append(prettyPrint(stVariation, defTabs + TAB));

    return result.toString();
  }

  public String prettyPrint(EntityType entity)
  {
    return prettyPrint(entity, "");
  }

  private String prettyPrint(EntityType entity, String defTabs)
  {
    if (entity == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(defTabs + "EntityType name: " + entity.getName() + (entity.isRoot() ? " (root)" : "") + ENDL);

    if (!entity.getParents().isEmpty())
      result.append(defTabs + TAB + "parents: " + entity.getParents().stream().map(parent -> parent.getName()).collect(Collectors.joining(", ")) + ENDL);

    for (StructuralVariation stVariation : entity.getVariations())
      result.append(prettyPrint(stVariation, defTabs + TAB));

    return result.toString();
  }

  public String prettyPrint(StructuralVariation eVariation)
  {
    return prettyPrint(eVariation, "");
  }

  private String prettyPrint(StructuralVariation stVariation, String defTabs)
  {
    if (stVariation == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(defTabs + "StructuralVariation vId: " + stVariation.getVariationId() + " count: " + stVariation.getCount() +
        " initTs: " + stVariation.getFirstTimestamp() + " lastTs: " + stVariation.getLastTimestamp() + ENDL);
    for (Feature prop : stVariation.getFeatures())
      result.append(prettyPrint(prop, defTabs + TAB));

    return result.toString();
  }

  public String prettyPrint(Feature property)
  {
    return prettyPrint(property, "");
  }

  private String prettyPrint(Feature property, String defTabs)
  {
    if (property == null)
      return null;

    StringBuilder result = new StringBuilder();

    result.append(defTabs + Serializer.serialize(property) + ENDL);

    return result.toString();
  }
}
