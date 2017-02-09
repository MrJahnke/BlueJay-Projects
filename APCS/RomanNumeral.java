
/**
 * Write a description of class RomanNumeral here.
 * 
 * @author Mr. Jahnke
 * @version December 4, 2016
 */

import static java.lang.System.*;

public class RomanNumeral
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS= {1000,900,500,400,100,90,
                                                    50,40,10,9,5,4,1};

    private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
                                                  "L","XL","X","IX","V","IV","I"};

    public RomanNumeral(String str)
    {
        setRoman(str);
    }

    public RomanNumeral(Integer orig)
    {
        setNumber(orig);
    }

    public void setNumber(Integer num)
    {
        number = num;
        // Change int to Roman String
        String r="";
        while (num > 0) {
            for (int i = 0; i < NUMBERS.length ; i++) {
                if (num >= NUMBERS[i]) {
                    r+=LETTERS[i];
                    num-=NUMBERS[i];
                    break;
                }
            }
        }
        roman = r; 
    }
    
    public void setRoman(String rom)
    {
        roman = rom;
        // Change Roman String to int
        int num = 0;
        while (rom.length()>0) {
            boolean found = false;
            String rn="";
            if (rom.length()>1)  
                rn= rom.substring(0,2);

            for(int j=0; j<LETTERS.length ; j++) {
                if(rn.equals(LETTERS[j])) {
                    num+=NUMBERS[j];
                    rom=rom.substring(2);
                    found = true;
                    break;
                }     
             }
            
            if(!found) {
                rn = rom.substring(0,1);
                for(int j=0; j<LETTERS.length ; j++) {
                    if(rn.equals(LETTERS[j])) {
                       num+=NUMBERS[j];
                       if (rom.length()>1)
                           rom=rom.substring(1);
                       else
                           rom="";
                       break;
                    }     
                }
            }
        }
       number = num;
    }

    public Integer getNumber()
    {
        return number;
    }

    public String toString()
    {
        return roman + "\n";
    }
}