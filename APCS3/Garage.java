import java.awt.Color;

public class Garage
{
    public static void main(String[] args)
    {
        Vehicle plainCar = new Car();
        Vehicle redCar = new Car("VW", "Red", 2012);
        Vehicle blueCar = new Car("Thunderbird", "Blue", 1984, 123456, 18, 2);
        
        Vehicle plainTruck = new Truck();
        Vehicle yellowTruck = new Truck("Mack", "Yellow", 2005);
        Vehicle orangeTruck = new Truck("Peterbuilt", "Orange", 2010, 98765, 200, 100000);
       
        Vehicle[] myVehicles = { plainCar, redCar, blueCar, plainTruck, yellowTruck, orangeTruck };
        
        for (Vehicle v : myVehicles)
        {
            System.out.println(v.toString());
        }
        
        plainCar.calculateMpg(250, 10);
        redCar.calculateMpg(300, 10);
        blueCar.calculateMpg(200, 10);
        plainTruck.calculateMpg(500, 100);
        yellowTruck.calculateMpg(650, 100);
        orangeTruck.calculateMpg(400, 100);
        
        
        System.out.println("5 gallons added?: " + redCar.addGas(5));
        double gallons = redCar.fillTank(); //fillTank();
        System.out.println("Price to fill tank: " + gallons * Vehicle.PRICE_PER_GALLON);
        System.out.println("With a full tank of gas we can go " + redCar.range() + " miles");
        gallons = redCar.drive(345);
        System.out.println("It will use " + gallons + " to go 345 miles");
        System.out.println("Odometer: " + redCar.getOdometer());
        
        System.out.println("The total number of passengers the cars can carry is " +
                totalPassengers(myVehicles));
        System.out.println("The total amount of cargo the trucks can carry is " +
                totalCargo(myVehicles) + " pounds.");
        System.out.println("The total amount of gas needed to fill all the vehicles is " +
                fillTanks(myVehicles) + " gallons.");
        System.out.println("If the vehicles were empty, the total cost to fill all of them would be $" +
               costFillTanks(myVehicles));
        System.out.println("The total distance all the vehicles could travel is " +
                totalDistance(myVehicles) + " miles.");
    }
    
    public static int totalPassengers(Object[] arr)
    {
        int totalPass = 0;
        for (Object o : arr)
        {
            Vehicle v = (Vehicle)o;
            if (v instanceof Car )
                totalPass += ((Car)v).getPassengers();
        }
        return totalPass;
    }
    
    public static double totalCargo(Object[] arr)
    {
        double totalCargo = 0;
        for (Object o : arr)
        {
            Vehicle v = (Vehicle)o;
            if (v instanceof Truck )
                totalCargo += ((Truck)v).getCargo();
        }
        return totalCargo;
    }
    
    public static double fillTanks(Object[] arr)
    {
        double totalFuel = 0;
        for (Object o : arr)
        {
            Vehicle v = (Vehicle)o;
            totalFuel += v.fillTank();   // not filling the tanks
        }
        return totalFuel;
    }
    
    public static double costFillTanks(Object[] arr)
    {
        double totalFuel = 0;
        for (Object o : arr)
        {
            Vehicle v = (Vehicle)o;
            totalFuel += v.getGasCapacity();   // not filling the tanks
        }
        return totalFuel * Vehicle.PRICE_PER_GALLON;
    }
    
    public static int totalDistance(Object[] arr)
    {
        int totalDistance = 0;
        for (Object o : arr)
        {
            totalDistance += ((Vehicle)o).range();   // not filling the tanks
        }
        return totalDistance;
    }
}
