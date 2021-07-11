package dayoneQs_2.day22;

import java.util.Scanner;

/**
 * Remarks:
 * Author:panlai
 * :Date:2021/7/8
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int nums = scanner.nextInt();
            int power = scanner.nextInt();
            int[] animalPower = new int[nums];
            for (int i = 0; i < animalPower.length; i++) {
                animalPower[i] = scanner.nextInt();
            }
            for (int i = 0; i < animalPower.length; i++) {
                if (animalPower[i] <= power) {
                    power += animalPower[i];
                } else {
                    int max = 0;
                    for (int j = 2; j < power; j++) {
                        if (power % j == 0 && animalPower[i] % j == 0) {
                            if (j > max) {
                                max = j;
                            }
                        }
                    }
                    power = power + max;
                }
            }
            System.out.println(power);
        }
    }
}
