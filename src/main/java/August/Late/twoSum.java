package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class twoSum {

    public double[] twoSum(int n) {
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

        double[] res = new double[5 * n + 1];
        for (int i = n; i <= 6 * n; i++) {
            res[i - n] = (dp[n][i] * 1.0 / all);
        }
        return res;
    }

}
