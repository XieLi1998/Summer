/**
 * Created by xieli on 2020/7/16.
 */
public class FindGreatestSumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(array[i] + max, array[i]);
            res = Math.max(max, res);
        }
        return res;
    }

}
