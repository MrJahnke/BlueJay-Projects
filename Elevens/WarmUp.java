import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class WarmUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarmUp
{
    public static void main(String[] args) {
        int[] nums = {3,6,2,5,7,8,9,1};
        for (int x : nums)
            System.out.print(x+" ");
        System.out.println();
        System.out.println("nums: " + findEvens(nums));
        
        int[] evens = findEvens2(nums);
        System.out.print("findEvens2 ");
        for (int x : evens)
            System.out.print(x+" ");
        System.out.println();
        for (int x : nums)
            System.out.print(x+" ");
            
        System.out.println();
        System.out.print("findEvens3 ");
        int[] evens3 = findEvens3(nums);
        for (int x : evens3)
            System.out.print(x+" ");
        System.out.println();
        for (int x : nums)
            System.out.print(x+" ");
        System.out.println();
        
        //System.out.println();
        //System.out.print("findEvens4 ");
        //for (int x : nums)
       //     System.out.print(x+" ");
       // System.out.println();
       // findEvens4(nums);
       // for (int x : nums)
       //     System.out.print(x+" ");    
    }


    
    public static ArrayList<Integer> findEvens(int[] arr)
    {
       ArrayList<Integer> result = new ArrayList<Integer>();
       for (int x : arr)
           if (x%2==0) 
               result.add(x);
       return result;
    }
    
    public static int[] findEvens2(int[] arr)
    {
      int numOfEvens=0;
      for (int x : arr)
           if (x%2==0) 
               numOfEvens++;
      int[] result = new int[numOfEvens];
      int next = 0;
      for (int x : arr) {
           if (x%2==0) {
               result[next] = x;
               next++;
           }
      }
      return result;
    }
    
    
    /*public static void findEvens3(int[] arr)
    {
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               arr[x]=0;
           }
      }
    }
    */
   
    public static int[] findEvens3(int[] arr)
    {
      int[] result = arr;
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               result[x]=0;
           }
      }
      return result;
    }
}
