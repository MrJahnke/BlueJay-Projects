public class Stuff
{
    public int stuffPrim1(int y)
    {
        return 2 + y;
    }
    
    public void stuffPrim2(int y)
    {
        y =  2 + y;  // y += 2
    }
    
    public String stuffObj1(String s)
    {
        return "Hi " + s;
    }
    
    public void stuffObj2(String s)
    {
        s = "Hi " + s;
    }
    
   public String stuffBall1(Ball b)
    {
        return "hi " + b;
    }
    
   public void stuffBall2(Ball b)
   {
       Ball c = new Ball();
       c.setColor("Blue");
       System.out.println(c);
       b = c; 
   }
}
