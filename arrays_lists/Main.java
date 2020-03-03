package arrays_lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student georgi = new Student("Georgi", 16, 4.33);
        Student petar = new Student("Petar", 20, 3.45);
        Student ivan = new Student("Ivan", 13, 5.40);
        Worker dimitrov = new Worker("Dimitrov", 50, 2500);
        Worker johnson = new Worker("Johnson", 45, 2000);
        Worker davidson = new Worker("Davidson", 39, 2400);

        ArrayList<User> allUsers = new ArrayList<>() {{
            add(georgi);
            add(petar);
            add(ivan);
            add(dimitrov);
            add(johnson);
            add(davidson);
        }};

        allUsers.remove(petar);
        allUsers.add(0, new Student("Ginka", 20, 5.0));
        allUsers.set(4, new Worker("Ivanov", 45, 2222));

        System.out.println("ALL USERS FROM LIST:");
        for (int i = 0; i < allUsers.size(); i++) {
            System.out.println(allUsers.get(i));
        }

        //check for existence of element
        if (allUsers.contains(ivan)) {
            System.out.println("Yes, Ivan is in the list.");
        }

        System.out.println();
        System.out.println("EMPLOYEES ONLY:");

        allUsers.stream().filter(user -> user instanceof Worker).forEach(s -> System.out.println(s));
        System.out.println("STUDENTS ONLY:");
        allUsers.stream().filter(user -> user instanceof Student).forEach(user -> System.out.println(user));
    }

}
