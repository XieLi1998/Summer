package June;

/**
 * Created by xieli on 2020/6/19.
 */
public class findNthDigit {

    public int findNthDigit(int n) {
        int digits = 1;
        long base = 9;
        while (n - base * digits > 0) {
            n -= base * digits;
            digits += 1;
            base *= 10;
        }

        // 获取目标位是当前数字的第几位
        int idx = n % digits;
        if (idx == 0)
            idx = digits;

        long num = 1;
        for (int i = 1; i < digits; i++) {
            num *= 10;
        }
        num += (idx == digits) ? (n / digits - 1) : (n / digits);

        // 将想要的数字控制在最后一位
        for (int i = idx; i < digits; i++) {
            num /= 10;
        }
        return (int) num % 10;
    }

    public static void main(String[] args) {
        findNthDigit findNthDigit = new findNthDigit();
        System.out.println(findNthDigit.findNthDigit(3));
    }

}
