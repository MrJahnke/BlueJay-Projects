import java.util.Scanner;

public class WhileLoops
{
    public static void main(String[] args)
    {
        
        for (int x = 0; x<10; x++)
        {
            System.out.println("Happy New Year");
        }
        
        int y = 0;
        while (y<10)
        {
            if (y ==5)
                break;
            System.out.println("Welcome Back!");
            y++;
        }
        
        int z=0;
        do
        {
            z++;
            if (z==5)
                continue;
            System.out.println(z + " Study for Exams!");
            
        } while (z<10);
        
        Scanner kb = new Scanner(System.in);
        String answer = "";
        System.out.println("Write something...");
        while (!answer.equalsIgnoreCase("bye"))
        {
            answer = kb.nextLine();
            if (answer.substring(answer.length()-1).equals("?")) {
                  System.out.println("I don't know. " + answer);
                  continue;
            }
            System.out.println(answer);
        }
        
        //#10
        int i = 0, k = 0;
        while(i <= 3) 
        {
           for(k = 0; k <=2; k++) 
           {
              System.out.print(i + "," + k + " "); 
           }
           i++; 
        }
        //#13
        double m = 92.801;
        int j = 0; 
        do
        {
            j = j + 2;
            if (j > -100) {
                System.out.println(j + " ");
                continue; 
            }
            m+=3;
        }while(j < 6); 
        System.out.println(m);
        
        //#14
        int num;
       do
        {
            System.out.print("Enter a number to square or 0 to quit: ");
            num = kb.nextInt();
            System.out.print(num + " squared is " + num*num + "\n\n");
        } while (num!=0);
    }
}


