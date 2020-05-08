package May;

/**
 * Created by xieli on 2020/5/6.
 */
public class countDigitOne {
    public int countDigitOne(int n) {
        int count = 0;
        for (int k = 1; k <= n; k *= 10) {
            int abc = n % k;
            int xyzd = n / k;
            int d = xyzd % 10;
            int xyz = xyzd / 10;
            count += xyz * k;
            if (d > 1) {
                count += k;
            } else if (d == 1) {
                count += abc + 1;
            }
            if (xyz == 0)
                break;
        }
        return count;
    }

    public static int countDigitSeven(int n) {
        int count = 0;
        for (int k = 1; k <= n; k *= 10) {
            int abc = n % k;
            int xyzd = n / k;
            int d = xyzd % 10;
            int xyz = xyzd / 10;
            count += xyz * k;
            if (d > 7) {
                count += k;
            } else if (d == 7) {
                count += abc + 1;
            }
            if (xyz == 0)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 123456;
        int b = a / 10;
        System.out.println(countDigitSeven(70));
    }
}
