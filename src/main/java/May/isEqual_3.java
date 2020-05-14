package May;

/**
 * Created by xieli on 2020/5/14.
 */
public class isEqual_3 {

    public boolean isEqual_3(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;
        int sum = 0;
        for (int val : nums)
            sum += val;

        int equalPoint;
        if (sum / 3 != sum * 1.0 / 3) {
            return false;
        } else {
            equalPoint = sum / 3;
        }
        sum = 0;
        int size = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == size * equalPoint) {
                size++;
                if (size == 2 && nums.length - i - 1 < 2)
                    return false;
                else if (size == 3 && nums.length - i - 1 < 1)
                    return false;
            }
        }
        return false;
    }

}
