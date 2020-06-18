package June;

/**
 * Created by xieli on 2020/6/18.
 */
public class FindGreatestSumOfSubArray {

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            ans = Math.max(max, ans);
        }
        return ans;
    }


}
