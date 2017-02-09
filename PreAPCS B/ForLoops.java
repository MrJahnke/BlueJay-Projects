
public class ForLoops
{
    public static void main(String[] args) {
        int j=3;
        for(int z = 3; z<=24; z=z*2)
        { 
            System.out.print(z+ " ");
        }

        System.out.println("\n\nLet's Flip a Coin - A lot!");
        
        int x;
        int heads = 0;
        int tails = 0;
        int toss;
        final int FLIPS = 10000000;
        for(x=0 ; x<FLIPS ; x++ ){
            toss = (int)(Math.random()*2);
            if (toss == 0)
                heads++;
            else
                tails++;
         }
     System.out.println("Heads: "+heads+" " +((double)heads/FLIPS*100.0)+"%");
     System.out.println("Tails: "+tails+" " +((double)tails/FLIPS*100.0)+"%");
     
     String s = "cat";
     for (int k=0; k<s.length(); k++)
     {
         System.out.println(s.substring(k,k+1));
     }
    }
}
