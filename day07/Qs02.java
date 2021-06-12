package dayoneQs_1.day07;

import java.util.Stack;

/**
 * Remarks:         合法括号序列判断
 * Author:panlai
 * :Date:2021/5/31
 */
public class Qs02 {
    public static boolean chkParenthesis(String A, int n) {
        if (A == null || A.length()!=n){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch:A.toCharArray()) {
            if (ch == '(' || ch==')'){
                if(ch == '('){
                    stack.push(ch);
                }else{
                    if (stack.empty()){
                        return false;
                    }else{
                        stack.pop();
                    }
                }

            }else {
                return false;
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "())";
        int n = 3;
        System.out.println(chkParenthesis(str, n));
    }
}
