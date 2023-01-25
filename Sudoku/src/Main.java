import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku");
        char board[][] = {
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','1','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'},
                            {'0','0','0','0','0','0','0','0','0'} };


        Sudoku sud = new Sudoku();

        sud.solveSudoku(board);

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));
        System.out.println(Arrays.toString(board[3]));
        System.out.println(Arrays.toString(board[4]));
        System.out.println(Arrays.toString(board[5]));
        System.out.println(Arrays.toString(board[6]));
        System.out.println(Arrays.toString(board[7]));
        System.out.println(Arrays.toString(board[8]));


    }


}