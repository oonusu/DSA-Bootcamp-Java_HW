package Intermediate;

import java.util.Scanner;

// 17. Find if a number is palindrome or not
public class HW_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        long origin = sc.nextInt();
        long n = origin;
        long p = 0;
        while ( n > 0) {
            p = p * 10 + n % 10;
            n /= 10;
        }
        System.out.println(origin == p);
    }
}
