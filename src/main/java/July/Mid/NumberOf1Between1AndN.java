/**
 * Created by xieli on 2020/7/16.
 */
public class NumberOf1Between1AndN {

    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        while (n > 0) {
            char[] chars = String.valueOf(n).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1')
                    count++;
            }
            n--;
        }
        return count;
    }

}
