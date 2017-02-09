public class Tile
{
    private String letter;
    private int value;
  
    public Tile(String l,int v)
    {
        letter = l;
        value = v;
    }
    public String getLetter() { 
        return letter;
    }
    public int getValue() { 
        return value;
    }
    public void setLetter(String s) {
        letter=s;
    }
    public void setValue(int v) {
        value=v;
    }
    public String toString()
    {
        return letter+value;
    }
}
