package June;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xieli on 2020/6/20.
 */
public class dicesSum {

    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        long[][] dp = new long[n + 1][6 * n + 1];

        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++)
            for (int j = i; j <= 6 * n; j++)   /* 使用 i 个骰子最小点数为 i */
                for (int k = 1; k <= 6 && k <= j; k++)
                    dp[i][j] += dp[i - 1][j - k];

        final double totalNum = Math.pow(6, n);
        List<Map.Entry<Integer, Double>> res = new ArrayList<>();
        for (int i = n; i <= 6 * n; i++) {
            res.add(new AbstractMap.SimpleEntry<>(i, dp[n][i] / totalNum));
        }
        return res;
    }

}
