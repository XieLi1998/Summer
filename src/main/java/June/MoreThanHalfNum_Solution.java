package June;

import java.util.Arrays;

/**
 * Created by xieli on 2020/6/18.
 */
public class MoreThanHalfNum_Solution {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int target = array[array.length / 2];
        int count = 0;
        for (int k : array) {
            if (k == target)
                count++;
        }
        if (count > array.length / 2)
            return target;
        else
            return 0;
    }

    public int MoreThanHalfNum_Solution_02(int[] array) {
        int cnt = 0, majority = array[0];
        for (int i = 0; i < array.length; i++) {
            cnt = array[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for (int val : array) {
            if (val == majority)
                cnt++;
        }
        return cnt > array.length / 2 ? majority : 0;
    }

}
