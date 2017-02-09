public class Ball
{
    private String color;
    public Ball() { color = "Red";}
    
    public void setColor(String c) { color = c; }
    
    public String getColor() { return color; }
    
    public String toString() { return color + " ball";
    }
}