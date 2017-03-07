
/**
 * This is a class that tests the Deck class.
 * 
 * @author  Mr Jahnke
 * @version  March 6, 2017
 */

public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN  ACTIVITY 2 *** */
    
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();
        
        /* If the above runner works, comment it out and make a new deck
         * that can be use for playing BlackJack.
         * Suits:  Hearts, Clubs, Diamonds, Spades.
         * Ranks: 2 - 10, Jack, Queen, King, Ace.
         * Values: 2-10, Face Cards (JQK) = 10, Ace = 11.
         * Print the deck.
         */
        
        
        
        
        
    }
}

/*
 * 
**** Deal a Card ****
  deal: king of red (point value = 13)


**** Deck Methods After 1 Card Dealt ****
  toString:
size = 5
Undealt cards: 
king of blue (point value = 13), queen of red (point value = 12), 
queen of blue (point value = 12), jack of red (point value = 11), 
jack of blue (point value = 11)
Dealt cards: 
king of red (point value = 13)

  isEmpty: false
  size: 5


**** Deal Remaining 5 Cards ****
  deal: king of blue (point value = 13)
  deal: queen of red (point value = 12)
  deal: queen of blue (point value = 12)
  deal: jack of red (point value = 11)
  deal: jack of blue (point value = 11)


**** Deck Methods After All Cards Dealt ****
  toString:
size = 0
Undealt cards: 

Dealt cards: 
king of red (point value = 13), king of blue (point value = 13), 
queen of red (point value = 12), queen of blue (point value = 12), 
jack of red (point value = 11), jack of blue (point value = 11)


  isEmpty: true
  size: 0


**** Deal a Card From Empty Deck ****
  deal: null

*/

