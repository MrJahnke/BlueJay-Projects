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
        
        
         //for (int floor=0; floor<building.length; floor++) {
         //    Arrays.fill(building[floor], new Apartment());
        // }
        
         for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                System.out.print(building[r][c] + "\t");
            }
            System.out.println();
        }
        
        int len = building.length*building[0].length;
        Apartment[] apartments = new Apartment[len];
        int x = 0;
        
        for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                apartments[x] = building[r][c];
                x++;
            }
        }
        
            System.out.println();
                System.out.println("Sorted Apartments");
                    System.out.println();
        
       Arrays.sort(apartments);
       x=0;
       for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                building[r][c] = apartments[x];
                x++;
            }
        }
        
        for (int r=building.length-1; r>=0; r--) {
            for (int c=building[r].length-1; c>=0; c--)
            {
                System.out.print(building[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
