
public class Apartment implements Comparable
{
    // instance variables - replace the example below with your own
    private int occupancy;
    private String owner;

    public Apartment(String own, int occ)
    {
        owner = own;
        occupancy = occ;
    }

    public Apartment()
    {
        int ran = (int)(Math.random()*6);
        if (ran == 0)
        {
            owner = "single";
            occupancy = 1;
        }
        else if (ran == 1 || ran ==2)
        {
            owner = "couple";
            occupancy = 2;
        }
        else
        {
            owner = "family";
            occupancy = (int)(Math.random()*4)+3;
        }
            
    }
    public int getOccupancy()
    {
       return occupancy;
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public String toString()
    {
        return owner + ", " + occupancy; 
    }
    
    public int compareTo(Object other)
    {
        return this.occupancy - ((Apartment)other).getOccupancy();
    }
}
