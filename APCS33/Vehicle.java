
public abstract class Vehicle
{
    // instance variables 
    private String model;
    private String color;
    private int year;
    private int odometer;
    
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
