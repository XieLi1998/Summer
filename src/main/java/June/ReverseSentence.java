package June;

/**
 * Created by xieli on 2020/6/20.
 */
public class ReverseSentence {

    public String ReverseSentence(String str) {
        if (str.trim().equals(""))
            return str;
        String[] chars = str.split(" ");
        StringBuffer res = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            res.append(chars[i]);
            if (i > 0)
                res.append(" ");
        }
        return res.toString();
    }

}
