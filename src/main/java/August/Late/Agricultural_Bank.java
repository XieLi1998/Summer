package August.Late;

import java.util.Scanner;

/**
 * Created by xieli on 2020/8/30.
 */
public class Agricultural_Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        str = str.replace('0', '@');
        str = str.replace('1', '$');
        str = str.replace('2', '&');
        System.out.println(str);
    }

}
