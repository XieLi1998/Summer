package June;

/**
 * Created by xieli on 2020/6/20.
 */
public class Add {

    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int c = (num1 & num2) << 1;
            num1 ^= num2;
            num2 = c;
        }
        return num1;
    }

}
