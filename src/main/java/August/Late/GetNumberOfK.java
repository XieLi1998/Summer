package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class GetNumberOfK {

    public int GetNumberOfK(int[] array, int k) {
        return helper(array, k) - helper(array, k - 1);
    }

    private int helper(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
                left = mid + 1;
            else if (array[mid] < target)
                left = mid + 1;
            else if (array[mid] > target)
                right = mid - 1;
        }
        return left;
    }

}
