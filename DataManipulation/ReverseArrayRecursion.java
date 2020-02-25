package DataManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArrayRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int[] array = Arrays.stream(reader.readLine()
               .split("\\s"))
               .mapToInt(Integer::parseInt).toArray();

        array = reverseArray(array,0,array.length -1);

        for (int i : array) {
            System.out.println(i);
        }
       int result = binarySearch(array,3);
        System.out.println(array[result]);

    }
    private static int[] reverseArray(int[] array, int start, int end){
        //base case
        if(start < end){
            //swap logic
            int temp=array[start];
            array[start]=array[end];
            array[end] = temp;
            reverseArray(array,start+1,end -1);
        }
        //return statement
         return array;
    }
    private static int binarySearch(int[] array, int target){
         //only on sorted arrays;
       return Arrays.binarySearch(array,target);



    }
}
