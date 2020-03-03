package arrays_lists;

public class Worker extends User {
    private double salary;

    public Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Salary: " + salary;
    }
}
