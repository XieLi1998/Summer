/**
 * Created by xieli on 2020/7/16.
 */
public class MoreThanHalfNum {

    public int MoreThanHalfNum_Solution(int[] array) {
        int count = 0, majority = array[0];
        for (int i = 0; i < array.length; i++) {
            count = majority == array[i] ? count + 1 : count - 1;
            if (count == 0) {
                majority = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int val : array)
            if (val == majority)
                count++;

        return count > array.length / 2 ? majority : 0;
    }

}
