import java.util.Scanner;

public class GolfGame
{ 
    static Scanner kb;
    
    public static void main(String[] args)
    {
        kb = new Scanner(System.in);
        ScoreCard card = new ScoreCard();
        
        card.addScore(createPlayer());
  
        
        System.out.println(card);       

    }
    
    public static Score createPlayer()
    {
        System.out.print("Enter players name: ");
        String name = kb.nextLine();
        Score player = new Score(name);
        int[] scores = new int[9];
        System.out.print("Enter scores for "+player.getPlayer()+": ");
            for (int x=0; x<scores.length; x++)
                scores[x] = Integer.parseInt(kb.next()); 
        player.addScore(scores);
        return player;
    }
}