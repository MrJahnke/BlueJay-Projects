import java.util.ArrayList;

public class Digits {
    
   private ArrayList<Integer> digitList;
    
   public Digits(int num) 
   {
       digitList = new ArrayList<Integer>();
       
       if (num == 0)
           digitList.add(new Integer(0));
       
       while (num > 0) {  
           int digit = num % 10;
           digitList.add(0 , new Integer(digit));
          num/=10;
       }
   }
     
   public boolean isStrictlyIncreasing()
   {
       for (int x=0; x<digitList.size()-1; x++)
       {
           int digit1 = digitList.get(x).intValue();
           int digit2 = digitList.get(x+1).intValue();
           
           if (digit1 > digit2) {
               return false; }
       }   
       return true; 
   }
   
   public String toString() {
       return "" + digitList; 
   }

   public static void main(String[] args) {
       Digits digList1 = new Digits(1356);
       System.out.println(digList1);
       System.out.println(digList1.isStrictlyIncreasing());
       
       Digits digList2 = new Digits(1536);
       System.out.println(digList2);
       System.out.println(digList2.isStrictlyIncreasing());
    }
}

/*
[1, 3, 5, 6]
true
[1, 5, 3, 6]
false
*/
