package April;

import java.util.TreeSet;

/**
 * Created by xieli on 2020/4/30.
 */
public class isContinuous {

    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5)
            return false;

        int count = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int num : numbers) {
            if (num == 0)
                count++;
            else
                set.add(num);
        }

        if (count + set.size() != 5)
            return false;
        if (set.last() - set.first() < 5)
            return true;
        return false;
    }

}
