/**
 * Created by xieli on 2020/6/23.
 */
public class minNumberInRotateArray {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int l = 0, h = array.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (array[mid] <= array[h])
                h = mid;
            else
                l = mid + 1;
        }
        return array[l];
    }

}
