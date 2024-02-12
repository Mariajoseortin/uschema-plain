package es.um.uschemap.utils.compare;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.EntityType;
import es.um.uschemap.USchemap.RelationshipType;
import es.um.uschemap.USchemap.StructuralVariation;
import es.um.uschemap.USchemap.USchemapFactory;
import es.um.uschemap.USchemap.USchemap;

public class CompareUSchemapTest
{
  private CompareUSchemap cSchema;
  private CompareSchemaType cSchemaType;
  private CompareRelationshipType cRel;
  private CompareEntityType cEntity;
  private CompareStructuralVariation cVariation;

  @Before
  public void setUp()
  {
    cSchema = new CompareUSchemap();
    cSchemaType = new CompareSchemaType();
    cRel = new CompareRelationshipType();
    cEntity = new CompareEntityType();
    cVariation = new CompareStructuralVariation();
  }

  /**
   * TestUSchemap SHOULD check: Name and RelationshipType/EntityType comparison with SchemaType.
   */
  @Test
  public void testUSchemap()
  {
    assertFalse(cSchema.compare(null, null));

    assertTrue(cSchema.compare(createUSchemap("name", null, null), createUSchemap("name", null, null)));
    assertFalse(cSchema.compare(createUSchemap("name1", null, null), createUSchemap("name2", null, null)));

    assertFalse(cSchema.compare(createUSchemap("name", new String[] {"entityName"}, null),
        createUSchemap("name", null, null)));
    assertTrue(cSchema.compare(createUSchemap("name", new String[] {"entityName1", "entityName2"}, null),
        createUSchemap("name", new String[] {"entityName1", "entityName2"}, null)));

    assertFalse(cSchema.compare(createUSchemap("name", null, new String[] {"refName"}),
        createUSchemap("name", null, null)));
    assertFalse(cSchema.compare(createUSchemap("name", null, new String[] {"refName1"}),
        createUSchemap("name", null, new String[] {"refName2"})));
  }

  /**
   * TestClassifier SHOULD check: Name, Parents, StructuralVariations and RelationshipType/EntityType comparison.
   * TestClassifier SHOULD NOT check: IsRoot
   */
  @Test
  public void testSchemaType()
  {
    assertFalse(cSchemaType.compare(null, null));

    assertTrue(cSchemaType.compare(createRel("name", null), createRel("name", null)));
    assertFalse(cSchemaType.compare(createRel("name1", null), createRel("name2", null)));

    assertTrue(cSchemaType.compare(createEntity("name", false, null), createEntity("name", false, null)));
    assertFalse(cSchemaType.compare(createEntity("name1", false, null), createEntity("name2", false, null)));

    assertTrue(cSchemaType.compare(createEntity("name", false, new String[] {"parent1", "parent2"}), createEntity("name", false, new String[] {"parent1", "parent2"})));
    assertFalse(cSchemaType.compare(createEntity("name", false, new String[] {"parent1", "parent2"}), createEntity("name", false, new String[] {"parent1"})));

    assertFalse(cSchemaType.compare(createRel("name", null, 1, 2, 3), createRel("name", null, 1)));
    assertTrue(cSchemaType.compare(createRel("name", null, 1, 2, 3), createRel("name", null, 3, 2, 1)));
    assertFalse(cSchemaType.compare(createRel("name", null, 1, 2, 3), createRel("name", null, 1, 2, 3, 4)));
  }

  /**
   * TestRelationshipType SHOULD NOT check: Name and StructuralVariation
   */
  @Test
  public void testRelationshipType()
  {
    assertFalse(cRel.compare(null, null));

    assertFalse(cRel.compare(createRel("name", null), null));
    assertFalse(cRel.compare(null, createRel("name", null)));

    assertTrue(cRel.compare(createRel("name", null, 1, 2, 3), createRel("name", null, 1, 2, 3)));
    assertTrue(cRel.compare(createRel("name", null, 1, 2, 3), createRel("name", null, 1)));

    assertTrue(cRel.compare(createRel(null, null), createRel("name", null)));
    assertTrue(cRel.compare(createRel("aaa", null), createRel("bbb", null)));
  }

