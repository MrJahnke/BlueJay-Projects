
public class Garage
{
  
       public static void main(String[] args)
       {
           Vehicle car1 = new Car("VW", "Red", 2015);
           Car car2 = new Car("Ford", "Blue", 2010);
           Vehicle truck1 = new Truck();
           
           System.out.println(car2.compareTo(car1));
           
           Vehicle[] myVehicles = {car1, car2, truck1};
           
        }
}

    