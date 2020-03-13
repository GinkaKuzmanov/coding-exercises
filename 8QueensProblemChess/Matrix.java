package queen;

public class Matrix {
    static int[][] matrix;
   static int boardSize = 5;

    public static void main(String[] args) {
        matrix = new int[boardSize][boardSize];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(j % 2 == 0){
                    matrix[i][j] = 1;
                }

                if(i % 2 == 1){
                    matrix[i][j] = 2;
                }
            }
        }

        printMatrix(matrix);

            checkValuesMatrix(matrix, boardSize, boardSize);
            checkValuesMatrix(matrix, boardSize, 0);
            checkValuesMatrix(matrix, 0, 0);
    }

    private static void printMatrix(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }

    }

    private static void checkValuesMatrix(int[][] board,int row,int col){
            // right diagonal - i=row - 1; j=col + 1;
           // left diagonal, i= row - 1; col - 1
        //row, i = row - 1; i>=0/until it is zero/ ; i--;
       for(int i= row - 1, j = col - 1; i>=0 && j>=0;i--,j--){
           if(board[i][j] == 1){
               System.out.printf("On row %d we have 1.%n",i+1);
           }
       }

       for(int i = row - 1, j = col + 1; i>=0 && j < board.length; i--,j++){
           if(board[i][j] == 0){
               System.out.println("We have 0 on " + i + " "+ j  );
           }
       }

       for(int i= row + 1,j=col + 1; i<board.length && j<board.length;i++,j++){
           if(board[i][j]==2){
               System.out.println("We have 2 on " + i);
           }
       }
    }
}
