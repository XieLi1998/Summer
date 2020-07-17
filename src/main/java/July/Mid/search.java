/**
 * Created by xieli on 2020/7/17.
 */
public class search {

    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    private int helper(int[] num, int target) {
        int left = 0, right = num.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (num[mid] == target)
                left = mid + 1;
            else if (num[mid] < target)
                left = mid + 1;
            else if (num[mid] > target)
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        search search = new search();
        int[] nums = {0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 4};
        System.out.println(search.search(nums, 1));
    }

}
