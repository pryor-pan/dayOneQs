package dayoneQs_1.day06;

import java.util.Scanner;

/**
 * Remarks:         把字符串转化为整数
 * Author:panlai
 * :Date:2021/5/28
 */
public class Qs02 {
    public static boolean isNum(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == null || "".equals(str.trim())){
            System.out.println(0);
        }

        str = str.trim();
        char[] array = str.toCharArray();
        int i = 0;
        int flag = 1;
        int res = 0;
        if (array[i] == '-'){
            flag = -1;
        }
        if (array[i] == '+'||array[i] == '-'){
            i++;
        }
        while (i<array.length){
            if (isNum(array[i])){
                int cur = array[i] - '0';
                if (flag == 1 && (res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE /10 && cur > 7)){
                    System.out.println(0);
                    break;
                }
                if (flag == -1 && (res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE /10 && cur > 8)){
                    System.out.println(0);
                    break;
                }
                res = res * 10 + cur;
                i++;
            }else {
                System.out.println(0);
                break;
            }
        }
        System.out.println(res*flag);
    }

}
