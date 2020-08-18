package August.Late;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/8/18.
 */
public class LastRemaining {

    public int LastRemaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }

}
