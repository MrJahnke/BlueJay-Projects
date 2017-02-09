
/**
 * Write a description of class Test8_11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Test8_11
{
    public static void main(String[] args)
    {
        boolean a = true, b=true;
        print(a&&b); print(a||b); print(!a||!b); println(!(a&&b));
        a = true; b=false;
        print(a&&b); print(a||b); print(!a||!b); println(!(a&&b));
        a = false; b=true;
        print(a&&b); print(a||b); print(!a||!b); println(!(a&&b));
        a = false; b=false;
        print(a&&b); print(a||b); print(!a||!b); println(!(a&&b));
        
        int aa=10, bb = 5;
        boolean c = true, d = false;
        println(aa > 0 && !c); 
        println(aa!=20 && d || aa%bb==2) ;  
        boolean e = c && aa+2==12;
        println(e);  
        println(false && true || false);   
        println(false || true && false);   
        println(true && false || true && true || false );  
        println((5==5) || (7>1) && (4<15) && (35<=36) && (89!=34));
        
        
        int k = 10;
        if (k>15) {
            if (k<30) {
                System.out.println("One");} 
                else { 
                    System.out.println("Two");}
        } else {
            if (k<0) 
                System.out.println("Three");
            else
                System.out.println("Four"); 
        }
        
        int p, q=5;
        for(p=0; p<5; p++);     
            q = q+1;
        System.out.println(p + " " + q);
        
        int pp, qq=5;
        for(pp=0; pp<5; pp++) {    
            qq = qq+1;
        }
        System.out.println(pp + " " + qq);
        
        int ppp, qqq=5;
        for(ppp=0; ppp<5; ppp++)   
        qqq = qqq+1;
        System.out.println(ppp + " " + qqq);
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your grade: ");
            int level = kb.nextInt(); 
            switch (level) 
            {
                case 12:
                        System.out.println("Senior");
                case 11:
                        System.out.println("Junior");
                case 10:
                        System.out.println("Sophomore");
                case 9:
                        System.out.println("Freshman");
                        break;
                case 8:
                case 7:
                case 6:
                        System.out.println("Middle School");
                        break;
                default:
                        System.out.println("Elementary School");
            }
 
        
        for (int even=20; even<=50; even+=2)
            System.out.print(even+" ");
        println(" ");
        for (int even=20; even<=50; even++)
            if (even%2==0)
                System.out.print(even+" ");
        println(" ");
        for (int even=10; even<=25; even++)
            System.out.print(even*2+" ");
        
        println(" ");
        int xx;
         for (xx=0; xx<5; xx++)
            System.out.println(xx);
         System.out.println("x is " + xx);   
            
        int j = 20;
         for (int x = 0; x<j; x++)
         {
             j = j-2-x;
             System.out.print(j+ " ");
         } 
        println(" ");
         
         
        println("Grade 11, Stuco=No, date=No, Price:" +calculateTicketPrice2(11, false, false));  
        println("Grade 11, Stuco=Yes, date=No, Price:" +calculateTicketPrice2(11, true, false));    
        println("Grade 12, Stuco=No, date=Yes, Price:" +calculateTicketPrice2(12, false, true));
        println("Grade 10, Stuco=No, date=No, Price:" +calculateTicketPrice2(10, false, false));
        println("Grade 9, Stuco=No, date=No, Price:" +calculateTicketPrice2(9, false, false));
    }
    
    private static int calculateTicketPrice(int grade, boolean inStuco, boolean hasDate){
        int price=0;
        if (inStuco)
            price = 0;
        else if (grade==11 || grade==12)
            if(hasDate)
                price = 4;
            else
                price = 5;
        else if (grade == 10)
            price = 6;
        else
            price = -1;
            
        return price;
    }
       
        private static int calculateTicketPrice2(int grade, boolean inStuco, boolean hasDate){
        int price=0;
        if (inStuco) {
            price = 0;
        }
        else
        {
            switch (grade) 
            {
             case 12:
             case 11:
                if (hasDate)
                    price = 4;
                else
                    price = 5;
                break;
            case 10:
                price = 6;
                break;
            default:
                price = -1;
            } 
        }
        return price;
    }
    private static void print(Object o){
        System.out.print(o+ " ");
    }
    private static void println(Object o){
        System.out.println(o+ " ");
    }
}
