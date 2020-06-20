package June;

/**
 * Created by xieli on 2020/6/20.
 */
public class Sum_Solution {

    //等差数列
    public int Sum_Solution(int n) {
        int sum = (int) Math.pow(n, 2) + n;
        return sum >> 1;
    }

}
