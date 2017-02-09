/*
Mr. Jahnke
October 24, 2016

This is a basic input and output class
*/
import java.util.Scanner;

public class TestQuiz  {
  public static void main(String[] arg) {  
      Scanner kb = new Scanner(System.in);
      String name;
      int age;
      System.out.print("What is your name? ");
      name = kb.nextLine();
      System.out.println("Hello " + name);
      System.out.print("What is your age? ");
      age = kb.nextInt();
      System.out.println("You are " + age);
  }
}

