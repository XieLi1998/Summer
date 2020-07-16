import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/7/16.
 */
public class GetMedian {

    //大顶堆，取小数中的最大数
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    //小顶堆，取大数中的最小数
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void Insert(Integer num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        //维系两个优先队列数量上的相等
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public Double GetMedian() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) * 0.5;
        return (double) maxHeap.peek();
    }


}
