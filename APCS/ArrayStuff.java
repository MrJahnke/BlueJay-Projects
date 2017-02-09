//AP Computer Science,November 20, 2016
public class ArrayStuff
{
   public static void main(String args[]) 
   {
    int[] myList1 = {2,4,6,8,10,12,14,16,18};
    int[] myList2 = new int[10];
    printMe(myList1);
    printMe(myList2);
    addOne(myList1);
    printMeToo(myList1);
    addTwo(myList1);
    printMe(myList1);
    String[] family = {"mom", "dad", "brother", "sister"};
    for (String s : family){
        System.out.println(s);
    }
   }
   
   public static void printMe(int[] arr){
       for(int j = 0; j<arr.length; j++) {
           System.out.print(arr[j] + " ");
        }
        System.out.println();
   }
   public static void printMeToo(int[] arr){
        for(int k : arr) {
           System.out.print(k + " ");
        }
        System.out.println();
   }
   public static void addOne(int[] arr){
        for(int j = 0; j<arr.length; j++) {
           arr[j]++;
        }
    }
   public static void addTwo(int[] arr){
        for(int k : arr) {     // k is the value at arr[j], not the index
           k = k+2;
        }
   }
}
/* 2 4 6 8 10 12 14 16 18 
0 0 0 0 0 0 0 0 0 0 
3 5 7 9 11 13 15 17 19 
3 5 7 9 11 13 15 17 19 
mom
dad
brother
sister
 */
