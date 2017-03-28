
/**
 * This is a class that tests the Deck class.
 * 
 * @author  Mr Jahnke
 * @version  March 6, 2017
 */

public class DeckTester4 {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {

        /* If the above runner works, comment it out and make a new deck
         * that can be use for playing BlackJack.
         * Suits:  Hearts, Clubs, Diamonds, Spades.
         * Ranks: 2 - 10, Jack, Queen, King, Ace.
         * Values: 2-10, Face Cards (JQK) = 10, Ace = 11.
         * Print the deck.
         */
     
        String[] ranks = {"Ace", "2","3","4","5","6","7","8","9","10","J", "Q", "K"};
        String[] suits = {"Clubs   ", "Hearts  ", "Spades  ", "Diamonds"};
        int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Shuffled Deck  ****");
        System.out.println(d);
        
        //d.selectionSort();
        //d.selectionSort();
        
        d.insertionSort();
        d.insertionSort();
        
        System.out.println("**** Sorted Deck ****");
        System.out.println(d); 
    }
}

