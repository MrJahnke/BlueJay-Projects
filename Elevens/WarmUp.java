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
        System.out.println(findEvens(nums));
        int[] evens = findEvens2(nums);
        for (int x : evens)
            System.out.print(x+" ");
        System.out.println();
        int[] evens3 = findEvens3(nums);
        for (int x : evens3)
            System.out.print(x+" ");
        System.out.println();
        for (int x : nums)
            System.out.print(x+" ");
        System.out.println();
        findEvens4(nums);
        for (int x : nums)
            System.out.print(x+" ");    
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
    
    public static int[] findEvens3(int[] arr)
    {
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               arr[x]=0;
           }
      }
      return arr;
    }
    public static void findEvens4(int[] arr)
    {
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               arr[x]=0;
           }
      }
    }
}
