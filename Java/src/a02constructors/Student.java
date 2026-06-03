package a02constructors;

public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    public Student(String name, int age , double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void study(){
        System.out.println(this.name + " Studying");
    }

}
