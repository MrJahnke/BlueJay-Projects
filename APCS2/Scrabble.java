import java.util.Scanner;

public class Scrabble
{
    public static void main(String[] args)
    {
       Scanner kb = new Scanner(System.in);
       ScrabbleTiles gameTiles = new ScrabbleTiles(); 
       String word;
       
       System.out.println("Let's Play SCRABBLE!");
       PlayerTiles myTiles = new PlayerTiles(gameTiles, 7);
       System.out.println(myTiles);
       do {
           System.out.print("Make a word: ");
           word = kb.nextLine().toUpperCase();
           
           int points = myTiles.getScore(word);
           System.out.println(word + " is worth " + points + " points");
           System.out.println("Score: " + myTiles.getPlayerScore());
           System.out.println(myTiles);  
           
           System.out.print("Enter to continue or 'q' to quit? ");
           word=kb.nextLine();
           
       } while (!word.equals("q"));
       System.out.println("Thanks for playing.");
    }
}
    
