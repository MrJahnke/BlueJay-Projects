
/**
 * Write a description of class NumberSorter here.
 * 
 * @author Mr Jahnke
 * @version December 6, 2016
 */
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
    //instance variables and other methods not shown

    private static int getNumDigits(int number)
    {
        int count = 1;
        int d=10;
        while (count<10)  // or d<10000000000
        {
            if (number/d==0) 
            { 
                break;
            }
            count++;
            d*=10;
        }
        return count;
    }

    public static int[] getSortedDigitArray(int number)
    {
        int n = getNumDigits(number);
        int[] numList = new int[n];
        int[] sorted;
        int d;
        int index = 0;
        for (int x=0; x<numList.length ; x++) 
        {
            d = number % 10;
            numList[x] = d;
            number= number/10;
        }
        sorted = sortArray(numList);
        return sorted;
    }
    
    private static int[] sortArray(int[] arr) {
        int[] newArray = new int[arr.length];
        
        for (int x=newArray.length-1; x>=0; x--)
        {
            int max = 0;
            for(int j=1 ; j < arr.length ; j++) 
            {
                if (arr[j] >= arr[max]) 
                {
                    max = j;
                }
            }
            newArray[x] = arr[max];
            arr[max]=0;
        }
        return newArray; 
    }
    
    public static void main(String args[])
	{
		System.out.println(NumberSorter.getNumDigits(1234));
    }
    
}