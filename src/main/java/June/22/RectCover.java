/**
 * Created by xieli on 2020/6/22.
 */
public class RectCover {

    public int RectCover(int target) {
        if (target <= 2)
            return target;
        int sum = 0;
        int one = 2;
        int two = 1;
        for (int i = 3; i <= target; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }
        return sum;
    }

}
