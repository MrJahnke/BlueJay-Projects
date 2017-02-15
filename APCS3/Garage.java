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
        
        redCar.calculateMpg(250, 10);
        double money = redCar.addGas(5); //fillTank();
        System.out.println("Price to add 5 gallons: " + money);
        money = redCar.fillTank(); //fillTank();
        System.out.println("Price to fill tank: " + money);
        System.out.println("With a full tank of gas we can to " + redCar.range() + " miles");
        money = redCar.trip(345);
        System.out.println("It will cost " + money + " to go 345 miles");
        System.out.println("Odometer: " + redCar.getOdometer());
        
        
    }
}
