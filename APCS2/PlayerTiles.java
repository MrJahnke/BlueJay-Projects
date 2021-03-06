
/**
 * Write a description of class PlayerTiles here.
 * 
 * @author jjahnke 
 * @version January 22, 2017
 */

import java.util.ArrayList;
import java.util.List;

public class PlayerTiles extends ScrabbleTiles
{
    private ArrayList<Tile> gameTiles;
    private ArrayList<Tile> playerTiles;
    private int playerScore;
    
    /**
     * A constructor to create a players set of tiles.
     * @param t The set of game tiles that the player will draw from.
     * @param n The number of tiles that the player starts out with.
     */
    public PlayerTiles(ScrabbleTiles t, int n)
    {
        gameTiles = t.getTiles();
        playerTiles = new ArrayList<Tile>();
        drawTiles(n);
        playerScore = 0;
    }   
    
    public int getPlayerScore() {
        return playerScore;
    }
    
    /**
     * A method intended to be called by the a game's ScrabbleTiles obj 
     * that randomly selects one tile from tiles, copies it, 
     * removes it, and returns the copy.
     * (for efficency, it could just get last element, since the ArrayList
     *   is already shuffled)
     * @return A randomly selected tile from tiles.
     */
    public Tile drawTile()
    {
        int nextGameTile = gameTiles.size()-1;
        Tile tile = gameTiles.get(nextGameTile);
        gameTiles.remove(nextGameTile);
        return tile;
    }
    
    /** 
     * A method intended to be called by the player's ScrabbleTiles obj that
     * draws n number of tiles from the game's ScrabbleTiles obj
     * and adds them to the players tiles
     * @param gameTiles The ArrayList representing the games tiles.
     * @param n The number of tiles to be drawn.
     */
    public void drawTiles(int n)
    {
       int gameTilesLeft = gameTiles.size();
       if (gameTilesLeft < n) {
            n = gameTilesLeft;
            System.out.println("There are no tiles left");
        }
        for (int j=0; j<n; j++)
        {
            Tile tile = drawTile();
            playerTiles.add(tile);
        }
        gameTilesLeft = gameTiles.size();
        System.out.println("Tiles left: " + gameTilesLeft);
    }
    
    /** 
     * A method intended to be called by the player's ScrabbleTiles obj that
     * searches the tiles for a single letter. Method needs to call Tile getLetter(). 
     * @param letter A single letter that the method searches for in the tiles.
     * @return The index of where the letter is 
     * or -1 if the letter is not one of the tiles.
     */
    private int letterInTiles(String letter)
    {
        for (int j = 0; j<playerTiles.size(); j++)
        {
            Tile t = playerTiles.get(j);
            if ( t.getLetter().equalsIgnoreCase(letter))
                return j;
        }
        return -1;
    }
    
    private int letterInTiles(String word, String letter)
    {
        String wordTiles = "";
        for (int j = 0; j<word.length(); j++)
        {
            //wordTiles+=playerTiles.get().getLetter();
        }
        while (word.length()>0)
        {
            //word = 
        }
        
        return -1;
    }
        

    /**
     * A player method to see if all the letters in a word are represented
     * by a tile in the player's tiles. Should call letterInTiles(String letter).
     * @param word A String to look for in the player's tiles.
     * @return Whether or not all the letters in the word are in tiles
     */    
    private boolean allLettersInTiles(String word)
    {
        //for (int x = 0; x<word.length(); x++)
        //{
         //   String letter = word.substring(x,x+1);
        //    if (letterInTiles(letter)==-1)
         //       return false;
        //}
        //return true;
        String letters="";
        for (int j=0; j<playerTiles.size(); j++)
        {
            Tile t = playerTiles.get(j);
            letters+=t.getLetter();
        }
        for (int x=0; x<word.length(); x++)
        {
            String letter = word.substring(x,x+1);
            int j = letters.indexOf(letter);
            if (j==0)
                letters = letters.substring(1);
            else if (j>0)
                letters = letters.substring(0,j)+letters.substring(j+1);
            else
                return false;
        }
        return true;
    }
    
    /** 
     * A method intended to be called by a player ScrabbleTiles obj that
     * returns the total of all the letter values in a word 
     * or 0 if a letter is not a tile.
     * Gets each letter of the word, and call the letterInTiles method 
     * which finds where the letter is.
     * With that tiles location, get the tile and get its value.
     * Adds up all the values.
     * @param word A String
     * @return The value of the tiles in the String, 
     *   or 0 if the String contains letters that are not in 
     *   the players tiles.
     */
    public int getScore(String word)
    {
        int points = 0;
        if (!allLettersInTiles(word)) {
            return 0; 
        }
        for (int x=0; x<word.length();x++)
        {
            String s = word.substring(x,x+1);
            int n = letterInTiles(s);
            Tile t = playerTiles.get(n);
            points += t.getValue();  
            playerTiles.remove(n);
        }
        drawTiles(word.length());
        playerScore+=points;
        return points;
    }
    
    public String toString() 
    {
        String s="";
        for (Tile t : playerTiles)
            s+=t+" ";
        return s; 
    }
    
    public static void main (String[] args)
    {
        String letters = "ABCDEFA";
        String word1 = "BABE";    // false
        System.out.println(doSomething(letters, word1));
        String word2 = "FACE";    // true
        System.out.println(doSomething(letters, word2));
        String word3 = "BAA";    // true
        System.out.println(doSomething(letters, word3));
    }
    
    private static boolean doSomething(String s1, String s2)
    {
        for (int x=0; x<s2.length(); x++)
        {
            String letter = s2.substring(x,x+1);
            int j = s1.indexOf(letter);
            if (j==0)
                s1 = s1.substring(1);
            else if (j>0)
                s1 = s1.substring(0,j)+s1.substring(j+1);
            else
                return false;
        }
        return true;
    }


    
    
}
