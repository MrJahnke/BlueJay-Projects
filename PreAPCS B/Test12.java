import java.util.Scanner;

public class Test12
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Number 10: Parrot");
        String answer = "";
        while (!answer.equals("q"))
        {
            System.out.print("Enter: ");
            answer = kb.nextLine();
            if (!answer.equals("q"))
                System.out.println(answer);
        }
        
        System.out.println("\nNumber 11: Guessing Game");
        int target = (int) (Math.random()*10+1);   // a number 1-10
        int guess;
        do {
            System.out.print("Enter a number: ");
            guess = kb.nextInt();
            if (guess > target)
                System.out.println("Guess Lower");
            else if (guess < target)
                System.out.println("Guess Higher");
            else
                System.out.println("Correct!");
            } while (guess != target);
            
            System.out.println("\nNumber 12: Rolling Dice");
            int total = 0; 
            int number = rollDie();
            while (total < 30 )
            {
                number = rollDie();
                total += number;
                System.out.println("Die Roll: "+ number+ " Total: " + total);
            }
    }  
    
    public static int rollDie()
    {
        return (int) (Math.random()*6+1);
    }
}
