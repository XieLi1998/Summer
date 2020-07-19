/**
 * Created by xieli on 2020/7/15.
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

    public int StrToIntV2(String str) {
        if (str == null || "".equals(str.trim()))
            return 0;
        char[] chars = str.trim().toCharArray();
        int res = 0, flag = 1;
        int i = 0;
        if (chars[i] == '-')
            flag = -1;
        if (chars[i] == '+' || chars[i] == '-')
            i++;

        while (i < chars.length) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                int cur = chars[i] - '0';
                if (flag == 1 &&
                        (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && cur > 7))
                    return 0;
                if (flag == -1 &&
                        (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && cur > 8))
                    return 0;

                res = res * 10 + cur;
                i++;
            } else {
                return 0;
            }
        }
        return flag * res;
    }

    public int StrToIntV3(String str) {
        if (str == null || "".equals(str.trim()))
            return 0;
        char[] chars = str.trim().toCharArray();
        int res = 0;
        int i = 1, flag = 1;
        if (chars[0] == '-')
            flag = -1;
        else if (chars[0] != '+')
            i = 0;

        for (int j = i; j < chars.length; j++) {
            if (chars[j] < '0' || chars[j] > '9')
                break;
            if (res > Integer.MAX_VALUE / 10 ||
                    res == Integer.MAX_VALUE / 10 && chars[j] > '7')
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + (chars[j] - '0');
        }
        return flag * res;
    }
}
