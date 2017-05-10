public class MultPractice implements StudyPractice
{
    private int firstInt;
    private int secondInt;
    
    public MultPractice(int n1, int n2) {
        firstInt = n1;
        secondInt = n2;
    }
    
    public String getProblem() {
        return firstInt + " TIMES " + secondInt;
    }
    
    public void nextProblem() {
        secondInt++;
    }


    public static void main(String[] args) {
        StudyPractice p1 = new MultPractice(7, 3);
        System.out.println(p1.getProblem());
        p1.nextProblem();
        System.out.println(p1.getProblem());
        p1.nextProblem();
        System.out.println(p1.getProblem());
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        StudyPractice p2 = new MultPractice(4, 12);
        p2.nextProblem();
        System.out.println(p2.getProblem());
        System.out.println(p2.getProblem());
        p2.nextProblem();
        p2.nextProblem();
        System.out.println(p2.getProblem());
        p2.nextProblem();
        System.out.println(p2.getProblem());
    }
}