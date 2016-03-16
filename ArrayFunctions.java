
/**
 * This class implements the methods needed for the interface.  
 * 
 * @author Arion Almond 
 * @version 4/22/14
 */
public class ArrayFunctions implements ArrayFunctionsInterface
{
    /**
     * This method sorts the array in ascending order.
     * A while and for loop combination achieve the process.
     */
    public  double [ ] sortMe(double [ ] array)
    {
        boolean loop = true;
        double temp;
        while(loop)
        {
            loop = false;
            for(int i=0;i<array.length-1;i++)
            {
                if(array[i]>array[i+1])
                {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    loop = true;
                }
            }
            
        }
        return array;
    }
    
    /**
     * This method finds the maximum value of the array.
     * A while and for loop combination achieve the process.
     */
    
    public double getMax(double [ ] array)
    {
        boolean loop = true;
        double max = 0;
        double temp;
        while(loop)
        {
            for(int i=0;i<array.length;i++)
            {
                if(array[i]>max)
                {
                    max = array[i];
                }
            }
            loop = false;
        }
        return max;
    }
    
     /**
     * This method finds the minimum value of the array.
     * A while and for loop combination achieve the process.
     */
    public  double  getMin(double [ ]  array)
    {
        boolean loop = true;
        double min = 10000000;
        double temp;
        while(loop)
        {
            for(int i=0;i<array.length;i++)
            {
                if(array[i]<min)
                {
                    min = array[i];
                }
            }
            loop = false;
        }
        return min;
    }
    
     /**
     * This method indexing the array to locate an element within the array.
     * A for loop achieves the process.
     */
    public  int whereAmI(double [ ] array, double  searchValue)
    {
        double a = searchValue;
        int index = 0;
        for(int i=0;i<array.length;i++)
        {
            if (array[i] == a)
            {
               index = i;
            }
        }
        
        return index;
    }
    
     /**
     * This method adds together the elements of the array.
     * A for loop achieves the process.
     */
    public  double sumMeUp(double [ ] array)
    {
        double a = 0;
        for(int i=0;i<array.length;i++)
        {
            a += array[i];
        }
        return a;
    }
    
     /**
     * This method will reverse the order of an array.
     * A for loop achieves the process.
     */
    public  double [ ] reverseMe(double [ ] array)
    {
        int a = array.length;
        for (int i=1;i<(array.length+1)/2;i++)
        {
            double t = array[i-1];
            array[i-1] = array[a-i];
            array[a-i]=t;

        }
        return array;
    }
    
     /**
     * This method will print the elements of a parameter array.
     * A for loop achieves the process.
     */
    public void printMe(double [ ] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ " "); 
        }
    }
    
     /**
     * This method reads in the original array to the new array.
     * It also will take into account the size of the parameter array
     * and double its size.
     * A for loop achieves the process.
     */
    public double[ ] doubleMySize(double [ ] array)
    {
        int a = array.length;
        int b = 2*a;
        double [] temp = new double [b];
        for(int i = 0; i<array.length; i++)
        {
            temp[i] = array[i];
        }
        
        array = temp;
        return array;
    }

}
