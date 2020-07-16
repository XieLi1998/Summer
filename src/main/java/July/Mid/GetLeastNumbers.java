import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/7/16.
 */
public class GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length || k <= 0)
            return null;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> o2 - o1));

        for (int val : input) {
            priorityQueue.add(val);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return new ArrayList<>(priorityQueue);
    }

}
