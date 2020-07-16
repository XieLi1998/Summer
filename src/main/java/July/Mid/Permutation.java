import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by xieli on 2020/7/16.
 */
public class Permutation {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0)
            return list;
        help(str.toCharArray(), 0, list);
        Collections.sort(list);
        return list;
    }
    private void help(char[] chars, int i, ArrayList<String> list) {
        if (i == chars.length) {
            list.add(String.valueOf(chars));
        } else {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (!set.contains(chars[j])) {
                    set.add(chars[j]);
                    swap(chars, i, j);
                    help(chars, i + 1, list);
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
