package June;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/6/20.
 */
public class LastRemaining {

    //数学归纳法
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }

    //链表
    public int LastRemaining_Solution_02(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int cur = -1;
        while (list.size() > 1) {
            for (int i = 0; i < m; i++) {
                cur++;
                if (cur == list.size())
                    cur = 0;
            }
            list.remove(cur);
            cur--;
        }
        return list.get(0);
    }

}
