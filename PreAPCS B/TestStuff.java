
/**
 * @author Mr Jahnke 
     * @version November 13, 2016
 */
public class TestStuff
{
    public static void main(String[] args) {
        
        System.out.println(true && true || false);
        System.out.println(true || true && false);
        System.out.println(false || true && false);
        System.out.println(false && true || false); 

        int x = 12;
        if (x > 10) 
        {   
            System.out.println("X is big");
        }
        
        if (x < 10) 
        {   
            System.out.println("X is small");
        }
        
        if (x > 10) 
        {   
            System.out.println("X is big");
        }
        else
        {
            System.out.println("X is small");
        }
        
        if (x > 10) 
            System.out.println("X is big");
        else
            System.out.println("X is small");
        
        if (x > 10) 
            System.out.println("X is big");
        else
            System.out.println("X is small");
            System.out.println("Coding is cool");
         
            
          
    }
}

/*
 * true
true
false
false
X is big
X is big
X is big
X is big
Coding is cool
*/
