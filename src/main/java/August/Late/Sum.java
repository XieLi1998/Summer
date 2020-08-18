package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class Sum {

    public int Sum_Solution(int n) {
        boolean result = n > 1 && (n += Sum_Solution(n - 1)) > 0;
        return n;
    }

}
