package June;

/**
 * Created by xieli on 2020/6/10.
 */
public class StrToInt {

    public int StrToInt(String str) {
        Integer res = 0;
        try {
            res = new Integer(str);
        } catch (Exception e) {

        } finally {
            return res;
        }
    }

    public int StrToInt_Pro(String str) {
        if (str == null || "".equals(str.trim()))
            return 0;
        char[] chars = str.trim().toCharArray();
        int flag = 1, res = 0;
        int i = 0;
        if (chars[i] == '-')
            flag = -1;
        if (chars[i] == '+' || chars[i] == '-')
            i++;
        while (i < str.length()) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                int cur = chars[i] - '0';
                if (flag == 1 &&
                        (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE && cur > 7))
                    return 0;
                if (flag == -1 &&
                        (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE && cur > 8))
                    return 0;
                res = res * 10 + cur;
                i++;
            } else {
                return 0;
            }
        }
        return flag * res;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
}
