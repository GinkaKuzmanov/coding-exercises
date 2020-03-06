package joker_ginka.iter;

public class IterationTraining {

    //числата в низходящ ред от 1000 до 1
    public static void printNumbers(){
        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }
    }
//     принтира всички числа от 0
//    до 1000 като на всяко 10-то число да се принтира вместо числото буквата "X"
    public static void printXOnTenthPos(){
        for (int i = 0; i <= 1000 ; i++) {
            if(i==0){
                continue;
            }
            if(i % 10 == 0){
                System.out.println("X");
            }else{
                System.out.println(i);
            }
        }
    }
//    - Направете метод, който да принтира числате от 1 до
//1000, но без четните числа e.g 1,3,5,7....
   public static void printOddNumbers(){
        for (int i = 1; i <=1000 ; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    //за четните
    public static void printEvenNumbers(){
        for (int i = 1; i <=1000 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}
