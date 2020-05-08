package April;

/**
 * Created by xieli on 2020/4/28.
 */
public class giftMaxValue {

    public static int getMaxPathValue(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int[][] dp = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left;
                int top;
                //当i== 0时，从top下来的值一定为0
                if (i == 0) {
                    top = 0;
                } else {
                    top = dp[i - 1][j];
                }
                //当j==0时，从left过来的值一定为0
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

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(getMaxPathValue(arr));
    }

}
