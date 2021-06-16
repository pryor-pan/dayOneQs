package dayoneQs_1.day11;

import java.util.Scanner;

/**
 * Remarks:         求最大连续bit数
 * Author:panlai
 * :Date:2021/6/4
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String str = Integer.toBinaryString(n);
            String[] strings = str.split("0");
            int max = 0;
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length()>max){
                    max = strings[i].length();
                }
            }
            System.out.println(max);
        }
    }
}
