import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String password = "";
        while (!password.equals("XRay")) {
            System.out.print("Enter your password: ");
            password = kb.nextLine();
            
            if (password.equals("XRay"))
                System.out.println("Correct!");
            else
                System.out.println("Incorrect");  
        }
        Scanner kb2 = new Scanner(System.in);
        int num = -1;
        while (num!=0) {
            System.out.print("Enter a number: (0 to quit)");
            num = kb2.nextInt();
            boolean isEven = num % 2 == 0;
            if (isEven)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
}
