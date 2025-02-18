package es.um.uschemap.utils.compare;

import es.um.uschemap.USchemap.Null;

public class CompareNull extends Comparator<Null>
{
  @Override
  public boolean compare(Null n1, Null n2)
  {
    if (super.checkNulls(n1, n2))
      return false;

    if (super.checkEquals(n1, n2))
      return true;

    return true;
  }
}
