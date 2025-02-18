package es.um.uschemap.utils.compare;

import es.um.uschemap.USchemap.Aggregate;
import es.um.uschemap.USchemap.Attribute;
import es.um.uschemap.USchemap.StructuralFeature;

public class CompareStructuralFeature extends Comparator<StructuralFeature>
{
  @Override
  public boolean compare(StructuralFeature f1, StructuralFeature f2)
  {
    if (super.checkNulls(f1, f2))
      return false;

    if (super.checkEquals(f1, f2))
      return true;

    if (f1.isOptional() ^ f2.isOptional())
      return false;

    if (f1 instanceof Attribute && f2 instanceof Attribute)
      return new CompareAttribute().compare((Attribute)f1, (Attribute)f2);

    if (f1 instanceof Aggregate && f2 instanceof Aggregate)
      return new CompareAggregate().compare((Aggregate)f1, (Aggregate)f2);

    return false;
  }
}
