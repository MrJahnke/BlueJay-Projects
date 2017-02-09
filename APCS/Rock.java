import java.text.DecimalFormat;
import java.util.Random;

public class Rock {

    private double weight;
    DecimalFormat df = new DecimalFormat("0.000");
    Random gen = new Random();
    
    public Rock() {
        //weight = (gen.nextInt(5000-500+1)+500)/1000.0;
        weight = (gen.nextDouble()*(5000-500+1)+500)/1000.0;
    }
    
    public Rock(double w){
        weight = w;
    }
    
    public double getWeight(){
            return weight;
    }
    
    public void erode(){
        weight*=.9;
    }
    
    public String toString() {
        return "Rock: " + df.format(weight) +" kg";
    }
    
    public static Rock[] addRock(Rock[] box, Rock r) {
        Rock[] newBox = new Rock[box.length+1];
        for(int j = 0; j<box.length; j++) {
            newBox[j] = box[j];
        }
        newBox[box.length] = r;
        return newBox;
    }
    
    public static Rock[] removeRock(Rock[] box, int i) {
        if (i < 0 || i >= box.length) {
            System.err.println("Index out of bounds in Rock[]");
            return box;
        }
       
        Rock[] newBox = new Rock[box.length-1];
        for(int j=0; j<i; j++) {
            newBox[j] = box[j];
        }
        for(int j=i+1; j<box.length; j++) {
            newBox[j-1] = box[j];
        }
        return newBox;
    }
    
    public static Rock[] split(Rock[] box){
        int bigIndex = 0;
        for (int j=1; j<box.length; j++){
            if (box[j].getWeight()>box[bigIndex].getWeight()){
                bigIndex = j;
            }
        }
         Rock[] newBox = new Rock[box.length+1];
         for (int k=0; k<bigIndex; k++){
            newBox[k] = box[k];
         }
         newBox[bigIndex] = new Rock(box[bigIndex].getWeight()/2);
         newBox[bigIndex+1] = new Rock(box[bigIndex].getWeight()/2);
         
         for (int m=bigIndex+2; m<newBox.length; m++){
            newBox[m] = box[m-1];
         }
       return newBox;
    }
    
    public static void main(String[] args) {
        Rock[] box = new Rock[10];
        
        for (int j=0; j<box.length; j++){
            box[j] = new Rock();
        }
        
        System.out.println("A BOX OF ROCKS");
        for(Rock r : box){
            System.out.println(r);
        }
        
        System.out.println("\nA BOX OF ERODED ROCKS");
        for (int j=0; j<box.length; j++){
            box[j].erode();
        }
        
        for(Rock r : box){
            System.out.println(r);
        }
        
        Rock[] box2 = split(box);
        System.out.println("\nA BOX WITH A SPLIT ROCK");
        for(Rock r : box2){
            System.out.println(r);
        }  
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

/*
run:
A BOX OF ROCKS
A Rock: 1.085 kg
A Rock: 3.433 kg
A Rock: 1.244 kg
A Rock: 1.057 kg
A Rock: 3.720 kg
A Rock: 1.754 kg
A Rock: 4.017 kg
A Rock: 4.178 kg
A Rock: 2.390 kg
A Rock: 2.280 kg

A BOX OF ERODED ROCKS
A Rock: 0.977 kg
A Rock: 3.090 kg
A Rock: 1.120 kg
A Rock: 0.951 kg
A Rock: 3.348 kg
A Rock: 1.579 kg
A Rock: 3.615 kg
A Rock: 3.760 kg
A Rock: 2.151 kg
A Rock: 2.052 kg

A BOX WITH A SPLIT ROCK
A Rock: 0.977 kg
A Rock: 3.090 kg
A Rock: 1.120 kg
A Rock: 0.951 kg
A Rock: 3.348 kg
A Rock: 1.579 kg
A Rock: 3.615 kg
A Rock: 1.880 kg
A Rock: 1.880 kg
A Rock: 2.151 kg
A Rock: 2.052 kg
*/