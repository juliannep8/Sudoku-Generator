import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[][] puzzle = new int[9][9];
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i<9; i++){
            nums.add(i+1);
        }
        Collections.shuffle(nums);
        for (int i = 0; i < 9; i++) {
            puzzle[0][i] = nums.get(i);
        }
        
        if (solve(puzzle)) {
            printBoard(puzzle);
        } else {
            System.out.println("No solution possible. Run again to regenerate!");
        }
    }

    public static boolean solve(int[][] board) {
        for (int row = 1; row<9; row++) {
            for (int col = 0; col<9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <=9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            
                            if (solve(board)) 
                                return true;
                            board[row][col] = 0;
                        }
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i <9; i++) {
            if (board[row][i] == num || board[i][col] == num) 
                return false;
        }

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j< 3; j++) {
                if (board[boxRow + i][boxCol + j] == num)
                    return false;
            }
        }
        
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i<9; i++) {
            if (i % 3 == 0 && i != 0)
                System.out.println("------|-------|------");

            for (int j = 0; j<9; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
