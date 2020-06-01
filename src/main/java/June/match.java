package June;

/**
 * Created by xieli on 2020/6/1.
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

        //下一个是 *
        if (j < pattern.length - 1 && pattern[j + 1] == '*') {
            //当前匹配
            if (str.length != i &&
                    (str[i] == pattern[j] || pattern[j] == '.'))
                return matchCore(str, i, pattern, j + 2) ||
                        matchCore(str, i + 1, pattern, j);
                //当前不匹配
            else
                return matchCore(str, i, pattern, j + 2);
        }
        //下一个不是 *
        if (str.length != i &&
                (str[i] == pattern[j] || pattern[j] == '.'))
            return matchCore(str, i + 1, pattern, j + 1);
        return false;
    }

}
