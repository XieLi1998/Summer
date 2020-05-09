package May;

/**
 * Created by xieli on 2020/5/9.
 */
public class mySqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = x / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            // 该值为 mid ^ 2，如果 mid 使用 int，在 x=2147395599 时, 则 mid * mid 会先越界，再被转型成 long
            long sqr = mid * mid;
            long nextSqr = (mid + 1) * (mid + 1);

            if (sqr == x || (sqr < x && nextSqr > x)) {
                return (int) mid;
            } else if (sqr < x) {
                left = mid + 1;
            } else if (sqr > x) {
                right = mid - 1;
            }
        }

        return x;
    }
}
