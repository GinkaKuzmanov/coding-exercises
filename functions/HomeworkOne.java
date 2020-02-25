package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkOne {
    public static void main(String[] args) {
        int [] array = {4,25,2,13,7,5,1,18};
        insertionSort(array);

        calcLoanPayments(5000, 12);
        
       boolean prime= isPrime(4);
        System.out.println(prime);
        primesInRange(100);
    }

    public static void insertionSort(int[] array){
        System.out.println(Arrays.toString(array));
        //first element is sorted
        for (int i = 1; i < array.length ; i++) {
            int current = array[i];
            //this will be the adjacent element index
            int j = i-1;
                             //array[i-1] > array[i]
            while(j > -1 && array[j] > current){
               //now work within elements of array
                //array[i] = array[i-1]
                array[j+1] = array[j];
                //we decrement the value in order to move the bigger ones to right
                  j--;
            }
            array[j+1] = current;
        }

        System.out.println("Sorted array" + Arrays.toString(array));


    }

    public static void primesInRange(int number){
        List<Integer> primes = new ArrayList<>();
        for (int primeCandidate = 0; primeCandidate <=number ; primeCandidate++) {
            if(isPrime(primeCandidate)){
                primes.add(primeCandidate);
            }
        }
        System.out.println(primes);
    }
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for (int i = 2; i < number ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void calcLoanPayments(double presentValue, double periods) {
        //applied excel functions PMT,FV
        //future value =PV * Math.pow((1 + R/12), M);
        //PMT＝(fv * R/12) / (pow((1 + R/12), M) - 1);
       //годишен лихвен процент(7%)
        double rate = 1 + (0.07 / 12);
        double term = (-((periods / 12) * 12));
        double monthPayment = (presentValue * (0.07 / 12)) / (1 - Math.pow(rate, term));
        double futureValue = presentValue * Math.pow((1 + 0.07/12), periods) ;

        System.out.println(String.format("Amount to pay each month: %.2f BGN", monthPayment));
        System.out.println(String.format("Total sum of %.0f payments is: %.2f BGN",periods,futureValue));


    }
}
