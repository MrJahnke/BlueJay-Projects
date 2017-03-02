
/**
 * This is a class that tests the Deck class.
 * 
 * @author Mr. Jahnke 
 * @version March 5, 2017
 */

public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Jack", "Queen", "King", "Ace" };
		String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds" };
		int[] values1 = { 11 , 12, 13, 14 };
		
		Deck regDeck = new Deck(ranks, suits, values1 );
		System.out.println(regDeck);
	}
}
