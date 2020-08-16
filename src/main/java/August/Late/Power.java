package August.Late;

/**
 * Created by xieli on 2020/8/16.
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
        double power = Power(base * base, exponent / 2);
        if (exponent % 2 == 1)
            power *= base;
        return isNegative ? 1 / power : power;
    }

    public double PowerV2(double base, int exponent) {
        int n = Math.abs(exponent);
        double result = 1;
        while (n != 0) {
            if ((n & 1) == 1)
                result *= base;
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? result : 1 / result;
    }

}
