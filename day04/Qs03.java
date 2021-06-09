package dayoneQs.day04;

import java.util.Scanner;

/**
 * Remarks:             [编程题]计算糖果
 *              https://www.nowcoder.com/questionTerminal/02d8d42b197646a5bbd0a98785bb3a34
 * Author:panlai
 * :Date:2021/5/27
 */
public class Qs03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int a = (n1+n3)/2;
        int b = (n2+n4)/2;
        int c = n4 - b;
        if (a-b!=n1||b-c!=n2||a+b!=n3||b+c!=n4){
            System.out.println("No");
        }else{
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.println(c);
        }

    }
}
