package May;

/**
 * Created by xieli on 2020/5/28.
 */
public class Power {

    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            isNegative = true;
            exponent = -exponent;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow *= base;
        return isNegative ? 1 / pow : pow;
    }

    public double Power_02(double base, int exponent) {
        int n = Math.abs(exponent);
        double ans = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= base;
            }
            base *= base;
            n >>= 1;
        }

        return exponent > 0 ? ans : 1 / ans;
    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println(a & 1);
    }

}
