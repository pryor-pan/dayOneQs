package dayoneQs_1.day10;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/6/2
 */
public class Qs02 {
    public static void func(String str){
        int score1 = 0;
        if (str.length()<=4){
            score1 = 4;
        }else if (str.length()<=7){
            score1 = 10;
        }else{
            score1 = 25;
        }

        int score2 = 0;
        boolean flg3 = false;
        boolean flg4 = false;
        for (char ch:str.toCharArray()) {
            /*if (ch>'a'&& ch<'z'){
                for (int i = 0; i < str.length(); i++) {
                    if ('A'<str.charAt(i) && str.charAt(i)<'Z'){
                        score2 = 20;
                        break;
                    }
                }
                if (score2!=20){
                    score2=10;
                    break;
                }
            }else if (ch > 'A' && ch<'Z'){
                for (int i = 0; i < str.length(); i++) {
                    if ('a'<str.charAt(i) && str.charAt(i)<'z'){
                        score2 = 20;
                        break;
                    }
                }
                if (score2!=20){
                    score2=10;
                    break;
                }
            }
            if (score2!=0){
                break;
            }*/
            if (ch>'a'&& ch<'z'){
                flg3 = true;
            }
            if (ch > 'A' && ch<'Z'){
                flg4 = true;
            }

        }
        if (flg3 || flg4){
            score2 = 10;
            if (flg3 && flg4){
                score2 = 20;
            }
        }


        int score3 = 0;
        int count = 0;
        for (char ch:str.toCharArray()) {
            if (Character.isDigit(ch)){
                count++;
            }
        }
        if (count == 1){
            score3 = 10;
        }else if (count>1){
            score3 = 20;
        }

        int score4 = 0;
        int count1 = 0;
        for (char ch:str.toCharArray()) {
            if (!Character.isDigit(ch) && !Character.isLetter(ch) && ch!=' '){
                count1++;
            }
        }
        if (count1 == 1){
            score4 = 10;
        }else if (count1>1){
            score4 = 25;
        }

        int score5 = 0;
        if (score2!=0 && score3 !=0){
            score5 = 2;
        }
        if (score2!=0 && score3!=0 && score4!=0){
            score5 = 3;
        }
        if (score2 == 20 && score3!=0 && score4 != 0){
            score5 = 5;
        }
        int score = score1+score2+score3+score4+score5;
        if (score>=90){
            System.out.println("VERY_SECURE");
        }else if (score>=80){
            System.out.println("SECURE");
        }else if (score>=70){
            System.out.println("VERY_STRONG");
        }else if (score>=60){
            System.out.println("STRONG");
        }else if (score>=50){
            System.out.println("AVERAGE");
        }else if (score>=25){
            System.out.println("WEAK");
        }else{
            System.out.println("VERY_WEAK");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        func(str1);
        while (sc.hasNext()){
            String str = sc.nextLine();
            func(str);
        }
    }
}
