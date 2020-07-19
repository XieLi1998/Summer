import java.util.ArrayList;

/**
 * Created by xieli on 2020/7/19.
 */
public class lastRemaining {

    public int lastRemaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int idx = 0;
        while (n > 1) {
            idx = (idx + m - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }

}
