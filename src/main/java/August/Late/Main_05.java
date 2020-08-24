package August.Late;

import java.util.Scanner;

public class Main_05 {

    private static String string;

    private static void helper(int l, int r) {
        String temp = string.substring(l - 1, r);
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            for (int j = i + 1; j < temp.length(); j++) {
                String substring = temp.substring(i, j);
                count += core(substring);
            }
        }

        System.out.println(count);
    }

    private static int core(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            helper(l, r);
        }

    }


}
