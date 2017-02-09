
/**
 * Write a description of class EggCarton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ChangeMaker
{
   public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       
       int amount, quarters, dimes, nickels, pennies;
       System.out.print("Enter the amount you want in change: ");
       amount = kb.nextInt();
       quarters = amount / 25;
       dimes = amount % 25 / 10;
       nickels = amount % 25 % 10 / 5;
       pennies = amount % 25 % 10 % 5;
       System.out.println("Quarter: " + quarters +
            "\nDimes: " + dimes +
            "\nNickels: " + nickels +
            "\nPennies: " + pennies);
   }
}
