import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/7/16.
 */
public class FirstAppearingOnce {

    private int[] cnts = new int[256];
    Queue<Character> queue = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        cnts[ch]++;
        queue.offer(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1)
            queue.poll();
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

}
