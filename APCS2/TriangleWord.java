import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
    //instance variables and constructors could be present, but are not necessary
        
    public static void printTriangle(String word)
    {
        int size = word.length();
        for (int row = 1; row <=size; row ++)
        {
            for (int letters = 1  ; letters<=row; letters++)
            {
                out.print(word.substring(0,row));
            }
            out.println();
        }
    }
}