package June;

/**
 * Created by xieli on 2020/6/19.
 */
public class InversePairs {

    public int InversePairs(int[] array) {
        if (array == null || array.length == 1 || array.length == 0)
            return 0;
        return countCore(array, 0, array.length - 1) % 1000000007;
    }

    private int countCore(int[] array, int low, int high) {
        if (low == high)
            return 0;
        int mid = low + (high - low) / 2;
        int leftCount = countCore(array, low, mid) % 1000000007;
        int rightCount = countCore(array, mid + 1, high) % 1000000007;
        return leftCount + rightCount + merge(array, low, high, mid);
    }

    private int merge(int[] array, int low, int high, int mid) {
        int[] temp = new int[high - low + 1];
        int p1 = low, p2 = mid + 1;
        int cnts = 0;
        int index = 0;

        while (p1 <= mid && p2 <= high) {
            if (array[p1] > array[p2]) {
                cnts += mid - p1 + 1;
                temp[index++] = array[p2++];
                if (cnts >= 1000000007)
                    cnts %= 1000000007;
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
        return cnts % 1000000007;
    }

}
