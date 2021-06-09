package dayoneQs.day04;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/5/27
 */
public class Qs01 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[101];
        data[0] = 1;
        if (n < 6){
            System.out.println(-1);
        }
        data[6] = 2;
        for (int i = 8; i <= n; i++){
            if (data[i - 8] != 0){
                data[i] = data[i - 8] + 1;
            }else if (data[i - 6] != 0) {
                data[i] = data[i - 6] + 1;
            }
        }
        if (data[n] == -1){
            System.out.println(-1);
        }else {
            System.out.println(data[n] - 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flg = false;

        for (int i = 0; i*8 <= n; i++) {
            for (int j = 0; j*6 <= n-(i*8); j++) {
                if ((i*8) + (j *6) == n){
                    System.out.println(i+j);
                    flg = true;
                }
            }
        }
        if (!flg){
            System.out.println(-1);
        }
    }

}
