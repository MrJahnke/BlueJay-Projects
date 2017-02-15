public abstract class Vehicle
{
     final static double PRICE_PER_GALLON = 1.91;
    // abstract static double 
    // instance variables
    private final String model;
    private final String color;
    private final int year;
    private int odometer;
    private double gasCapacity;
    private double gasRemaining;
    private double mpg;
    
    public Vehicle(String m, String c, int y)
    {
        model = m;
        color = c;
        year = y;
    }
    
    @Override
    public String toString()
    {
        return year + " " + color + " " + model;
    }
    
    public abstract String honk();
    
    public void setGasCapacity(double cap) { gasCapacity = cap;}
    public int getOdometer() {return odometer;}
    public void setOdometer(int m) {odometer = m;}
    public double getGasRemaining() {return gasRemaining;}
    public double addGas(double g) { 
        double gas = gasRemaining  + g;
        if (gas<=gasCapacity) {
            gasRemaining = gas;
            return gas * Vehicle.PRICE_PER_GALLON;
        } else {
            return 0;
        }
    }
    public double fillTank()
    {
        double gasNeeded = gasCapacity - gasRemaining;
        gasRemaining = gasCapacity;
        return gasNeeded * Vehicle.PRICE_PER_GALLON;
    }
    
    public void setMpg(double m) { mpg = m; }
    public void calculateMpg (int miles, double gallons)  {
        mpg = miles / gallons;
    }
    public double range()
    {
        return gasRemaining * mpg;
    }
    
    public double trip(int miles) {
        if (miles <= range()) {
           odometer += miles;
           return miles / mpg * PRICE_PER_GALLON;
        } else {
            return 0;
        }
        
    }
    
    
}

