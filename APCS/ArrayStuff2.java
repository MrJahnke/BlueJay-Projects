//AP Computer Science,November 24, 2016
public class ArrayStuff2
{
   public static void main(String args[]) 
   {
    int[] nums = new int[5];
    String[] words = new String[5];
    Rock[] rocks = new Rock[5];
    
    for (int j=0;j<nums.length;j++)  {
        nums[j] = j;  
    }
    
    for (int j=0;j<words.length;j++) {
        words[j] = "Number " +j;
    }
    
    for (int j=0;j<rocks.length;j++) {
        rocks[j] = new Rock(j);
    }
    System.out.print("NUMS: ");
    for (int n : nums) {
        System.out.print(n+" ");
    }
    System.out.print("\n\nWORDS: ");
    for (String s : words) {
        System.out.print(s+" ");
    }
    System.out.println("\n\nROCKS: ");
    for (Rock r : rocks) {
        System.out.print(r+" ");
    }
    System.out.print("\n\nCHANGING NUMS: ");
        for (int n : nums) {
        n = n+1;
        System.out.print(n+" ");
    }
    System.out.print("\n\nCHANGING WORDS: ");
    for (String s : words) {
        s=s.concat("0");
        System.out.print(s+" ");
    }
    System.out.println("\n\nCHANGING ROCKS: ");
    for (Rock r : rocks) {
        r.erode();
        System.out.print(r+" ");
    }
    
    System.out.print("\n\nNUMS AGAIN: ");
    for (int n : nums) {
        System.out.print(n+" ");
    }
    System.out.print("\n\nWORDS AGAIN: ");
    for (String s : words) {
        System.out.print(s+" ");
    }
    System.out.println("\n\nROCKS AGAIN: ");
    for (Rock r : rocks) {
        System.out.print(r+" ");
    }
}
}

/*
 * NUMS: 0 1 2 3 4 

WORDS: Number 0 Number 1 Number 2 Number 3 Number 4 

ROCKS: 
Rock: 0.000 kg Rock: 1.000 kg Rock: 2.000 kg Rock: 3.000 kg Rock: 4.000 kg 

CHANGING NUMS: 1 2 3 4 5 

CHANGING WORDS: Number 00 Number 10 Number 20 Number 30 Number 40 

CHANGING ROCKS: 
Rock: 0.000 kg Rock: 0.900 kg Rock: 1.800 kg Rock: 2.700 kg Rock: 3.600 kg 

NUMS AGAIN: 0 1 2 3 4 

WORDS AGAIN: Number 0 Number 1 Number 2 Number 3 Number 4 

ROCKS AGAIN: 
Rock: 0.000 kg Rock: 0.900 kg Rock: 1.800 kg Rock: 2.700 kg Rock: 3.600 kg 
 */
    