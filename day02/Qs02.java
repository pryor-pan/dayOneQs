package dayoneQs.day02;

import java.util.Scanner;

/**
 * Remarks:         倒置字符串
 * Author:panlai
 * :Date:2021/5/25
 */
public class Qs02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[strings.length-i-1]+ " ");
        }
    }
}
