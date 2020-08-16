package August.Late;

/**
 * Created by xieli on 2020/8/16.
 */
public class isNumeric {

    public boolean isNumeric(char[] str) {
        if (str == null ||  str.length == 0)
            return false;
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }

}
