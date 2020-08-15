package August.Late;

import java.util.Arrays;

/**
 * Created by xieli on 2020/8/16.
 */
public class JumpFloorII {

    public int JumpFloorII(int target) {
        int[] result = new int[target + 1];
        Arrays.fill(result, 1);

        for (int i = 2; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                result[i] += result[j];
            }
        }

        return result[target];
    }

}
