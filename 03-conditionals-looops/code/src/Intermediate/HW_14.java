package Intermediate;

import java.util.Scanner;

// 14. Armstrong Number In Java
public class HW_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            int n = origin;
            while ( n > 0 ) {

                sum += (int) Math.pow(n % 10, i);
                n /= 10;
            }
            if (origin == sum) {
                System.out.println(origin + " is Armstrong Number.");
                return;
            }
        }
        System.out.println(origin + " is not Armstrong Number.");
    }
}
