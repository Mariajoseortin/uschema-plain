package es.um.uschemap.utils;

//import static org.junit.Assert.*;

import java.nio.file.Path;

import org.junit.Before;
import org.junit.Test;

import es.um.uschemap.USchemap.EntityType;
import es.um.uschemap.USchemap.StructuralVariation;
import es.um.uschemap.USchemap.USchemap;

public class ModelIOTest
{
  private EcoreModelIO uSchemaIO;
  private Path modelPath = Path.of("../es.um.uschemap.models/stackoverflow/stackoverflow.xmi");
  private USchemapSerializer serializer;
  private USchemapFactory factory;

  @Before
  public void setUp()
  {
    uSchemaIO = new EcoreModelIO();
    serializer = new USchemapSerializer();
    factory = new USchemapFactory();
  }

  @Test
  public void testOpenWrite()
  {
    USchemap schema = uSchemaIO.load(USchemap.class, modelPath);
    System.out.println(serializer.serialize(schema));
    uSchemaIO.write(schema, Path.of("../es.um.uschemap.models/test.xmi"));
  }

  @Test
  public void testWrite()
  {
    USchemap schema = factory.createUSchemap("SchemaName");
    EntityType eType = factory.createEntityType("EntityType", true);
    schema.getEntities().add(eType);
    StructuralVariation var = factory.createStructuralVariation(1);
    eType.getVariations().add(var);
    var.getFeatures().add(factory.createAttribute("Attr1", factory.createPrimitiveType("String")));
    var.getFeatures().add(factory.createAttribute("Attr2", factory.createPrimitiveType("Number")));

    System.out.println(serializer.serialize(schema));
    uSchemaIO.write(schema, Path.of("../es.um.uschemap.models/test.xmi"));
  }
}
