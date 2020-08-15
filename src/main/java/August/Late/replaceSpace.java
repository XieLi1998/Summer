package August.Late;

/**
 * Created by xieli on 2020/8/15.
 */
public class replaceSpace {

    public String replaceSpace(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                res.append("%20");
            else
                res.append(str.charAt(i));
        }
        return res.toString();
    }

}
