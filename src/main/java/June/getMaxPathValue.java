package June;

/**
 * Created by xieli on 2020/6/19.
 */
public class getMaxPathValue {

    public int getMaxPathValue(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left;
                int top;

                //当 i == 0 时，从 top 下来的值一定为0
                if (i == 0) {
                    top = 0;
                } else {
                    top = dp[i - 1][j];
                }

                //当  == 0 时，从 left 左边来的值一定为0
                if (j == 0) {
                    left = 0;
                } else {
                    left = dp[i][j - 1];
                }
                dp[i][j] = Math.max(left, top) + nums[i][j];
            }
        }
        return dp[rows - 1][cols - 1];
    }
}
