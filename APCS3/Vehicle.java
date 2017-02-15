public abstract class Vehicle
{
    public final static double PRICE_OF_GAS = 1.91;
    // instance variables
    private String model;
    private String color;
    private int year;
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
    
    public String toString()
    {
        return year + " " + color + " " + model;
    }
    
    public abstract String honk();
    
    public int getOdometer() return odometer;
    public void setOdometer(int m) odometer = m;
    public int getGasRemaining() return gasRemaining;

    
}
