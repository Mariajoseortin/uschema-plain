package es.um.unosql.utils.compare;

import es.um.unosql.uNoSQLSchema.PList;

public class ComparePList extends Comparator<PList>
{
  @Override
  public boolean compare(PList l1, PList l2)
  {
    if (super.checkNulls(l1, l2))
      return false;

    if (super.checkEquals(l1, l2))
      return true;

    return (l1.getElementType() == null && l2.getElementType() == null)
        || new CompareDataType().compare(l1.getElementType(), l2.getElementType());
  }
}
