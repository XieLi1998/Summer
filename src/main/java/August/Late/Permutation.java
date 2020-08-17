package August.Late;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xieli on 2020/8/17.
 */
public class Permutation {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if (str == null || str.length() == 0)
            return list;
        helper(str.toCharArray(), 0, list);
        Collections.sort(list);
        return list;
    }

    private void helper(char[] chars, int i, ArrayList<String> list) {
        if (i == chars.length) {
            list.add(String.valueOf(chars));
        } else {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (!set.contains(chars[j])) {
                    set.add(chars[j]);
                    swap(chars, i, j);
                    helper(chars, i + 1, list);
                    swap(chars, i, j);
                }
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
