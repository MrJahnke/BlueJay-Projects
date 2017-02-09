
/**
 * A class that the firstname, middle name, and last name, of 
 * from the user and m;ake a Monogram.
 * 
 * @author JJahnke
 * @version Oct 17, 2016
 */

import java.util.Scanner;

public class MonogramMaker
{
   public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       
       String fName, mName, lName, monogram;
       
       System.out.println("Let's Make a Monogram!\n");
       System.out.print("Enter your FIRST name: ");
       fName = kb.nextLine();
       System.out.print("Enter your MIDDLE name: ");
       mName = kb.nextLine();
       System.out.print("Enter your LAST name: ");
       lName = kb.nextLine();
       
       monogram = fName.substring(0,1).toLowerCase() + lName.substring(0,1).toUpperCase() +
                    mName.substring(0,1).toLowerCase();
       System.out.println("\nYour monogram is " + monogram);
       
       
    }     
  
}

/*
 * Let's Make a Monogram!

Enter your FIRST name: Franklin
Enter your MIDDLE name: Delano
Enter your LAST name: Rosevelt

Your monogram is fRd
*/

