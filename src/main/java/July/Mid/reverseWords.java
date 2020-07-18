/**
 * Created by xieli on 2020/7/18.
 */
public class reverseWords {

//    public String reverseWords(String s) {
//        if (s.trim().equals(""))
//            return s;
//        StringBuilder res = new StringBuilder();
//        String[] strings = s.trim().split(" ");
//        for (int i = strings.length - 1; i >= 0; i--) {
//            res.append(strings[i]);
//            if (i > 0)
//                res.append(" ");
//        }
//        return res.toString();
//    }

    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ')
                i--;
            res.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            j = i;
        }
        //把最后一个空格处理掉
        return res.toString().trim();
    }
}
