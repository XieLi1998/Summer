/**
 * Created by xieli on 2020/7/13.
 */
public class movingCount {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] flag = new boolean[rows][cols];
        return judge(threshold, rows, cols, flag, 0, 0);
    }

    private int judge(int threshold, int rows, int cols, boolean[][] flag, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || numSum(i) + numSum(j) > threshold || flag[i][j] == true)
            return 0;

        flag[i][j] = true;
        return judge(threshold, rows, cols, flag, i + 1, j) +
                judge(threshold, rows, cols, flag, i - 1, j) +
                judge(threshold, rows, cols, flag, i, j + 1) +
                judge(threshold, rows, cols, flag, i, j - 1) +
                1;
    }

    private int numSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
