
/**
 * Write a description of class Stars here.
 * 
 * @author Jahnke
 * @version Dec 6, 2016
 */

public class Stars
{
   public static void main(String[] args)
   {
       for (int row=1; row<=10; row++)
       {
           for(int col=0; col<row; col++) 
           {
               System.out.print("*");
           }
           System.out.println();
       }
       
       
       String s="";
       for (int row=1; row<=10; row++)
       {
           s = s + "*";
           System.out.print(s);
           System.out.println();
       }
   }
}
