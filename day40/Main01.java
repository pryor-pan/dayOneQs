package dayoneQs_3.day40;

import java.util.Scanner;

/**
 * @Name: Main01
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/29 15:14
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long c[] = new long[22];
        c[2] = 1;
        c[3] = 2;
        for (int i = 4; i < 22; i++) {
            c[i] = (i - 1) * (c[i - 1] + c[i - 2]);
        }
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(c[n]);
        }
    }
}
