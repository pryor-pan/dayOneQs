package dayoneQs.day04;

import java.util.Scanner;

/**
 * Remarks:         [编程题]进制转换(未完成)
 *
 *              https://www.nowcoder.com/questionTerminal/ac61207721a34b74b06597fe6eb67c52
 * Author:panlai
 * :Date:2021/5/27
 */
public class Qs04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        String table = "0123456789ABCDEF";
        int num = sc.nextInt();
        int n = sc.nextInt();
        while (num>0){
            if (num<0){
                System.out.println("-");
            }
            s = table.charAt(num%n) + s;
            num = num/n;
        }
        System.out.println(s);
    }
}
