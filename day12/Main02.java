package dayoneQs_1.day12;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/4
 */
public class Main02 {
    public static boolean isPrime(int n ){
        for (int i = 2; i < n; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] ret = new int[2];
            for (int i = 0; i <= n/2; i++) {
                if (isPrime(i) && isPrime(n-i)){
                    ret[0] = i;
                    ret[1] = n-i;
                }
            }
            System.out.println(ret[0]);
            System.out.println(ret[1]);
        }
        sc.close();
    }
}
