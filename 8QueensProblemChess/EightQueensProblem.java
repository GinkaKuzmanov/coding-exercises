package queen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EightQueensProblem {
    private static void putQueens(int gridSize) {
        if (gridSize < 4) {
            System.out.println("No solutions available");
        } else {
            int[][] chessboard = new int[gridSize][gridSize];
            putAllQueens(chessboard, 0);
            printBoard(chessboard);
        }

    }


    private static boolean putAllQueens(int[][] board, int row){
        if(row >= board.length)
            return true;
        boolean isAllQueensPlaced = false;
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board,row,i)) {
                board[row][i] = 1;
                isAllQueensPlaced = putAllQueens(board, row + 1);
            }
            if(isAllQueensPlaced){
                break;
            }
            else{
                board[row][i] = 0;
            }
        }
        return isAllQueensPlaced;
    }
    private static boolean isSafe(int[][] board, int row, int col) {
        //check upper left diagonal
        for (int i = row - 1,
             j = col - 1; i >= 0 && j >= 0
                ; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        //check upper right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;

             i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        //check in same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 1) {
                    System.out.print("Q");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }


    public static void main(String[] args) throws IOException {
        putQueens(8);

    }
}