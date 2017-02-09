import java.util.Scanner;

public class Review12
{
    public static void main(String[] argd)
    {
        Scanner kb = new Scanner(System.in);
        String s, word="";
        while (true) 
        {
            System.out.print("Enter a name: ");
            s = kb.nextLine();
            if (s.substring(0,1).equalsIgnoreCase("q"))
                break;
            word = word + s + " "; 
        } 
        System.out.print(word);
    }
}
