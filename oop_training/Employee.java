package oop_training;

public class Employee {
    private static final String DEFAULT_EMAIL = "n/a";
    private static final int DEFAULT_AGE = -1;

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department, DEFAULT_EMAIL, DEFAULT_AGE);
    }

    //create 4 constructor for all input cases
    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, email, DEFAULT_AGE);
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, DEFAULT_EMAIL, age);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
public String toString(){
        return String.format("%s %.2f %s %d", this.name,this.salary,this.email,this.age);
    }
}
