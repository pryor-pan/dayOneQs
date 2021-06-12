package dayoneQs_1.day07;

import java.util.Scanner;

/**
 * Remarks:                 fibonacci数列
 * Author:panlai
 * :Date:2021/5/31
 */
public class Qs01 {
    public static int fibonacci(int n ){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (fibonacci(i)<n){
            i++;
        }
        int n1 = fibonacci(i-1);
        int n2 = fibonacci(i);
        if (Math.abs(n1-n)>Math.abs(n2-n)){
            System.out.println(Math.abs(n2-n));
        }else{
            System.out.println(Math.abs(n1-n));
        }
    }
}
