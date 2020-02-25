package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculations {
    // exercise 2.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Double.parseDouble(reader.readLine());
        double num2 = Double.parseDouble(reader.readLine());

        while (true) {
            if (num1 <= 10 && num1 > 0 && num2 <= 10 && num2 > 0) {
                calcOperations(num1, num2);
                break;
            } else {
                System.out.println("The given numbers must be between 1 and 10. Try again:");
                num1 = Double.parseDouble(reader.readLine());
                num2 = Double.parseDouble(reader.readLine());
            }
        }


    }

    public static void calcOperations(double num1, double num2) {
        System.out.println("Sum: " + additionTwoNumbers(num1, num2));
        System.out.println("Subtraction: " + subtractTwoNumbers(num1, num2));
        System.out.println("Multiplication: " + multiplyTwoNumbers(num1, num2));
        System.out.println("Division: " + divideTwoNumbers(num1, num2));
    }

    public static double additionTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractTwoNumbers(double num1, double num2) {
        double minuend = Math.max(num1, num2);
        double subtrahend = Math.min(num1, num2);
        return minuend - subtrahend;
    }

    public static double multiplyTwoNumbers(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideTwoNumbers(double num1, double num2) {
        double dividend = Math.max(num1, num2);
        double divisor = Math.min(num1, num2);
        return dividend / divisor;
    }
}
