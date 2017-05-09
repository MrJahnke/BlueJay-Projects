
/**
 * Write a description of class FRQ2017 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class FRQ2017 {
   public static void main(String[] args) {
       ArrayList<Integer> digitList;
       digitList = new ArrayList<Integer>();
   
       int num = 1536;
       
       if (num == 0)
           digitList.add(new Integer(0));
       
       while (num > 0) {  
           int digit = num % 10;
           digitList.add(0 , new Integer(digit));
          num/=10;
       }
       
       System.out.println(digitList);
       
       System.out.println(isStrictlyIncreasing(digitList));
       
    }
    
    public static boolean isStrictlyIncreasing(ArrayList<Integer> list)
    {
       for (int x=0; x<list.size()-1; x++)
       {
           int digit1 = list.get(x).intValue();
           int digit2 = list.get(x+1).intValue();
           
           if (digit1 > digit2) {
               return false; }
       }   
       return true; 
    }
}
