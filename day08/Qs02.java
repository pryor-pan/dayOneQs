package dayoneQs_1.day08;

import java.util.Scanner;

/**
 * Remarks:         求最小公倍数
 *
 * Author:panlai
 * :Date:2021/5/31
 */
public class Qs02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 % n2== 0 || n2 % n1==0){
            System.out.println(Math.max(n1,n2));
        }
        for (int i = Math.max(n1,n2); i <= (n1*n2); i++) {
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}