  /**
   * TestEntityType SHOULD check: IsRoot
   * TestEntityType SHOULD NOT check: Name and StructuralVariation
   */
  @Test
  public void testEntityType()
  {
    assertFalse(cEntity.compare(null, null));

    assertFalse(cEntity.compare(createEntity("name", false, null), null));
    assertFalse(cEntity.compare(null, createEntity("name", false, null)));

    assertTrue(cEntity.compare(createEntity("name1", false, null), createEntity("name2", false, null)));
    assertFalse(cEntity.compare(createEntity("name1", false, null), createEntity("name2", true, null)));

    assertTrue(cEntity.compare(createEntity("name", false, null, 1, 2, 3), createEntity("name", false, null, 1, 2, 3)));
    assertTrue(cEntity.compare(createEntity("name", false, null, 1, 2, 3), createEntity("name", false, null, 1)));

    assertTrue(cEntity.compare(createEntity(null, false, null), createEntity("name", false, null)));
    assertTrue(cEntity.compare(createEntity("aaa", false, null), createEntity("bbb", false, null)));
  }

  /**
   * TestStructuralVariation SHOULD check: Properties
   * TestStructuralVariation SHOULD NOT check: VariationId, Count and Timestamp
   */
  @Test
  public void testStructuralVariation()
  {
    assertFalse(cVariation.compare(null, null));

    assertTrue(cVariation.compare(createVar(0, 0, 0), createVar(0, 0, 0)));
    assertTrue(cVariation.compare(createVar(0, 0, 0), createVar(1, 0, 0)));
    assertTrue(cVariation.compare(createVar(0, 0, 0), createVar(0, 1, 0)));
    assertTrue(cVariation.compare(createVar(0, 0, 0), createVar(0, 0, 1)));

    assertFalse(cVariation.compare(createVar(0, 0, 0), createVar(0, 0, 0, "prop1")));
    assertTrue(cVariation.compare(createVar(0, 0, 0, "prop1"), createVar(0, 0, 0, "prop1")));
    assertTrue(cVariation.compare(createVar(0, 0, 0, "prop1", "prop2"), createVar(0, 0, 0, "prop2", "prop1")));
  }

  private USchemap createUSchemap(String name, String[] entities, String[] refs)
  {
    USchemap schema = USchemapFactory.eINSTANCE.createUSchemap();
    schema.setName(name);

    if (entities != null)
      for (String e : entities)
      {
        EntityType entity = USchemapFactory.eINSTANCE.createEntityType();
        entity.setName(e);
        schema.getEntities().add(entity);
      }

    if (refs != null)
      for (String ref : refs)
      {
        RelationshipType reference = USchemapFactory.eINSTANCE.createRelationshipType();
        reference.setName(ref);
        schema.getRelationships().add(reference);
      }

    return schema;
  }

  private EntityType createEntity(String name, boolean root, String[] parents, Integer... varIds)
  {
    EntityType entity = USchemapFactory.eINSTANCE.createEntityType();
    entity.setName(name);
    entity.setRoot(root);

    if (parents != null)
      for (String parentName : parents)
      {
        EntityType parent = USchemapFactory.eINSTANCE.createEntityType();
        parent.setName(parentName);
        entity.getParents().add(parent);
      }

    for (int varId : varIds)
    {
      StructuralVariation var = USchemapFactory.eINSTANCE.createStructuralVariation();
      var.setVariationId(varId);
      entity.getVariations().add(var);
    }

    return entity;
  }

  private RelationshipType createRel(String name, String[] parents, Integer... varIds)
  {
    RelationshipType ref = USchemapFactory.eINSTANCE.createRelationshipType();
    ref.setName(name);

    if (parents != null)
      for (String parentName : parents)
      {
        EntityType parent = USchemapFactory.eINSTANCE.createEntityType();
        parent.setName(parentName);
        ref.getParents().add(parent);
      }

    for (int varId : varIds)
    {
      StructuralVariation var = USchemapFactory.eINSTANCE.createStructuralVariation();
      var.setVariationId(varId);
      ref.getVariations().add(var);
    }

    return ref;
  }

  private StructuralVariation createVar(int varId, long count, long ts, String... props)
  {
    StructuralVariation variation = USchemapFactory.eINSTANCE.createStructuralVariation();
    variation.setVariationId(varId);
    variation.setCount(count);
    variation.setFirstTimestamp(ts);

    for (String prop : props)
    {
      Attribute nullProp = USchemapFactory.eINSTANCE.createAttribute();
      nullProp.setName(prop);
      nullProp.setType(USchemapFactory.eINSTANCE.createNull());
      variation.getFeatures().add(nullProp);
    }

    return variation;
  }
}
