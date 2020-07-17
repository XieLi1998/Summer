/**
 * Created by xieli on 2020/7/17.
 */
public class singleNumbers {

    public int[] singleNumbers(int[] nums) {
        //用于将所有的数异或起来
        int k = 0;
        for (int num : nums)
            k ^= num;

        int mask = 1;

        //异或，不同的位取 1
        while ((k & mask) == 0)
            mask <<= 1;

        int a = 0, b = 0;

        //通过异或位将所有的数分为两组再来分别异或
        for (int num : nums) {
            if ((num & mask) == 0)
                a ^= num;
            else
                b ^= num;
        }

        return new int[]{a, b};
    }

}
