package dayoneQs_1.day15;

import java.util.Scanner;

/**
 * Remarks:         查找输入整数二进制中1的个数
 * Author:panlai
 * :Date:2021/6/9
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n =sc.nextInt();
            int count = 0;
            while (n!=0){
                n &= n-1;
                count++;
            }
            System.out.println(count);
        }
    }
}
