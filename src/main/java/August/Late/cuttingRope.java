package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class cuttingRope {

    public int cuttingRope(int target) {
//        if (target <= 3)
//            return target - 1;
//        int a = target / 3, b = target % 3;
//        if (b == 0)
//            return (int) Math.pow(3, a);
//        else if (b == 1)
//            return (int) Math.pow(3, a - 1) * 4;
//        return (int) Math.pow(3, a) * 2;

        int[] dp = new int[target + 1];
        dp[2] = 1;
        for (int i = 3; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[target];
    }


}
