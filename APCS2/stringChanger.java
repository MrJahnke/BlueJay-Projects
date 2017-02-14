
public class StringChanger
{
    public static String change1(String s)
    {
       boolean i = true;
       int psn = 0;
       String result = "";
       
       while (s.indexOf("_", psn) >=0)
       {
           int nextPsn = s.indexOf("_", psn);
           result = result + s.substring(psn, nextPsn);
           // This always add <I>  not <I>...</I>
           // Change it using a if else statement and a boolean
           if (true)
              result += "<I>";
           
           psn = nextPsn+1;
       }
       result += s.substring(psn);
       return result;
    }
    
    public static String change2(String s)
    {
       String tag;
       int psn = 0;
       String result = "";
       
       while (s.indexOf("_", psn) >=0)
       {
           int nextPsn = s.indexOf("_", psn);
           result = result + s.substring(psn, nextPsn);
           // This always add <I>  not <I>...</I>
           // Change it using a if else statement and string equals
           if (true)
              result += "<I>";
           
           psn = nextPsn+1;
       }
       result += s.substring(psn);
       return result;
    }
    
    public static String change3(String s)
    {
       int i = 1;
       int psn = 0;
       String result = "";
       
       while (s.indexOf("_", psn) >=0)
       {
           int nextPsn = s.indexOf("_", psn);
           result = result + s.substring(psn, nextPsn);
           // This always add <I>  not <I>...</I>
           // Change it using a if else statement and int == 
           // you can switch between i = 1 and i = -1 by adding i = -i
           if (true)
              result += "<I>";
           
           psn = nextPsn+1;
       }
       result += s.substring(psn);
       return result;
    }
    
    public static void main(String[] args)
    {
        System.out.println(change1("_This_ is _very_ _good_."));
        System.out.println(change2("_This_ is _very_ _good_."));
        System.out.println(change3("_This_ is _very_ _good_."));
    }
}
