/**
 * Created by xieli on 2020/7/18.
 */
public class singleNumberV3 {

    //    public int singleNumber(int[] nums) {
//        int ones = 0, twos = 0;
//        for (int num : nums) {
//            ones = ones ^ num & ~twos;
//            twos = twos ^ num & ~ones;
//        }
//        return ones;
//    }

    public int singleNumber(int[] nums) {
        int[] counts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                counts[i] += num & 1;
                num >>>= 1;
            }
        }

        int res = 0, m = 3;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= counts[31 - i] % m;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(0 ^ 0);
    }

}
