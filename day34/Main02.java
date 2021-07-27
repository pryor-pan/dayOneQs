package dayoneQs_3.day34;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description:        养兔子
 * @Author: panlai
 * @Date: 2021/7/22 18:16
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            BigInteger oldRabbit = new BigInteger("1");
            BigInteger newRabbit = new BigInteger("0");
            for (int i = 0; i < n-1; i++) {
                BigInteger temp = newRabbit;
                newRabbit = oldRabbit;
                oldRabbit = oldRabbit.add(temp);
            }
            System.out.println(oldRabbit.add(newRabbit));
        }
    }

}
