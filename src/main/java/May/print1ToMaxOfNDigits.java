package May;

/**
 * Created by xieli on 2020/5/28.
 */
public class print1ToMaxOfNDigits {

    public int[] print1ToMaxOfNDigits(int n) {
        int[] map = {10, 100, 1000, 10_000, 100_000, 1_000_000,
                10_000_000, 100_000_000, 1_000_000_000, Integer.MAX_VALUE};
        int size = map[n - 1];
        int[] ans = new int[size - 1];
        for (int i = 1; i < size; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }

}
