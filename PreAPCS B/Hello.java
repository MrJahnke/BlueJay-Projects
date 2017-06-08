/**
 * A simple Hello, World program
 * 
 * @author Mr Jahnke 
 * @version 28, May 2017
 */

import java.util.Scanner;

public class Hello {

    private String name;
    
    public Hello (String n) {
        name = n; }
    
    public String toString() {
        return "Hello, " + name; }
    
    public static void main(String[] args) {
      Hello myName;
      String word;
      
      Scanner kb = new Scanner(System.in);
      System.out.print("What is your name? ");
      word = kb.nextLine();
      myName = new Hello(word);
      System.out.println(myName);
   }
}

/*
 * Output
What is your name? George
Hello, George
 */
