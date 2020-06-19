package June;

import java.util.HashMap;

/**
 * Created by xieli on 2020/6/19.
 */
public class FindNumsAppearOnce {

    //哈希表
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]))
                map.put(array[i], 2);
            else
                map.put(array[i], 1);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1)
                if (count == 0) {
                    num1[0] = array[i];
                    count++;
                } else {
                    num2[0] = array[i];
                }
        }
    }

    //位运算
    public void FindNumsAppearOnce_Pro(int[] array, int num1[], int num2[]) {
        int diff = 0;
        for (int num : array)
            diff ^= num;
        diff &= (-diff);
        for (int num : array) {
            if ((num & diff) == 0)
                num1[0] ^= num;
            else
                num2[0] ^= num;
        }
    }

}
