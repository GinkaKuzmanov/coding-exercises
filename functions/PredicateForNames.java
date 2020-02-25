package functions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lenName = Integer.parseInt(reader.readLine());
        String [] names = reader.readLine().split("\\s+");

        Arrays.stream(names).
                filter(name -> lenPredicate.test(name,lenName)).
                forEach(System.out::println);

    }
    static BiPredicate<String,Integer> lenPredicate = (name, lengt) -> {
        return name.length() <= lengt;
    };
}
