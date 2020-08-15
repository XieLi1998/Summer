package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class movingCount {

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] flag = new boolean[rows][cols];
        return helper(threshold, rows, cols, 0, 0, flag);
    }

    private int helper(int threshold, int rows, int cols, int i, int j, boolean[][] flag) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || Sum(i) + Sum(j) > threshold || flag[i][j] == true)
            return 0;

        flag[i][j] = true;
        return helper(threshold, rows, cols, i + 1, j, flag) +
                helper(threshold, rows, cols, i - 1, j, flag) +
                helper(threshold, rows, cols, i, j + 1, flag) +
                helper(threshold, rows, cols, i, j - 1, flag) +
                1;
    }

    private int Sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}
