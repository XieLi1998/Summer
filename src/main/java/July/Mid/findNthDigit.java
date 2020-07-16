/**
 * Created by xieli on 2020/7/16.
 */
public class findNthDigit {

    public int findNthDigit(int n) {
        int digits = 1;
        long base = 9;
        while (n - base * digits > 0) {
            n -= base * digits;
            digits++;
            base *= 10;
        }

        int idx = n % digits;
        if (idx == 0)
            idx = digits;

        long num = 1;
        for (int i = 1; i < digits; i++) {
            num *= 10;
        }

        num += (idx == digits) ? (n / digits - 1) : (n / digits);

        for (int i = idx; i < digits; i++) {
            num /= 10;
        }

        return (int) num % 10;
    }

    public static void main(String[] args) {
        findNthDigit findNthDigit=new findNthDigit();
        System.out.println(findNthDigit.findNthDigit(11));
    }

}
