import java.text.DecimalFormat;
import java.util.*;

public class RockList {


    public static void main(String[] args) {
        //Rock[] box = new Rock[10];
        ArrayList<Rock> box = new ArrayList<Rock>();
        
        for (int j=0; j<10; j++){
            box.add(new Rock());
        }
        
        System.out.println("A BOX OF ROCKS");
        for(Rock r : box){
            System.out.println(r);
        }
        
        System.out.println("\nA BOX OF ERODED ROCKS");
        for (int j=0; j<box.size(); j++){
            box.get(j).erode();
        }
        
        for(Rock r : box){
            System.out.println(r);
        }
        
        /*
        Rock[] box2 = split(box);
        System.out.println("\nA BOX WITH A SPLIT ROCK");
        for(Rock r : box2){
            System.out.println(r);
        }  
        */
        Rock bigRock = new Rock(5.0);
        box2 = addRock(box2, bigRock);
        System.out.println("\nADD A ROCK");
        for(Rock r : box2){
            System.out.println(r);
        }
        
        box2 = removeRock(box2, 2);
        System.out.println("\nREMOVE A ROCK");
        for(Rock r : box2){
            System.out.println(r);
        }
        
    }
}

