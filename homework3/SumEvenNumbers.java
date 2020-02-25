package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumEvenNumbers {
    public static void main(String[] args) throws IOException {
        //exercise 3.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int sum = sumNumbers(num1);

        System.out.println("The sum is: " + sum);
    }

    private static int sumNumbers(int number){
        int sum = 0;
        for (int i = 0; i <= number ; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
