import java.awt.Color;

public class Car extends Vehicle
{
    private int passengers;
    
    public Car(String m, String c, int y)
    {
        super(m,c,y);
        passengers = 5;
    }
    
    public Car()
    {
        super("Car", "White", 2017);
    }

    public String honk()
    {
        return "Beep-Beep";
    }
}
