package dayoneQs_2.day28;

import java.util.Scanner;

/**
 * @Description:        守形数
 * @Author: panlai
 * @Date: 2021/7/15 22:20
 */

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int num1 = num*num;
            int tem = 0;
            int i = 1;
            while (num1!=0){
                tem += num1%10*i;
                if (tem == num){
                    break;
                }else {
                    num1 /= 10;
                    i *= 10;
                }
            }
            if (tem==num){
                System.out.println("Yes!");
            }
            else {
                System.out.println("No!");
            }
        }
    }
}
