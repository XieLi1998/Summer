package August.Late;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/8/17.
 */
public class GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
        if (k > input.length || k <= 0)
            return new ArrayList<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
        for (int val :
                input) {
            maxHeap.add(val);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<Integer>(maxHeap);
    }

}
