package August.Late;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/8/18.
 */
public class isContinuous {

    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5)
            return false;
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int value : numbers) {
            if (value == 0)
                continue;
            max = Math.max(max, value);
            min = Math.min(min, value);
            if (repeat.contains(value))
                return false;
            repeat.add(value);
        }
        return max - min < 5;
    }

}
