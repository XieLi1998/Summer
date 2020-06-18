package June;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/6/18.
 */
public class GetLeastNumbers {


    //用大顶堆来维护最小堆
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length || k <= 0)
            return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        for (int num : input) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }

}
