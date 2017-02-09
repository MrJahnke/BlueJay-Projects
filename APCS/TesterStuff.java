public class TesterStuff
{
  public static void main(String[] args)
  {
      Stuff s = new Stuff();
      
      String name1 = null;
      System.out.println(s.stuffObj1(name1));
      
      String name2 = null;
      s.stuffObj2(name2);
      System.out.println(name2);
      
      int num1=0;
      System.out.println(s.stuffPrim1(num1));
      
      int num2=0;
      s.stuffPrim2(num2);
      System.out.println(num2);
      
      Ball b1;
      Ball b2 = null;
      //s.stuffBall(b2);
      System.out.println(s.stuffBall1(b2));
      s.stuffBall2(b2);
      System.out.println(b2);
    }
}