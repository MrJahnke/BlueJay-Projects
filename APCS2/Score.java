
/**
 * A score for a golf
 * 
 * @author jahnke 
 * @version jan11-17
 */

import java.util.Arrays;

public class Score
{
    // instance variables - replace the example below with your own
    private String player;
    private int[] scores;

    public Score(String n)
    {
        player = n;
        scores = new int[9];
    }
    
    public Score(String n, int[] s)
    {
        player = n;
        scores = new int[9];
        this.addScore(s);
    }
    
    public String getPlayer()
    {
        return player;
    }

    private void clearCard()
    {
        for (int x = 0; x<scores.length; x++)
            scores[x] = 0;
    }
    
    public void addScore(int[] nums)
    {
        for(int x=0; x<scores.length; x++)
            scores[x] = nums[x];
    }
    
    public int getTotal()
    {
        int total = 0;
        for (int x : scores)
            total+=x;
        return total;
    }
    
    public String toString()
    {
        String s = player + "\t";
        for (int x : scores)
            s+= x+ " ";
        if (!getPlayer().equals("Hole"))
            s += ": " +getTotal();
        return s;
    }
}