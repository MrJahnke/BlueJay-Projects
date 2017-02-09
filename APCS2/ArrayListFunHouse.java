
/**
 * Write a description of class ArrayListFunHouse here.
 * 
 * @author Jahnke 
 * @version December 14, 2016
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<>();
                for (int j=2; j<=number/2; j++)   
                    if(number%j==0)
                        factors.add(j);
                return factors;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
            int factor;
            ArrayList<Integer> testList = new ArrayList<>();
            for(int j=0;j<nums.size(); j++)
            {
                factor = nums.get(j);
                testList = getListOfFactors(factor);
                if (testList.size()==0)
                    nums.remove(j);
            }
	}
}