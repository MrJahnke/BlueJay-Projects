
/**
 * Write a description of class StudentAthlete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class StudentAthlete extends Student
{
    //class variables
    public final static int VOLLEYBALL = 1;
    public final static int BASKETBALL = 2;
    public final static int FOOTBALL = 3;

    
    // instance variables
    private int sport;
    
    public StudentAthlete() {
        super();
        sport = 0;
    }
    
    public StudentAthlete(String n, double g, int s) {
        super(n ,g);
        sport = s;
    }
    
    public String toString() {
        return super.toString() + "\tSport: " + getSportName();
    }
    
    public int getSport() {
        return sport;
    }
    

    public String getSportName() {
        int s = getSport();
        String sp;
        switch (s) {
            case 1:
                sp = "Volleyball";
                break;
            case 2:
                sp = "Basketball";
                break;
            case 3:
                sp = "Football";
                break;
            default:
                sp = "no sport";
                //break;
        }
        return sp;
    }
    

}
