import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner kb = new Scanner(System.in);
		String word = "";
		do
		{
		    out.print("\nEnter a word :: ");
		    word = kb.nextLine();
		    TriangleWord.printTriangle(word);
		    out.print("\nDo you want more sample input? ");
		    word = kb.nextLiSystem.out.println("Enter a word :: ");
		    word = kb.nextLine();ne();
		} while (!word.equals("n"));
		out.println("Good-bye");
	}
}