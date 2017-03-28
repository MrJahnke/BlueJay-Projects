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
        int[] nums1 = {3,6,2,5,7,8,9,1};
        int[] nums2 = {3,6,2,5,7,8,9,1};
        int[] nums3 = {3,6,2,5,7,8,9,1};
        int[] nums4 = {3,6,2,5,7,8,9,1};
        int[] nums5 = {3,6,2,5,7,8,9,1};
        int[] nums6 = {3,6,2,5,7,8,9,1};
        int[] nums7 = {3,6,2,5,7,8,9,1};
        for (int x : nums)
            System.out.print(x+" ");
        System.out.println();
        ArrayList arrNums = findEvens(nums);
        System.out.println(arrNums);
        System.out.println(arrNums.get(1));
        System.out.println(arrNums);
        
        
        //System.out.println("nums: " + findEvens(nums));
        
        
        /*
        int[] evens = findEvens2(nums);
        System.out.println("findEvens2 ");
        for (int x : evens)
            System.out.print(x+" ");
        System.out.println();
        for (int x : nums)
            System.out.print(x+" ");
            
        System.out.println();
        System.out.println("findEvens3 ");
        findEvens3(nums3);
        for (int x : nums3)
            System.out.print(x+" ");
        System.out.println();
        for (int x : nums3)
            System.out.print(x+" ");
        System.out.println();
        
        System.out.println();
        System.out.println("findEvens4 ");
        evens = findEvens4(nums4);
        for (int x : evens)
            System.out.print(x+" "); 
            System.out.println();
        for (int x : nums4)
            System.out.print(x+" ");
            
        System.out.println();
        System.out.println("findEvens5 ");
        
        evens = findEvens5(nums5);
        for (int x : evens)
            System.out.print(x+" ");  
            System.out.println();
        for (int x : nums5)
            System.out.print(x+" ");
            
        System.out.println();
        System.out.println("findEvens6 ");

        evens = findEvens6(nums6);
        for (int x : evens)
            System.out.print(x+" "); 
       System.out.println();
        for (int x : nums6)
            System.out.print(x+" ");
            
        System.out.println();
        System.out.println("findEvens7 ");

        evens = findEvens7(nums7);
        for (int x : evens)
            System.out.print(x+" "); 
       System.out.println();
        for (int x : nums7)
            System.out.print(x+" ");
            
            */
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
    
    
    public static void findEvens3(int[] arr)
    {
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               arr[x]=0;
           }
      }
    }
    
    public static int[] findEvens4(int[] arr)
    {
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               arr[x]=0;
           }
      }
      return arr;
    }
    
    public static int[] findEvens5(int[] arr)
    {
      int[] result = new int[arr.length];
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) 
               result[x]=0;
           else 
               result[x]=arr[x];
      }
      return result;
    }
    
    public static int[] findEvens6(int[] arr)
    {
      int[] result = arr;
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) {
               result[x]=0;
           }
      }
      return result;
    }
    
    public static int[] findEvens7(int[] arr)
    {
      int[] result = new int[arr.length];
      for (int x=0; x<arr.length; x++ ) {
           if (arr[x]%2!=0) 
               result[x]=0;
           else 
               result[x]=arr[x];
      }
      arr = result;
      return arr;
    }
}
