/**
 * Created by xieli on 2020/7/17.
 */
public class reversePairs {

    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 1 || nums.length == 0)
            return 0;
        return countCore(nums, 0, nums.length - 1);
    }

    private int countCore(int[] nums, int low, int high) {
        if (low == high)
            return 0;
        int mid = low + (high - low) / 2;
        int leftCount = countCore(nums, low, mid);
        int rightCount = countCore(nums, mid + 1, high);
        return leftCount + rightCount + merge(nums, low, mid, high);
    }

    private int merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int p1 = low, p2 = mid + 1;
        int cnts = 0;
        int index = 0;

        while (p1 <= mid && p2 <= high) {
            if (nums[p1] > nums[p2]) {
                temp[index++] = nums[p2++];
                cnts += mid - p1 + 1;
            } else {
                temp[index++] = nums[p1++];
            }
        }

        while (p1 <= mid) {
            temp[index++] = nums[p1++];
        }
        while (p2 <= high) {
            temp[index++] = nums[p2++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low++] = temp[i];
        }

        return cnts;
    }
}
