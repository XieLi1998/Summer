/**
 * Created by xieli on 2020/7/19.
 */
public class add {

    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }

}
