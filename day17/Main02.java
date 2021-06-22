package dayoneQs_2.day17;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Remarks:         超长正整数相加
 * Author:panlai
 * :Date:2021/6/11
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String addend = in.next();
            String augend = in.next();
            BigInteger sum = new BigInteger(addend);
            BigInteger sum1 = new BigInteger(augend);
            BigInteger res = sum.add(sum1);
            System.out.println(res);
        }
    }
}
