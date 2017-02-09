
/**
 * Write a description of class ExpressionSolverRunner here.
 * 
 * @author Jahnke
 * @version December 15, 2016
 */
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.util.Scanner;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
	    Scanner kb = new Scanner(System.in);
	    System.out.print("Enter an Equation: ");
	    String q = kb.nextLine();
	    ExpressionSolver exp = new ExpressionSolver(q);
	    System.out.println(exp);
	}
}
