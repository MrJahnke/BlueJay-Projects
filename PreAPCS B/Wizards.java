import java.util.Scanner;

public class Wizards
{
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      final int GIANTS = 1;
      final int WIZARDS = 2;
      final int ELVES = 3;
      int compGWE, playerGWE = -1;
      
      while (playerGWE !=0) {
          System.out.print("Enter 1)Giants, 2)Wizards, 3)Elves, 0)quit: ");
          playerGWE = kb.nextInt();
          compGWE = (int)(Math.random()*3+1); 
          
          String compChoice ="";
          switch(compGWE) {
                break;
            case 1:   //GIANTS
                compChoice = "Giants";
                break;
            case 2:   //Wizards
                compChoice = "Wizards";
            case 3:   //Elves
                compChoice = "Elves";
                break;
            default:
                System.out.println("Error");
        }
          System.out.println("The computer chose " + compChoice);
          
          if (playerGWE==compGWE)
                System.out.println("Draw");
          else if (playerGWE==GIANTS) {
            if (compGWE==ELVES) 
                System.out.println("Giants beat Elves. You Win");
            if (compGWE==WIZARDS)
                System.out.println("Wizards beat Giants. You Lose");
          }
          else if (playerGWE==WIZARDS) {
            if (compGWE==ELVES) 
                System.out.println("Elves beat Wizards. You Lose");
            if (compGWE==GIANTS)
                System.out.println("Wizards beat Giants. You Win");
          }
          else if (playerGWE==ELVES) {
            if (compGWE==WIZARDS) 
                System.out.println("Elves beat Wizards. You Win");
            if (compGWE==GIANTS)
                System.out.println("Giants beat Elves. You Lose");
          }
          System.out.println();
    }
    System.out.println("\nThanks for playing!");
   }
}
