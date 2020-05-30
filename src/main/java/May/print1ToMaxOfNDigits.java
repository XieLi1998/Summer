package May;

/**
 * Created by xieli on 2020/5/28.
 */
public class print1ToMaxOfNDigits {

    public int[] print1ToMaxOfNDigits(int n) {
        int[] map = {10, 100, 1000, 10_000, 100_000, 1_000_000,
                10_000_000, 100_000_000, 1_000_000_000, Integer.MAX_VALUE};
        int size = map[n - 1];
        int[] ans = new int[size - 1];
        for (int i = 1; i < size; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }

    public int[] print1ToMaxOfNDigits_pro(int n) {
        int max = (int) Math.pow(10, n);
        int[] ans = new int[max - 1];
        for (int i = 1; i <= max - 1; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }

    public void print1ToMaxOfNDigits_pro_pro(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits_pro_pro(number, 0);
    }

    private void print1ToMaxOfNDigits_pro_pro(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits_pro_pro(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

}
