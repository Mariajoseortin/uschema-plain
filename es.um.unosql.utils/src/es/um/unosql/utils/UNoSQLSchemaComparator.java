package es.um.unosql.utils;

import java.io.File;
import es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage;
import es.um.unosql.uNoSQLSchema.uNoSQLSchema;
import es.um.unosql.utils.compare.CompareUNoSQLSchema;

public class UNoSQLSchemaComparator
{
  public boolean compare(String route1, String route2)
  {
    return compare(new File(route1), new File(route2));
  }

  public boolean compare(File model1, File model2)
  {
    ModelLoader loader = new ModelLoader(UNoSQLSchemaPackage.eINSTANCE);
    uNoSQLSchema schema1 = loader.load(model1, uNoSQLSchema.class);
    uNoSQLSchema schema2 = loader.load(model2, uNoSQLSchema.class);

    return compare(schema1, schema2);
  }

  public boolean compare(uNoSQLSchema schema1, uNoSQLSchema schema2)
  {
    return new CompareUNoSQLSchema().compare(schema1, schema2);
  }
}
