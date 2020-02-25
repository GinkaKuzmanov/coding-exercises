package functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbersInput = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        String command = "";
        while (!"end".equals(command)) {
            for (int i = 0; i < numbersInput.size(); i++) {
                if ("add".equals(command)) {
                    numbersInput.set(i,addNumbers.apply(numbersInput.get(i)));
                }
                if("multiply".equals(command)){
                    numbersInput.set(i,multiply.apply(numbersInput.get(i)));
                }
                if("subtract".equals(command)){
                    numbersInput.set(i,subtract.apply(numbersInput.get(i)));
                }
                else if("print".equals(command)){
                    System.out.print("");
                }

            }
            command = reader.readLine();
        }
        System.out.println(numbersInput.toString().replaceAll("[\\[\\],]",""));
    }
    static Function<Integer,Integer> addNumbers = number -> number = number + 1;
    static Function<Integer,Integer> multiply = number -> number = number * 2;
    static Function<Integer,Integer> subtract = number -> number = number - 1;

}


