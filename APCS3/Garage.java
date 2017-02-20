public class Garage
{
    public static void main(String[] args)
    {
        Car plainCar = new Car();
        Car redCar = new Car("VW", "Red", 2012);
        Car blueCar = new Car("Thunderbird", "Blue", 2007, 100000, 18, 2);
        
        Vehicle plainTruck = new Truck();
        Vehicle yellowTruck = new Truck("Mack", "Yellow", 2005);
        Vehicle orangeTruck = new Truck("Peterbuilt", "Orange", 2010, 98765, 200, 100000);
       
        Vehicle[] myVehicles = { plainCar, redCar, blueCar, plainTruck, yellowTruck, orangeTruck };
        
        System.out.println("My Vehicles...");
        for (Vehicle v : myVehicles)
        {
            System.out.println(v.toString());
        }
        
        //calculate MPG
        plainCar.calculateMpg(250, 10);
        redCar.calculateMpg(300, 10);
        blueCar.calculateMpg(200, 10);
        plainTruck.calculateMpg(500, 100);
        yellowTruck.calculateMpg(650, 100);
        orangeTruck.calculateMpg(400, 100);
        
        System.out.println();
        // test methods
        System.out.println("Some basic information about a vehicle...");
        System.out.println("5 gallons added to "+redCar.getModel()+"? " + redCar.addGas(5));
        System.out.println("20 gallons added to "+redCar.getModel()+"? " + redCar.addGas(20));
        double gallons = redCar.fillTank(); //fillTank();
        System.out.println("Price to fill "+redCar.getModel()+": $" + gallons * Vehicle.PRICE_PER_GALLON);
        System.out.println("With a full tank the " +redCar.getModel()+" can drive " + redCar.range() + " miles");
        gallons = redCar.drive(345);
        System.out.println("It will use "+gallons+ " gallons to drive 345 miles");
        System.out.println(redCar.getModel() +" Odometer: " + redCar.getOdometer());
        
        System.out.println();
        // Working with the array of Vehicles
        System.out.println("Some information about all my Vehicles...");
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
                
        System.out.println();
        System.out.println("Testing the Interfaces...");
        System.out.println("The "+redCar.getModel() + " is " + redCar.compareTo(blueCar) + " years newer than the "+ blueCar.getModel());
        System.out.println("The safety rating of the " + plainCar.getModel() + " is "  +plainCar.calculateSafety());
        System.out.println("The safety rating of the " + redCar.getModel() + " is "  +redCar.calculateSafety());
        System.out.println("The safety rating of the " + blueCar.getModel() + " is "  +blueCar.calculateSafety());
    }
    
    public static int totalPassengers(Vehicle[] arr)
    {
        int totalPass = 0;
        for (Vehicle v : arr)
        {
            //Vehicle v = (Vehicle)o;
            if (v instanceof Car )
                totalPass += ((Car)v).getPassengers();
        }
        return totalPass;
    }
    
    public static double totalCargo(Vehicle[] arr)
    {
        double totalCargo = 0;
        for (Vehicle v : arr)
        {
            //Vehicle v = (Vehicle)o;
            if (v instanceof Truck )
                totalCargo += ((Truck)v).getCargo();
        }
        return totalCargo;
    }
    
    public static double fillTanks(Vehicle[] arr)
    {
        double totalFuel = 0;
        for (Vehicle v : arr)
        {
            //Vehicle v = (Vehicle)o;
            totalFuel += v.fillTank();   // not filling the tanks
        }
        return totalFuel;
    }
    
    public static double costFillTanks(Vehicle[] arr)
    {
        double totalFuel = 0;
        for (Vehicle v : arr)
        {
            //Vehicle v = (Vehicle)o;
            totalFuel += v.getGasCapacity();   // not filling the tanks
        }
        return totalFuel * Vehicle.PRICE_PER_GALLON;
    }
    
    public static int totalDistance(Vehicle[] arr)
    {
        int totalDistance = 0;
        for (Vehicle v : arr)
        {
            totalDistance += v.range();   // not filling the tanks
        }
        return totalDistance;
    }
}
