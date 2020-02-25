package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        printDivisibleNumbers(num1, num2, num3);

    }

    //exercise 1.
    private static void printDivisibleNumbers(int num1, int num2, int num3) {
        if (num1 >= 100 && num1 <= 200) {
            for (int i = 0; i <= num1; i++) {
                if (i % num2 == 0 && i % num3 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Try again");
        }
    }
}
