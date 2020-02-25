package functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ints = Arrays.stream(reader.readLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());


        ints.stream().sorted((o1, o2) -> comparator.compare(o1, o2))
                .forEach(e -> System.out.print(e + " "));


    }

    static Comparator<Integer> comparator = (o1, o2) -> {
        if (o1 == o2) return 0;
        if (o1 % 2 == 0) {
            if (o2 % 2 == 0) {
                if (o1 < o2)
                    return -1;
                else
                    return 1;
            } else {
                return -1;
            }
        } else {
            if (o2 % 2 != 0) {
                if (o1 < o2)
                    return -1;
                else
                    return 1;
            } else {
                return 1;
            }
        }
    };

    public int compare(int x, int y) {
        if (x == y) {
            // Both numbers are odd or both numbers are even
            if (x == 0) {
                // Both numbers are even: compare as usual
                return Integer.compare(x, y);
            } else {
                // Both numbers are odd: compare in reverse
                return Integer.compare(y, x);
            }
        }
        // One is odd, the other one is even
        if (x == 0) {
            return -1;
        }
        return 1;
    }


}

