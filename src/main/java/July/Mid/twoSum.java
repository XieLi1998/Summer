/**
 * Created by xieli on 2020/7/18.
 */
public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target)
                i++;
            else if (sum > target)
                j--;
            else
                return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }

    public double[] twoSum(int n) {
        //最多11个骰子，66个点数
        int[][] dp = new int[15][70];

        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k <= 0)
                        break;
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        int all = (int) Math.pow(6, n);
        //最小的点数为 n
        double[] res = new double[5 * n + 1];
        for (int i = n; i <= 6 * n; i++) {
            res[i - n] = (dp[n][i] * 1.0 / all);
        }
        return res;
    }

}
