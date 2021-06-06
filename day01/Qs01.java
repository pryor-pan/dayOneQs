package dayoneQs.day01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Remarks:             组队竞赛
 * Author:panlai
 * :Date:2021/5/24
 */
public class Qs01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array  = new long[3*n];
        for (int i = 0; i < 3*n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        long ret = 0;
        int i = array.length-2;
        while (n>0){
            ret += array[i];
            i -= 2;
            n--;
        }
        System.out.println(ret);
    }

}
