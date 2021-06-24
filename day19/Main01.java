package dayoneQs_2.day19;

import java.util.Scanner;

/**
 * Remarks:         汽水瓶
 * Author:panlai
 * :Date:2021/6/14
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n==0){
                break;
            }
            int count = 0;
            while (n>2){
                count += n/3;
                n = (n/3)+(n%3);
            }
            if (n==2){
                count++;
            }
            System.out.println(count);
        }
    }
}
