package dayoneQs_2.day29;

import java.util.Scanner;

/**
 * @Description:        有假币
 * @Author: panlai
 * @Date: 2021/7/16 9:50
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n==0){
                break;
            }else {
                for (int i = 0; i < Math.sqrt(n)+1 ; i++) {
                    if (Math.pow(2,i)<=n&&n<Math.pow(2,i+1)){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
