package object_classes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Моля въведете входни данни:име, фамилия,баланс?");
            String firstName = reader.readLine();
            String lastName = reader.readLine();

            double balance = Double.parseDouble(reader.readLine());

            Client client = new Client(firstName, lastName, balance);

            int countOfTries = 3;

            while (countOfTries-- > 0) {
                System.out.println("Моля въведете пин код?");
                String pinCode = reader.readLine();
                if (!"0101".equals(pinCode)) {
                    System.out.println("Грешен пин код!");
                } else {
                    client.setPinCode(pinCode);
                    System.out.println("Каква сума желаете да изтеглите?");
                    double amount = Double.parseDouble(reader.readLine());
                    client.withdraw(amount);
                    double endBalance = client.showBalance();
                    System.out.println(String.format("Вашият баланс е: %.2f. BGN", endBalance));
                    break;
                }
                //razreshava do tri opita
                if (countOfTries == 0) {
                    System.out.println("Картата ви е блокирана временно!");

                }

            }
        }catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
