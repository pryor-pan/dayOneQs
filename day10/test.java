package dayoneQs_1.day10;
/**
 * @ClassName topic02.Main
 * @Desc TODO
 * @Author LikeCupid
 * @Date 2021/6/2 23:29
 * @Version 1.0
 */
import java.util.*;;


public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String pwd = scan.nextLine();
            int level = getPwdSecurityLevel(pwd);
            if (level < 25) {
                System.out.println("VERY_WEAK");
            }else if (level < 50) {
                System.out.println("WEAK");
            }else if (level < 60) {
                System.out.println("AVERAGE");
            }else if (level < 70) {
                System.out.println("STRONG");
            }else if (level < 80) {
                System.out.println("VERY_STRONG");
            }else if (level < 90) {
                System.out.println("SECURE");
            }else {
                System.out.println("VERY_SECURE");
            }
        }
    }
    public static int getPwdSecurityLevel(String pwd) {
        int level = 0;
        int len = pwd.length();
        if (len == 0) {
            return level;
        }
        if (len <= 4) {
            level += 5;
        }else if (len <= 7) {
            level += 10;
        }else{
            level += 25;
        }
        boolean flg1 = false;
        boolean flg2 = false;
        int temp = 0;
        int num = 0;
        for (char ch : pwd.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                flg1 = true;
            }
            if (ch >= 'A' && ch <= 'Z') {
                flg2 = true;
            }
            if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)
                    || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)) {
                temp++;
            }
            if (ch >= '0' && ch <= '9') {
                num++;
            }
        }
        if (flg1 || flg2) {
            level += 10;
            if (flg1 && flg2) {
                level += 10;
            }
        }
        if (num > 0) {
            level += 10;
            if (num > 1) {
                level += 10;
            }
        }
        if (temp > 0) {
            level += 10;
            if (temp > 1) {
                level += 15;
            }
        }
        if (num > 0 && (flg1 || flg2)) {
            level += 2;
            if (temp > 0) {
                level += 1;
                if (flg1 && flg2) {
                    level += 2;
                }
            }
        }
        return level;
    }
}