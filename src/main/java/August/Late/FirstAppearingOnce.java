package August.Late;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/8/17.
 */
public class FirstAppearingOnce {

    int[] cnts = new int[256];
    Queue<Character> queue = new LinkedList<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1)
            queue.poll();
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }

}
