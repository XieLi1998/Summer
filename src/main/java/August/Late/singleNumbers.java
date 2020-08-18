package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class singleNumbers {

    public int[] singleNumbers(int[] nums) {
        int k = 0;
        for (int val : nums)
            k ^= val;

        int mask = 1;
        while ((k & mask) == 0)
            mask <<= 1;

        int a = 0, b = 0;
        for (int val : nums) {
            if ((val & mask) == 0)
                a ^= val;
            else
                b ^= val;
        }

        return new int[]{a, b};
    }

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int k = 0;
        for (int val : array)
            k ^= val;

        int mask = 1;
        while ((k & mask) == 0)
            mask <<= 1;

        int a = 0, b = 0;
        for (int val : array) {
            if ((val & mask) == 0)
                a ^= val;
            else
                b ^= val;
        }

        num1[0] = a;
        num2[0] = b;
    }

    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for (int val : nums) {
            a = a ^ val & ~b;
            b = b ^ val & ~a;
        }
        return a;
    }

}
