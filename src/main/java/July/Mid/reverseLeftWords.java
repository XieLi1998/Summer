/**
 * Created by xieli on 2020/7/18.
 */
public class reverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0)
            return "";
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public String reverseLeftWordsV2(String s, int n) {
        if (s == null || s.length() == 0)
            return "";

        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for (int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();
    }
}
