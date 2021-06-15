package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                rsl = checkColumn(board, index) || checkRow(board, index);
                break;
            }
        }
        return rsl;
    }

    public static boolean checkColumn(int[][] board, int index) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[index][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkRow(int[][] board, int index) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
