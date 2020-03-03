package arrays_lists.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseArray {
    public static void main(String[] args) throws IOException {
        System.out.println("Напишете дължина на масива:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        printArray(length);
    }


    //принтира цифрите от 1 до броя на елементите
    public static void printArray(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
}
