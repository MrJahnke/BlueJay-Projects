public class RaceCar extends Car
{
    // instance variables - replace the example below with your own
    private int speed;

    // (Name, Color, Speed)
    // year=2017, odometer=0, gasCapacity=30, passenger=1
    public RaceCar(String n, String c, int s)
    {
        super(n,c, 2017, 0, 30, 1);
        speed = s;
    }
    
    public int calculateSafety()
    {
        return 10 + ((100-speed)/10);
    }
    
    // adds " Varroom!!" to the Cars honk()
    // output:  Beep-Beep!  Varroom!!
    public String honk()
    {
        
        return  super.honk() + "  Varroom!!";
    }
    
    public static void main(String[] args)
    {
        // All work?
        Vehicle v1 = new RaceCar("GoGoMobile", "White", 75);
        Car c2 = new RaceCar("HippityHop", "Red", 125);
        RaceCar r3 = new RaceCar("Speedy", "Blue", 150);
 
        // All work?
        System.out.println(v1 + ": " + v1.honk());
        System.out.println(c2 + ": " + c2.honk());
        System.out.println(r3 + ": " + r3.honk());
        
        // All work?
        //System.out.println(v1.getModel()+"SR:"+v1.calculateSafety());
        System.out.println(c2.getModel()+"SR:"+c2.calculateSafety());
        System.out.println(r3.getModel()+"SR:"+r3.calculateSafety());
    }
}
