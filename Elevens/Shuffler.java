/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 10;


    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
        
                System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive LESS efficient selection shuffles:");
        int[] values3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle3(values3);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values3[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " flips:");
        
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            System.out.println(flip());
        }
        System.out.println();
        
        int[] numbers1 = {0,1,2,3,4};
        int[] numbers2 = {4,2,3,1,0};
        int[] numbers3 = {1,2,3,4,5};
        
        System.out.println("Numbers1 and Numbers2 are permutations2: " + arePermutations2(numbers1, numbers2));
        System.out.println("Numbers1 and Numbers3 are permutations2: " + arePermutations2(numbers1, numbers3));
        System.out.println();
        System.out.println("Numbers1 and Numbers2 are permutations: " + arePermutations(numbers1, numbers2));
        System.out.println("Numbers1 and Numbers3 are permutations: " + arePermutations(numbers1, numbers3));

    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        int size = values.length;
        int[] shuffled = new int[size];
        int k = 0;
        int half = size/2;
        if (size%2!=0) half+=1;
        
        for (int j=0; j<half; j++) 
        {
            shuffled[k] = values[j];
            k+=2;
        }
        k = 1;
        for (int j=half; j<size; j++) 
        {
            shuffled[k] = values[j];
            k+=2;
        }
        
        for (int j = 0; j<size; j++)
        {
            values[j] = shuffled[j];
        }
    }
     
    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all   cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        int size = values.length;
        for (int k=size-1; k>=0; k--) 
        {
            int r = (int)(Math.random()*k+1);
            int temp = values[k];
            values[k] = values[r];
            values[r] = temp;

        }
    }
    
    public static void selectionShuffle2(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        int size = values.length;
        for (int k=0; k<size; k++) 
        {
            int r = (int)(Math.random()*k+1);
            int temp = values[k];
            values[k] = values[r];
            values[r] = temp;
        }
        
    }
    
    public static void selectionShuffle3(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        int count = 0;
        int size = values.length;
        int[] shuffled = new int[size];  
        for (int k=0; k<size; k++) 
        {
            int j=0;
            do {
                j = (int)(Math.random()*size);
                count++;
            } while (values[j]==-1);
            shuffled[k] = values[j];
            values[j] = -1;
        }
        for (int j = 0; j<size; j++)
        {
            values[j] = shuffled[j];
        }
        System.out.println("Loops: "+count);
    }
    
    public static String flip()
    {
        int ran = (int)(Math.random()*3);
        String flip = "heads";
        if (ran == 2)
            flip = "tails";
        return flip;
    }
    
    public static boolean arePermutations2 (int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
            return false;
        boolean found = false;
        for (int j=0; j<arr2.length; j++)
        { 
                if (!contains(arr1, arr2[j]))
                    return false;
        }       
        return true;
    }
    
    
    private static boolean contains(int[] arr, int n)
    {
        for (int j=0; j<arr.length; j++)
        {
            if (arr[j]==n)
                return true;
        }
        return false;
    }
    
    public static boolean arePermutations(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
            return false;
        boolean found = false;
        for (int j=0; j<arr1.length; j++)
        { 
                for (int k=0; k<arr2.length; k++)
                {
                    if (arr1[j]==arr2[k])
                    {
                        found = true;
                        break;
                    }
                }
                if (!found)
                {
                    found = false;  // or return false;
                    break;
                }
        }       
        return found;  // or return true;
    }
}
 


