package java_oop;

public class Student extends User {
    private double grade;

    public Student(String name, int age, double grade){
        super(name,age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Grade: %.2f", this.name, this.age, this.grade);
    }
}
