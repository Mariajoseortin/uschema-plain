package es.um.uschemap.utils.compare;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{ CompareUSchemapTest.class, ComparePropertyTest.class, CompareDataTypeTest.class })
public class AllTests {}
