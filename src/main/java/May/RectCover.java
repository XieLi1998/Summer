package May;

/**
 * Created by xieli on 2020/5/23.
 */
public class RectCover {
    public int RectCover(int target) {
        if (target <= 2)
            return target;

        int sum = 0;
        int one = 2; //n-1项
        int two = 1; //n-2项

        for (int i = 3; i <= target; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }

        return sum;
    }
}
