import java.util.Scanner;
public class Giants
{
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      final int GIANTS = 1;
      final int WIZARDS = 2;
      final int ELVES = 3;
      int compGWE, playerGWE = -1;
      
      while (playerGWE !=0) {
          System.out.print("Enter 1,2,3 for Giants,Wizards,Elves: ");
          playerGWE = kb.nextInt();
          compGWE = (int)(Math.random()*3+1);
          
          // Using AND and OR
          if (playerGWE==GIANTS && compGWE==ELVES ||
              playerGWE==ELVES && compGWE==WIZARDS ||
              playerGWE==WIZARDS && compGWE==GIANTS) {
                System.out.println("Player wins");
          }
          // else if (more code for Computer wins  
         
          // Using only if else
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
    }
   }
}
