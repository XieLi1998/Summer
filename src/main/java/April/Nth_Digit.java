package April;

/**
 * Created by xieli on 2020/4/28.
 */
public class Nth_Digit {
    public int findNthDigit(int n) {
        // 计算该数字由几位数字组成，由1位：digits = 1；2位：digits = 2...
        long base = 9, digits = 1;
        while (n - base * digits > 0) {
            n -= base * digits;
            base *= 10;
            digits++;
        }

        // 计算真实代表的数字是多少
        long idx = n % digits;// 注意由于上面的计算，n现在表示digits位数的第n个数字
        if (idx == 0) {
            idx = digits;
        }

        // 从真实的数字中找到我们想要的那个数字
        long sum = 1;
        for (int k = 1; k < digits; k++) {
            sum *= 10;
        }
        sum += (idx == digits) ? (n / digits - 1) : (n / digits);

        for (long i = idx; i < digits; i++) {
            sum /= 10;
        }

        return (int) sum % 10;
    }

    public static void main(String[] args) {
        int mask = 1;
        mask <<= 1;
        System.out.println(mask);
    }
}
