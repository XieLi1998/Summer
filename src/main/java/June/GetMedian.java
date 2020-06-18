package June;

import java.util.PriorityQueue;

/**
 * Created by xieli on 2020/6/18.
 */
public class GetMedian {

    //大顶堆
    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    //小顶堆
    private PriorityQueue<Integer> right = new PriorityQueue<>();

    private int N = 0;

    public void Insert(Integer num) {
        /* N 为偶数的情况下插入到右半边。
         * 因为右半边元素都要大于左半边，但是新插入的元素不一定比左半边元素来的大，
         * 因此需要先将元素插入左半边，然后利用左半边为大顶堆的特点，取出堆顶元素即为最大元素，此时插入右半边 */
        if (N % 2 == 0) {
            left.add(num);
            right.add(left.poll());
        } else {
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if (N % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return (double) right.peek();
    }
}
