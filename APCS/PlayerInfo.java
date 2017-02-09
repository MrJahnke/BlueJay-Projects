
public class PlayerInfo implements Player
{

    private int weight;
    private double height;
    public PlayerInfo()
    {
        height = 180;
        weight = 80;
    }
    public double getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
}

