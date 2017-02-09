import java.util.Scanner;

public class DigitAdderFin
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner(System.in);
        int num = 0, sumOfDigits;
        do
        {
            System.out.print("Enter a number and I will add the digits for you or 0 to quit: ");
            num = kb.nextInt();
            sumOfDigits = sumDigits(num);
            System.out.println(sumOfDigits + " is the num of the digits of " + num);
            System.out.println("Number of ODD digits: " + getOddDigitsCount(num)); 
            System.out.println("Number of EVEN digits: " + getEvenDigitsCount(num)); 
            System.out.println();  //blank line
        } while (num!=0);
        System.out.println("Good-Bye.");
    }
    
    public static int sumDigits(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    
    public static boolean isOdd (int number)
    {
        return number%2!=0;
    }
    
    public static int getOddDigitsCount(int number)
    {
        int oddTotal = 0;
        int num;
        while (number > 0)
        {
            num = number % 10;
            if (isOdd(num))
                oddTotal++;
            number = number / 10;
        }
        return oddTotal;
    }
    
    public static int getEvenDigitsCount(int number)
    {
        int evenTotal = 0;
        int num;
        while (number > 0)
        {
            num = number % 10;
            if (!isOdd(num))
                evenTotal++;
            number = number / 10;
        }
        return evenTotal;
    }
}