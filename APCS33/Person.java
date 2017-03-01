public class Person
{
   public int x;
   public Person(int x) {  
       this.x = x; 
   }
   public int f() { return x; }
   public int g() { return x; }
   public int h() { return x; }
   public String greeting() { return "Hi"; }
}
