
/**
 * Write a description of class Clock here.
 * 
 * @author Jahnke 
 * @version December 6, 2016
 */
public class Clock
{
   public static void main(String[] args)
   {
       for (int hour=1; hour<=4; hour++)
       {
           for(int mins=10; mins<60; mins+=5) 
           {
               System.out.print(hour+":"+mins+" ");
           }
           System.out.println(); 
       }
   }
}
