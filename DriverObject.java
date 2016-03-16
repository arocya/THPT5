/**
 * This is the Driver for the Object class
 * 
 * @author Arion Almond
 * @version 4/22/2014
 */
public class DriverObject
{
   public static void main(String [ ] args)
   { 
       Object test = new Object();
       Object o = new Object();
       System.out.println("This is the original object: ");
       o.print(test);
       System.out.println();
       
       System.out.println("\nThis is a test of the sortMe( ) method and the printMe( ) methods. ");
       test = o.sort(test);
       o.print(test);
       System.out.println();
       
       System.out.println("\nThis is a test of getMax( )");
       System.out.println("The maximum value in the array is: " +o.getMaximum(test));
       
       System.out.println("\nThis is a test of getMin( )");
       System.out.println("The minimum value in the array is: " + o.getMinimum(test));
       
       System.out.println("\nThis is a test of sumMeUp( )");
       System.out.println("The sum of the values in the array is: " +o.sum(test));
       
       System.out.println("\nThis is a test of reverseMe( )");
       test = o.reverse(test);
       o.print(test);
       System.out.println();
       
       System.out.println("\nThis is a test of whereAmI( )");
       System.out.println("The value 8 is at subscript " + o.whereIbe(test, 8));
       
       System.out.println("\nThis is a test of doubleMySize(  )");
       test = o.doubleSize(test);
       o.print(test);
       System.out.println();
       
       System.out.println("\nEnd of tests");
    } //end of main( )
       
}//end of Driver class

