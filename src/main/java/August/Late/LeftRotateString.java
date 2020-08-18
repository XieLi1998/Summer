package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class LeftRotateString {

    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0)
            return "";
//        return str.substring(n, str.length()) + str.substring(0, n);
        StringBuilder res = new StringBuilder();
        for (int i = n; i < str.length(); i++) {
            res.append(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }


}
