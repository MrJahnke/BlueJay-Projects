public class Man extends Person
{ 
    public int x;
    public Man(int x,int y){
        super(x);
        this.x = y;
    }
    public int f() { 
        return x + g();  
    }
    public int h() { return x; }
    public String greeting() { return "Yo"; }
}

