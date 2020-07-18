import java.util.ArrayList;
import java.util.List;

/**
 * Created by xieli on 2020/7/18.
 */
public class findContinuousSequence {

    //递增数组 + 滑动窗口
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1, high = 2;

        while (high > low) {
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                res.add(list);
                low++;
            } else if (cur < sum) {
                high++;
            } else {
                low++;
            }
        }
        return res;
    }

    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int low = 1, high = 2;

        while (high > low) {
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == target) {
                int[] list = new int[high - low + 1];
                int idx = 0;
                for (int i = low; i <= high; i++) {
                    list[idx++] = i;
                }
                res.add(list);
                low++;
            } else if (cur < target) {
                high++;
            } else {
                low++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
