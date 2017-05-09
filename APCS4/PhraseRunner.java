
public class PhraseRunner
{
    public static void main(String[] args)
    {
        Phrase phrase1 = new Phrase("A cat ate late");
        int index = phrase1.findNthOccurrence("at", 1);
        System.out.println(index);
        index = phrase1.findLastOccurrence("at");
        System.out.println(index);
        
        phrase1.replaceNthOccurrence("at", 1, "rane");
        System.out.println(phrase1);
        
        //Phrase phrase2 = new Phrase("aaaa");
        //index = phrase2.findNthOccurrence("aa", 2);
        //System.out.println(index);
        //phrase2.replaceNthOccurrence("aa", 2, "bb");
        //System.out.println(phrase2);
    }
}
