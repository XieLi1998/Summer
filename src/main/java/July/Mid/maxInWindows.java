import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/7/18.
 */
public class maxInWindows {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size > num.length || size < 1)
            return res;
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < size; i++) {
            heap.add(num[i]);
        }
        res.add(heap.peek());
        for (int j = size; j < num.length; j++) {
            heap.remove(num[j - size]);
            heap.add(num[j]);
            res.add(heap.peek());
        }
        return res;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (k > nums.length || k < 1)
            return new int[0];
        PriorityQueue<Integer> heap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < k; i++) {
            heap.add(nums[i]);
        }
        res.add(heap.peek());
        for (int j = k; j < nums.length; j++) {
            heap.remove(nums[j - k]);
            heap.add(nums[j]);
            res.add(heap.peek());
        }

        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }
        return array;
    }

}
