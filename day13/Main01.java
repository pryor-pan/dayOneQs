package dayoneQs_1.day13;

import java.util.Scanner;

/**
 * Remarks:     参数解析
 * Author:panlai
 * :Date:2021/6/7
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(4);
        int i = str.indexOf(' ');
        System.out.println(str.substring(0,i));
        str = str.substring(i+1);

        i = str.indexOf(' ');
        System.out.println(str.substring(0,i));
        str = str.substring(i+1);

        int j = str.lastIndexOf(' ');
        System.out.println(str.substring(0,j));

        System.out.println(str.substring(j+1));
    }
}
