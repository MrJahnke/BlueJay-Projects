import java.util.ArrayList;

public class ScrabbleTiles
{
   private ArrayList<Tile> tiles;
   String onePoint = "EEEEEEEEEEEEAAAAAAAAAIIIIIIIIIOOOOOOOONNNNNNRRRRRRTTTTTTLLLLSSSSUUUU";
   String twoPoints = "DDDDGGG";
   String threePoints = "BBCCMMPP";
   String fourPoints = "FFHHVVWWYY";
   String fivePoints = "K";
   String eightPoints = "JX";
   String tenPoints = "QZ";
   String zeroPoints = "__";  // two underscores _ _ Represents 'Blanks'
   
   /**
    * A no arguements constructor that creates all the tiles
    * for a new game of Scrabble.
    */
    public ScrabbleTiles()
    {
      tiles = new ArrayList<Tile>();
      newGameTiles();
    }
    
    public void newGameTiles()
    {
      makeTiles(onePoint, 1);
      makeTiles(twoPoints, 2);
      makeTiles(threePoints, 3);
      makeTiles(fourPoints, 4);
      makeTiles(fivePoints, 5);
      makeTiles(eightPoints, 8);
      makeTiles(tenPoints, 10);
      makeTiles(zeroPoints, 0);
      shuffleTiles();
    }
    
    public ArrayList<Tile> getTiles()
    {
        return tiles;
    }
    
    public int tilesLeft() {
        return tiles.size();
    }
    
    /** 
     * A new game method called by the constructor that takes a String of letters 
     * and makes Tiles of each letter, then adds the Tiles to tiles.
     * @param A String of letters
     * @param The point value of each letter (all the letters should have the same point value.
     */
    private void makeTiles(String letters, int points)
    {
        for (int x=0; x<letters.length(); x++)
        {
            String s = letters.substring(x,x+1);
            Tile tile = new Tile(s, points);
            tiles.add(tile);
        }
    }
    
    /** 
     * A method that shuffles all the tiles in the ArrayList<Tiles> tiles.
     * Takes a random tile and moves it to a new Arraylist, then returns
     * the new ArrayList.
     */
    private void shuffleTiles()
    {
        ArrayList<Tile> mixedTiles = new ArrayList<Tile>();
        while (!tiles.isEmpty())
        {
            int randNum = (int)(Math.random()*tiles.size());
            mixedTiles.add(tiles.get(randNum));
            tiles.remove(randNum);
        }
        tiles = mixedTiles;
    }
    
    public String toString() 
    {
        String s="";
        for (Tile t : tiles)
            s+=t+" ";
        return s; 
    }
    
}
