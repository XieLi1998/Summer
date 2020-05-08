package April;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/4/30.
 */
public class subStr {

    public Set<String> getAllSub(String str) {
        int len = str.length();
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                set.add(str.substring(i, j));
            }
        }
        return set;
    }
}
