package es.um.unosql.utils.compare;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{ CompareUNoSQLSchemaTest.class, ComparePropertyTest.class, CompareDataTypeTest.class })
public class AllTests {}
