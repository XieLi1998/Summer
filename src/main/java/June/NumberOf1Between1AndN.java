package June;

/**
 * Created by xieli on 2020/6/18.
 */
public class NumberOf1Between1AndN {

    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        while (n > 0) {
            String s = String.valueOf(n);
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1')
                    count++;
            }
            n--;
        }
        return count;
    }

}
