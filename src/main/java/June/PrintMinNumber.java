package June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by xieli on 2020/6/19.
 */
public class PrintMinNumber {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";

        String res = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });

        for (int k : list) {
            res += k;
        }

        return res;
    }

}
