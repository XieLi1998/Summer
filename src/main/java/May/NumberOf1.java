package May;

/**
 * Created by xieli on 2020/5/28.
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            //无符号右移
            n >>>= 1;
        }
        return count;
    }
}
