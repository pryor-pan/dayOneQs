package dayoneQs_3.day35;

import java.util.Scanner;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/23 15:09
 */

public class Main01 {
    //求阶乘，作为分母，（非递归方式）
    public static double factorial(int n){
        double sum = 1;
        while (n>1){
            sum *= n;
            n--;
        }
        return sum;
    }

    //求所有人都抽不到自己的情况。
    public static double assertCase(int n){
        if (n == 1){
            return 0;
        }
        if (n ==2 ){
            return 1;
        }
        return (n-1) * (assertCase(n-1) + assertCase(n-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            double mol = assertCase(n);
            double den = factorial(n);
            double result = mol/den*100;
            System.out.println(String.format("%.2f",result) +"%");
        }
    }
}
