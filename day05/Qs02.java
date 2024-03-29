package dayoneQs_1.day05;

import java.util.Scanner;

/**
 * Remarks:         连续最大和
 * Author:panlai
 * :Date:2021/5/28
 */
public class Qs02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = sc.nextInt();
            }
            int max = num[0];
            int sum = num[0];
            for(int i=1;i<n;i++){
                if(sum>=0){
                    sum += num[i];
                }else{
                    sum=num[i];
                }
                if(sum>max)max=sum;
            }
            System.out.println(max);
        }
    }
}
