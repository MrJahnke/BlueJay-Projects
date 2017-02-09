
/**
 * Represent a student
 * 
 * @author Mr Jahnke 
 * @version 1.0
 * @since October 18, 2016
 * 
 */

public class Student implements Citizen
{
    // class variables
    private static final double HONOR_GPA = 3.3;
    public final static String SCHOOL = "ASK";
    private static int nextStudNum = 1000;
    // instance variables
    private String name;
    private int studNum;
    private boolean honorStudent;
    private double gpa;
    private String country;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        name = "student";
        studNum = nextStudNum;
        gpa = 0.0;
        honorStudent = setHonorStudent();
        nextStudNum++;
    }
    
    public Student(String n, double g)
    {
        name = n;
        studNum = nextStudNum;
        gpa = g;
        honorStudent = setHonorStudent();
        nextStudNum++;
    }
    
    public Student(String n) {
        this(n, 2.0); 
    }
    
    public Student(Student other) {
        this.name = other.name;
        this.studNum = other.studNum;
        this.gpa = other.gpa;
        this.honorStudent = other.honorStudent;
        
    }

    public String toString()
    {
        return "Name: " + name + "\tNumber: " + studNum;
    }
    
    public double getGPA () {
        return gpa;
    }
    
    public void setGPA(double g) {
        gpa = g;
        honorStudent = setHonorStudent();
    }
    
    public boolean getHonorStudent() {
        return honorStudent;
    }
    
    private boolean setHonorStudent()
    {
        return this.getGPA() >= HONOR_GPA;
    }
    
    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.studNum == other.studNum;
    }
    
    public String getCountry(){
        return country;
    }
    public void setCountry(String c) {
        country = c;
    }
}
