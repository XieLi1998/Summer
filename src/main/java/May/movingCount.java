package May;

/**
 * Created by xieli on 2020/5/27.
 */
public class movingCount {

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] flag = new boolean[rows][cols];
        return helper(0, 0, rows, cols, flag, threshold);
    }

    private int helper(int i, int j, int rows, int cols, boolean[][] flag, int threshold) {
        if (i < 0 || j < 0 || i >= rows || j >= cols
                || numSum(i) + numSum(j) > threshold || flag[i][j] == true)
            return 0;

        flag[i][j] = true;
        return helper(i - 1, j, rows, cols, flag, threshold) +
                helper(i + 1, j, rows, cols, flag, threshold) +
                helper(i, j - 1, rows, cols, flag, threshold) +
                helper(i, j + 1, rows, cols, flag, threshold) +
                //注意，此处必须加现在这个本身满足条件的例子
                1;
    }

    private int numSum(int threshold) {
        int sum = 0;
        while (threshold > 0) {
            sum += threshold % 10;
            threshold /= 10;
        }
        return sum;
    }

}
