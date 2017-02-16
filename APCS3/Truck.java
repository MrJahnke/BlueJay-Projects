public class Truck extends Vehicle
{
    // instance variables - replace the example below with your own
    private double cargo;
    
    public Truck(String m, String c, int y, int od, double cap, double crgo)
    {
        super(m,c,y,od, cap);
        cargo = crgo;
    }
    
    public Truck(String m, String c, int y)
    {
        super(m,c,y,0, 150);
        cargo = 80000;
    }
    
    public Truck()
    {
        this("Truck", "Black", 2016, 0, 200, 97000);
    }
    
    public double getCargo() { return cargo; }

    public String honk()
    {
       return "H-H-O-O-O-NK!";
    }
    
    public double costPerHundred(int miles)
    {
        double cost = drive(miles) * PRICE_PER_GALLON;
        return cost / cargo / 100;
    }
}
