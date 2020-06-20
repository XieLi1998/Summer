package June;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/6/20.
 */
public class maxInWindows {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size > num.length || size < 1)
            return res;
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            heap.add(num[i]);
        }
        res.add(heap.peek());
        for (int i = 0, j = i + size; j < num.length; i++, j++) {
            heap.remove(num[i]);
            heap.add(num[j]);
            res.add(heap.peek());
        }
        return res;
    }

}
