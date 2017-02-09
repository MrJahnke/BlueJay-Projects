import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxes
{
    //instance variables and constructors could be present, but are not necessary
   
    public static void printBox(char letter, int size)
    {
        for (int j = 0; j<size; j++) {
            for (int k = 0; k<size; k++) {
                System.out.print(letter); }
            System.out.println();
        }
    }
}