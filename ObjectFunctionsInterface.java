/**
 * This interface specifies several
 * methods for operations on Object class.
 * 
 * @author Arion Almond
 * @version 4/22/2014
 */

public interface ObjectFunctionsInterface
{
	public  Object sort(Object o);
	public  double  getMaximum(Object o);
 	public  double getMinimum(Object o);
    public  int whereIbe(Object o, double  searchValue);
    public  double sum(Object o);
	public  Object reverse(Object o);
    public  void print(Object o);
    public  Object doubleSize(Object o);
}

