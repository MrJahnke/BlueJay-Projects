import java.util.Scanner;

public class sportPicker
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sport="", input="";
        int num;
        
        System.out.println("Welcome to the ASK Student Sports Picker!");
        System.out.println("To help you choose, answer the questions");
        System.out.println();
        System.out.print("Are you a ASK High School Student? YES or NO: ");
        input = kb.nextLine();
        if (input.equalsIgnoreCase("yes")) 
        { //if1
            System.out.print("Are you in good shape? ");
            input = kb.nextLine();
            if (input.equalsIgnoreCase("yes"))
            { //if2
                System.out.print("Do you have good hand-eye coordination? ");
                input = kb.nextLine();
                if (input.equalsIgnoreCase("yes"))
                {  //if3
                    System.out.print("Can you use a ball? ");
                    input = kb.nextLine();
                    if (input.equalsIgnoreCase("yes"))
                    { //if4
                        System.out.print("Choose one from the list or enter 0 to be randomly assigned a sport. ");
                        num = kb.nextInt();   
                        if (num==0)
                        { //if5
                            num = (int)(Math.random()*6+1);
                        } //close if5
                        switch (num){
                            
                        } //end switch
                    } //end if4
                    else
                    {
                        //sdf
                    }
                } //end if3
                else
                {
                    //sdf
                }
            } //end if2
            else
            {
                //jasldj
            }    
        } //end if1
        else {
            sport = "Not Eligible";
            System.out.println("You can not play sports at ASK");
        } //end else1
        System.out.println("Your sport is " + sport);
    } //end main
} //end class
