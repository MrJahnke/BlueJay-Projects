
/**
 * Write a description of class TextFormatter here.
 * 
 * @author Jahnke 
 * @version February 8, 2017
 */
public class TextFormatter
   {
     private String line; //  The line to format
     
     public TextFormatter (String lineToFormat)
     {  
         line = lineToFormat;  
     }
     
     public void setLine(String newLine)
     {
         line = newLine;
     }

    /**
     * Finds the first single instance of str in line,
     * starting at the position start
     * @param str the string of length 1 to find.
     * Guaranteed to be length 1.
     * @param start the position to start searching.
     * Guaranteed to be in the string line.
     * @return the index of the first single instance of
     * str if the string is found or -1 if it is not found.
     */
    private int findString (String str, int start)
    {  
        /* To be implemented in part a) */ 
        int psn = line.indexOf(str, start);
        //int loop = 0;
        String before = "";
        String after = "";
        while (psn >= 0) // && loop<10)
        {
           // System.out.println("psn top: " +psn);
            if (psn>0) 
            {
                before = line.substring(psn-1, psn); 
                //System.out.println("before:" +before);
            }
            if (psn < line.length()-1) 
            {
                after = line.substring(psn+1, psn+2);
                //System.out.println("after: "+after);
            }
            
            if (! (str.equals(before) || str.equals(after)))
            {
                psn = line.indexOf(str, psn); //not needed
                return psn;
            }
            psn = line.indexOf(str, psn+1);  //start++
            //System.out.println("loop: " + loop);
            //loop++;
        }
        return -1;
    }
    
    /**
     * Count the number of times single instances of str appear in
     * the line.
     * @param str the string to find.
     * Guaranteed to be length 1.
     * @return the number of times the string appears in the line
     */
    private int countStrings (String str)
    {  
        /* To be implemented in part b) */ 
        return 0;
    }
    
    /**
     * Replace all single instances of underscores in the line given by
     * line with italics tags.  There must be an even number of underscores 9
     * in the line, and they will be replaced by <I>, </I>, alternating.
     * @param original a string of length 1 to replace
     * @param replacement the string (of any length) use as a replacement
     * @return the line with single instances of underscores replaced with
     * <I> tags or the original line if there are not an even number of
     * underscores.
    */
  public String convertItalics ()
  {  
      String result = "hi";
      
      /* To be implemented in part c) */ 
      
      return result;
  }
  
  public static void main(String[] args)
  {
      TextFormatter myTC = new TextFormatter("aabaccb");
      System.out.println(myTC.findString("a",0));  // 3
      System.out.println(myTC.findString("b",4));  // 6
      System.out.println(myTC.findString("c",0));  // -1
      
      String convertedLine = "";
      myTC.setLine("This is _very_ good.");
      convertedLine = myTC.convertItalics();
      System.out.println(convertedLine);
      // This is <I>very</I> good.
      
      myTC.setLine("_This_ is _very_ _good_.");
      convertedLine = myTC.convertItalics();
      System.out.println(convertedLine);
      // <I>This</I> is <I>very</I> <I>good</I>.
      
      myTC.setLine("This is _very good.");
      convertedLine = myTC.convertItalics();
      System.out.println(convertedLine);
      // This is _very good.  (no change because odd number of _)
      
      myTC.setLine("This is __very good.");
      convertedLine = myTC.convertItalics();
      System.out.println(convertedLine);
      // This is __very good.  (Even, but no change because __ skipped. )
  }
}