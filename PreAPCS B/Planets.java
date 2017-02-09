import java.util.Scanner;

public class Planets
{
   public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       double weight;
       int selection;
       String planet;
       
       System.out.print("What is your weight on Earth? ");
       weight = kb.nextDouble();
       
       System.out.println("\t1. Voltair");
       System.out.println("\t2. Krypton");
       System.out.println("\t3. Fertos");
       System.out.println("\t4. Servontos");
       System.out.print("Selection: ");
       selection = kb.nextInt();
       
       switch(selection) {
           case 1:
                weight*=0.321;
                planet = "Voltar";
                break;
           case 2:
                weight*=0.654;
                planet = "Krypton";
                break;
           case 3:
                weight*=1.789;
                planet = "Fertos";
                break;
           case 4:
                weight*=4.321;
                planet = "Servontos";
                break;
           default:
                planet = "Earth";
                break;
        }
        System.out.println("Your weight on "+planet+" would be "+weight);
    }
}
