/**
 * Created by xieli on 2020/7/13.
 */
public class Power {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }

        double power = Power(base * base, exponent / 2);
        if (exponent % 2 == 1)
            power *= base;
        return isNegative == true ? 1 / power : power;
    }

    public double PowerV2(double base, int exponent) {
        int n = Math.abs(exponent);
        double ans = 1;

        while (n != 0) {
            if ((n & 1) == 1)
                ans *= base;
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? ans : 1 / ans;
    }
}
