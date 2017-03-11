
public class RaceTrack
{
    public static void main(String[] args)
    {
        Vehicle v1 = new RaceCar("GoGoMobile", "White", 75);
        Car c2 = new RaceCar("HippityHop", "Red", 125);
        RaceCar r3 = new RaceCar("Speedy", "Blue", 150);
 
        System.out.println(v1 + ": " + v1.honk());
        System.out.println(c2 + ": " + c2.honk());
        System.out.println(r3 + ": " + r3.honk());
        
        System.out.println(v1.getModel()+ " Safety Rating: " + ((RaceCar)v1).calculateSafety());
        System.out.println(c2.getModel()+ " Safety Rating: " + c2.calculateSafety());
        System.out.println(r3.getModel()+ " Safety Rating: " + r3.calculateSafety());
    }
    
}
