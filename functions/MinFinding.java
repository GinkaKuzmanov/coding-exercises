package functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinFinding {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = Arrays.stream(reader.readLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int min = minFinder.apply(list);
        System.out.println(list.indexOf(min));


    }

    static Function<List<Integer>, Integer> minFinder = (list) ->{
       return list.stream().min(Integer::compareTo).get();
    };
}
