
/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
   public static void main(String[] args) {  
       printSomething("ABCD");
       //doSomething("ABCD"); 
   }
    
   static void doSomething(String s){
       int len = s.length();
       if (len < 1) {
           //System.out.println("Done");
           return;
        }
       System.out.println(s.substring(0,len));
       doSomething(s.substring(0,len-1));   
    }
    
    static void printSomething(String s) {
        int n = s.length();
        if (n < 1)
            return;
        String s1 = s.substring(1,n);
        printSomething(s1);
        System.out.println(s);
        printSomething(s1);
    }
            
}
