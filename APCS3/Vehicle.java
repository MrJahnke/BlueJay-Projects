import java.awt.Color;

public abstract class Vehicle
{
    public final static int tankCapacity = 20;
    // instance variables
    private String model;
    private String color;
    private int year;
    private int odometer;
    private int gallonsRemaining;
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

    
}
