import static java.lang.System.*;

public class RomanNumeral2
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS= {1000,900,500,400,100,90,
                                                    50,40,10,9,5,4,1};

    private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
                                                  "L","XL","X","IX","V","IV","I"};

    public RomanNumeral2(String str)
    {
        setRoman(str);
    }

    public RomanNumeral2(Integer orig)
    {
        setNumber(orig);
    }

    public void setNumber(Integer num)  
    {
        number = num;
        int x;
        for (x=0 ; x < NUMBERS.length; x++) {
            if (num == NUMBERS[x]) {
                break; }
        }
        roman = LETTERS[x];
    }

    public void setRoman(String rom)
    {

    }

    public Integer getNumber()
    {
        return number;
    }

    public String toString()
    {
        return roman + "\n";
    }
    
    public static void main(String[] args) {
        RomanNumeral2 rome = new RomanNumeral2(10);
        System.out.println("10 is " + rome);
    }
}