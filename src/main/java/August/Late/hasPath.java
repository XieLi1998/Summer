package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class hasPath {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flags = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix, rows, cols, i, j, str, 0, flags))
                    return true;
            }
        }
        return false;
    }

    private boolean judge(char[] matrix, int rows, int cols, int i, int j, char[] str,
                          int k, boolean[] flags) {
        int index = i * cols + j;
        if (i >= rows || j >= cols || i < 0 || j < 0 || matrix[index] != str[k] || flags[index] == true)
            return false;
        if (k == str.length - 1)
            return true;
        flags[index] = true;

        if (judge(matrix, rows, cols, i + 1, j, str, k+1, flags) ||
                judge(matrix, rows, cols, i - 1, j, str, k+1, flags) ||
                judge(matrix, rows, cols, i, j + 1, str, k+1, flags) ||
                judge(matrix, rows, cols, i, j - 1, str, k+1, flags))
            return true;

        flags[index] = false;
        return false;
    }

}
