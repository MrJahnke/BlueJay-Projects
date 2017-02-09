// name

import java.util.Scanner;

public class DigitAdder
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner(System.in);
        int num = 0;
        do
        {
            System.out.print("Enter a number and I will add the digits for you or 0 to quit: ");
            num = kb.nextInt();
            System.out.println(sumDigits(num) + " is the num of the digits of " + num);
            System.out.println("Number of ODD digits: " + getOddDigitsCount(num)); 
            System.out.println("Number of EVEN digits: " + getEvenDigitsCount(num)); 
            System.out.println();  //blank line
        } while (num!=0);
        System.out.println("Good-Bye.");
    }
    
    public static int sumDigits(int num)
    {
        int sum = 0;
        num = 0;  // delete this when you write your method.
        while (num > 0)
        {
            // some code
            
        }
        return sum;   // return the sum of all the digits.
    }
    
    public static boolean isOdd (int number)
    {
        // return true if number is odd.
        return number==0; //change this
    }
    
    public static int getOddDigitsCount(int number)
    {
        int oddTotal = 0;
        //some code
        // if number is odd (make a call to isOdd(number)
        return oddTotal;  //return total number of odd digits
    }
    
    public static int getEvenDigitsCount(int number)
    {
        int evenTotal = 0;
        //some code
        // if number is even/not odd (make a call to isOdd(number)
        return evenTotal;  //return total number of even digits
    }
}