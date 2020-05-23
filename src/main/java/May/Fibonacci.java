package May;

/**
 * Created by xieli on 2020/5/23.
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public int Fibonacci_pro(int n) {
        int[] ans = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans[n];
    }

    public int Fibonacci_pro_pro(int n) {
        if (n <= 1)
            return n;

        int sum = 0;
        int one = 1; //n-1项
        int two = 0; //n-2项

        for (int i = 2; i <= n; i++) {
            sum = one + two;
            two = one;
            one = sum;
        }

        return sum;
    }
}
