package August.Late;

/**
 * Created by xieli on 2020/8/17.
 */
public class MoreThanHalfNum {

    public int MoreThanHalfNum(int[] array) {
        int cnt = 0, majority = array[0];
        for (int i = 0; i < array.length; i++) {
            cnt = array[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for (int value :
                array) {
            if (value == majority) {
                cnt++;
            }
        }
        return cnt > array.length / 2 ? majority : 0;
    }

}
