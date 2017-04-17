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
        
        print(building);
        //sort();
     
       //System.out.println("\nSorted Apartments\n");
        
       //print();
       
       System.out.println("\nTotal Occupants: "+totalOccupants(building) +"\n");
       
       makeRoommates(building);
       print(building);
       
       System.out.println("\nTotal Occupants: "+totalOccupants(building) +"\n");
      

    }
    
    private static void print(Apartment[][] building){
        for (int r=building.length-1; r>=0; r--) {
            for (int c=building[r].length-1; c>=0; c--)
            {
                System.out.print(building[r][c] + "\t");
            }
            System.out.println();
        }
    }
    
    private static void sort(Apartment[][] building){
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
        Arrays.sort(apartments);
       x=0;
       for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                building[r][c] = apartments[x];
                x++;
            }
        }
        
    }

    
    public static int totalOccupants(Apartment[][] building) {
        int total=0;
        for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                if (building[r][c]!=null)
                    total+= building[r][c].getOccupancy();
            }
        }
        return total;
    }
    
    public static void makeRoommates(Apartment[][] building) {
        int row1 = -1, col1 = -1;
        for (int r=0; r<building.length; r++) {
            for (int c=0; c<building[r].length; c++)
            {
                if( building[r][c].getOwner().equals("single")) {
                    if (row1 == -1){
                        row1=r;
                        col1=c;
                    }
                    else {
                        building[row1][col1] = new Apartment("roomies", 2);
                        row1 = -1;
                        col1 = -1;
                        building[r][c] = new Apartment("empty ", 0);
                        //building[r][c] = null;
                    } 
                }
            }
        }
    }
}
