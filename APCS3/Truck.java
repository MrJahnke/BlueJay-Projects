

public class Truck extends Vehicle
{
    // instance variables - replace the example below with your own
    private int cargo;
    
    public Truck(String m, String c, int y)
    {
        super(m,c,y);
        cargo = 1000;
    }
    
    public Truck()
    {
        super("Truck", "Black", 2017);
    }

    public String honk()
    {
       return "RRRrrrrr";
    }
}
