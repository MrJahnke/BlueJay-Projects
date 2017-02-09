import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
    public static void main( String args[] )
    {       
        
        Scanner kb1 = new Scanner(System.in);
        Scanner kb2 = new Scanner(System.in);
        String answer = "y";
        
        while (answer.equals("y"))
        {
            System.out.print("Enter the letter for the box: ");
            String letters = kb1.nextLine();
            char letter = letters.charAt(0);
    
            System.out.print("Enter the size of the box: ");
            int size = kb2.nextInt();
            
            LetterBoxes.printBox(letter, size);
            
            System.out.print("\nDo you want to enter more sample input? ");
            answer = kb1.nextLine();
            System.out.println();
        }
        System.out.print("GoodBye");
    }
}