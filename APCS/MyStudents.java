
/**
 * A class to test the Student class.
 *  Complile in the same folder as Student
 * 
 * @author APCS
 * @version 1.0
 * @since October 18, 2016
 */

import java.util.Scanner;

public class MyStudents
{
    
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        //Student joe = new Student();
        //Student bill = new Student("Bill");
        Student mary = new Student("Mary" , 3.5);
        
        /*
        System.out.println("These are the Students");
        System.out.println(joe);
        System.out.println(bill);
        System.out.println(mary);
        
        System.out.println("\nBill is an Honor Student? " + bill.getHonorStudent());
        System.out.println("Mary is an Honor Student? " + mary.getHonorStudent());
        bill.setGPA(4);
        System.out.println("Bill study harders... ");
        System.out.println("Bill is an Honor Student? " + bill.getHonorStudent());
        
        System.out.println("\nMary and Bill go to " + Student.SCHOOL);
        
        Student william = new Student(bill);
        System.out.println("\nBill equals Mary: " + bill.equals(mary));
        System.out.println("Bill equals William: " + bill.equals(william));
        
        System.out.println("\nLet's make another student.");
        System.out.print("Enter Student's name: ");
        String name = kb.nextLine();
        if (name.indexOf(" ") != -1) {
            System.out.print("Enter " + name.substring(0,name.indexOf(" ")) + "'s GPA: ");
        }
        else {
            System.out.print("Enter " + name +"'s GPA: ");
        }
        double gpa = kb.nextDouble();
        Student student = new Student(name, gpa);
        System.out.println("\nNew student created:\n" + student);
        System.out.println("GPA: " + student.getGPA() +
                "\nHonor Student? "+ student.getHonorStudent());
        
        */   
       StudentAthlete sara = new StudentAthlete();
       StudentAthlete mike = new StudentAthlete("Mike", 3.7, StudentAthlete.VOLLEYBALL);
       
       
       System.out.println(mary);
       System.out.println(sara);
       System.out.println(mike);
                
    }
}
