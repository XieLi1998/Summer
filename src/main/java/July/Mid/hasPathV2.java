/**
 * Created by xieli on 2020/7/13.
 */
public class hasPathV2 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix, rows, cols, str, i, j, k, flag))
                    return true;
            }
        }
        return false;
    }

    private boolean judge(char[] matrix, int rows, int cols, char[] str, int i, int j, int k, boolean[] flag) {
        int index = i * cols + j;
        if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || flag[index] == true)
            return false;

        if (k == str.length - 1)
            return true;

        flag[index] = true;

        if (judge(matrix, rows, cols, str, i + 1, j, k + 1, flag) ||
                judge(matrix, rows, cols, str, i - 1, j, k + 1, flag) ||
                judge(matrix, rows, cols, str, i, j + 1, k + 1, flag) ||
                judge(matrix, rows, cols, str, i, j - 1, k + 1, flag))
            return true;

        flag[index] = false;
        return false;
    }
}
