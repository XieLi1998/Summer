package August.Late;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int n = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        String temp;
        for (int i = 0; i < string.length(); i++) {

            for (int j = i + 1; j < string.length(); j++) {
                temp = string.substring(i, j);
                res.add(temp);
            }
        }
        Collections.sort(res);
        int count = 0;
        for (String value : res) {
            count++;
            if (count == n - 1) {
                System.out.println(value);
            }
        }
//        String[] ans = res.toArray(new String[res.size()]);
//        Arrays.sort(ans);
//        System.out.println(ans[n]);
    }
}
