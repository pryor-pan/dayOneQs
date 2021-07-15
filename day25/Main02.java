package dayoneQs_2.day25;

import java.util.Scanner;

/**
 * Remarks:         树根
 * Author:panlai
 * :Date:2021/7/12
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(fun(s));
        }
    }
    public static int fun(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i ++ ) {
            res += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(res < 10) return res;
        return fun(res + "");
    }
}
