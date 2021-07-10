package dayoneQs_2.day21;

import java.util.Scanner;

/**
 * Remarks:     洗牌
 * Author:panlai
 * :Date:2021/7/8
 */
public class Main01 {

    public static int[] remix(int[] arr1,int[] arr2){
        int[] ret = new int[2*arr1.length];
        int l = arr1.length-1;
        int r = arr2.length-1;
        for (int i = 0; i < ret.length; i++) {
            if (i%2!=0){
                ret[i] = arr1[l];
                l--;
            }else{
                ret[i] = arr2[r];
                r--;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            for (int i = 0; i < n; i++) {
                array1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                array2[i] = sc.nextInt();
            }
            int[] ret = new int[2*n];
            for (int i = 0; i < k; i++) {
                ret = remix(array1,array2);
            }
            for (int i = 0; i < ret.length; i++) {
                System.out.print(ret[ret.length-i-1] + " ");
            }
            System.out.println();
            num--;
        }
    }
}
