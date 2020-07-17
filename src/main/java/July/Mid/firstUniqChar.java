import java.util.HashMap;

/**
 * Created by xieli on 2020/7/17.
 */
public class firstUniqChar {

    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars)
            map.put(c, !map.containsKey(c));
        for (char c : chars)
            if (map.get(c))
                return c;
        return ' ';
    }

}
