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

    //逻辑短路
    public int Sum_Solution_02(int n) {
        //boolean 只是为了不报错
        boolean res = n > 1 && ((n += Sum_Solution_02(n - 1)) > 0);
        return n;
    }

}
