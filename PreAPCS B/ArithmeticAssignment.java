import java.util.Scanner;

public class ArithmeticAssignment
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Lesson 5");
        System.out.println("79 + 3 * (4 + 82 - 68) - 7 + 19 = " + 
      (79 + 3 * (4 + 82 - 68) - 7 + 19));  //145
        System.out.println("(179 + 21 + 10) / 7 + 181 = " + 
            ((179 + 21 + 10) / 7 + 181));  //211
        System.out.println("(10389 * 56 * 11 + 2246 = " + 
            (10389 * 56 * 11 + 2246)); //6401870
        
      int a, b, c;
      double x1, x2, temp;
      System.out.println("\nRoots of the Quadratic Equation"); 
      System.out.print("Enter a b c (in one line seperated by a space): ");
      a = kb.nextInt();
      b = kb.nextInt();
      c = kb.nextInt();
      temp = Math.sqrt(b*b - 4*a*c);
      x1 = (-b+temp)/(2*a);
      x2 = (-b-temp)/(2*a);
      System.out.println("x1 = " + x1 + " x2 = " + x2);
      
     System.out.println("\nLesson 6");
      System.out.println("d1 = " + (3*Math.PI*Math.sin(Math.toRadians(187)) +
                Math.abs(Math.cos(Math.toRadians(122)))));
                
      System.out.println("d2 = " + (Math.pow(14.72,3.801) + Math.log(72)));
    }
        
}
