public class Methods
{
    public static void main(String[] args) {
       System.out.println("Hello!");
       sayHi();
       saySomething("Hola");
       sayHi("Jim");                         // returns "Hi Jim" put nothing 'catches it'
       System.out.println( sayHi("Sally") );
       saySomething("Coding is GREAT!", 5);
    }
    
    // a void method with no parameters/arguements
    public static void sayHi() {
        System.out.println("HI!");
    }
    
    // a void method that has a String parameter/arguements
    public static void saySomething(String s) {
        System.out.println(s);
    }
    
    // a method that returns a String and takes a String parameter
    public static String sayHi(String n) {
        return "Hi " + n;
    }
    
    // a void method that takes a String and an int as parameters
    public static void saySomething(String s, int num) {
        for (int x=0; x < num; x++)
            System.out.println(s);
    }
}

/*  Output:
Hello!
HI!
Hola
Hi Sally
Coding is GREAT!
Coding is GREAT!
Coding is GREAT!
Coding is GREAT!
Coding is GREAT!

 */