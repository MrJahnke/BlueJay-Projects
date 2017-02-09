
/**
 * Write a description of class ArrayListStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStuff
{
   public static void main(String[] args)
   {
       /*
        ArrayList<Rock> box = new ArrayList<Rock>();
       //List box = new ArrayList<Rock>();
       
       //System.out.println(box.isEmpty());
       Rock r = new Rock();
       //box.remove(0);
       box.add(r);
       //box.get(3);
       box.add(new Rock());
       box.add(2,r);
       
       System.out.println("A List");
       List arr = new ArrayList();
       arr.add(3);
       
       //int x = arr.get(0);
       
       Integer num = new Integer(4);
       arr.add(num);
       Integer num2 = (Integer)arr.get(1);
       int n = num2.intValue();
       System.out.println(n);
       
       System.out.println("\nAn ArrayList");
       List<Integer> arr2= new ArrayList<Integer>();
       arr2.add(100);
       int m = arr2.get(0);
       System.out.println(m);
       arr2.clear();
       
       for (int x=0;x<10;x++) {
           arr2.add(x);
       }
        
       for (int j : arr2) {
            System.out.println(j);
       }
       
       System.out.println("\nAn Iterator List");
       Iterator list = arr2.iterator();
       
       while (list.hasNext()) {
           System.out.println(list.next());
        }
        
       List arr = new ArrayList();
       arr.add("CAT");
       arr.add(new Integer(3));
       String s = (String)arr.get(0);
       Integer i = (Integer)arr.get(1);
       System.out.println(s);
       System.out.println(i);
       */
      List a = new ArrayList();
      List<Integer> b = new ArrayList<Integer>();
      
      int x = 19;
      //question 5
      a.add(x);
      b.add(x);
      
      // question 6
      int gh = b.get(0);
      gh = (int)a.get(0);
     
      System.out.println(gh);
      //Qustions 7
      int sz = a.size();
      sz = b.size();
      
      //problem 5
      
      ArrayList aList= new ArrayList();
      Integer i = new Integer(5);
      int k = i;
      System.out.println(k);
      aList.add(i);
      int j = (Integer)aList.get(0);
      System.out.println(j);
      
      ArrayList<Integer> obj = new ArrayList();
      Integer ss = new Integer(6);
      obj.add(ss);
      j = obj.get(0);
      System.out.println(j);
    }
}
