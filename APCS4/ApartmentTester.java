import java.util.Arrays;

public class ApartmentTester
{
    public static void main(String[] args) {
        Apartment[][] building = new Apartment[10][5];
        
        for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++) {
                building[r][c] = new Apartment();
            }
        }
        
        
         for (int floor=0; floor<building.length; floor++) {
             Arrays.fill(building[floor], new Apartment());
             //Arrays.sort(building[floor]);   // run time error - not comparable object
         }
        
         for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                System.out.print(building[r][c] + "\t");
            }
            System.out.println();
        }
        
        
    }
}
