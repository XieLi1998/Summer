package May;

import java.util.Scanner;

/**
 * Created by xieli on 2020/5/14.
 */
public class maxOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        long res = maxOfThree(nums);
        System.out.println(res);
    }

    private static long maxOfThree(long[] nums) {

        //max1,max2,max3用于记录最大,次大,第三大的数
        long max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        //min1,min2用于记录最小,次小的数
        long min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (long num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
