package oop_training;

public class Person {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_AGE = 1;

    private int age;
    private String name;

    public Person(){
     this(DEFAULT_AGE,DEFAULT_NAME);
    }

    public Person(int age){
        this(age,DEFAULT_NAME);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString(){

        return String.format("Name: %s, age: %d", this.name,this.age);
    }
}
