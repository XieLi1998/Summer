/**
 * Created by xieli on 2020/7/19.
 */
public class sumNums {

    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
