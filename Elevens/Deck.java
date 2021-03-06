import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *      
 * @author Mr Jahnke
 * @version March 5, 2017
 */

public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        size = ranks.length * suits.length; 
        cards = new ArrayList<Card>();
        if (ranks.length == values.length) 
        {
            for (int r=0; r<ranks.length; r++)
            {
                for (int s=0; s<suits.length; s++)
                {
                    cards.add(new Card(ranks[r],suits[s],values[r]));
                }
            } 
            shuffle();
        } else {
            System.out.println("Error");
        }
        
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        return size==0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
        size = cards.size();
        //int size = values.length;
        for (int k=size-1; k>=0; k--) 
        {
            int r = (int)(Math.random()*k+1);
            Card temp = cards.get(k);
            cards.set(k, cards.get(r));
            cards.set(r, temp);

        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        if (isEmpty()) {
            return null;
        } else {
            return cards.get(--size);
        }
            
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ",\t ";
            }
            if ((size - k) % 4 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
    
    public void selectionSort(){
        int min, minIndex;
        int count = 0;
        for (int i=0; i<cards.size(); ++i) {
            min = (cards.get(i)).getPointValue();
            minIndex = i;
            for (int j = i+1; j<cards.size(); ++j) {
                int value = cards.get(j).getPointValue();
                if (value < min){
                     min = value;
                     minIndex = j;
                }
                count++;
            }
            Card temp = cards.get(i);
            cards.set(i, cards.get(minIndex));
            cards.set(minIndex, temp);
            count++;
        }
        System.out.println("Count: "+count);
    }
   
    public void insertionSort(){
        Card cardToInsert;
        int count = 0;
        int j;
        boolean keepGoing;
        for (int k=1; k<cards.size(); k++)
        {
            cardToInsert = cards.get(k);
            j = k-1;
            keepGoing = true;
            count++;
            while((j>=0) && keepGoing)
            {
                Card c = cards.get(j);
                if(cardToInsert.compareTo(c) < 0)
                {
                    cards.set(j+1, c);
                    j--;
                    if(j == -1) // special for inserting at [0]
                        cards.set(0,cardToInsert);
                }
                else 
                {
                    keepGoing = false;
                    cards.set(j+1, cardToInsert);
                }
                count++;
            }
        }
       System.out.println("Count: " +count);     
    }

}
