package June;

import java.util.TreeSet;

/**
 * Created by xieli on 2020/6/20.
 */
public class isContinuous {

    public boolean isContinuous(int[] numbers) {
        if (numbers.length != 5)
            return false;
        int size = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                size++;
            else
                set.add(numbers[i]);
        }

        if (size + set.size() != 5)
            return false;
        if (set.last() - set.first() < 5)
            return true;
        return false;
    }

}
