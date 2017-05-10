public class Phrase
{
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }
    
    public String toString()
    { return currentPhrase; }
    
    public int findNthOccurrence(String str, int n)
    {
        if (currentPhrase.indexOf(str)==-1) {
            return -1;
        }
        int index = 0;
        for (int x=0; x<n; x++) {
            index = currentPhrase.indexOf(str, index);
            if (index >= 0)
                index++;
            else
                return -1;
        }
        return index-1;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        if (this.findNthOccurrence(str, n) > 0) 
        {
            int index = this.findNthOccurrence(str, n); 
            currentPhrase = currentPhrase.substring(0, index) + repl +
                currentPhrase.substring(index + str.length());
        }
    }
       
    public int findLastOccurrence(String str)
    {
        int count = 1;
        while (findNthOccurrence(str,count) >=0)
        { 
            count++;
        }
        return findNthOccurrence(str,count-1);
    }
}
