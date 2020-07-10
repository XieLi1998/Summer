import java.util.Arrays;

/**
 * Created by xieli on 2020/7/10.
 */
public class JumpFloorIIV2 {
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

    public int JumpFloorIIV2(int target) {
        if (target <= 2)
            return target;
        return 2 * JumpFloorII(target - 1);
    }
}
