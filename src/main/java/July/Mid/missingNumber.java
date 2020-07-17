/**
 * Created by xieli on 2020/7/17.
 */
public class missingNumber {

    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

}
