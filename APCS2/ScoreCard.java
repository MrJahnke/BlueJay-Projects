import java.util.ArrayList;

public class ScoreCard
{
    private ArrayList<Score> scores;
    
    public ScoreCard()
    {
        scores = new ArrayList<Score>();
        int[] hole = {1,2,3,4,5,6,7,8,9};
        scores.add(new Score("Hole", hole));
        int[] par = {4,5,4,4,3,4,3,5,4};
        scores.add(new Score("Par", par));
    }
    
    public void addScore(Score score)
    {
        scores.add(score);
    }
    
    public String toString()
    {
        String str = "";
        for (Score s : scores )
        {
            str += s + "\n";
        }
        return str;
    }
}
