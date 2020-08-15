package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class minNumberInRotateArray {

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int l = 0, h = array.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (array[l] == array[mid] && array[mid] == array[h])
                return minNumberInShift(array, l, h);
            else if (array[mid] <= array[h])
                h = mid;
            else
                l = mid + 1;
        }
        return array[l];
    }

    private int minNumberInShift(int[] array, int l, int h) {
        for (int i = l; i < h; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[l];
    }

}
