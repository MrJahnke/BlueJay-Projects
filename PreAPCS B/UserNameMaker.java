
/**
 * Write a description of class UserNameMaker here.
 * 
 * @author jjahnke 
 * @version October 17, 2016
 */

import java.util.Scanner;

public class UserNameMaker
{
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       
       String name, username, domain;
       
       System.out.println("Enter the users first and last name");
       System.out.println("(Enter \"q\" to quit)\n");
       
       name="";
       domain = "ask.edu.kw";
       
       while (!name.equalsIgnoreCase("q")) {
           System.out.print("Name: ");
           name = kb.nextLine();
           if (!name.equalsIgnoreCase("q")) {
               name = name.trim().toLowerCase();
               int space = name.indexOf(" ");
               while (space >= 0) {
                   name = name.substring(space+1) + name.substring(0,1);
                   space = name.indexOf(" ");
                }
               username = name   + "@" + domain;
               username = username.replace("-","");
               System.out.println("Username: " + username + "\n");
            }
        } 
        System.out.println("Good-bye");
    }
}
