

public class MartixTester
{
    public static void main(String[] args) {
        
        int[][] a = { {1, 2, -2, 0},
                     {-3, 4, 7, 2},
                     {6, 0, 3, 1} 
                    };
                    
        int[][] b = { {-1 ,3},
                      {0, 9},
                      {1, -11},
                      {4, -5}
                    };
                    
        int[][] c = MatrixMult(a,b);
        //print c;
   }
   
   public static int[][] MatrixMult(int[][] m1, int[][] m2){
       int[][] mm = new int[m1.length][m2[0].length];
       int rSum=0;
       int cSum=0;
       for(int r=0; r<mm.length; r++) {
           for(int c=0; c<[r].length; c++) {
               rSum = rowSum(m1[r]);
               
               mm[r][c] = rSum*cSum;
       
       return mm;
       
    }
    public static int rowSum(int[] arr) {
        int sum=0;
        for(int j=0, j<arr.length; j++)
            sum+=arr[j];
        return sum;
    }
}
