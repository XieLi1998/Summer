package April;

/**
 * Created by xieli on 2020/4/28.
 */
public class LCOF {

    public int[] singleNumbers(int[] nums) {
        int k = 0;

        for (int num : nums) {
            k ^= num;
        }

        int mask = 1;
        //^运算符相异为1，相同为0，从最低为开始找不同的地方
        while ((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }

}
