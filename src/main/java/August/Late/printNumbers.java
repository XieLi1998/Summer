package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class printNumbers {

    public int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] dp = new int[end];
        for (int i = 0; i < end; i++) {
            dp[i] = i + 1;
        }
        return dp;
    }

    int[] result;
    char[] numbers, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int start, n, nine = 0, count = 0;

    public int[] printNumbersV2(int n) {
        this.n = n;
        result = new int[(int) Math.pow(10, n) - 1];
        numbers = new char[n];
        start = n - 1;
        dfs(0);
        return result;
    }

    private void dfs(int x) {
        if (x == n) {
            String s = String.valueOf(numbers).substring(start);
            if (!s.equals("0"))
                result[count++] = Integer.parseInt(s);
            if (n - start == nine)
                start--;
            return;
        }
        for (char c : loop) {
            if (c == '9')
                nine++;
            numbers[x] = c;
            dfs(x + 1);
        }
        nine--;
    }

}
