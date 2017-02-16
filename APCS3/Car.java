public class Car extends Vehicle
{
    private int passengers;
    
    public Car(String m, String c, int y, int od, double cap, int p )
    {
        super(m,c,y,od,cap);
        passengers = p;
    }
    
    public Car(String m, String c, int y)
    {
        super(m,c,y, 0, 12.0);
        passengers = 4;
    }
    
    public Car()
    {
        this("Car", "White", 2017, 0, 18.0, 5);
    }

    public int getPassengers() { return passengers; }
    
    public String honk()
    {
        return "Beep-Beep";
    }
    
    public double costPerPassenger(int miles)
    {
        double cost = drive(miles) * Vehicle.PRICE_PER_GALLON;
        return cost / passengers;
    }
}
