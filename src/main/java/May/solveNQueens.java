package May;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xieli on 2020/5/8.
 */
public class solveNQueens {
    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        if (n <= 0)
            return null;
        res = new LinkedList<List<String>>();
        char[][] board = new char[n][n];
        for (char[] chars : board)
            Arrays.fill(chars, '.');
        backtrack(board, 0);
        return res;
    }

    private void backtrack(char[][] board, int row) {
        if (row == board.length) {
            res.add(charToString(board));
            return;
        }

        int n = board[row].length;
        for (int col = 0; col < n; col++) {
            if (!isVaild(board, row, col))
                continue;
            board[row][col] = 'Q';
            backtrack(board, row + 1);
            board[row][col] = '.';
        }
    }

    private boolean isVaild(char[][] board, int row, int col) {
        int rows = board.length;
        for (char[] chars : board) {
            if (chars[col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < rows; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private List<String> charToString(char[][] board) {
        List<String> result = new LinkedList<String>();
        for (char[] chars : board) {
            result.add(String.valueOf(chars));
        }
        return result;
    }
}
