public class Position
{
    private int row;
    private int col;

    public Position(int r, int c) {
        row = r;
        col = c;
    }

    public String toString() {
        return "("+row +","+col+")";
    }
    
    public static Position findPosition(int num, int[][] intArr) {
        for (int r=0; r<intArr.length; r++) 
            for (int c=0; c<intArr[0].length; c++) 
                if (intArr[r][c] == num) 
                    return new Position(r,c);
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] result = new Position[intArr.length][intArr[0].length];
        
        for (int r=0; r<intArr.length; r++)  {
            for (int c=0; c<intArr[0].length; c++) {
                int value = intArr[r][c];
                result[r][c] = findPosition(value+1, intArr);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
      int[][] arr = {   {15,5,9,10},
                        {12,16,11,6},
                        {14,8,13,7}     };
        
      System.out.println(findPosition(8, arr));
      System.out.println(findPosition(17, arr));
      
      Position[][] posArr = getSuccessorArray(arr);
      print(posArr);
    }
    
    private static void print(Position[][] arr) {
        for (int r=0; r<arr.length; r++) {
            for (int c=0; c<arr[0].length; c++) {
                System.out.print(arr[r][c]);
            }
            System.out.println();
        }
    }
}
