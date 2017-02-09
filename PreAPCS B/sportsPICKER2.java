
/**
 * @author Mr Jahnke
 * @version November 24, 2016
 */

import java.util.Scanner;
public class sportsPICKER2
{
    public static void main(String[] args) {
        Scanner kbSTR = new Scanner(System.in);
        Scanner kbINT = new Scanner(System.in);
        String sport="", input="";
        int num;
        
        System.out.println("Welcome to the ASK Student Sports Picker!");
        System.out.println("To help you choose, answer the questions");
        System.out.println();
        do {
            System.out.print("Are you a ASK High School Student? YES or NO: ");
            input = kbSTR.nextLine();
            if (input.equalsIgnoreCase("yes")) 
            { //if1
                System.out.print("Are you in good shape? ");
                input = kbSTR.nextLine();
                if (input.equalsIgnoreCase("yes"))
                { //if2
                    System.out.print("Do you have good hand-eye coordination? ");
                    input = kbSTR.nextLine();
                    if (input.equalsIgnoreCase("yes"))
                    {  //if3
                        System.out.print("Can you use a ball? ");
                        input = kbSTR.nextLine();
                        if (input.equalsIgnoreCase("yes"))
                        { //if4
                            System.out.println("Choose one from the list or enter 0 to be randomly assigned a sport. ");
                            System.out.print("1)Football 2)Softball 3)Futbol 4)Basketball 5)Lacrosse 6)Tennis: ");
                            num = kbINT.nextInt();   
                            if (num==0)
                            { //if5
                                num = (int)(Math.random()*6+1);
                            } //close if5
                            switch (num){
                                case 1:
                                    sport="Football";
                                    break;
                                case 2:
                                    sport="Softball";
                                    break;
                                case 3:
                                    sport="Futbol";
                                    break;
                                case 4:
                                    sport="Basketball";
                                    break;
                                case 5:
                                    sport="Lacrosse";
                                    break; 
                                case 6:
                                    sport="Tennis";
                                    break;
                                default:
                                    sport="What!";
                            } //end switch
                        } //end if4
                        else
                        {
                            sport = "Sailing";
                        }
                    } //end if3
                    else
                    {
                        System.out.print("Chose 1)wrestling, 2)track, 3)cross country: ");
                        num = kbINT.nextInt();
                        switch(num)
                        {
                            case 1: 
                                sport = "Wrestling";
                                break;
                            case 2: 
                                sport = "Track";
                                break;
                            case 3: 
                                sport = "Cross Country";
                                break;
                            default: 
                                sport = "Wrestling";
                            } // end switch
                    } //end else
                } //end if2
                else
                {
                    sport = "Chess";
                }    
            } //end if1
            else {
                sport = "Not Eligible";
                System.out.println("You can not play sports at ASK");
            } //end else1
            System.out.println("Your sport is " + sport);
            System.out.print("\nWould you like to choose another sport?: ");
            input = kbSTR.nextLine();
        } while (input.equalsIgnoreCase("yes"));
        System.out.println("Good-bye");
    } //end main
} //end class

