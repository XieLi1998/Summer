package June;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xieli on 2020/6/10.
 */
public class reOrderArray {

    public void reOrderArray(int[] array) {
        Queue<Integer> queue = new LinkedList<>();

        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 1)
                queue.add(array[i]);
        }

        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0)
                queue.add(array[i]);
        }

        for (int i = 0; i < len; i++) {
            array[i] = queue.poll();
        }
    }

    public void reOrderArray_for_01(int[] array) {
        int oddCnt = 0;
        for (int x : array)
            if (x % 2 == 1)
                oddCnt++;
        int[] copy = array.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                array[i++] = num;
            else
                array[j++] = num;
        }
    }

}
