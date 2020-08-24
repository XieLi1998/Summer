package August.Late;

import java.util.Scanner;

public class Main_03 {

    private static int helper(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dp = new int[T];
        for (int i = 0; i < T; i++) {
            dp[i] = sc.nextInt();
        }

        int[] res = new int[T];
        for (int i = 0; i < T; i++) {
            int a = dp[i] / 2;
            int b = dp[i] - a;
            res[i] = helper(a) + helper(b);
        }
        for (int i = 0; i < T; i++) {
            System.out.print(res[i]+" ");
        }

    }


}
