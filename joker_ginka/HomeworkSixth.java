package joker_ginka;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkSixth {
    public static void main(String[] args) {
        double[] productsPrices = {2.34, 2.66, 3.76, 3.53, 6.33, 13.55};
        changeCalculator(productsPrices, 35);

        tip(200, 15);

        String output = removeVowels("Hello, can you translate this message?");
        System.out.println(output);


        int number = Integer.parseInt(calcExponent(245));
        System.out.println(number);

        toSecondPow();
    }

    //THE HOMEWORK: the mandatory tasks
    //Lesna
    public static void changeCalculator(double[] prices, double billPaid) {
        double costOfProductsChosen = 0;
        for (int i = 0; i < prices.length; i++) {
            costOfProductsChosen += prices[i];
        }
        if (billPaid > costOfProductsChosen) {
            double change = billPaid - costOfProductsChosen;
            System.out.println(String.format("Ресто: %.2f лева.", change));
        } else if (billPaid == costOfProductsChosen) {
            System.out.println("Благодаря, хубав ден!");
        } else {
            double deficit = costOfProductsChosen - billPaid;
            System.out.printf("Парите не стигат, трябва да доплатите %.2f лева.%n", deficit);
        }

    }

    //Lesna
    public static void tip(double bill, int percentage) {
        double multiplicand = percentage / 100.0;
        double tip = bill * multiplicand;
        System.out.println(String.format("За сметка от %.2f трябва да оставите %.2f лева бакшиш.", bill, tip));
    }

    //Trudna
    public static String removeVowels(String input) {
        //easiest thing is regex
        String regex = "[^AEOIUYaeoiuy]+";
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sb.append(matcher.group(0));
        }
        return sb.toString();
    }

    //Lesna
    public static void toSecondPow() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                int result = (int) Math.pow(i, 2);
                System.out.print(result + " ");
            }
        }
    }

    //Sredna
    public static String calcExponent(int param) {
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        while (param > 0) {
            deque.push(param % 10);
            param /= 10;
        }

        while (!deque.isEmpty()) {
            int result = (deque.peek() * deque.pop());
            sb.append(result);
        }
        return sb.toString();
    }
}
