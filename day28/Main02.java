package dayoneQs_2.day28;

import java.util.Scanner;

/**
 * @Description:
 * @Author: panlai
 * @Date: 2021/7/15 22:20
 */

public class Main02 {
    public static boolean func(String str){
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String str1 = str.substring(i,j);
                String[] strings = str.split(str1);
                if (strings.length>2){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            if (str.length()<=8){
                System.out.println("NG");
                break;
            }
            int numberCount = 0;
            int upLetterCount = 0;
            int loLetterCount = 0;
            int others = 0;
            for (char ch:str.toCharArray()) {
                if (ch>='0'&&ch<='9'){
                    numberCount++;
                }
                else if (ch>='a'&&ch<='z'){
                    loLetterCount++;
                }
                else if (ch>='A'&&ch<='Z'){
                    upLetterCount++;
                }else {
                    others++;
                }
            }
            if (func(str)&&numberCount!=0&&upLetterCount!=0&&loLetterCount!=0&&others!=0){
                System.out.println("OK");
            }else if (func(str)&&numberCount!=0&&upLetterCount==0&&loLetterCount!=0&&others!=0){
                System.out.println("OK");
            }else if (func(str)&&numberCount!=0&&upLetterCount!=0&&loLetterCount==0&&others!=0){
                System.out.println("OK");
            }else if (func(str)&&numberCount!=0&&upLetterCount!=0&&loLetterCount!=0&&others==0){
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

}
