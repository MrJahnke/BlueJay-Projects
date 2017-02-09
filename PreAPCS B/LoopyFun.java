
/**
 * Write a description of class LoopyFun here.
 * 
 * @author Mr Jahnke
 * @version December 12
 */
public class LoopyFun
{
    public static void main(String[] args)
    {
        goTeam("Falcons! ");    System.out.println();
        goTeam("Vikings! ");    System.out.println();
        goTeam("Bulldogs! ");   System.out.println();
        countDown();            System.out.println();
        fibNum(10);             System.out.println();
        int fib = getFibNum(24);
        System.out.println("The 24th fibonacci number is " + fib );
    }
    
    public static void goTeam(String teamName)
    {
        for (int num = 2 ; num <= 8 ; num += 2 )
            System.out.println(num);
        System.out.println("Who do we appreciate?");
        for (int x=0; x<3; x++)
            System.out.print(teamName);  
    }
  
    private static void countDown() {
        for (int x=10; x>=0; x--) {
            System.out.print(x);
                for(int y=0; y<3; y++)
                    System.out.print(" .");
            System.out.println();
        }
        System.out.println("BLAST OFF!");
    }
    
    private static void fibNum(int num) {
        int fib1=0, fib2=1, fib3;
        System.out.print(fib1+" "+fib2+" ");
        for(int x=3; x<=num; x++) {
            fib3 = fib1+fib2;
            System.out.print(fib3+" ");
            fib1 = fib2;
            fib2 = fib3;
        }
    } 
    
    private static int getFibNum(int num) {
        int fib1=0, fib2=1, fib3=0;
        //System.out.print(fib1+" "+fib2+" ");
        for(int x=3; x<=num; x++) {
            fib3 = fib1+fib2;
            //System.out.print(fib3+" ");
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib3;
    } 
}
