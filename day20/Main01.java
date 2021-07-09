package dayoneQs_2.day20;

import java.util.Scanner;

/**
 * Remarks:     字符串翻转
 * Author:panlai
 * :Date:2021/7/5
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(n-i-1));
        }
    }
}
