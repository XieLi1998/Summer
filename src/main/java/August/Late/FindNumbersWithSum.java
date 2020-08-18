package August.Late;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by xieli on 2020/8/18.
 */
public class FindNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int low = 0, high = array.length - 1;
        while (low < high) {
            int cur = array[low] + array[high];
            if (cur == sum)
                return new ArrayList<>(Arrays.asList(array[low], array[high]));
            else if (cur < sum)
                low++;
            else
                high--;
        }
        return new ArrayList<>();
    }

}
