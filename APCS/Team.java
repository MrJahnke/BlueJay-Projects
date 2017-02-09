import java.util.*;

public class Team {
    private ArrayList plyrs; 
    
    public Team( ){
        plyrs = new ArrayList( ); 
    }
    
    //precondition: p != null
    public Team addPlayer(Player p) //Computer??
    {
        if (p == null) {
            throw new NullPointerException( );//<*1> 
        }
        else {
            plyrs.add(p);
        }
        return this; 
    }
//... more methods

    public double weight( ) //weight of entire team 
    {
        int sum = 0;
        for (int k=0; k<plyrs.size(); ++k) {
            //Player p =  (Player)plyrs.get(k);
            //sum += p.getWeight();
            sum += ((Player)plyrs.get(k)).getWeight( ); //<*2> 
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        Team t = new Team();
        Player x = null;
        //t.addPlayer(x);   throws error
        Player p = new PlayerInfo();
        PlayerInfo bp = new PlayerInfo();
        t.addPlayer(bp);
        t.addPlayer(p);
        System.out.println(p.getWeight());
        System.out.println(t.weight());
        
    }
}