
/**
 * This is a class that tests the Card class.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("King", "Diamonds", 10);
		Card c2 = new Card("Two", "Hearts", 2);
		Card c3 = new Card("Seven", "Diamonds", 7);
		Card c4 = new Card("Ace", "Spades", 11);
		Card c5 = new Card("Ace", "Clubs", 11);
		Card c6 = new Card("Ace", "Spades", 1);
		Card c7 = new Card("Ace", "Spades", 11);
		Card c8 = new Card("Joker", "Spades", 11);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		System.out.println(c4.matches(c5));
		System.out.println(c4.matches(c6));
		System.out.println(c4.matches(c7));
		System.out.println(c4.matches(c8));
	}
}
