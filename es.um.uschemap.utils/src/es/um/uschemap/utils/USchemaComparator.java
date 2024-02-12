package es.um.uschemap.utils;

import java.nio.file.Path;

import es.um.uschemap.USchemap.USchemapPackage;
import es.um.uschemap.USchemap.USchemap;
import es.um.uschemap.utils.compare.CompareUSchemap;

public class USchemapComparator
{
  public boolean compare(Path model1Path, Path model2Path)
  {
    EcoreModelIO uSchemaIO = new EcoreModelIO(USchemapPackage.eINSTANCE);
    USchemap schema1 = uSchemaIO.load(USchemap.class, model1Path);
    USchemap schema2 = uSchemaIO.load(USchemap.class, model2Path);

    return compare(schema1, schema2);
  }

  public boolean compare(USchemap schema1, USchemap schema2)
  {
    return new CompareUSchemap().compare(schema1, schema2);
  }
}
