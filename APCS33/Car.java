
public class Car extends Vehicle implements Safety, Comparable
{
    // instance variables 
    private int passengers;

    public Car( String m, String c, int y )
    {
        super(m,c,y);
        passengers = 5;
    }
    
    public Car()
    {
        super("Car", "White", 2017);
        passengers = 5;
    }
    
    public String honk()
    {
        return "Beep-Beep";
    }
    
    public int calculateSafety()
    {
        return this.getYear() - baseYear;
    }
    
    public int compareTo(Object other)
    {
        //Car c = (Car)other;
        return this.getYear() - ((Car)other).getYear();
    }

}
