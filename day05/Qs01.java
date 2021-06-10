package dayoneQs_1.day05;

import java.util.Scanner;

/**
 * Remarks:         统计回文
 *              https://exam.nowcoder.com/cts/17135844/summary?id=9763AAA0C1056D56#4/{%22uid%22%3A%229763AAA0C1056D56%22%2C%22type%22%3A%224%22%2C%22index%22%3A0}
 * Author:panlai
 * :Date:2021/5/28
 */
public class Qs01 {
    public static boolean isHuiWen(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int number(String a,String b){
        int count=0;
        int len=a.length();
        for(int i=0;i<=len;i++){
            String str=a.substring(0,i)+b+a.substring(i,len);
            if(isHuiWen(str)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String a=s.next();
            String b=s.next();
            System.out.println(number(a,b));
        }
    }


}
