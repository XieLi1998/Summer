package August.Late;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by xieli on 2020/8/17.
 */
public class PrintMinNumber {

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }

        String res = "";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        Collections.sort(list, ((o1, o2) -> (o1 + o2).compareTo(o2 + o1)));

        for (String value :
                list) {
            res += value;
        }
        return res;
    }

}
