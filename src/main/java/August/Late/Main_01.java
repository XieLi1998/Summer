package August.Late;

// 本题为考试多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

public class Main_01 {

//    class ListNode{
//        int val;
//        ListNode next;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[1000000];
        for (int i = 0; i < n; i++) {
            dp[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                continue;
            }
            System.out.print(dp[i]+" ");
        }
    }
}
