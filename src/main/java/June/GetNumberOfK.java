package June;

import java.util.Arrays;

/**
 * Created by xieli on 2020/6/19.
 */
public class GetNumberOfK {

    //工具类
    public int GetNumberOfK(int[] array, int k) {
        int index = Arrays.binarySearch(array, k);
        if (index < 0)
            return 0;

        int count = 1;
        for (int i = index + 1; i < array.length && array[i] == k; i++) {
            count++;
        }

        for (int i = index - 1; i >= 0 && array[i] == k; i--) {
            count++;
        }

        return count;
    }

    //实现二分查找
    public int GetNumberOfK_Pro(int[] array, int k) {
        int first = binarySearch(array, k);
        int last = binarySearch(array, k + 1);
        return (first == array.length || array[first] != k) ? 0 : last - first;
    }

    private int binarySearch(int[] array, int k) {
        int l = 0, h = array.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] >= k)
                h = m;
            else
                l = m + 1;
        }
        return l;
    }

}
