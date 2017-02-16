public abstract class Vehicle
{
    final static double PRICE_PER_GALLON = 1.91; 
    // instance variables
    private final String model;
    private final String color;
    private final int year;
    private int odometer;
    private final double gasCapacity;
    private double gasRemaining;
    private double mpg;
    
    public Vehicle(String m, String c, int y, int od, double cap)
    {
        model = m;
        color = c;
        year = y;
        odometer = od;
        gasCapacity = cap;
    }    
       
    //public void setGasCapacity(double cap) { gasCapacity = cap;}
    public int getOdometer() {return odometer;}
    public void setOdometer(int m) {odometer = m;}
    public double getGasCapacity () { return gasCapacity; }
    public double getGasRemaining() {return gasRemaining;}
    //public void setMpg(double m) { mpg = m; }
    public void calculateMpg (int miles, double gallons)  {
        mpg = miles / gallons;
    }
    
    public boolean addGas(double g) { 
        double gas = gasRemaining  + g;
        if (gas<=gasCapacity) {
            gasRemaining = gas;
            return true;
        } else {
            return false;
        }
    }
    
    public double fillTank()
    {
        double gasNeeded = gasCapacity - gasRemaining;
        gasRemaining = gasCapacity;
        return gasNeeded;
    }
    
    public double range()
    {
        return gasRemaining * mpg;
    }
    
    public double drive(int miles) {
        if (miles <= range()) {
           odometer += miles;
           return miles / mpg;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString()
    {
        return year + " " + model + " " + color;
    }
    
    public abstract String honk();
}