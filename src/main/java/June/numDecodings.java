package June;

/**
 * Created by xieli on 2020/6/19.
 */
public class numDecodings {

    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        int pre = 1, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            int temp = cur;
            if (s.charAt(i) == '0')
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')
                    cur = pre;
                else
                    return 0;
            else if (s.charAt(i - 1) == '1' ||
                    (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6'))
                cur += pre;
            pre = temp;
        }
        return cur;
    }

}
