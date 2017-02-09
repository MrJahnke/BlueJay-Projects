import java.util.Scanner;

public class SwitchD
{
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      String className;
      String grade;
      char letter;
      
      System.out.print("Enter your grade: ");
      grade = kb.nextLine();
      letter = grade.charAt(0);
      
      switch(letter) {
         case 'S':
         case 's':
            className="Senior";
            break;
         case 'j':
            className="Junior";
            break;
         case 'm':
            className="Sophomore";
            break;
         case 'f':
            className="Freshman";
            break;
         default:
            className="kid";
      }
       System.out.println("You are a " + className);
    }
}
