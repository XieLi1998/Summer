package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class reOrderArray {

    public void reOrderArray(int[] array) {
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 1)
                oddCount++;
        }
        int[] copy = array.clone();
        int i = 0, j = oddCount;
        for (int num : copy) {
            if (num % 2 != 0)
                array[i++] = num;
            else
                array[j++] = num;
        }
    }

}
