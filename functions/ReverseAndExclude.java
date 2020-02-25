package functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int divisibleBy = Integer.parseInt(reader.readLine());
        Predicate<Integer> divisionPredicate = (number) -> number % divisibleBy == 0;
        integerList.removeIf(divisionPredicate);
        Collections.reverse(integerList);
        System.out.println(integerList.toString()
                .replaceAll("[\\[\\],]",""));
    }
}
