package August.Late;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by xieli on 2020/8/30.
 */
public class Agricultural_Bank_v3 {

    public static String[] getPokerOrder(String[] cards) {
        TreeSet<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Map<Character, Integer> map = new HashMap<Character, Integer>();
                map.put('k', 1);
                map.put('s', 2);
                map.put('h', 3);
                map.put('p', 4);
                map.put('q', 5);
                int num = map.get(o1.charAt(0)) - map.get(o2.charAt(0));
                int num2 = num == 0 ? Integer.parseInt(o1.substring(1)) - Integer.parseInt(o2.substring(1)) : num;
                return num2;
            }
        });

        for (String card : cards) {
            set.add(card);
        }
        String[] res = set.toArray(new String[set.size()]);
        return res;
    }
}
