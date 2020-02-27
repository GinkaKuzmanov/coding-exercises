package java_oop;

public class Teacher extends User {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Salary: %.2f", this.name, this.age, this.salary);
    }
}
