package arrays_lists;

public class Student extends User {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(System.lineSeparator())
                .append("GPA: ").append(this.gpa);
        return sb.toString();
    }
}
