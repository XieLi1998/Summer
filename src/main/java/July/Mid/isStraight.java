import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/7/19.
 */
public class isStraight {

    public boolean isStraight(int[] nums) {
        if (nums.length != 5)
            return false;
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0)
                continue;
            max = Math.max(num, max);
            min = Math.min(num, min);
            if (repeat.contains(num))
                return false;
            repeat.add(num);
        }
        return max - min < 5;
    }

}
