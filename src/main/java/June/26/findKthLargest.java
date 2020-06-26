import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/6/26.
 */
public class findKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        //最小堆
        int len = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        for (int val : nums)
            minHeap.add(val);
        for (int i = 0; i < len - k; i++)
            minHeap.poll();
        return minHeap.peek();
    }

    public static int findKthLargest_02(int[] nums, int k) {
        //最大堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int val : nums)
            maxHeap.add(val);
        for (int i = 0; i < k - 1; i++)
            maxHeap.poll();
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest_02(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    public int findKthLargest_03(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        int target = len - k;
        while (true) {
            int index = partition(nums, left, right);
            if (index == target)
                return nums[target];
            else if (index > target)
                right = index - 1;
            else
                left = index + 1;
        }

    }

    private int partition(int[] num, int left, int right) {
        int pivot = num[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (pivot > num[i]) {
                j++;
                swap(num, i, j);
            }
        }
        swap(num, left, j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
