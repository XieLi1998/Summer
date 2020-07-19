import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/7/18.
 */
public class MaxQueue {

    Queue<Integer> queue;
    LinkedList<Integer> max;

    public MaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();   //双端链表
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!max.isEmpty() && max.getLast() < value)
            max.removeLast();
        max.add(value);
    }

    public int pop_front() {
        if (!max.isEmpty() && queue.peek().equals(max.getFirst()))
            max.removeFirst();
        return queue.isEmpty() ? -1 : queue.poll();
    }

}
