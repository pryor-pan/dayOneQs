package dayoneQs_2.day26;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Double n = sc.nextDouble();
            Double r = sc.nextDouble();
            if (n<= (2*r*3.14)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
