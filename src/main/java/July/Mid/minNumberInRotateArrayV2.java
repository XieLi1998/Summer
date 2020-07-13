/**
 * Created by xieli on 2020/7/13.
 */
public class minNumberInRotateArrayV2 {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int l = 0, h = array.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[l] == array[m] && array[m] == array[h])
                return minNumber(array, l, m);
            else if (array[m] >= array[h])
                l = m + 1;
            else
                h = m;
        }
        return array[l];
    }

    private int minNumber(int[] num, int l, int h) {
        for (int i = l; i < h; i++) {
            if (num[i] > num[i + 1])
                return num[i + 1];
        }
        return num[l];
    }
}
