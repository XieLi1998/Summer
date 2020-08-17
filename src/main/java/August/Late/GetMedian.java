package August.Late;

import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/8/17.
 */
public class GetMedian {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    public void Insert(Integer num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.add(minHeap.poll());
    }

    public Double GetMedian() {
        if (maxHeap.size() == minHeap.size())
            return (minHeap.peek() + maxHeap.peek()) * 0.5;
        return (double) maxHeap.peek();
    }

}
