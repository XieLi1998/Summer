package June;

/**
 * Created by xieli on 2020/6/20.
 */
public class LeftRotateString {

    //调用库函数
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0 || n <= 0)
            return str;
        int len = str.length();
        String p = str.substring(0, n);
        String q = str.substring(n, len);
        return q + p;
    }


    //先将 "abc" 和 "XYZdef" 分别翻转，得到 "cbafedZYX"，
    // 然后再把整个字符串翻转得到 "XYZdefabc"
    public String LeftRotateString_02(String str, int n) {
        if (n >= str.length())
            return str;
        char[] chars = str.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, n, str.length() - 1);
        reverse(chars, 0, str.length() - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j)
            swap(chars, i++, j--);
    }

    private void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}
