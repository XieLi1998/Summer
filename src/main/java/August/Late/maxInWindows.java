package August.Late;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/8/18.
 */
public class maxInWindows {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (size > num.length || size < 1)
            return res;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
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

}
