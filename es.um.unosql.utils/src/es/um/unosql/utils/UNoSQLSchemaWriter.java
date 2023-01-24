package es.um.unosql.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import es.um.unosql.uNoSQLSchema.UNoSQLSchemaPackage;
import es.um.unosql.uNoSQLSchema.uNoSQLSchema;

public class UNoSQLSchemaWriter
{
  private ResourceSet resourceSet;
  private Map<Object, Object> options;

  public UNoSQLSchemaWriter()
  {
    resourceSet = new ResourceManager(UNoSQLSchemaPackage.eINSTANCE).getResourceSet();
    UNoSQLSchemaPackage.eINSTANCE.eResource().setURI(URI.createPlatformResourceURI("/es.um.unosql/model/unosqlschema.ecore", true));
    options = new HashMap<Object,Object>();
    options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
    options.put(XMIResource.OPTION_ENCODING, "UTF-8");
    options.put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
  }

  public Map<Object, Object> getOptions()
  {
    return options;
  }

  public void write(uNoSQLSchema schema, File outputRoute)
  {
    Resource outputRes = resourceSet.createResource(URI.createFileURI(outputRoute.getPath()));
    outputRes.getContents().add(schema);

    try
    {
      outputRes.save(new BufferedOutputStream(Files.newOutputStream(outputRoute.toPath())), options);
    } catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
