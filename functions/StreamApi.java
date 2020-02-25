package functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        Integer [] array = {3,4,2,1,5,21};
        List<Integer> list = Arrays.asList(array);
       list = list.stream().sorted((x,y) -> Integer.compare(y,x)).collect(Collectors.toList());
        System.out.println(list);
    }
}
