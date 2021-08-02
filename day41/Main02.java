package dayoneQs_3.day41;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Name: Main01
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/30 9:53
 */

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input=Integer.parseInt(sc.nextLine());
            Stack<Integer> number=new Stack<>();
            String centense=sc.nextLine();
            String[] allFigure =centense.split(" ");
            for(int i=0;i<allFigure.length;i++){
                if(allFigure[i].length()==1){
                    char aa=allFigure[i].charAt(0);
                    if(aa==42||aa==43||aa==45||aa==47){
                        int result=0;
                        int b=number.pop();
                        int a=number.pop();
                        switch (aa) {
                            case '+':
                                result=a+b;
                                break;
                            case '-':
                                result=a-b;
                                break;
                            case '*':
                                result=a*b;
                                break;
                            case '/':
                                result=a/b;
                                break;
                        }
                        number.push(result);
                    }else {
                        number.push(aa-'0');
                    }
                }else {
                    number.push(Integer.parseInt(allFigure[i]));
                }
//              if(single.isEmpty()){
//                  System.out.println(number.pop());
//                  break;
//              }
            }
            System.out.println(number.pop());
        }
    }
}
