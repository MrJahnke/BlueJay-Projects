
/**
 * Write a description of class BankTester here.
 * 
 * @author jahnke
 * @version Dec 1, 2016
 */
import java.io.*;
import java.util.*; //includes ArrayList 
import java.text.*; //for NumberFormat 
public class BankTester
{
    public static void main(String args[]) 
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( ); 
        formatter.setMinimumFractionDigits(2); 
        formatter.setMaximumFractionDigits(2);
        String name;
        //Instantiate an ArrayList object here called aryList 
        ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();
        do
        {
            Scanner kbReader = new Scanner(System.in); 
            System.out.print("Please enter the name to whom the account belongs: ");
            name = kbReader.nextLine( );
            if( !name.equalsIgnoreCase("EXIT") ) 
            {
                System.out.print("Please enter the amount of the deposit. "); 
                double amount = kbReader.nextDouble(); 
                System.out.println(" "); 
                //gives an eye-pleasing blank line 
                // Create a BankAccount object
                // Add it to the ArrayList object
                aryList.add(new BankAccount(name, amount));
            } 
        }while(!name.equalsIgnoreCase("EXIT"));
            //Search aryList and print out the name and amount of the largest bank account 
            BankAccount ba = aryList.get(0);//get first account in the list
            double maxBalance = ba.balance;
            String maxName = ba.name;
            for(int j = 1; j < aryList.size( ); j++) 
            {
                //Step through the remaining objects and decide which one has
                //largest balance (compare each balance to maxBalance) ?
                BankAccount bNext = aryList.get(j);//get first account in the list
                double nextBalance = bNext.balance;
                if (nextBalance > maxBalance) {
                    maxBalance = nextBalance;
                    maxName = bNext.name;
                }
            }
            System.out.println("The account with the largest balance belongs to "+maxName);
            System.out.println("The amount is "+ maxBalance);
     } 
}
