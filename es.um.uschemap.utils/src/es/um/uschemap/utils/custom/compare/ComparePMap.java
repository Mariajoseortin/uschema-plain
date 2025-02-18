package es.um.uschemap.utils.custom.compare;

import es.um.uschemap.USchemap.PMap;

public class ComparePMap extends Comparator<PMap>
{
  @Override
  public boolean compare(PMap m1, PMap m2)
  {
    if (super.checkNulls(m1, m2))
      return false;

    if (super.checkEquals(m1, m2))
      return true;

    return ((m1.getKeyType() == null && m2.getKeyType() == null) || new ComparePrimitiveType().compare(m1.getKeyType(), m2.getKeyType()))
        && ((m1.getValueType() == null && m2.getValueType() == null) || new CompareDataType().compare(m1.getValueType(), m2.getValueType()));
  }
}
