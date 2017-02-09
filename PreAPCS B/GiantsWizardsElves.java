
/**
 * Write a description of class RockPaperScissors here.
 * 
 * @author Mr Jahnke 
 * @version November 13, 2016
 */
import java.util.Scanner;

public class GiantsWizardsElves
{
   public static void main(String[] args) 
   {
    Scanner kb = new Scanner(System.in);
    final int GIANTS = 1;
    final int WIZARDS = 2;
    final int ELVES = 3;
    
    int input;
    int playerGWE, compGWE;

    System.out.println("Let's play Giants, Wizards, and Elves");
    
    do {
        System.out.print("Enter 1,2,3 for Giants/Wizards/Elves (0 to Quit): ");
        playerGWE = kb.nextInt();
        if (playerGWE==0) break;
        compGWE = (int)(Math.random()*3+1);
        System.out.println("You chose " + setString(playerGWE)+ " and the computer chose " +setString(compGWE));
        
        if (playerGWE==GIANTS && compGWE==ELVES ||
            playerGWE==ELVES && compGWE==WIZARDS ||
            playerGWE==WIZARDS && compGWE==GIANTS)
            {
                //System.out.println("Your "+setString(playerGWE)+" beats "+setString(compGWE));
                System.out.println("You WIN!");
        }
        else if (compGWE==GIANTS && playerGWE==ELVES ||
            compGWE==ELVES && playerGWE==WIZARDS ||
            compGWE==WIZARDS && playerGWE==GIANTS)
            {
                //System.out.println("Your "+setString(playerGWE)+" gets beat by  "+setString(compGWE));
                System.out.println("Your lose");
        }
        else
        {
            //System.out.println("You both chose " + setString(playerGWE)
            System.out.println("Draw");
        }
        System.out.println();
    }while (playerGWE != 0);
    
    System.out.println("Thanks for playing Giants, Wizards, and Elves");
   }
   
   private static String setString(int s) {
       if (s==1) return "Giants";
       else if (s==2) return "Wizards";
       else return "Elves";
    }
}
   
   

