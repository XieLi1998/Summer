package May;

/**
 * Created by xieli on 2020/5/27.
 */
public class cutRope {
    public int cutRope(int target) {
        if (target <= 3)
            return target - 1;
        int a = target / 3, b = target % 3;
        if (b == 0)
            return (int) Math.pow(3, a);
        if (b == 1)
            return (int) Math.pow(3, a - 1) * 4;
        return (int) Math.pow(3, a) * 2;
    }
}
