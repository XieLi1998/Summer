package May;

import java.util.Arrays;

/**
 * Created by xieli on 2020/5/25.
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if (target <= 2)
            return target;
        return 2 * JumpFloorII(target - 1);
    }

    public int JumpFloorII_Pro(int target) {
        if (target <= 2)
            return target;

        int[] dp = new int[target + 1];
        Arrays.fill(dp, 1);
        for (int i = 3; i <= target; i++) {
            for (int j = i; j >= 1; j--) {
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        JumpFloorII main=new JumpFloorII();
        System.out.println(main.JumpFloorII(5));
        System.out.println(main.JumpFloorII_Pro(5));
    }
}
