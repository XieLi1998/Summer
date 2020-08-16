package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class match {

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return matchCore(str, 0, pattern, 0);
    }

    private boolean matchCore(char[] str, int i, char[] pattern, int j) {
        if (j == pattern.length)
            return i == str.length;

        if (j < pattern.length - 1 && pattern[j + 1] == '*') {
            if (str.length != i &&
                    (str[i] == pattern[j] || pattern[j] == '.'))
                return matchCore(str, i, pattern, j + 2) ||
                        matchCore(str, i + 1, pattern, j + 2) ||
                        matchCore(str, i + 1, pattern, j);
            else
                return matchCore(str, i, pattern, j + 2);
        }

        if (str.length != i &&
                (str[i] == pattern[j] || pattern[j] == '.'))
            return matchCore(str, i + 1, pattern, j + 1);

        return false;
    }

}
