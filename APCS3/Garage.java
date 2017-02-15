import java.awt.Color;

public class Garage
{
    public static void main(String[] args)
    {
        Vehicle redCar = new Car("VW", "Red", 2012);
        System.out.println(redCar);
        System.out.println("My car goes " + redCar.honk());
        
        Vehicle blackTruck = new Truck("Ford", "Black", 2015);
        System.out.println(blackTruck);
        System.out.println("My truck goes " + blackTruck.honk());
        
        Vehicle[] myVehicles = { redCar, blackTruck };
        
        for (Vehicle v : myVehicles)
        {
            System.out.println(v.toString());
        }
    }
}
