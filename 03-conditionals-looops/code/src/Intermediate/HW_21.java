package Intermediate;

import java.util.Scanner;

// 21. Perfect Number In Java
public class HW_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if (s == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}
