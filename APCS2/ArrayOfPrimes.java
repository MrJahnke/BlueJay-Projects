public class ArrayOfPrimes
{
    //instance variables and constructors could be present, but are not necessary
    
    //getPrimeList(int numPrimes) will return an array 
    //containing the first numPrimes primes starting at 2
    public static int[] getPrimeList(int numPrimes)
    {
        int[] list = new int[numPrimes];
        int count=1;
        int num = 3;
        list[0] = 2;
        while (count < numPrimes)
        {
            if (isPrime(num)) {
                list[count] = num;
                count++;
            }
            num+=2;
        }
        return list;  //just call a method here
        
    }

    //getPrimeList(int numPrimes, int primeStart) will return an array 
    //containing the first numPrimes primes starting at primeStart
    public static int[] getPrimeList(int numPrimes, int primeStart)
    {
        int[] list = new int[numPrimes];
        int count=0;
        int num = primeStart+1;
        while (count < numPrimes)
        {
            if (isPrime(num)) {
                list[count] = num;
                count++;
            }
            num++;
        }
        return list;
    }
        
    //isPrime will return true if num is prime
    //a prime number is any number ony divisible by 1 and    itself
    private static boolean isPrime(int num)
    {
       boolean prime = true;
       if (num % 2 == 0)
            prime = false;
       else {
           for (int x=3; x<=num/2; x++) {
               if (num % x == 0) {
                   prime = false;
                   break;
                }
            }
       }
        return prime;
    }
}
