package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class StrToInt {

    public int StrToInt(String str) {
//        int res = 0;
//        try {
//            res = new Integer(str);
//        } catch (NumberFormatException e) {
//
//        } finally {
//            return res;
//        }

        if (str == null || "".equals(str.trim()))
            return 0;
        char[] chars = str.toCharArray();
        int res = 0;
        int i = 1, flag = 1;
        if (chars[0] == '-')
            flag = -1;
        else if (chars[0] != '+')
            i = 0;

        for (int j = i; j < chars.length; j++) {
            if (chars[j] < '0' || chars[j] > '9')
                return 0;
            if (res > Integer.MAX_VALUE / 10 ||
                    (res == Integer.MAX_VALUE / 10 && chars[j] > '7'))
                return 0;
            res = res * 10 + (chars[j] - '0');
        }
        return flag * res;
    }

}
