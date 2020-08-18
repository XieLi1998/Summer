package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class InversePairs {

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0 || array.length == 1)
            return 0;
        return Counter(array, 0, array.length - 1);
    }

    private int Counter(int[] array, int low, int high) {
        if (low == high)
            return 0;
        int mid = low + (high - low) / 2;
        int leftCount = Counter(array, low, mid);
        int rightCount = Counter(array, mid + 1, high);
        return leftCount + rightCount + merge(array, low, mid, high);
    }

    private int merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int p1 = low, p2 = mid + 1;
        int cnts = 0;
        int index = 0;

        while (p1 <= mid && p2 <= high) {
            if (array[p1] > array[p2]) {
                temp[index++] = array[p2++];
                cnts += mid - p1 + 1;
            } else {
                temp[index++] = array[p1++];
            }
        }

        while (p1 <= mid) {
            temp[index++] = array[p1++];
        }

        while (p2 <= high) {
            temp[index++] = array[p2++];
        }

        for (int i = 0; i < temp.length; i++) {
            array[low++] = temp[i];
        }

        return cnts;
    }

}
