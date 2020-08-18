package August.Late;

/**
 * Created by xieli on 2020/8/18.
 */
public class ReverseSentence {

    public String ReverseSentence(String str) {
        if (str.trim().equals(""))
            return str;
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            result.append(strings[i]);
            if (i > 0)
                result.append(" ");
        }
        return result.toString();
    }

    public String ReverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ')
                i--;
            res.append(s.substring(i + 1, j + 1));
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            j = i;
        }
        return res.toString().trim();
    }

}
