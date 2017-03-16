public class Tester
{
    public static void main(String[] args) {
        Person p = new Man(5,10);
        System.out.println("p.x = " + p.x);
        System.out.println("p.g() = "+ p.g());
        System.out.println("p.f() = " + p.f());
        System.out.println("p.h() = " + p.h());
        System.out.println("p says " + p.greeting());
        
        Man m  = new Man(5,10);
        System.out.println("m.x = " + m.x);
        System.out.println("m.g() = "+ m.g());
        System.out.println("m.f() = " + m.f());
        System.out.println("m.h() = " + m.h());
        System.out.println("m says " + m.greeting());;
        
<<<<<<< HEAD
        System.out.println(m instanceof Person);
        System.out.println(m instanceof Man);
        System.out.println(m instanceof Object);
=======
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Man);
        System.out.println(p instanceof Object);
>>>>>>> origin/master
    }
}
