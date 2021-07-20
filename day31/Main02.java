package dayoneQs_3.day31;

import java.util.Scanner;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/19 12:52
 */

public class Main02 {
    public  static void func(int num){
        System.out.print(num + "+=");
        int i = 2;
        int sum = 1;
        int num1 = num;
        while (num>i){
            if (num%i == 0){
                sum*=i;
                if (sum!=num1){
                    System.out.print(i+"");
                }else {
                    System.out.print(i);
                    break;
                }
                num = num/i;
                i = 2;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            func(num);
        }

    }

}
