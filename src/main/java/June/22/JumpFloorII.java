import java.util.Arrays;

/**
 * Created by xieli on 2020/6/22.
 */
public class JumpFloorII {

    public int JumpFloorII(int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 1);
        for (int i = 2; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }

}
