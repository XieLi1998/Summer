package August.Late;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by xieli on 2020/8/24.
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer>[] groups = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            LinkedList<Integer> a = new LinkedList<>();
            groups[i] = a;
        }

    }

}
