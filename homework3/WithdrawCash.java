package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//exercise 5.
public class WithdrawCash {
    private static double BALANCE = 5000;

    public static void withdraw(double amount) {
        if (BALANCE < amount) {
            throw new IllegalArgumentException("Недостатъчна наличност по сметка.");
        }
        if (amount == 10 || amount == 20 || amount == 50 || amount == 100) {
            BALANCE -= amount;
            System.out.println(String.format("Изтеглихте %.2f BGN. Нетна разполагаемост: %.2f BGN", amount, BALANCE));
        } else {
            System.out.println("Въведената сума е грешна.");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter amount:");
        double amount = Double.parseDouble(reader.readLine());
        try {
            withdraw(amount);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
