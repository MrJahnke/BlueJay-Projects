
import java.util.Scanner;

public class SwitchB
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String className="";
        char grade;
        
        System.out.print("Enter your Grade: ");
        String input = kb.nextLine();
        grade = input.charAt(0);
        
        switch(grade) {
            case 'S':
            case 's':
                className = "Senior";
                break;
            case 'j':
                className = "Junior";
                break;
            case 'm':
                className = "Sophomore";
                break;
            case 'f':
                className = "Freshman";
                break;
            default:
                className = "kid";
        }
        System.out.println("You are a " + className);
    }
}
