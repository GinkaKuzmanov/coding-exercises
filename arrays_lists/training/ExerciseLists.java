package arrays_lists.training;

import java.util.ArrayList;
import java.util.List;

public class ExerciseLists {
    public static void main(String[] args) {
        List<String> animals = List.of("dog", "cat", "horse", "mouse", "zebra", "lion", "tiger", "bear", "rhino", "deer");

        for (String animal : animals) {
            System.out.print(animal + " ");
        }


    }
}
