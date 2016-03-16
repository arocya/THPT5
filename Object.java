
/**
 * This class is a framework for our previous THPT.  This framework
 * sets up the ability to use any Object instead of just arrays.
 * Being that we don't know which objects will be used I have left
 * it as a framework.  The methods are left similar to the ones
 * used before to incorporate new functionalilty once the objects 
 * are created and implemented.  
 * 
 * @author Arion Almond 
 * @version 4/22/2014
 */
public class Object implements ObjectFunctionsInterface
{
    public Object sort(Object o)
    {
        Object x = new Object();
        //         boolean loop = true;
        //         double temp;
        //         while(loop)
        //         {
        //             loop = false;
        //             for(int i=0;i<o.length-1;i++)
        //             {
        //                 if(array[i]>array[i+1])
        //                 {
        //                     temp = array[i];
        //                     array[i] = array[i+1];
        //                     array[i+1] = temp;
        //                     loop = true;
        //                 }
        //             }
        //             
        //         }
        return x;
    }
    
    public double getMaximum(Object o)
    {
        double x = 0;
        //         boolean loop = true;
        //         double max = 0;
        //         double temp;
        //         while(loop)
        //         {
        //             for(int i=0;i<array.length;i++)
        //             {
        //                 if(array[i]>max)
        //                 {
        //                     max = array[i];
        //                 }
        //             }
        //             loop = false;
        //         }
        return x;
    }
    
    public double getMinimum(Object o)
    {
        boolean loop = true;
        double min = 10000000;
        //         double temp;
        //         while(loop)
        //         {
        //             for(int i=0;i<array.length;i++)
        //             {
        //                 if(array[i]<min)
        //                 {
        //                     min = array[i];
        //                 }
        //             }
        //             loop = false;
        //         }
        return min;
    }
    
    public int whereIbe(Object o, double  searchValue)
    {
        Object x = new Object();
        double a = searchValue;
        int index = 0;
        //         for(int i=0;i<array.length;i++)
        //         {
        //             if (array[i] == a)
        //             {
        //                index = i;
        //             }
        //         }
        //         
        return index;
    }
    
    public double sum(Object o)
    {
        double a = 0;
        //         for(int i=0;i<array.length;i++)
        //         {
        //             a += array[i];
        //         }
        return a;
    }
    
    public Object reverse(Object o)
    {
        Object x = new Object();
        //         int a = array.length;
        //         for (int i=1;i<(array.length+1)/2;i++)
        //         {
        //             double t = array[i-1];
        //             array[i-1] = array[a-i];
        //             array[a-i]=t;
        // 
        //         }
        return x;
    }
    
    public  void print(Object o)
    {
        //         for (int i = 0; i < array.length; i++)
        //         {
        //             System.out.print(array[i]+ " "); 
        //         }
    }
    
    public Object doubleSize(Object o)
    {
        Object x = new Object();
        
        //         int a = array.length;
        //         int b = 2*a;
        //         double [] temp = new double [b];
        //         for(int i = 0; i<array.length; i++)
        //         {
        //             temp[i] = array[i];
        //         }
        //         
        //         array = temp;
        return x;
    }

}

