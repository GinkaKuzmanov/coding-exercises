package java_oop;

public class User {
   protected String name;
   protected int age;



    public User(String name, int age){
       this.name = name;
       this.age = age;
   }

    public void printDetails(){
        System.out.println(String.format("Name: %s, Age: %d", this.name, this.age));
    }
}
