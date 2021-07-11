package dayoneQs_2.day22;

import java.util.Scanner;

/**
 * Remarks:        小易的升级之路
 * Author:panlai
 * :Date:2021/7/8
 */
public class Main01 {
    public static int factor(int a,int b){
        if (a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (a%b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int abl = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i <num ; i++) {
                if (abl>=arr[i]){
                    abl += arr[i];
                }else{
                    abl += factor(abl,arr[i]);
                }
            }
            System.out.println(abl);
        }
    }
}
