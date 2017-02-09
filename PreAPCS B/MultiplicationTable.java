
/**
 * Write a description of class MultipicationTable here.
 * 
 * @author Jahnke
 * @version Dec 6, 2016
 */
public class MultiplicationTable
{
   public static void main(String[] args)
   {
       for (int row=1; row<=10; row++)
       {
           for(int col=1; col<=10; col++) 
           {
               System.out.print(row*col+"\t");
           }
           System.out.println(); 
       }
   }
}
