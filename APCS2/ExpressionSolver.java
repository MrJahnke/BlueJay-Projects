
/**
 * Write a description of class ExpressionSolver here.
 * 
 * @author Jahnke 
 * @version December 15, 2016
 */
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.util.ArrayList;

public class ExpressionSolver
{
    private String equation;
    private static ArrayList<String> list;

    public ExpressionSolver(String s)
    {
        equation = s;
        setExpression(s);
        solveExpression();
    }

    public void setExpression(String s)
    {
        list = new ArrayList<String>();
        for (int x=0; x<s.length(); x++)
        {
            if (s.substring(x).equals("*") || s.substring(x).equals("/") || 
                s.substring(x).equals("+") || s.substring(x).equals("-"))
                    list.add(s.substring(0,x-1));
            s = s.substring(x);
        }
    }

    public void solveExpression()
    {
        for (String j : list)
             System.out.print(j);
        System.out.println();
        
        int num1=0, num2=0, num3=0;
        String s="", n3="";
        int x=0; 
        while (x<list.size())
        {
            s = list.get(x);
            if (s.equals("*") || s.equals("/"))
            {
                num1 = Integer.parseInt(list.get(x-1));
                num2 = Integer.parseInt(list.get(x+1));
                if (s.equals("*") )
                    num3 = num1*num2;
                else
                    num3 = num1/num2;
                list.remove(x-1);
                list.remove(x-1);
                n3 = Integer.toString(num3);
                list.set(x-1,n3);
                // for testing
                for (String j : list)
                    System.out.print(j);
                System.out.println();
            }
            else
                x++;   // only add when not found
        }
         
        for (int y=0; y<list.size();y++)
        {
            s = list.get(y);
            if (s.equals("+") || s.equals("-"))
            {
                num1 = Integer.parseInt(list.get(y-1));
                num2 = Integer.parseInt(list.get(y+1));
                if (s.equals("+"))
                    num3 = num1+num2;
                else
                    num3 = num1-num2;
                list.remove(y-1);
                list.remove(y-1);
                n3 = Integer.toString(num3);
                list.set(y-1,n3);
                y--;            // to avoid skipping because of remove
                // for testing
                for (String j : list)
                    System.out.print(j);
                System.out.println();
            }
        }
    }

    public String toString( )
    {
        return equation + "=" + list.get(0);
    }

}