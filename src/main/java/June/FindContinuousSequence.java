package June;

import java.util.ArrayList;

/**
 * Created by xieli on 2020/6/20.
 */
public class FindContinuousSequence {

    //暴力遍历
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 1; i < sum; i++) {
            int temp = 0;
            int j = i;
            while (temp < sum) {
                temp += j;
                j++;
            }
            if (temp == sum) {
                ArrayList<Integer> newArray = new ArrayList<>();
                for (int k = i; k < j; k++) {
                    newArray.add(k);
                }
                res.add(newArray);
            }
        }
        return res;
    }


    //递增数组之和 + 滑动窗口
    public ArrayList<ArrayList<Integer>> FindContinuousSequence_02(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1, high = 2;
        while (high > low) {
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> newArray = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    newArray.add(i);
                }
                res.add(newArray);
                low++;
            } else if (cur < sum) {
                high++;
            } else {
                low++;
            }
        }
        return res;
    }


}
