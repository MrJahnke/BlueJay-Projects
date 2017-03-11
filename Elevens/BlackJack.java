
/**
 * 
 * 
 * @author  
 * @version 
 */
public class BlackJack
{
    public static void main(String[] args) {
        
       String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
       String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
       int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11};
       Deck deck = new Deck(ranks, suits, pointValues);
       
       deck.shuffle();
        
    }
}
